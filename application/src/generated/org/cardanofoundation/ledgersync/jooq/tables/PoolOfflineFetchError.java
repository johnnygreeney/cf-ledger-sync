/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.cardanofoundation.ledgersync.jooq.DefaultSchema;
import org.cardanofoundation.ledgersync.jooq.Indexes;
import org.cardanofoundation.ledgersync.jooq.Keys;
import org.cardanofoundation.ledgersync.jooq.tables.records.PoolOfflineFetchErrorRecord;
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
public class PoolOfflineFetchError extends TableImpl<PoolOfflineFetchErrorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pool_offline_fetch_error</code>
     */
    public static final PoolOfflineFetchError POOL_OFFLINE_FETCH_ERROR = new PoolOfflineFetchError();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoolOfflineFetchErrorRecord> getRecordType() {
        return PoolOfflineFetchErrorRecord.class;
    }

    /**
     * The column <code>pool_offline_fetch_error.id</code>.
     */
    public final TableField<PoolOfflineFetchErrorRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>pool_offline_fetch_error.fetch_error</code>.
     */
    public final TableField<PoolOfflineFetchErrorRecord, String> FETCH_ERROR = createField(DSL.name("fetch_error"), SQLDataType.VARCHAR(65535).nullable(false), this, "");

    /**
     * The column <code>pool_offline_fetch_error.fetch_time</code>.
     */
    public final TableField<PoolOfflineFetchErrorRecord, LocalDateTime> FETCH_TIME = createField(DSL.name("fetch_time"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>pool_offline_fetch_error.retry_count</code>.
     */
    public final TableField<PoolOfflineFetchErrorRecord, Integer> RETRY_COUNT = createField(DSL.name("retry_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pool_offline_fetch_error.pool_id</code>.
     */
    public final TableField<PoolOfflineFetchErrorRecord, Long> POOL_ID = createField(DSL.name("pool_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pool_offline_fetch_error.pmr_id</code>.
     */
    public final TableField<PoolOfflineFetchErrorRecord, Long> PMR_ID = createField(DSL.name("pmr_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private PoolOfflineFetchError(Name alias, Table<PoolOfflineFetchErrorRecord> aliased) {
        this(alias, aliased, null);
    }

    private PoolOfflineFetchError(Name alias, Table<PoolOfflineFetchErrorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pool_offline_fetch_error</code> table reference
     */
    public PoolOfflineFetchError(String alias) {
        this(DSL.name(alias), POOL_OFFLINE_FETCH_ERROR);
    }

    /**
     * Create an aliased <code>pool_offline_fetch_error</code> table reference
     */
    public PoolOfflineFetchError(Name alias) {
        this(alias, POOL_OFFLINE_FETCH_ERROR);
    }

    /**
     * Create a <code>pool_offline_fetch_error</code> table reference
     */
    public PoolOfflineFetchError() {
        this(DSL.name("pool_offline_fetch_error"), null);
    }

    public <O extends Record> PoolOfflineFetchError(Table<O> child, ForeignKey<O, PoolOfflineFetchErrorRecord> key) {
        super(child, key, POOL_OFFLINE_FETCH_ERROR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_POOL_OFFLINE_FETCH_ERROR_PMR_ID, Indexes.POOL_OFFLINE_FETCH_ERROR_POOL_ID_IDX, Indexes.POOL_OFFLINE_FETCH_ERROR_POOL_ID_PMR_ID_IDX);
    }

    @Override
    public Identity<PoolOfflineFetchErrorRecord, Long> getIdentity() {
        return (Identity<PoolOfflineFetchErrorRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PoolOfflineFetchErrorRecord> getPrimaryKey() {
        return Keys.POOL_OFFLINE_FETCH_ERROR_PKEY;
    }

    @Override
    public PoolOfflineFetchError as(String alias) {
        return new PoolOfflineFetchError(DSL.name(alias), this);
    }

    @Override
    public PoolOfflineFetchError as(Name alias) {
        return new PoolOfflineFetchError(alias, this);
    }

    @Override
    public PoolOfflineFetchError as(Table<?> alias) {
        return new PoolOfflineFetchError(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolOfflineFetchError rename(String name) {
        return new PoolOfflineFetchError(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolOfflineFetchError rename(Name name) {
        return new PoolOfflineFetchError(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolOfflineFetchError rename(Table<?> name) {
        return new PoolOfflineFetchError(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, LocalDateTime, Integer, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super String, ? super LocalDateTime, ? super Integer, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super String, ? super LocalDateTime, ? super Integer, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}