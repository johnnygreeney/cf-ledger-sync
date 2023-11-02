/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.cardanofoundation.ledgersync.jooq.DefaultSchema;
import org.cardanofoundation.ledgersync.jooq.Indexes;
import org.cardanofoundation.ledgersync.jooq.Keys;
import org.cardanofoundation.ledgersync.jooq.tables.records.StakeDeregistrationRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StakeDeregistration extends TableImpl<StakeDeregistrationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stake_deregistration</code>
     */
    public static final StakeDeregistration STAKE_DEREGISTRATION = new StakeDeregistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StakeDeregistrationRecord> getRecordType() {
        return StakeDeregistrationRecord.class;
    }

    /**
     * The column <code>stake_deregistration.id</code>.
     */
    public final TableField<StakeDeregistrationRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>stake_deregistration.cert_index</code>.
     */
    public final TableField<StakeDeregistrationRecord, Integer> CERT_INDEX = createField(DSL.name("cert_index"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stake_deregistration.epoch_no</code>.
     */
    public final TableField<StakeDeregistrationRecord, Integer> EPOCH_NO = createField(DSL.name("epoch_no"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stake_deregistration.addr_id</code>.
     */
    public final TableField<StakeDeregistrationRecord, Long> ADDR_ID = createField(DSL.name("addr_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>stake_deregistration.redeemer_id</code>.
     */
    public final TableField<StakeDeregistrationRecord, Long> REDEEMER_ID = createField(DSL.name("redeemer_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>stake_deregistration.tx_id</code>.
     */
    public final TableField<StakeDeregistrationRecord, Long> TX_ID = createField(DSL.name("tx_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private StakeDeregistration(Name alias, Table<StakeDeregistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private StakeDeregistration(Name alias, Table<StakeDeregistrationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stake_deregistration</code> table reference
     */
    public StakeDeregistration(String alias) {
        this(DSL.name(alias), STAKE_DEREGISTRATION);
    }

    /**
     * Create an aliased <code>stake_deregistration</code> table reference
     */
    public StakeDeregistration(Name alias) {
        this(alias, STAKE_DEREGISTRATION);
    }

    /**
     * Create a <code>stake_deregistration</code> table reference
     */
    public StakeDeregistration() {
        this(DSL.name("stake_deregistration"), null);
    }

    public <O extends Record> StakeDeregistration(Table<O> child, ForeignKey<O, StakeDeregistrationRecord> key) {
        super(child, key, STAKE_DEREGISTRATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_STAKE_DEREGISTRATION_ADDR_ID, Indexes.IDX_STAKE_DEREGISTRATION_REDEEMER_ID, Indexes.IDX_STAKE_DEREGISTRATION_TX_ID);
    }

    @Override
    public Identity<StakeDeregistrationRecord, Long> getIdentity() {
        return (Identity<StakeDeregistrationRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<StakeDeregistrationRecord> getPrimaryKey() {
        return Keys.STAKE_DEREGISTRATION_PKEY;
    }

    @Override
    public List<UniqueKey<StakeDeregistrationRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_STAKE_DEREGISTRATION);
    }

    @Override
    public StakeDeregistration as(String alias) {
        return new StakeDeregistration(DSL.name(alias), this);
    }

    @Override
    public StakeDeregistration as(Name alias) {
        return new StakeDeregistration(alias, this);
    }

    @Override
    public StakeDeregistration as(Table<?> alias) {
        return new StakeDeregistration(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public StakeDeregistration rename(String name) {
        return new StakeDeregistration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StakeDeregistration rename(Name name) {
        return new StakeDeregistration(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public StakeDeregistration rename(Table<?> name) {
        return new StakeDeregistration(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Integer, Integer, Long, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super Integer, ? super Integer, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super Integer, ? super Integer, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
