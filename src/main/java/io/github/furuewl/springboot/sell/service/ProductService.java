package io.github.furuewl.springboot.sell.service;


import io.github.furuewl.springboot.sell.dataobject.ProductInfo;
import io.github.furuewl.springboot.sell.dto.CartDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品Service接口
 *
 * @author weilai
 * 2017-10-14 15:47
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<CartDto> cartDtoList);

    // 减库存
    void decreaseStock(List<CartDto> cartDtoList);

}
