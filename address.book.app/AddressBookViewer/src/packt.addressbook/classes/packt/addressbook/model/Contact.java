/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt.addressbook.model;

/**
 * Necesitamos ordenar objetos Contact.Para lo cual llamamos a la interface Comparable
 * implementamos el metodo compareTo(). la cual compara dos instancias Contact basado en la
 * propiedad lastName
 * @author barcvilla
 */
public class Contact implements Comparable
{
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    public Contact(String id, String firstName, String lastName, String phoneNumber)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    public Contact(String firstName, String lastName, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + '}';
    }
    
    @Override
    public int compareTo(Object other) {
        Contact otherContact = (Contact) other;
        return this.lastName.compareTo(otherContact.lastName);
    }
    
    
}
