/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import org.cardanofoundation.ledgersync.jooq.tables.ExtraKeyWitness;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExtraKeyWitnessRecord extends UpdatableRecordImpl<ExtraKeyWitnessRecord> implements Record3<Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>extra_key_witness.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>extra_key_witness.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>extra_key_witness.hash</code>.
     */
    public void setHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>extra_key_witness.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>extra_key_witness.tx_id</code>.
     */
    public void setTxId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>extra_key_witness.tx_id</code>.
     */
    public Long getTxId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ExtraKeyWitness.EXTRA_KEY_WITNESS.ID;
    }

    @Override
    public Field<String> field2() {
        return ExtraKeyWitness.EXTRA_KEY_WITNESS.HASH;
    }

    @Override
    public Field<Long> field3() {
        return ExtraKeyWitness.EXTRA_KEY_WITNESS.TX_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getHash();
    }

    @Override
    public Long component3() {
        return getTxId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getHash();
    }

    @Override
    public Long value3() {
        return getTxId();
    }

    @Override
    public ExtraKeyWitnessRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ExtraKeyWitnessRecord value2(String value) {
        setHash(value);
        return this;
    }

    @Override
    public ExtraKeyWitnessRecord value3(Long value) {
        setTxId(value);
        return this;
    }

    @Override
    public ExtraKeyWitnessRecord values(Long value1, String value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExtraKeyWitnessRecord
     */
    public ExtraKeyWitnessRecord() {
        super(ExtraKeyWitness.EXTRA_KEY_WITNESS);
    }

    /**
     * Create a detached, initialised ExtraKeyWitnessRecord
     */
    public ExtraKeyWitnessRecord(Long id, String hash, Long txId) {
        super(ExtraKeyWitness.EXTRA_KEY_WITNESS);

        setId(id);
        setHash(hash);
        setTxId(txId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ExtraKeyWitnessRecord
     */
    public ExtraKeyWitnessRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.ExtraKeyWitness value) {
        super(ExtraKeyWitness.EXTRA_KEY_WITNESS);

        if (value != null) {
            setId(value.getId());
            setHash(value.getHash());
            setTxId(value.getTxId());
            resetChangedOnNotNull();
        }
    }
}