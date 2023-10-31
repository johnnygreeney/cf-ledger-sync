/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import java.math.BigInteger;

import org.cardanofoundation.ledgersync.jooq.tables.Reward;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RewardRecord extends UpdatableRecordImpl<RewardRecord> implements Record7<Long, BigInteger, Long, Long, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>reward.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>reward.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>reward.amount</code>.
     */
    public void setAmount(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>reward.amount</code>.
     */
    public BigInteger getAmount() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>reward.earned_epoch</code>.
     */
    public void setEarnedEpoch(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>reward.earned_epoch</code>.
     */
    public Long getEarnedEpoch() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>reward.spendable_epoch</code>.
     */
    public void setSpendableEpoch(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>reward.spendable_epoch</code>.
     */
    public Long getSpendableEpoch() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>reward.type</code>.
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>reward.type</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>reward.addr_id</code>.
     */
    public void setAddrId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>reward.addr_id</code>.
     */
    public Long getAddrId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>reward.pool_id</code>.
     */
    public void setPoolId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>reward.pool_id</code>.
     */
    public Long getPoolId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, BigInteger, Long, Long, String, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, BigInteger, Long, Long, String, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Reward.REWARD.ID;
    }

    @Override
    public Field<BigInteger> field2() {
        return Reward.REWARD.AMOUNT;
    }

    @Override
    public Field<Long> field3() {
        return Reward.REWARD.EARNED_EPOCH;
    }

    @Override
    public Field<Long> field4() {
        return Reward.REWARD.SPENDABLE_EPOCH;
    }

    @Override
    public Field<String> field5() {
        return Reward.REWARD.TYPE;
    }

    @Override
    public Field<Long> field6() {
        return Reward.REWARD.ADDR_ID;
    }

    @Override
    public Field<Long> field7() {
        return Reward.REWARD.POOL_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public BigInteger component2() {
        return getAmount();
    }

    @Override
    public Long component3() {
        return getEarnedEpoch();
    }

    @Override
    public Long component4() {
        return getSpendableEpoch();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public Long component6() {
        return getAddrId();
    }

    @Override
    public Long component7() {
        return getPoolId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public BigInteger value2() {
        return getAmount();
    }

    @Override
    public Long value3() {
        return getEarnedEpoch();
    }

    @Override
    public Long value4() {
        return getSpendableEpoch();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public Long value6() {
        return getAddrId();
    }

    @Override
    public Long value7() {
        return getPoolId();
    }

    @Override
    public RewardRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public RewardRecord value2(BigInteger value) {
        setAmount(value);
        return this;
    }

    @Override
    public RewardRecord value3(Long value) {
        setEarnedEpoch(value);
        return this;
    }

    @Override
    public RewardRecord value4(Long value) {
        setSpendableEpoch(value);
        return this;
    }

    @Override
    public RewardRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public RewardRecord value6(Long value) {
        setAddrId(value);
        return this;
    }

    @Override
    public RewardRecord value7(Long value) {
        setPoolId(value);
        return this;
    }

    @Override
    public RewardRecord values(Long value1, BigInteger value2, Long value3, Long value4, String value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RewardRecord
     */
    public RewardRecord() {
        super(Reward.REWARD);
    }

    /**
     * Create a detached, initialised RewardRecord
     */
    public RewardRecord(Long id, BigInteger amount, Long earnedEpoch, Long spendableEpoch, String type, Long addrId, Long poolId) {
        super(Reward.REWARD);

        setId(id);
        setAmount(amount);
        setEarnedEpoch(earnedEpoch);
        setSpendableEpoch(spendableEpoch);
        setType(type);
        setAddrId(addrId);
        setPoolId(poolId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RewardRecord
     */
    public RewardRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.Reward value) {
        super(Reward.REWARD);

        if (value != null) {
            setId(value.getId());
            setAmount(value.getAmount());
            setEarnedEpoch(value.getEarnedEpoch());
            setSpendableEpoch(value.getSpendableEpoch());
            setType(value.getType());
            setAddrId(value.getAddrId());
            setPoolId(value.getPoolId());
            resetChangedOnNotNull();
        }
    }
}
