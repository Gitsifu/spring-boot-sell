package io.github.furuewl.springboot.sell.repository;

import io.github.furuewl.springboot.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 商品类型测试用例
 *
 * @author weilai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        Assert.assertNotNull(productCategory);
    }

}