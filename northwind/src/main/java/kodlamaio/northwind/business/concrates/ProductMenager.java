package kodlamaio.northwind.business.concrates;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concrates.Product;

@Service //bu klas servis görevi görecek diye klasa bilgi veriyoruz.
public class ProductMenager implements ProductService{

	private ProductDao productDao;
	
	
	
	
  //@Autowired anotasyonu sayesinde bir bean içerisindeki değerleri 
	            //başka beanin içerisine enjekte edebilir değerlerini koruyarak kullanabiliriz.
	@Autowired
	public ProductMenager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}




	@Override
	public DateResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
				
				(this.productDao.findAll(),"Dta Listelendi");
	}




	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("ürün eklendi");
		
		
	
	}

}
