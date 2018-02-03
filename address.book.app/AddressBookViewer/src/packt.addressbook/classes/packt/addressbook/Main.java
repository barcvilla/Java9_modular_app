/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt.addressbook;

import java.util.List;
import packt.addressbook.model.Contact;
import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;

/**
 *
 * @author barcvilla
 */
public class Main {
   public static void main(String[] args)
   {
       ContactUtil contactUtil = new ContactUtil();
       SortUtil sortUtil = new SortUtil();
       List<Contact> contacts = contactUtil.getContacts();
       sortUtil.sortList(contacts);
       System.out.println(contacts);
   }
}
