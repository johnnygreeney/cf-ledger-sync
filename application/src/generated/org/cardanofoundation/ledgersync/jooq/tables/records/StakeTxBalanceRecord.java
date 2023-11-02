/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import java.time.LocalDateTime;

import org.cardanofoundation.ledgersync.jooq.tables.StakeTxBalance;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StakeTxBalanceRecord extends UpdatableRecordImpl<StakeTxBalanceRecord> implements Record5<Long, Long, Long, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stake_tx_balance.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>stake_tx_balance.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>stake_tx_balance.stake_address_id</code>.
     */
    public void setStakeAddressId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>stake_tx_balance.stake_address_id</code>.
     */
    public Long getStakeAddressId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>stake_tx_balance.tx_id</code>.
     */
    public void setTxId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>stake_tx_balance.tx_id</code>.
     */
    public Long getTxId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>stake_tx_balance.balance_change</code>.
     */
    public void setBalanceChange(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>stake_tx_balance.balance_change</code>.
     */
    public Long getBalanceChange() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>stake_tx_balance.time</code>.
     */
    public void setTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>stake_tx_balance.time</code>.
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, Long, Long, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StakeTxBalance.STAKE_TX_BALANCE.ID;
    }

    @Override
    public Field<Long> field2() {
        return StakeTxBalance.STAKE_TX_BALANCE.STAKE_ADDRESS_ID;
    }

    @Override
    public Field<Long> field3() {
        return StakeTxBalance.STAKE_TX_BALANCE.TX_ID;
    }

    @Override
    public Field<Long> field4() {
        return StakeTxBalance.STAKE_TX_BALANCE.BALANCE_CHANGE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return StakeTxBalance.STAKE_TX_BALANCE.TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getStakeAddressId();
    }

    @Override
    public Long component3() {
        return getTxId();
    }

    @Override
    public Long component4() {
        return getBalanceChange();
    }

    @Override
    public LocalDateTime component5() {
        return getTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getStakeAddressId();
    }

    @Override
    public Long value3() {
        return getTxId();
    }

    @Override
    public Long value4() {
        return getBalanceChange();
    }

    @Override
    public LocalDateTime value5() {
        return getTime();
    }

    @Override
    public StakeTxBalanceRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public StakeTxBalanceRecord value2(Long value) {
        setStakeAddressId(value);
        return this;
    }

    @Override
    public StakeTxBalanceRecord value3(Long value) {
        setTxId(value);
        return this;
    }

    @Override
    public StakeTxBalanceRecord value4(Long value) {
        setBalanceChange(value);
        return this;
    }

    @Override
    public StakeTxBalanceRecord value5(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public StakeTxBalanceRecord values(Long value1, Long value2, Long value3, Long value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StakeTxBalanceRecord
     */
    public StakeTxBalanceRecord() {
        super(StakeTxBalance.STAKE_TX_BALANCE);
    }

    /**
     * Create a detached, initialised StakeTxBalanceRecord
     */
    public StakeTxBalanceRecord(Long id, Long stakeAddressId, Long txId, Long balanceChange, LocalDateTime time) {
        super(StakeTxBalance.STAKE_TX_BALANCE);

        setId(id);
        setStakeAddressId(stakeAddressId);
        setTxId(txId);
        setBalanceChange(balanceChange);
        setTime(time);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StakeTxBalanceRecord
     */
    public StakeTxBalanceRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance value) {
        super(StakeTxBalance.STAKE_TX_BALANCE);

        if (value != null) {
            setId(value.getId());
            setStakeAddressId(value.getStakeAddressId());
            setTxId(value.getTxId());
            setBalanceChange(value.getBalanceChange());
            setTime(value.getTime());
            resetChangedOnNotNull();
        }
    }
}
