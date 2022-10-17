package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;
    private String name;
    private int price;
    private int stockQuality;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

}
