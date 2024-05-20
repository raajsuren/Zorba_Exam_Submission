package org.springmvc.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "item_type")
public class Item_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private Integer itemTypeId;

    @Column(name = "item_type")
    private String itemType;

    @OneToMany(mappedBy = "item_type")
    private Set<Items_info> Items_info;

    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Set<org.springmvc.entity.Items_info> getItems_info() {
        return Items_info;
    }

    public void setItems_info(Set<org.springmvc.entity.Items_info> items_info) {
        Items_info = items_info;
    }
}
