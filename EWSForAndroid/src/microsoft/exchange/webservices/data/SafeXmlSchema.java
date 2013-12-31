/**************************************************************************
 * copyright file="SafeXmlSchema.java" company="Microsoft"
 *     Copyright (c) Microsoft Corporation.  All rights reserved.
 * 
 * Defines the SafeXmlSchema.java.
 **************************************************************************/
package microsoft.exchange.webservices.data;

import java.io.InputStream;


import com.innovaturelabs.xml.stream.XMLInputFactory;
import com.innovaturelabs.xml.stream.XMLStreamException;
import com.innovaturelabs.xml.stream.XMLStreamReader;

import javax.xml.validation.Validator;
import javax.xml.validation.ValidatorHandler;
import javax.xml.validation.Schema;

/**
 * XmlSchema with protection against DTD parsing in read overloads
 
 */

public class SafeXmlSchema extends Schema{

	@Override
	public Validator newValidator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValidatorHandler newValidatorHandler() {
		// TODO Auto-generated method stub
		return null;
	}
        
	  /**
       * Reads an XML Schema from the supplied stream.
       * @param stream The supplied data stream.
      * @return The XmlSchema object representing the XML Schema.
      * @throws XMLStreamException
      */
	public static Schema Read(InputStream stream) throws XMLStreamException
    {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();

		return (Schema) inputFactory.createXMLEventReader(stream);    
        }
	
	/**
	 * Reads an XML Schema from the supplied TextReader.
	 * @param reader The TextReader containing the XML Schema to read
	 * @return The XmlSchema object representing the XML Schema.
	 * @throws XMLStreamException
	 */
	
    public static Schema Read(XMLStreamReader reader) throws XMLStreamException
    {
    
       	XMLInputFactory inputFactory = XMLInputFactory.newInstance();

		return (Schema) inputFactory.createXMLEventReader(reader);    
    }
      
}
