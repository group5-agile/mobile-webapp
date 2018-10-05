package poly.agile.webapp.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD:src/main/java/poly/agile/webapp/controller/product/ProductController.java
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import poly.agile.webapp.dto.ProductDTO;
import poly.agile.webapp.model.Brand;
import poly.agile.webapp.model.Product;
import poly.agile.webapp.service.brand.BrandService;
=======
import org.springframework.web.bind.annotation.RequestParam;

import poly.agile.webapp.dto.ProductDTO;
>>>>>>> parent of 2d9b67e... Mạnh - Update:src/main/java/poly/agile/webapp/controller/product/ProductListController.java
import poly.agile.webapp.service.product.ProductService;
import poly.agile.webapp.util.pagination.Pagination;

@Controller
public class ProductListController {

	@Autowired
	private ProductService service;

	@Autowired
	private BrandService brandService;

	@GetMapping("/products")
	public String show(Model model, @RequestParam(value = "page", defaultValue = "1") Integer page) {
<<<<<<< HEAD:src/main/java/poly/agile/webapp/controller/product/ProductController.java
		Page<ProductDTO> pages = productService.getPages(page);

		model.addAttribute("products", pages.getContent());
		model.addAttribute("pagination", new Pagination(pages.getTotalPages(), 5, page));
=======
		Page<ProductDTO> pages = service.getPages(page);
		Pagination pagination = new Pagination(pages.getTotalPages(), 3, page);

		model.addAttribute("products", pages.getContent());
		model.addAttribute("pagination", pagination);
>>>>>>> parent of 2d9b67e... Mạnh - Update:src/main/java/poly/agile/webapp/controller/product/ProductListController.java
		model.addAttribute("productPage", true);
		return "products/all";
	}

	@GetMapping(value = "/products/search", params = "query")
	public String search(Model model, @RequestParam(value = "page", defaultValue = "1") Integer page,
<<<<<<< HEAD:src/main/java/poly/agile/webapp/controller/product/ProductController.java
			@RequestParam("find") String keyword) {
		Page<ProductDTO> pages = productService.search(keyword, page);

=======
			@RequestParam("query") String keyword) {
		Page<ProductDTO> pages = service.search(keyword, page);
		Pagination pagination = new Pagination(pages.getTotalPages(), 3, page);

		pages.getContent().forEach(e->{
			System.out.println(e.getName());
		});
		
>>>>>>> parent of 2d9b67e... Mạnh - Update:src/main/java/poly/agile/webapp/controller/product/ProductListController.java
		model.addAttribute("products", pages.getContent());
		model.addAttribute("pagination", pagination);
		model.addAttribute("productPage", true);
		return "products/search";
	}

<<<<<<< HEAD:src/main/java/poly/agile/webapp/controller/product/ProductController.java
	@GetMapping("/products/{brandId}")
	public String getProductsByBrand(@PathVariable("brandId") Integer brandId,
			@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		Page<ProductDTO> pages = productService.findProductsByBrandId(brandId, page);

		model.addAttribute("products", pages.getContent());
		model.addAttribute("pagination", new Pagination(pages.getTotalPages(), 5, page));
		model.addAttribute("productPage", true);
		return "products/list-with-brand";
	}

	@GetMapping("/product/{id}")
	public String getProductDetail(@PathVariable("id") Integer id, Model model) {
		Product product = productService.findById(id);

		productService.incrementViewCount(id);
		model.addAttribute("product", product);
		model.addAttribute("productPage", true);
		return "products/detail";
	}

	@ModelAttribute("brands")
	public List<Brand> getBrand() {
		return brandService.findAll();
	}

=======
>>>>>>> parent of 2d9b67e... Mạnh - Update:src/main/java/poly/agile/webapp/controller/product/ProductListController.java
}
