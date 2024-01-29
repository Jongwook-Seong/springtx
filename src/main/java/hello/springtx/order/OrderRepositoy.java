package hello.springtx.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoy extends JpaRepository<Order, Long> {
}
