package com.howtodoinjava.hibernate.MyHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        // Session s =
        // Configuration con = new Configuration().configure("");
        // SessionFactory sf = con.buildSessionFactory();
        // Session session = sf.openSession();
        listSomeCity(30);
    }

    static List<City> listSomeCity(int maxNumOfResult) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM City";
        List<City> cityList = (List<City>) session.createQuery(hql).setMaxResults(maxNumOfResult).list();
        cityList.stream().forEach((c) -> {
            c = (City) c;
            System.out.println(c.getID() + " Name: " + c.getName() + ", Population: " + c.getPopulation());

        });
        return (List<City>) cityList;

    }
}
