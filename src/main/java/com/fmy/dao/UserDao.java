package com.fmy.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
@Repository
public class UserDao {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
