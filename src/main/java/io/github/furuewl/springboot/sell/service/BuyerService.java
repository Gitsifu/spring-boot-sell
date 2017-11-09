package io.github.furuewl.springboot.sell.service;


import io.github.furuewl.springboot.sell.dto.OrderDto;

/**
 * 买家
 */
public interface BuyerService {

    /**
     * 查询以一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDto findOrderOne(String openid, String orderId);

    /**
     * 取消一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDto cancelOrder(String openid, String orderId);

}
