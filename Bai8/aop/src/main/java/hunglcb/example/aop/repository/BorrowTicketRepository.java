package hunglcb.example.aop.repository;

import hunglcb.example.aop.entity.BorrowTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BorrowTicketRepository extends JpaRepository<BorrowTicket, Long> {
	List<BorrowTicket> findByCode(String code);
}


