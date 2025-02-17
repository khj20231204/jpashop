package jpashop.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
   
   @Id @GeneratedValue
   @Column(name = "ORDER_ITEM_ID")
   private Long id;

   //이게 없어지고 밑에 Order를 직접 참조
   //@Column(name = "ORDER_ID")
   //private Long orderId;

   @ManyToOne
   @JoinColumn(name = "ORDER_ID")
   private Order order;

   //이게 없어지고 밑에 Item을 직접 참조
   //@Column(name = "ITEM_ID")
   //private Long itemId;

   @ManyToOne
   @JoinColumn(name = "ITEM_ID")
   private Item item;


   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Order getOrder() {
      return order;
   }

   public void setOrder(Order order) {
      this.order = order;
   }

   public Item getItem() {
      return item;
   }

   public void setItem(Item item) {
      this.item = item;
   }
}
