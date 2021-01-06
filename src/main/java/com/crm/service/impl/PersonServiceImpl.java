package com.crm.service.impl;

import com.crm.dao.PersonPOMapper;
import com.crm.entity.po.PersonPO;
import com.crm.service.PersonService;
import com.crm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    public PersonPOMapper personDao;

    @Override
    public R savePerson(PersonPO personPO) {
        if (personDao.insert(personPO)==1){
            return R.ok();
        }
        return R.error();
    }
}
