package org.contact.dao;

import java.util.ArrayList;
import java.util.List;

import org.contact.entity.BusinessTrip;
import org.contact.entity.Contact;
import org.contact.entity.HibernateUtil;
import org.hibernate.Session;

public class BusinessTripDAOImpl implements BusinessTripDAO {
    @Override
    public void addBusinessTrip(BusinessTrip businessTrip) {
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        s.save(businessTrip);
        s.getTransaction().commit();
    }

    @Override
    public List<BusinessTrip> listBusinessTrip() {
        List<BusinessTrip> list = new ArrayList<>();
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        list = s.createQuery("from BusinessTrip").list();
        s.getTransaction().commit();
        s.close();
        return list;
    }

    @Override
    public void removeBusinessTrip(Integer id) {
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        BusinessTrip c = (BusinessTrip) s.load(BusinessTrip.class, id);
        s.delete(c);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void updateBusinessTrip(BusinessTrip businessTrip) {
        Session s = HibernateUtil.openSession();
        s.beginTransaction();
        s.update(businessTrip);
        s.getTransaction().commit();
        s.close();
    }
}
