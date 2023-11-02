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
import org.cardanofoundation.ledgersync.jooq.tables.records.ReservedPoolTickerRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class ReservedPoolTicker extends TableImpl<ReservedPoolTickerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>reserved_pool_ticker</code>
     */
    public static final ReservedPoolTicker RESERVED_POOL_TICKER = new ReservedPoolTicker();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservedPoolTickerRecord> getRecordType() {
        return ReservedPoolTickerRecord.class;
    }

    /**
     * The column <code>reserved_pool_ticker.id</code>.
     */
    public final TableField<ReservedPoolTickerRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>reserved_pool_ticker.name</code>.
     */
    public final TableField<ReservedPoolTickerRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>reserved_pool_ticker.pool_hash</code>.
     */
    public final TableField<ReservedPoolTickerRecord, String> POOL_HASH = createField(DSL.name("pool_hash"), SQLDataType.VARCHAR(56).nullable(false), this, "");

    private ReservedPoolTicker(Name alias, Table<ReservedPoolTickerRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservedPoolTicker(Name alias, Table<ReservedPoolTickerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>reserved_pool_ticker</code> table reference
     */
    public ReservedPoolTicker(String alias) {
        this(DSL.name(alias), RESERVED_POOL_TICKER);
    }

    /**
     * Create an aliased <code>reserved_pool_ticker</code> table reference
     */
    public ReservedPoolTicker(Name alias) {
        this(alias, RESERVED_POOL_TICKER);
    }

    /**
     * Create a <code>reserved_pool_ticker</code> table reference
     */
    public ReservedPoolTicker() {
        this(DSL.name("reserved_pool_ticker"), null);
    }

    public <O extends Record> ReservedPoolTicker(Table<O> child, ForeignKey<O, ReservedPoolTickerRecord> key) {
        super(child, key, RESERVED_POOL_TICKER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_RESERVED_POOL_TICKER_POOL_HASH);
    }

    @Override
    public Identity<ReservedPoolTickerRecord, Long> getIdentity() {
        return (Identity<ReservedPoolTickerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReservedPoolTickerRecord> getPrimaryKey() {
        return Keys.RESERVED_POOL_TICKER_PKEY;
    }

    @Override
    public List<UniqueKey<ReservedPoolTickerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_RESERVED_POOL_TICKER);
    }

    @Override
    public ReservedPoolTicker as(String alias) {
        return new ReservedPoolTicker(DSL.name(alias), this);
    }

    @Override
    public ReservedPoolTicker as(Name alias) {
        return new ReservedPoolTicker(alias, this);
    }

    @Override
    public ReservedPoolTicker as(Table<?> alias) {
        return new ReservedPoolTicker(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservedPoolTicker rename(String name) {
        return new ReservedPoolTicker(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservedPoolTicker rename(Name name) {
        return new ReservedPoolTicker(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservedPoolTicker rename(Table<?> name) {
        return new ReservedPoolTicker(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}