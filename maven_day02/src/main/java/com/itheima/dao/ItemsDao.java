package com.itheima.dao;

import com.itheima.domain.Items;

//持久层接口
public interface ItemsDao {

    public Items findById(int i);
}
