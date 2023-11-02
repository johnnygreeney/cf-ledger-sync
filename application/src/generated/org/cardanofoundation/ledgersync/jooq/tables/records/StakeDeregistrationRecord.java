/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import org.cardanofoundation.ledgersync.jooq.tables.StakeDeregistration;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StakeDeregistrationRecord extends UpdatableRecordImpl<StakeDeregistrationRecord> implements Record6<Long, Integer, Integer, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stake_deregistration.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>stake_deregistration.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>stake_deregistration.cert_index</code>.
     */
    public void setCertIndex(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>stake_deregistration.cert_index</code>.
     */
    public Integer getCertIndex() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>stake_deregistration.epoch_no</code>.
     */
    public void setEpochNo(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>stake_deregistration.epoch_no</code>.
     */
    public Integer getEpochNo() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>stake_deregistration.addr_id</code>.
     */
    public void setAddrId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>stake_deregistration.addr_id</code>.
     */
    public Long getAddrId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>stake_deregistration.redeemer_id</code>.
     */
    public void setRedeemerId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>stake_deregistration.redeemer_id</code>.
     */
    public Long getRedeemerId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>stake_deregistration.tx_id</code>.
     */
    public void setTxId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>stake_deregistration.tx_id</code>.
     */
    public Long getTxId() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Integer, Integer, Long, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Integer, Integer, Long, Long, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StakeDeregistration.STAKE_DEREGISTRATION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return StakeDeregistration.STAKE_DEREGISTRATION.CERT_INDEX;
    }

    @Override
    public Field<Integer> field3() {
        return StakeDeregistration.STAKE_DEREGISTRATION.EPOCH_NO;
    }

    @Override
    public Field<Long> field4() {
        return StakeDeregistration.STAKE_DEREGISTRATION.ADDR_ID;
    }

    @Override
    public Field<Long> field5() {
        return StakeDeregistration.STAKE_DEREGISTRATION.REDEEMER_ID;
    }

    @Override
    public Field<Long> field6() {
        return StakeDeregistration.STAKE_DEREGISTRATION.TX_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getCertIndex();
    }

    @Override
    public Integer component3() {
        return getEpochNo();
    }

    @Override
    public Long component4() {
        return getAddrId();
    }

    @Override
    public Long component5() {
        return getRedeemerId();
    }

    @Override
    public Long component6() {
        return getTxId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getCertIndex();
    }

    @Override
    public Integer value3() {
        return getEpochNo();
    }

    @Override
    public Long value4() {
        return getAddrId();
    }

    @Override
    public Long value5() {
        return getRedeemerId();
    }

    @Override
    public Long value6() {
        return getTxId();
    }

    @Override
    public StakeDeregistrationRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public StakeDeregistrationRecord value2(Integer value) {
        setCertIndex(value);
        return this;
    }

    @Override
    public StakeDeregistrationRecord value3(Integer value) {
        setEpochNo(value);
        return this;
    }

    @Override
    public StakeDeregistrationRecord value4(Long value) {
        setAddrId(value);
        return this;
    }

    @Override
    public StakeDeregistrationRecord value5(Long value) {
        setRedeemerId(value);
        return this;
    }

    @Override
    public StakeDeregistrationRecord value6(Long value) {
        setTxId(value);
        return this;
    }

    @Override
    public StakeDeregistrationRecord values(Long value1, Integer value2, Integer value3, Long value4, Long value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StakeDeregistrationRecord
     */
    public StakeDeregistrationRecord() {
        super(StakeDeregistration.STAKE_DEREGISTRATION);
    }

    /**
     * Create a detached, initialised StakeDeregistrationRecord
     */
    public StakeDeregistrationRecord(Long id, Integer certIndex, Integer epochNo, Long addrId, Long redeemerId, Long txId) {
        super(StakeDeregistration.STAKE_DEREGISTRATION);

        setId(id);
        setCertIndex(certIndex);
        setEpochNo(epochNo);
        setAddrId(addrId);
        setRedeemerId(redeemerId);
        setTxId(txId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StakeDeregistrationRecord
     */
    public StakeDeregistrationRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeDeregistration value) {
        super(StakeDeregistration.STAKE_DEREGISTRATION);

        if (value != null) {
            setId(value.getId());
            setCertIndex(value.getCertIndex());
            setEpochNo(value.getEpochNo());
            setAddrId(value.getAddrId());
            setRedeemerId(value.getRedeemerId());
            setTxId(value.getTxId());
            resetChangedOnNotNull();
        }
    }
}
