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
import org.cardanofoundation.ledgersync.jooq.tables.records.PoolOwnerRecord;
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
public class PoolOwner extends TableImpl<PoolOwnerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pool_owner</code>
     */
    public static final PoolOwner POOL_OWNER = new PoolOwner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoolOwnerRecord> getRecordType() {
        return PoolOwnerRecord.class;
    }

    /**
     * The column <code>pool_owner.id</code>.
     */
    public final TableField<PoolOwnerRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>pool_owner.pool_update_id</code>.
     */
    public final TableField<PoolOwnerRecord, Long> POOL_UPDATE_ID = createField(DSL.name("pool_update_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pool_owner.addr_id</code>.
     */
    public final TableField<PoolOwnerRecord, Long> ADDR_ID = createField(DSL.name("addr_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private PoolOwner(Name alias, Table<PoolOwnerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PoolOwner(Name alias, Table<PoolOwnerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pool_owner</code> table reference
     */
    public PoolOwner(String alias) {
        this(DSL.name(alias), POOL_OWNER);
    }

    /**
     * Create an aliased <code>pool_owner</code> table reference
     */
    public PoolOwner(Name alias) {
        this(alias, POOL_OWNER);
    }

    /**
     * Create a <code>pool_owner</code> table reference
     */
    public PoolOwner() {
        this(DSL.name("pool_owner"), null);
    }

    public <O extends Record> PoolOwner(Table<O> child, ForeignKey<O, PoolOwnerRecord> key) {
        super(child, key, POOL_OWNER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.POOL_OWNER_POOL_UPDATE_ID_IDX);
    }

    @Override
    public Identity<PoolOwnerRecord, Long> getIdentity() {
        return (Identity<PoolOwnerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PoolOwnerRecord> getPrimaryKey() {
        return Keys.POOL_OWNER_PKEY;
    }

    @Override
    public List<UniqueKey<PoolOwnerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_POOL_OWNER);
    }

    @Override
    public PoolOwner as(String alias) {
        return new PoolOwner(DSL.name(alias), this);
    }

    @Override
    public PoolOwner as(Name alias) {
        return new PoolOwner(alias, this);
    }

    @Override
    public PoolOwner as(Table<?> alias) {
        return new PoolOwner(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolOwner rename(String name) {
        return new PoolOwner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolOwner rename(Name name) {
        return new PoolOwner(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoolOwner rename(Table<?> name) {
        return new PoolOwner(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
