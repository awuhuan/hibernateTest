package com.test;

import org.hibernate.annotations.Index;

import javax.persistence.*;

/**
 * Created by wangjiguang on 16/1/11.
 */
@Entity
@Table(name = "migrations", schema = "", catalog = "blog")
public class MigrationsBean {
    private String migration;
    private int batch;

    @Basic
    @Id
    @Column(name = "migration")
    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    @Basic
    @Column(name = "batch")
    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MigrationsBean that = (MigrationsBean) o;

        if (batch != that.batch) return false;
        if (migration != null ? !migration.equals(that.migration) : that.migration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = migration != null ? migration.hashCode() : 0;
        result = 31 * result + batch;
        return result;
    }


}
