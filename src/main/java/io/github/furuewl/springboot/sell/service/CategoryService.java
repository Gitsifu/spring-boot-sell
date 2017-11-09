package io.github.furuewl.springboot.sell.service;


import io.github.furuewl.springboot.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目服务接口
 *
 * @author weilai
 * 2017-10-14 13:25
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
