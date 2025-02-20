package jpashop.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Delivery {

   @Id @GeneratedValue
   @Column(name = "DELIVERY_ID")
   private Long id;
/* 
   @OneToOne(mappedBy="delivery")
   private List<Order> order = new ArrayList<>(); */

   private String city;
   private String street;
   private String zipcode;
   private DeliveryStatus status;
}
