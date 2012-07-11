package com.sun.identity.monitoring;

//
// Generated by mibgen version 5.1 (03/08/07) when compiling SUN-OPENSSO-SERVER-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;

/**
 * The class is used for implementing the "SsoServerPolicy22AgentEntry" group.
 * The group is defined with the following oid: 1.3.6.1.4.1.42.2.230.3.1.1.2.1.21.5.1.
 */
public class SsoServerPolicy22AgentEntry implements SsoServerPolicy22AgentEntryMBean, Serializable {

    /**
     * Variable for storing the value of "Policy22AgentName".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.21.5.1.2".
     *
     * "Policy 2.2 Agent name"
     *
     */
    protected String Policy22AgentName = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "Policy22AgentIndex".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.21.5.1.1".
     *
     * "Policy 2.2 Agent index into table"
     *
     */
    protected Integer Policy22AgentIndex = new Integer(1);

    /**
     * Variable for storing the value of "SsoServerRealmIndex".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.9.1.1".
     *
     * "Realm index into table"
     *
     */
    protected Integer SsoServerRealmIndex = new Integer(1);


    /**
     * Constructor for the "SsoServerPolicy22AgentEntry" group.
     */
    public SsoServerPolicy22AgentEntry(SnmpMib myMib) {
    }

    /**
     * Getter for the "Policy22AgentName" variable.
     */
    public String getPolicy22AgentName() throws SnmpStatusException {
        return Policy22AgentName;
    }

    /**
     * Getter for the "Policy22AgentIndex" variable.
     */
    public Integer getPolicy22AgentIndex() throws SnmpStatusException {
        return Policy22AgentIndex;
    }

    /**
     * Getter for the "SsoServerRealmIndex" variable.
     */
    public Integer getSsoServerRealmIndex() throws SnmpStatusException {
        return SsoServerRealmIndex;
    }

}
