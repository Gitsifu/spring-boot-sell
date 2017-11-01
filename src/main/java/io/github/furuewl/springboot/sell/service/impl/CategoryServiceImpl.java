package io.github.furuewl.springboot.sell.service.impl;

import io.github.furuewl.springboot.sell.dataobject.ProductCategory;
import io.github.furuewl.springboot.sell.repository.ProductCategoryRepository;
import io.github.furuewl.springboot.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目接口实现
 *
 * @author weilai
 * 2017-10-14 13:26
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final ProductCategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
