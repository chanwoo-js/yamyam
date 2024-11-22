import { css } from "@emotion/react";

export const formStyle = css`
  width: 500px !important;
  padding: 16px;
  margin: 0 auto;
  border: 1px solid #ccc;
  border-radius: 8px;
  display: flex;
  flex-direction: column;

  & button {
    width: 50%;
    text-align: center;
  }
  & > div {
    margin-bottom: 20px;
  }
  & > div:last-child {
    margin-bottom: 0;
  }
  & > label {
    margin: 0 auto;
    width: 500px;
    border: 1px solid #ccc;
    border-radius: 4px;
    height: 54px;
  }
  & > div:nth-last-of-type(3),
  & > div:nth-last-of-type(5) {
    width: 500px;
    height: 54px;
    line-height: 54px;
    border: 1px solid #ccc;
    border-radius: 4px;
    line-height: 54px;
    position: relative;
    margin-bottom: 0;
  }
  & > div:nth-last-of-type(3) > svg,
  & > div:nth-last-of-type(5) > svg {
    position: absolute;
    right: 0;
    padding: 15px;
    cursor: pointer; 
  }
  & > div:nth-last-of-type(3) > label,
  & > div:nth-last-of-type(5) > label {
    margin-left : 5px;
  }
`;
export const signUpTitle = css`
  text-align: center;
  height: 100px;
  line-height: 100px;
  font-weight: bold;
  font-size: 32px;
`;

export const agreed = css`
  width: 502px;
  height: 100px;
  border-radius: 4px;
  border: 1px solid #ccc;
  box-sizing : border-box;
  padding: 15px;
`;
export const button = css`
  height: 56px;
`;
