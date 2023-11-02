/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.cardanofoundation.ledgersync.jooq.DefaultSchema;
import org.cardanofoundation.ledgersync.jooq.Indexes;
import org.cardanofoundation.ledgersync.jooq.Keys;
import org.cardanofoundation.ledgersync.jooq.tables.records.RedeemerRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
public class Redeemer extends TableImpl<RedeemerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>redeemer</code>
     */
    public static final Redeemer REDEEMER = new Redeemer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RedeemerRecord> getRecordType() {
        return RedeemerRecord.class;
    }

    /**
     * The column <code>redeemer.id</code>.
     */
    public final TableField<RedeemerRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>redeemer.fee</code>.
     */
    public final TableField<RedeemerRecord, BigInteger> FEE = createField(DSL.name("fee"), SQLDataType.DECIMAL_INTEGER(20), this, "");

    /**
     * The column <code>redeemer.index</code>.
     */
    public final TableField<RedeemerRecord, Integer> INDEX = createField(DSL.name("index"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>redeemer.purpose</code>.
     */
    public final TableField<RedeemerRecord, String> PURPOSE = createField(DSL.name("purpose"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>redeemer.script_hash</code>.
     */
    public final TableField<RedeemerRecord, String> SCRIPT_HASH = createField(DSL.name("script_hash"), SQLDataType.VARCHAR(56), this, "");

    /**
     * The column <code>redeemer.unit_mem</code>.
     */
    public final TableField<RedeemerRecord, Long> UNIT_MEM = createField(DSL.name("unit_mem"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>redeemer.unit_steps</code>.
     */
    public final TableField<RedeemerRecord, Long> UNIT_STEPS = createField(DSL.name("unit_steps"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>redeemer.redeemer_data_id</code>.
     */
    public final TableField<RedeemerRecord, Long> REDEEMER_DATA_ID = createField(DSL.name("redeemer_data_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>redeemer.tx_id</code>.
     */
    public final TableField<RedeemerRecord, Long> TX_ID = createField(DSL.name("tx_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private Redeemer(Name alias, Table<RedeemerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Redeemer(Name alias, Table<RedeemerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>redeemer</code> table reference
     */
    public Redeemer(String alias) {
        this(DSL.name(alias), REDEEMER);
    }

    /**
     * Create an aliased <code>redeemer</code> table reference
     */
    public Redeemer(Name alias) {
        this(alias, REDEEMER);
    }

    /**
     * Create a <code>redeemer</code> table reference
     */
    public Redeemer() {
        this(DSL.name("redeemer"), null);
    }

    public <O extends Record> Redeemer(Table<O> child, ForeignKey<O, RedeemerRecord> key) {
        super(child, key, REDEEMER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REDEEMER_REDEEMER_DATA_ID_IDX);
    }

    @Override
    public Identity<RedeemerRecord, Long> getIdentity() {
        return (Identity<RedeemerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RedeemerRecord> getPrimaryKey() {
        return Keys.REDEEMER_PKEY;
    }

    @Override
    public List<UniqueKey<RedeemerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_REDEEMER);
    }

    @Override
    public Redeemer as(String alias) {
        return new Redeemer(DSL.name(alias), this);
    }

    @Override
    public Redeemer as(Name alias) {
        return new Redeemer(alias, this);
    }

    @Override
    public Redeemer as(Table<?> alias) {
        return new Redeemer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Redeemer rename(String name) {
        return new Redeemer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Redeemer rename(Name name) {
        return new Redeemer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Redeemer rename(Table<?> name) {
        return new Redeemer(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, BigInteger, Integer, String, String, Long, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super BigInteger, ? super Integer, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super BigInteger, ? super Integer, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
