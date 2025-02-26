package jpashop.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Item {
   
   @Id @GeneratedValue
   @Column(name = "ITEM_ID")
   private Long id;

   private String name;
   private int price;
   private int stockQuantity;

   @ManyToMany(mappedBy = "items")
   private List<Category> category = new ArrayList<>();

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPrice() {
      return this.price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int getStockQuantity() {
      return this.stockQuantity;
   }

   public void setStockQuantity(int stockQuantity) {
      this.stockQuantity = stockQuantity;
   }

}
