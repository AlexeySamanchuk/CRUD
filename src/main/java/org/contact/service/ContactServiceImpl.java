package org.contact.service;

import java.util.List;

import org.contact.dao.ContactDAO;
import org.contact.dao.ContactDAOImpl;
import org.contact.entity.Contact;

public class ContactServiceImpl implements ContactService {
    private ContactDAO contactDAO = new ContactDAOImpl();

    @Override
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Override
    public List<Contact> listContact() {
        return contactDAO.listContact();
    }

    @Override
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }

    @Override
    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }
}