package io.github.furuewl.springboot.sell.repository;

import io.github.furuewl.springboot.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 商品类目DAO
 *
 * @author weilai
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
