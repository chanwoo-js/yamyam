package org.koreait.yumyum.repository;

import org.koreait.yumyum.entity.OrderDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StatsMenuRepository extends JpaRepository<OrderDetail, Long> {
    @Query("SELECT FUNCTION('DATE', o.orderDate) AS orderDate, m.menuName, SUM(od.quantity) AS totalQuantity, " +
            "SUM(od.quantity * m.menuPrice) AS totalSales " +
            "FROM Order o JOIN o.orderDetail od JOIN Menu m ON od.menuId = m.id " +
            "WHERE FUNCTION('DATE', o.orderDate) = :orderDate AND o.store.id = :storeId " +
            "GROUP BY FUNCTION('DATE', o.orderDate), m.menuName")
    List<Object[]> findDailySalesByDateAndStore(@Param("orderDate") LocalDate orderDate, @Param("storeId") Long storeId);
}