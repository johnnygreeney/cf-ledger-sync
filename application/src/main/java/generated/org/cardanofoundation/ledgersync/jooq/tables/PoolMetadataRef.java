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
import org.cardanofoundation.ledgersync.jooq.tables.records.PoolMetadataRefRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class PoolMetadataRef extends TableImpl<PoolMetadataRefRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pool_metadata_ref</code>
     */
    public static final PoolMetadataRef POOL_METADATA_REF = new PoolMetadataRef();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoolMetadataRefRecord> getRecordType() {
        return PoolMetadataRefRecord.class;
    }

    /**
     * The column <code>pool_metadata_ref.id</code>.
     */
    public final TableField<PoolMetadataRefRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>pool_metadata_ref.hash</code>.
     */
    public final TableField<PoolMetadataRefRecord, String> HASH = createField(DSL.name("hash"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>pool_metadata_ref.url</code>.
     */
    public final TableField<PoolMetadataRefRecord, String> URL = createField(DSL.name("url"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>pool_metadata_ref.pool_id</code>.
     */
    public final TableField<PoolMetadataRefRecord, Long> POOL_ID = createField(DSL.name("pool_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pool_metadata_ref.registered_tx_id</code>.
     */
    public final TableField<PoolMetadataRefRecord, Long> REGISTERED_TX_ID = createField(DSL.name("registered_tx_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private PoolMetadataRef(Name alias, Table<PoolMetadataRefRecord> aliased) {
        this(alias, aliased, null);
    }

    private PoolMetadataRef(Name alias, Table<PoolMetadataRefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pool_metadata_ref</code> table reference
     */
    public PoolMetadataRef(String alias) {
        this(DSL.name(alias), POOL_METADATA_REF);
    }

    /**
     * Create an aliased <code>pool_metadata_ref</code> table reference
     */
    public PoolMetadataRef(Name alias) {
        this(alias, POOL_METADATA_REF);
    }

    /**
     * Create a <code>pool_metadata_ref</code> table reference
     */
    public PoolMetadataRef() {
        this(DSL.name("pool_metadata_ref"), null);
    }

    public <O extends Record> PoolMetadataRef(Table<O> child, ForeignKey<O, PoolMetadataRefRecord> key) {
        super(child, key, POOL_METADATA_REF);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_POOL_METADATA_REF_REGISTERED_TX_ID);
    }

    @Override
    public Identity<PoolMetadataRefRecord, Long> getIdentity() {
        return (Identity<PoolMetadataRefRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PoolMetadataRefRecord> getPrimaryKey() {
        return Keys.POOL_METADATA_REF_PKEY;
    }

    @Override
    public List<UniqueKey<PoolMetadataRefRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_POOL_METADATA_REF);
    }

    @Override
    public PoolMetadataRef as(String alias) {
        return new PoolMetadataRef(DSL.name(alias), this);
    }

    @Override
    public PoolMetadataRef as(Name alias) {
        return new PoolMetadataRef(alias, this);
    }

    @Override
    public PoolMetadataRef as(Table<?> alias) {
        return new PoolMetadataRef(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolMetadataRef rename(String name) {
        return new PoolMetadataRef(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolMetadataRef rename(Name name) {
        return new PoolMetadataRef(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolMetadataRef rename(Table<?> name) {
        return new PoolMetadataRef(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
