package org.springmvc.dao;

import org.springmvc.entity.Item_type;

import java.util.List;

public interface ItemDao {
    String saveItem (Item_type item_type)

        List<Item_type> getAllItem();

}
