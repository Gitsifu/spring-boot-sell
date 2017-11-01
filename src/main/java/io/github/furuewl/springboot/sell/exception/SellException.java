package io.github.furuewl.springboot.sell.exception;


import io.github.furuewl.springboot.sell.enums.ResultEnum;

/**
 * 销售异常
 *
 * @author weilai
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
