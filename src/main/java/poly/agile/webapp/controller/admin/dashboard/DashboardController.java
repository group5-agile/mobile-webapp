package poly.agile.webapp.controller.admin.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DashboardController {

	@GetMapping("/dashboard")
	public String goDashboard() {
		return "admin/dashboard";
	}
}
