package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.entities.concrates.Product;

public interface ProductService {
   DateResult<List<Product>> getAll();
   Result add(Product product);
}
