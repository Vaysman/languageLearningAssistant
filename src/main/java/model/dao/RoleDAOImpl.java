package model.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import model.HibernateUtil;
import model.entities.Role;

public class RoleDAOImpl implements RoleDAO{
    
    final Logger logger = Logger.getLogger(this.getClass());
    
    @Override
    public void add(Role role) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.save(role);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.log(Priority.ERROR, e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
    
    @Override
    public void update(Role role) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.update(role);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.log(Priority.ERROR, e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void remove(Role role) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.delete(role);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.log(Priority.ERROR, e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public List<Role> findAll() {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            List<Role> roles = (List<Role>) session.createQuery("from Role").list();
            session.getTransaction().commit();
            return roles;
        } catch (Exception e) {
            logger.log(Priority.ERROR, e);
            throw new HibernateException(e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Role findById(int id) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            Role role = (Role) session.createQuery("from Role where id =:id").setInteger("id", id).uniqueResult();
            session.getTransaction().commit();
            return role;
        } catch (Exception e) {
            logger.log(Priority.ERROR, e);
            throw new HibernateException(e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Role findByName(String name) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            Role role = (Role) session.createQuery("from Role where name =:name").setString("name", name).uniqueResult();
            session.getTransaction().commit();
            return role;
        } catch (Exception e) {
            logger.log(Priority.ERROR, e);
            throw new HibernateException(e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
