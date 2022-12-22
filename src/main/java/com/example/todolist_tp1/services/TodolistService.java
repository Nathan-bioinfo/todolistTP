package com.example.todolist_tp1.services;

import com.example.todolist_tp1.entity.Todolist;
import com.example.todolist_tp1.Interfaces.Itodolist;
import com.example.todolist_tp1.tools.ServiceHibernate;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.hibernate.query.Query;
import java.util.List;

@Service
public class TodolistService implements Itodolist {
    /*private ServiceHibernate serviceHibernate;

    private Session session;

    public TodolistService(ServiceHibernate serviceHibernate){
        this.serviceHibernate = serviceHibernate;
        session = this.serviceHibernate.getSession();
    }

    @Override
    public boolean create(Todolist t) {
        session.beginTransaction();
        session.persist(t);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Todolist t) {
        session.beginTransaction();
        session.update(t);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Todolist t) {
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Todolist findById(int id) {
        Todolist td = null;
        td = (Todolist) session.get(Todolist.class,id);
        return td;
    }

    @Override
    public List<Todolist> findAll() {
        //Query<Todolist> todoQuery = session.createQuery("from todolists", Todolist.class);
        //return todoQuery.list();
        return null;
    }*/
}

