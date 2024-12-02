package org.koreait.yumyum.repository;

import org.koreait.yumyum.entity.OrderDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
@Repository
public interface StatsMenuRepository extends JpaRepository<OrderDetail, Long> {

    @Query("SELECT OD.orderProductName, " +
            "SUM(OD.quantity) " +
            "FROM OrderDetail AS OD " +
            "JOIN OD.order AS O " +
            "WHERE YEAR(O.orderDate) = :year " +
            "AND MONTH(O.orderDate) = :month " +
            "AND DAY(O.orderDate) = :day " +
            "GROUP BY OD.orderProductName ")
    List<Object[]> findMenuDailySales(@Param("year") int year,
                                      @Param("month") int month,
                                      @Param("day") int day);
}
