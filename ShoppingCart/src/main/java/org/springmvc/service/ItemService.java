package org.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmvc.dao.ItemDao;
import org.springmvc.entity.Item_type;

import javax.transaction.Transactional;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    @Transactional
    public String saveItemData(Item_typeModel item_typeModel){
        if (Item_typeModel.get)
    }

}
