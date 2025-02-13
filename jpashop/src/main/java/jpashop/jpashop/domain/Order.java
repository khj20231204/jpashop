package jpashop.jpashop.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order{
   
   @Id @GeneratedValue
   @Column(name = "ORDERS_ID")
   private Long id;

   @Column(name = "MEMBER_ID")
   private Long memberId;
   private LocalDateTime orderDate;

   @Enumerated(EnumType.STRING)
   private OrderStatus status;


   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getMemberId() {
      return this.memberId;
   }

   public void setMemberId(Long memberId) {
      this.memberId = memberId;
   }

   public LocalDateTime getOrderDate() {
      return this.orderDate;
   }

   public void setOrderDate(LocalDateTime orderDate) {
      this.orderDate = orderDate;
   }

   public OrderStatus getStatus() {
      return this.status;
   }

   public void setStatus(OrderStatus status) {
      this.status = status;
   }

}
