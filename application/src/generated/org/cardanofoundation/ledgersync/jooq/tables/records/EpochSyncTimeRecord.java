/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import org.cardanofoundation.ledgersync.jooq.tables.EpochSyncTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpochSyncTimeRecord extends UpdatableRecordImpl<EpochSyncTimeRecord> implements Record4<Long, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>epoch_sync_time.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>epoch_sync_time.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>epoch_sync_time.no</code>.
     */
    public void setNo(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>epoch_sync_time.no</code>.
     */
    public Long getNo() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>epoch_sync_time.seconds</code>.
     */
    public void setSeconds(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>epoch_sync_time.seconds</code>.
     */
    public Long getSeconds() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>epoch_sync_time.state</code>.
     */
    public void setState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>epoch_sync_time.state</code>.
     */
    public String getState() {
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
    public Row4<Long, Long, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return EpochSyncTime.EPOCH_SYNC_TIME.ID;
    }

    @Override
    public Field<Long> field2() {
        return EpochSyncTime.EPOCH_SYNC_TIME.NO;
    }

    @Override
    public Field<Long> field3() {
        return EpochSyncTime.EPOCH_SYNC_TIME.SECONDS;
    }

    @Override
    public Field<String> field4() {
        return EpochSyncTime.EPOCH_SYNC_TIME.STATE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getNo();
    }

    @Override
    public Long component3() {
        return getSeconds();
    }

    @Override
    public String component4() {
        return getState();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getNo();
    }

    @Override
    public Long value3() {
        return getSeconds();
    }

    @Override
    public String value4() {
        return getState();
    }

    @Override
    public EpochSyncTimeRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public EpochSyncTimeRecord value2(Long value) {
        setNo(value);
        return this;
    }

    @Override
    public EpochSyncTimeRecord value3(Long value) {
        setSeconds(value);
        return this;
    }

    @Override
    public EpochSyncTimeRecord value4(String value) {
        setState(value);
        return this;
    }

    @Override
    public EpochSyncTimeRecord values(Long value1, Long value2, Long value3, String value4) {
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
     * Create a detached EpochSyncTimeRecord
     */
    public EpochSyncTimeRecord() {
        super(EpochSyncTime.EPOCH_SYNC_TIME);
    }

    /**
     * Create a detached, initialised EpochSyncTimeRecord
     */
    public EpochSyncTimeRecord(Long id, Long no, Long seconds, String state) {
        super(EpochSyncTime.EPOCH_SYNC_TIME);

        setId(id);
        setNo(no);
        setSeconds(seconds);
        setState(state);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised EpochSyncTimeRecord
     */
    public EpochSyncTimeRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochSyncTime value) {
        super(EpochSyncTime.EPOCH_SYNC_TIME);

        if (value != null) {
            setId(value.getId());
            setNo(value.getNo());
            setSeconds(value.getSeconds());
            setState(value.getState());
            resetChangedOnNotNull();
        }
    }
}
