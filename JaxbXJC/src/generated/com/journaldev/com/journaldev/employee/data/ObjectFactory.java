//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 10:03:36 PM EST 
//


package com.journaldev.com.journaldev.employee.data;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.journaldev.com.journaldev.employee.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.journaldev.com.journaldev.employee.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpRequest }
     * 
     */
    public EmpRequest createEmpRequest() {
        return new EmpRequest();
    }

    /**
     * Create an instance of {@link EmpResponse }
     * 
     */
    public EmpResponse createEmpResponse() {
        return new EmpResponse();
    }

}