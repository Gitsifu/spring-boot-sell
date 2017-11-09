package io.github.furuewl.springboot.sell.repository;

import io.github.furuewl.springboot.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 订单详情表查询接口
 *
 * @author weilai
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    /**
     * 通过订单ID获得订单详情列表
     *
     * @param orderId orderId
     * @return 结果
     */
    List<OrderDetail> findByOrderId(String orderId);

}
