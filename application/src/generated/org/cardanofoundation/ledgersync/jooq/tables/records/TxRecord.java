/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import java.math.BigInteger;

import org.cardanofoundation.ledgersync.jooq.tables.Tx;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TxRecord extends UpdatableRecordImpl<TxRecord> implements Record13<Long, Long, Long, Long, BigInteger, String, BigInteger, BigInteger, BigInteger, Integer, Integer, Boolean, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>tx.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>tx.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>tx.block_id</code>.
     */
    public void setBlockId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>tx.block_id</code>.
     */
    public Long getBlockId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>tx.block_index</code>.
     */
    public void setBlockIndex(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>tx.block_index</code>.
     */
    public Long getBlockIndex() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>tx.deposit</code>.
     */
    public void setDeposit(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>tx.deposit</code>.
     */
    public Long getDeposit() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>tx.fee</code>.
     */
    public void setFee(BigInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>tx.fee</code>.
     */
    public BigInteger getFee() {
        return (BigInteger) get(4);
    }

    /**
     * Setter for <code>tx.hash</code>.
     */
    public void setHash(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>tx.hash</code>.
     */
    public String getHash() {
        return (String) get(5);
    }

    /**
     * Setter for <code>tx.invalid_before</code>.
     */
    public void setInvalidBefore(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>tx.invalid_before</code>.
     */
    public BigInteger getInvalidBefore() {
        return (BigInteger) get(6);
    }

    /**
     * Setter for <code>tx.invalid_hereafter</code>.
     */
    public void setInvalidHereafter(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>tx.invalid_hereafter</code>.
     */
    public BigInteger getInvalidHereafter() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>tx.out_sum</code>.
     */
    public void setOutSum(BigInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>tx.out_sum</code>.
     */
    public BigInteger getOutSum() {
        return (BigInteger) get(8);
    }

    /**
     * Setter for <code>tx.script_size</code>.
     */
    public void setScriptSize(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>tx.script_size</code>.
     */
    public Integer getScriptSize() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>tx.size</code>.
     */
    public void setSize(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>tx.size</code>.
     */
    public Integer getSize() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>tx.valid_contract</code>.
     */
    public void setValidContract(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>tx.valid_contract</code>.
     */
    public Boolean getValidContract() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>tx.tx_metadata_hash_id</code>.
     */
    public void setTxMetadataHashId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>tx.tx_metadata_hash_id</code>.
     */
    public Long getTxMetadataHashId() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, Long, Long, BigInteger, String, BigInteger, BigInteger, BigInteger, Integer, Integer, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, Long, Long, BigInteger, String, BigInteger, BigInteger, BigInteger, Integer, Integer, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Tx.TX.ID;
    }

    @Override
    public Field<Long> field2() {
        return Tx.TX.BLOCK_ID;
    }

    @Override
    public Field<Long> field3() {
        return Tx.TX.BLOCK_INDEX;
    }

    @Override
    public Field<Long> field4() {
        return Tx.TX.DEPOSIT;
    }

    @Override
    public Field<BigInteger> field5() {
        return Tx.TX.FEE;
    }

    @Override
    public Field<String> field6() {
        return Tx.TX.HASH;
    }

    @Override
    public Field<BigInteger> field7() {
        return Tx.TX.INVALID_BEFORE;
    }

    @Override
    public Field<BigInteger> field8() {
        return Tx.TX.INVALID_HEREAFTER;
    }

    @Override
    public Field<BigInteger> field9() {
        return Tx.TX.OUT_SUM;
    }

    @Override
    public Field<Integer> field10() {
        return Tx.TX.SCRIPT_SIZE;
    }

    @Override
    public Field<Integer> field11() {
        return Tx.TX.SIZE;
    }

    @Override
    public Field<Boolean> field12() {
        return Tx.TX.VALID_CONTRACT;
    }

    @Override
    public Field<Long> field13() {
        return Tx.TX.TX_METADATA_HASH_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getBlockId();
    }

    @Override
    public Long component3() {
        return getBlockIndex();
    }

    @Override
    public Long component4() {
        return getDeposit();
    }

    @Override
    public BigInteger component5() {
        return getFee();
    }

    @Override
    public String component6() {
        return getHash();
    }

    @Override
    public BigInteger component7() {
        return getInvalidBefore();
    }

    @Override
    public BigInteger component8() {
        return getInvalidHereafter();
    }

    @Override
    public BigInteger component9() {
        return getOutSum();
    }

    @Override
    public Integer component10() {
        return getScriptSize();
    }

    @Override
    public Integer component11() {
        return getSize();
    }

    @Override
    public Boolean component12() {
        return getValidContract();
    }

    @Override
    public Long component13() {
        return getTxMetadataHashId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getBlockId();
    }

    @Override
    public Long value3() {
        return getBlockIndex();
    }

    @Override
    public Long value4() {
        return getDeposit();
    }

    @Override
    public BigInteger value5() {
        return getFee();
    }

    @Override
    public String value6() {
        return getHash();
    }

    @Override
    public BigInteger value7() {
        return getInvalidBefore();
    }

    @Override
    public BigInteger value8() {
        return getInvalidHereafter();
    }

    @Override
    public BigInteger value9() {
        return getOutSum();
    }

    @Override
    public Integer value10() {
        return getScriptSize();
    }

    @Override
    public Integer value11() {
        return getSize();
    }

    @Override
    public Boolean value12() {
        return getValidContract();
    }

    @Override
    public Long value13() {
        return getTxMetadataHashId();
    }

    @Override
    public TxRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TxRecord value2(Long value) {
        setBlockId(value);
        return this;
    }

    @Override
    public TxRecord value3(Long value) {
        setBlockIndex(value);
        return this;
    }

    @Override
    public TxRecord value4(Long value) {
        setDeposit(value);
        return this;
    }

    @Override
    public TxRecord value5(BigInteger value) {
        setFee(value);
        return this;
    }

    @Override
    public TxRecord value6(String value) {
        setHash(value);
        return this;
    }

    @Override
    public TxRecord value7(BigInteger value) {
        setInvalidBefore(value);
        return this;
    }

    @Override
    public TxRecord value8(BigInteger value) {
        setInvalidHereafter(value);
        return this;
    }

    @Override
    public TxRecord value9(BigInteger value) {
        setOutSum(value);
        return this;
    }

    @Override
    public TxRecord value10(Integer value) {
        setScriptSize(value);
        return this;
    }

    @Override
    public TxRecord value11(Integer value) {
        setSize(value);
        return this;
    }

    @Override
    public TxRecord value12(Boolean value) {
        setValidContract(value);
        return this;
    }

    @Override
    public TxRecord value13(Long value) {
        setTxMetadataHashId(value);
        return this;
    }

    @Override
    public TxRecord values(Long value1, Long value2, Long value3, Long value4, BigInteger value5, String value6, BigInteger value7, BigInteger value8, BigInteger value9, Integer value10, Integer value11, Boolean value12, Long value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxRecord
     */
    public TxRecord() {
        super(Tx.TX);
    }

    /**
     * Create a detached, initialised TxRecord
     */
    public TxRecord(Long id, Long blockId, Long blockIndex, Long deposit, BigInteger fee, String hash, BigInteger invalidBefore, BigInteger invalidHereafter, BigInteger outSum, Integer scriptSize, Integer size, Boolean validContract, Long txMetadataHashId) {
        super(Tx.TX);

        setId(id);
        setBlockId(blockId);
        setBlockIndex(blockIndex);
        setDeposit(deposit);
        setFee(fee);
        setHash(hash);
        setInvalidBefore(invalidBefore);
        setInvalidHereafter(invalidHereafter);
        setOutSum(outSum);
        setScriptSize(scriptSize);
        setSize(size);
        setValidContract(validContract);
        setTxMetadataHashId(txMetadataHashId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TxRecord
     */
    public TxRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.Tx value) {
        super(Tx.TX);

        if (value != null) {
            setId(value.getId());
            setBlockId(value.getBlockId());
            setBlockIndex(value.getBlockIndex());
            setDeposit(value.getDeposit());
            setFee(value.getFee());
            setHash(value.getHash());
            setInvalidBefore(value.getInvalidBefore());
            setInvalidHereafter(value.getInvalidHereafter());
            setOutSum(value.getOutSum());
            setScriptSize(value.getScriptSize());
            setSize(value.getSize());
            setValidContract(value.getValidContract());
            setTxMetadataHashId(value.getTxMetadataHashId());
            resetChangedOnNotNull();
        }
    }
}
