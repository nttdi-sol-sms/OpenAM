package com.sun.identity.monitoring;

//
// Generated by mibgen version 5.1 (03/08/07) when compiling SUN-OPENSSO-SERVER-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;

/**
 * The class is used for implementing the "SsoServerTopology" group.
 * The group is defined with the following oid: 1.3.6.1.4.1.42.2.230.3.1.1.2.1.8.
 */
public class SsoServerTopology implements SsoServerTopologyMBean, Serializable {

    /**
     * Variable for storing the value of "SsoServerSiteMapTable".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.8.3".
     *
     * "Server topology : Site to server mapping"
     *
     */
    protected TableSsoServerSiteMapTable SsoServerSiteMapTable;

    /**
     * Variable for storing the value of "SsoServerSitesTable".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.8.2".
     *
     * "Server topology : sites and servers"
     *
     */
    protected TableSsoServerSitesTable SsoServerSitesTable;

    /**
     * Variable for storing the value of "SsoServerServerTable".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.8.1".
     *
     * "Server topology : all servers known to this server & their state"
     *
     */
    protected TableSsoServerServerTable SsoServerServerTable;


    /**
     * Constructor for the "SsoServerTopology" group.
     * If the group contains a table, the entries created through an SNMP SET will not be registered in Java DMK.
     */
    public SsoServerTopology(SnmpMib myMib) {
        SsoServerSiteMapTable = new TableSsoServerSiteMapTable (myMib);
        SsoServerSitesTable = new TableSsoServerSitesTable (myMib);
        SsoServerServerTable = new TableSsoServerServerTable (myMib);
    }


    /**
     * Constructor for the "SsoServerTopology" group.
     * If the group contains a table, the entries created through an SNMP SET will be AUTOMATICALLY REGISTERED in Java DMK.
     */
    public SsoServerTopology(SnmpMib myMib, MBeanServer server) {
        SsoServerSiteMapTable = new TableSsoServerSiteMapTable (myMib, server);
        SsoServerSitesTable = new TableSsoServerSitesTable (myMib, server);
        SsoServerServerTable = new TableSsoServerServerTable (myMib, server);
    }

    /**
     * Access the "SsoServerSiteMapTable" variable.
     */
    public TableSsoServerSiteMapTable accessSsoServerSiteMapTable() throws SnmpStatusException {
        return SsoServerSiteMapTable;
    }

    /**
     * Access the "SsoServerSiteMapTable" variable as a bean indexed property.
     */
    public SsoServerSiteMapEntryMBean[] getSsoServerSiteMapTable() throws SnmpStatusException {
        return SsoServerSiteMapTable.getEntries();
    }

    /**
     * Access the "SsoServerSitesTable" variable.
     */
    public TableSsoServerSitesTable accessSsoServerSitesTable() throws SnmpStatusException {
        return SsoServerSitesTable;
    }

    /**
     * Access the "SsoServerSitesTable" variable as a bean indexed property.
     */
    public SsoServerSitesEntryMBean[] getSsoServerSitesTable() throws SnmpStatusException {
        return SsoServerSitesTable.getEntries();
    }

    /**
     * Access the "SsoServerServerTable" variable.
     */
    public TableSsoServerServerTable accessSsoServerServerTable() throws SnmpStatusException {
        return SsoServerServerTable;
    }

    /**
     * Access the "SsoServerServerTable" variable as a bean indexed property.
     */
    public SsoServerServerEntryMBean[] getSsoServerServerTable() throws SnmpStatusException {
        return SsoServerServerTable.getEntries();
    }

}
