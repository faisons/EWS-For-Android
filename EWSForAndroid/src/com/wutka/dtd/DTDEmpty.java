package com.wutka.dtd;

import java.io.*;

/** Represents the EMPTY keyword in an Element's content spec
 *
 * @author Mark Wutka
 * @version $Revision: 1.1 $ $Date: 2004/08/19 05:30:23 $ by $Author: aslom $
 */
public class DTDEmpty extends DTDItem
{
    public DTDEmpty()
    {
    }

/** Writes out the keyword "EMPTY" */
    public void write(PrintWriter out)
        throws IOException
    {
        out.print("EMPTY");
        cardinal.write(out);
    }

    public boolean equals(Object ob)
    {
        if (ob == this) return true;
        if (!(ob instanceof DTDEmpty)) return false;
        return super.equals(ob);
    }
}
