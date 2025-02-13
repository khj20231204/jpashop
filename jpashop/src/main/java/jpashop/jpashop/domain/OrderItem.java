package jpashop.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {
   
   @Id @GeneratedValue
   @Column(name = "ORDER_ITEM_ID")
   private Long id;

   @Column(name = "ORDER_ID")
   private Long orderId;

   @Column(name = "ITEM_ID")
   private Long itemId;


   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getItemId() {
      return this.itemId;
   }

   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

}
