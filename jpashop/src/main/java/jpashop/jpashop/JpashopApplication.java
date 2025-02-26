package jpashop.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpashop.jpashop.domain.Order;
import jpashop.jpashop.domain.OrderItem;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{

           //Order order = em.find(Order.class, 1);
           //Long memberId = order.getMemberId();
           //Member member = em.find(Member.class, memberId);

           //Order order = new Order();
           //order.addOrderItem(new OrderItem());

           Order order = new Order();
           em.persist(order);

           OrderItem orderItem = new OrderItem();
           orderItem.setOrder(order);

        
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }finally {
            em.close();
        }
	}

}
