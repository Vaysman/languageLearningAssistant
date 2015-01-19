package model.dao;

import java.util.List;

import model.HibernateUtil;
import model.entities.User;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class UserDAOImpl implements UserDAO{
    
    final Logger logger = Logger.getLogger(this.getClass());
    
    @Override
    public void add(User user) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.save(user);
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
    public void update(User user) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.update(user);
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
    public void remove(User user) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.delete(user);
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
    public List<User> findAll() {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            List<User> users = (List<User>) session.createQuery("from User").list();
            session.getTransaction().commit();
            return users;
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
    public User findById(int id) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            User user = (User) session.createQuery("from User where id =:id").setInteger("id", id).uniqueResult();
            session.getTransaction().commit();
            return user;
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
    public List<User> findByName(String name) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            List<User> users = (List<User>) session.createQuery("from User where name =:name").setString("name", name).list();
            session.getTransaction().commit();
            return users;
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
    public List<User> findByLastName(String lastName) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            List<User> users = (List<User>) session.createQuery("from User where last_name =:lastName").setString("lastName", lastName).list();
            session.getTransaction().commit();
            return users;
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
    public User findByEmail(String email) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            User user = (User) session.createQuery("from User where email =:email").setString("email", email).uniqueResult();
            session.getTransaction().commit();
            return user;
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
    public User findByLogin(String login) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            User user = (User) session.createQuery("from User where login =:login").setString("login", login).uniqueResult();
            session.getTransaction().commit();
            return user;
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
