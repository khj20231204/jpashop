package jpashop.jpashop.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order{
   
   @Id @GeneratedValue
   @Column(name = "ORDERS_ID")
   private Long id;

   private LocalDateTime orderDate;

   @Enumerated(EnumType.STRING)
   private OrderStatus status; 

   @ManyToOne
   @JoinColumn(name = "MEMBER_ID")
   private Member member;
   
   @OneToOne
   @JoinColumn(name = "DELIVERY_ID")
   private Delivery delivery;

   @OneToMany(mappedBy="order")
   private List<OrderItem> orderItems = new ArrayList<>();
   
   public void addOrderItem(OrderItem orderItem) {
      orderItems.add(orderItem);
      orderItem.setOrder(this);
   }

   public Long getId() {
      return this.id;
   }
   
   public void setId(Long id) {
      this.id = id;
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

   public Member getMember() {
      return member;
   }

   public void setMember(Member member) {
      this.member = member;
   }

}
