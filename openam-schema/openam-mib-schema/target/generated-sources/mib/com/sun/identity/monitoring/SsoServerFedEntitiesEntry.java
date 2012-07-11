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
 * The class is used for implementing the "SsoServerFedEntitiesEntry" group.
 * The group is defined with the following oid: 1.3.6.1.4.1.42.2.230.3.1.1.2.1.19.1.1.
 */
public class SsoServerFedEntitiesEntry implements SsoServerFedEntitiesEntryMBean, Serializable {

    /**
     * Variable for storing the value of "FedEntityType".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.19.1.1.5".
     *
     * "Federation Entity Type"
     *
     */
    protected String FedEntityType = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "FedEntityLoc".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.19.1.1.4".
     *
     * "Federation Entity Location"
     *
     */
    protected String FedEntityLoc = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "FedEntityProto".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.19.1.1.3".
     *
     * "Federation Entity protocol"
     *
     */
    protected String FedEntityProto = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "FedEntityName".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.19.1.1.2".
     *
     * "Federation Entity name"
     *
     */
    protected String FedEntityName = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "FedEntityIndex".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.19.1.1.1".
     *
     * "Entity index into table"
     *
     */
    protected Integer FedEntityIndex = new Integer(1);

    /**
     * Variable for storing the value of "SsoServerRealmIndex".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.9.1.1".
     *
     * "Realm index into table"
     *
     */
    protected Integer SsoServerRealmIndex = new Integer(1);


    /**
     * Constructor for the "SsoServerFedEntitiesEntry" group.
     */
    public SsoServerFedEntitiesEntry(SnmpMib myMib) {
    }

    /**
     * Getter for the "FedEntityType" variable.
     */
    public String getFedEntityType() throws SnmpStatusException {
        return FedEntityType;
    }

    /**
     * Getter for the "FedEntityLoc" variable.
     */
    public String getFedEntityLoc() throws SnmpStatusException {
        return FedEntityLoc;
    }

    /**
     * Getter for the "FedEntityProto" variable.
     */
    public String getFedEntityProto() throws SnmpStatusException {
        return FedEntityProto;
    }

    /**
     * Getter for the "FedEntityName" variable.
     */
    public String getFedEntityName() throws SnmpStatusException {
        return FedEntityName;
    }

    /**
     * Getter for the "FedEntityIndex" variable.
     */
    public Integer getFedEntityIndex() throws SnmpStatusException {
        return FedEntityIndex;
    }

    /**
     * Getter for the "SsoServerRealmIndex" variable.
     */
    public Integer getSsoServerRealmIndex() throws SnmpStatusException {
        return SsoServerRealmIndex;
    }

}
