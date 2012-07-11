package com.sun.identity.monitoring;

//
// Generated by mibgen version 5.1 (03/08/07) when compiling SUN-OPENSSO-SERVER-MIB in standard metadata mode.
//


// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

/**
 * This interface is used for representing the remote management interface for the "SsoServerFedEntities" MBean.
 */
public interface SsoServerFedEntitiesMBean {

    /**
     * Access the "SsoServerFedEntitiesTable" variable.
     */
    public TableSsoServerFedEntitiesTable accessSsoServerFedEntitiesTable() throws SnmpStatusException;

}
