package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by wangjiguang on 16/1/11.
 */
public class test {

    public static void main(String[] args){
        UsersBean user = new UsersBean();
        user.setEmail("449@qq.com");
        user.setName("dasd");
        user.setPassword("212312");
        user.setRememberToken("dsad");
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        user.setUpdatedAt(ts);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        UsersBean u=  (UsersBean)session.get(UsersBean.class, 14);
        UsersBean u2 = (UsersBean)session.load(UsersBean.class, 13);

        List<UsersBean> datas = session.createQuery("From UsersBean where id >= 13").list();
        session.getTransaction().commit();
        for(int i=0;i<datas.size();i++){

            UsersBean data = datas.get(i);

            System.out.println("list:" + data.getName() + ":" + data.getEmail());

        }
        System.out.printf(datas.toString());

    }

}
