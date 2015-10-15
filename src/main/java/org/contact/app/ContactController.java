package org.contact.app;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.contact.entity.Contact;
import org.contact.service.ContactService;
import org.contact.service.ContactServiceImpl;

public class ContactController {
    private ContactService contactService = new ContactServiceImpl();
    private ObservableList<Contact> contactList = FXCollections.observableArrayList();

    public void addContact(Contact contact) {
        contactService.addContact(contact);
    }

    public ObservableList<Contact> getContactList() {
        if (!contactList.isEmpty()) contactList.clear();
        contactList = FXCollections.observableList((List<Contact>) contactService.listContact());
        return contactList;
    }

    public void removeContact(Integer id) {
        contactService.removeContact(id);
    }

    public void updateContact(Contact contact) {
        contactService.updateContact(contact);
    }
}













        