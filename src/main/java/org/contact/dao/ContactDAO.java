package org.contact.dao;

import java.util.List;

import org.contact.entity.Contact;

public interface ContactDAO {
    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);

    public void updateContact(Contact contact);
}