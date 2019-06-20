package itmama.service.impl;

import itmama.dao.ItemsDao;
import itmama.domain.Items;
import itmama.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findId(Integer id) {


        return itemsDao.findId(id);
    }
}
