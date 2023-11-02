/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import java.time.LocalDateTime;

import org.cardanofoundation.ledgersync.jooq.tables.Meta;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetaRecord extends UpdatableRecordImpl<MetaRecord> implements Record4<Long, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>meta.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>meta.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>meta.network_name</code>.
     */
    public void setNetworkName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>meta.network_name</code>.
     */
    public String getNetworkName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>meta.start_time</code>.
     */
    public void setStartTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>meta.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>meta.version</code>.
     */
    public void setVersion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>meta.version</code>.
     */
    public String getVersion() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, LocalDateTime, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Meta.META.ID;
    }

    @Override
    public Field<String> field2() {
        return Meta.META.NETWORK_NAME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Meta.META.START_TIME;
    }

    @Override
    public Field<String> field4() {
        return Meta.META.VERSION;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getNetworkName();
    }

    @Override
    public LocalDateTime component3() {
        return getStartTime();
    }

    @Override
    public String component4() {
        return getVersion();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getNetworkName();
    }

    @Override
    public LocalDateTime value3() {
        return getStartTime();
    }

    @Override
    public String value4() {
        return getVersion();
    }

    @Override
    public MetaRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MetaRecord value2(String value) {
        setNetworkName(value);
        return this;
    }

    @Override
    public MetaRecord value3(LocalDateTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public MetaRecord value4(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public MetaRecord values(Long value1, String value2, LocalDateTime value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetaRecord
     */
    public MetaRecord() {
        super(Meta.META);
    }

    /**
     * Create a detached, initialised MetaRecord
     */
    public MetaRecord(Long id, String networkName, LocalDateTime startTime, String version) {
        super(Meta.META);

        setId(id);
        setNetworkName(networkName);
        setStartTime(startTime);
        setVersion(version);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised MetaRecord
     */
    public MetaRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.Meta value) {
        super(Meta.META);

        if (value != null) {
            setId(value.getId());
            setNetworkName(value.getNetworkName());
            setStartTime(value.getStartTime());
            setVersion(value.getVersion());
            resetChangedOnNotNull();
        }
    }
}