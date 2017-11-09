package io.github.furuewl.springboot.sell.enums;

import lombok.Getter;

/**
 * 商品状态枚举类
 *
 * @author weilai
 * 2017-10-14 13:51
 */
@Getter
public enum ProductStatusEnum {
    /**
     * 商品在架状态
     */
    UP(0, "在架"),
    /**
     * 商品下架状态
     */
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
