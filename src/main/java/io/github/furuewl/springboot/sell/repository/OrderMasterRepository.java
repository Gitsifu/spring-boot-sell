package io.github.furuewl.springboot.sell.repository;

import io.github.furuewl.springboot.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单主表查询接口
 *
 * @author weilai
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
    /**
     * 通过openid发现订单
     *
     * @param buyerOpenid
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}
