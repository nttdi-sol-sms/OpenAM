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
 * The class is used for implementing the "SsoServerSAML1EndPointEntry" group.
 * The group is defined with the following oid: 1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.
 */
public class SsoServerSAML1EndPointEntry implements SsoServerSAML1EndPointEntryMBean, Serializable {

    /**
     * Variable for storing the value of "SAML1EndPointRqtFailed".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.6".
     *
     * "Count of SAML1 EndPoint Requests Failed"
     *
     */
    protected Long SAML1EndPointRqtFailed = new Long(1);

    /**
     * Variable for storing the value of "SAML1EndPointRqtOut".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.5".
     *
     * "Count of SAML1 EndPoint Requests Out"
     *
     */
    protected Long SAML1EndPointRqtOut = new Long(1);

    /**
     * Variable for storing the value of "SAML1EndPointRqtIn".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.4".
     *
     * "Count of SAML1 EndPoint Requests In"
     *
     */
    protected Long SAML1EndPointRqtIn = new Long(1);

    /**
     * Variable for storing the value of "SAML1EndPointStatus".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.3".
     *
     * "SAML1 EndPoint operational status : dormant | operational"
     *
     */
    protected String SAML1EndPointStatus = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "SAML1EndPointName".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.2".
     *
     * "SAML1 EndPoint name"
     *
     */
    protected String SAML1EndPointName = new String("JDMK 5.1");

    /**
     * Variable for storing the value of "SAML1EndPointIndex".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.1".
     *
     * "Realm index into table"
     *
     */
    protected Integer SAML1EndPointIndex = new Integer(1);

    /**
     * Variable for storing the value of "SAML1EndPointRqtAborted".
     * The variable is identified by: "1.3.6.1.4.1.42.2.230.3.1.1.2.1.16.2.1.7".
     *
     * "Count of SAML1 EndPoint Requests Aborted"
     *
     */
    protected Long SAML1EndPointRqtAborted = new Long(1);


    /**
     * Constructor for the "SsoServerSAML1EndPointEntry" group.
     */
    public SsoServerSAML1EndPointEntry(SnmpMib myMib) {
    }

    /**
     * Getter for the "SAML1EndPointRqtFailed" variable.
     */
    public Long getSAML1EndPointRqtFailed() throws SnmpStatusException {
        return SAML1EndPointRqtFailed;
    }

    /**
     * Getter for the "SAML1EndPointRqtOut" variable.
     */
    public Long getSAML1EndPointRqtOut() throws SnmpStatusException {
        return SAML1EndPointRqtOut;
    }

    /**
     * Getter for the "SAML1EndPointRqtIn" variable.
     */
    public Long getSAML1EndPointRqtIn() throws SnmpStatusException {
        return SAML1EndPointRqtIn;
    }

    /**
     * Getter for the "SAML1EndPointStatus" variable.
     */
    public String getSAML1EndPointStatus() throws SnmpStatusException {
        return SAML1EndPointStatus;
    }

    /**
     * Getter for the "SAML1EndPointName" variable.
     */
    public String getSAML1EndPointName() throws SnmpStatusException {
        return SAML1EndPointName;
    }

    /**
     * Getter for the "SAML1EndPointIndex" variable.
     */
    public Integer getSAML1EndPointIndex() throws SnmpStatusException {
        return SAML1EndPointIndex;
    }

    /**
     * Getter for the "SAML1EndPointRqtAborted" variable.
     */
    public Long getSAML1EndPointRqtAborted() throws SnmpStatusException {
        return SAML1EndPointRqtAborted;
    }

}
