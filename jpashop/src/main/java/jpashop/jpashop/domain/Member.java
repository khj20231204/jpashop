package jpashop.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
   
   @Id
   @GeneratedValue()
   @Column(name = "MEMBER_ID")
   private Long id;
   private String name;
   private String street;
   private String zipcode;

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

   public String getStreet() {
      return this.street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public String getZipcode() {
      return this.zipcode;
   }

   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }

}
