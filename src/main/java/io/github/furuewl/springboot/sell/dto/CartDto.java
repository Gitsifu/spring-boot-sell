package io.github.furuewl.springboot.sell.dto;

import lombok.Data;

/**
 * 购物车数据传输类
 *
 * @author weilai
 */
@Data
public class CartDto {

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
