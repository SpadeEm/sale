package com.java;

import com.java.dao.ProductCategoryDao;
import com.java.model.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaledemoApplicationTests {
	@Autowired
	private ProductCategoryDao productCategoryDao;

	@Test
	public void findOneTest() {
		ProductCategory productCategory =productCategoryDao.findOne(1);
		System.out.println(productCategory.toString());
	}

	@Test
	public void saveTest(){
		ProductCategory productCategory = new ProductCategory();
		productCategory.setCategoryName("测试保存");
		productCategory.setCategoryType(2);
		productCategoryDao.save(productCategory);
	}

}
