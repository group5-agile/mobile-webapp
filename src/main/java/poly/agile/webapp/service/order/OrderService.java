package poly.agile.webapp.service.order;

import java.util.List;

import poly.agile.webapp.dto.OrderDTO;
import poly.agile.webapp.dto.OrderLineDTO;
import poly.agile.webapp.model.Order;
import poly.agile.webapp.model.OrderStatus;
import poly.agile.webapp.model.User;
import poly.agile.webapp.service.BaseService;
import poly.agile.webapp.service.DTOService;

public interface OrderService extends BaseService<Order, Integer>, DTOService<OrderDTO> {

	OrderStatus findOrderStatusById(Integer id);

	List<OrderStatus> findAllOrderStatus();

	List<OrderDTO> findOrderListByUsername(String username);
	
	List<OrderLineDTO> findOrderLinesByOrderId(Integer id);

	long countNumberOfOrder(User user);

	long getTotalOrder();

}
