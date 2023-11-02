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
import org.cardanofoundation.ledgersync.jooq.tables.records.RedeemerDataRecord;
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
public class RedeemerData extends TableImpl<RedeemerDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>redeemer_data</code>
     */
    public static final RedeemerData REDEEMER_DATA = new RedeemerData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RedeemerDataRecord> getRecordType() {
        return RedeemerDataRecord.class;
    }

    /**
     * The column <code>redeemer_data.id</code>.
     */
    public final TableField<RedeemerDataRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>redeemer_data.bytes</code>.
     */
    public final TableField<RedeemerDataRecord, byte[]> BYTES = createField(DSL.name("bytes"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>redeemer_data.hash</code>.
     */
    public final TableField<RedeemerDataRecord, String> HASH = createField(DSL.name("hash"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>redeemer_data.value</code>.
     */
    public final TableField<RedeemerDataRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>redeemer_data.tx_id</code>.
     */
    public final TableField<RedeemerDataRecord, Long> TX_ID = createField(DSL.name("tx_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private RedeemerData(Name alias, Table<RedeemerDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private RedeemerData(Name alias, Table<RedeemerDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>redeemer_data</code> table reference
     */
    public RedeemerData(String alias) {
        this(DSL.name(alias), REDEEMER_DATA);
    }

    /**
     * Create an aliased <code>redeemer_data</code> table reference
     */
    public RedeemerData(Name alias) {
        this(alias, REDEEMER_DATA);
    }

    /**
     * Create a <code>redeemer_data</code> table reference
     */
    public RedeemerData() {
        this(DSL.name("redeemer_data"), null);
    }

    public <O extends Record> RedeemerData(Table<O> child, ForeignKey<O, RedeemerDataRecord> key) {
        super(child, key, REDEEMER_DATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REDEEMER_DATA_HASH_INDEX, Indexes.REDEEMER_DATA_TX_ID_IDX);
    }

    @Override
    public Identity<RedeemerDataRecord, Long> getIdentity() {
        return (Identity<RedeemerDataRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RedeemerDataRecord> getPrimaryKey() {
        return Keys.REDEEMER_DATA_PKEY;
    }

    @Override
    public List<UniqueKey<RedeemerDataRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_REDEEMER_DATA);
    }

    @Override
    public RedeemerData as(String alias) {
        return new RedeemerData(DSL.name(alias), this);
    }

    @Override
    public RedeemerData as(Name alias) {
        return new RedeemerData(alias, this);
    }

    @Override
    public RedeemerData as(Table<?> alias) {
        return new RedeemerData(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RedeemerData rename(String name) {
        return new RedeemerData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RedeemerData rename(Name name) {
        return new RedeemerData(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RedeemerData rename(Table<?> name) {
        return new RedeemerData(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, byte[], String, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super byte[], ? super String, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super byte[], ? super String, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
