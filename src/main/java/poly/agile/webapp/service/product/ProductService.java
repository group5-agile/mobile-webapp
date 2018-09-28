package poly.agile.webapp.service.product;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import poly.agile.webapp.dto.ProductDTO;
import poly.agile.webapp.model.Brand;
import poly.agile.webapp.model.Product;
import poly.agile.webapp.service.BaseService;
import poly.agile.webapp.service.DTOService;

@Service
public interface ProductService extends BaseService<Product, Integer>, DTOService<ProductDTO> {

	/**
	 * San pham moi nhat
	 * 
	 * @return
	 */
	public List<ProductDTO> getFiveNewProducts();

	public Page<ProductDTO> findProductByBrand(Brand brand, int page);

	public Page<ProductDTO> search(String keyword, int page);

	public Product findProductByName(String name);

	public ProductDTO findProductById(Integer id);

}
