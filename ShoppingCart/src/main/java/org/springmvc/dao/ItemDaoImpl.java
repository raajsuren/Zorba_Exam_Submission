package org.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springmvc.entity.Item_type;

import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao{
    private SessionFactory sessionFactory;


    @Override
    public String saveItem(Item_type item_type) {
        return null;
    }

    @Override
    public List<Item_type> getAllItem() {
        return null;
    }


}
