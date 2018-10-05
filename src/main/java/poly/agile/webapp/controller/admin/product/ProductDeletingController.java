package poly.agile.webapp.controller.admin.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import poly.agile.webapp.service.product.ProductService;

<<<<<<< HEAD:src/main/java/poly/agile/webapp/controller/admin/product/ProductDeletingController.java
@RestController
@RequestMapping("/admin")
public class ProductDeletingController {
=======
@Controller
@RequestMapping("/admin/products")
public class DeleteProductController {
>>>>>>> parent of 2d9b67e... Mạnh - Update:src/main/java/poly/agile/webapp/controller/admin/product/DeleteProductController.java

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/delete/{id}")
	public @ResponseBody boolean delete(@PathVariable("id") Integer id) {
		return productService.remove(productService.findById(id));
	}

}
