/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt.addressbook.util;

import java.util.Arrays;
import java.util.List;
import packt.addressbook.model.Contact;

/**
 *
 * @author barcvilla
 */
public class ContactUtil {
    public List<Contact> getContacts()
    {
        List<Contact> contacts = Arrays.asList
        (
            new Contact("1", "Edsger", "Dijkstra", "345-678-9012"),
            new Contact("2", "Alan", "Turin", "456-789-0123"),
            new Contact("3", "Ada", "Lovelace", "234-567-8901"),
            new Contact("4", "Charles", "Babbage", "123-456-8901"),
        new Contact("5", "Tim", "Berners-Lee", "456-789-0123")
        );
        
        return contacts;
    }
}
