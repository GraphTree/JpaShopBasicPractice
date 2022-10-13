package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;
    private String name;
    private int price;
    private int stockQuality;

}
