package com.wutka.dtd;

import java.io.*;

/** Defines the method used for writing DTD information to a PrintWriter
 *
 * @author Mark Wutka
 * @version $Revision: 1.1 $ $Date: 2004/08/19 05:30:23 $ by $Author: aslom $
 */
public interface DTDOutput
{
    public void write(PrintWriter out) throws IOException;
}
