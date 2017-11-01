package io.github.furuewl.springboot.sell.repository;

import io.github.furuewl.springboot.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品DAO
 *
 * @author weilai
 * 2017-10-14 12:47
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 列出所有相同状态的商品信息
     *
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
