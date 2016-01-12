package com.test;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by wangjiguang on 16/1/11.
 */
@Entity
@Table(name = "foots", schema = "", catalog = "blog")
public class FootsBean {
    private int id;
    private String name;
    private Timestamp dateCreate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "date_create")
    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootsBean footsBean = (FootsBean) o;

        if (id != footsBean.id) return false;
        if (name != null ? !name.equals(footsBean.name) : footsBean.name != null) return false;
        if (dateCreate != null ? !dateCreate.equals(footsBean.dateCreate) : footsBean.dateCreate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        return result;
    }
}
