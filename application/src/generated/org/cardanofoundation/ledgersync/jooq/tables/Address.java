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
import org.cardanofoundation.ledgersync.jooq.tables.records.AddressRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>address.id</code>.
     */
    public final TableField<AddressRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>address.address</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS_ = createField(DSL.name("address"), SQLDataType.VARCHAR(65535).nullable(false), this, "");

    /**
     * The column <code>address.address_has_script</code>.
     */
    public final TableField<AddressRecord, Boolean> ADDRESS_HAS_SCRIPT = createField(DSL.name("address_has_script"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>address.balance</code>.
     */
    public final TableField<AddressRecord, BigInteger> BALANCE = createField(DSL.name("balance"), SQLDataType.DECIMAL_INTEGER(39).nullable(false), this, "");

    /**
     * The column <code>address.tx_count</code>.
     */
    public final TableField<AddressRecord, Long> TX_COUNT = createField(DSL.name("tx_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>address.stake_address_id</code>.
     */
    public final TableField<AddressRecord, Long> STAKE_ADDRESS_ID = createField(DSL.name("stake_address_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>address.verified_contract</code>.
     */
    public final TableField<AddressRecord, Boolean> VERIFIED_CONTRACT = createField(DSL.name("verified_contract"), SQLDataType.BOOLEAN, this, "");

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    /**
     * Create a <code>address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    public <O extends Record> Address(Table<O> child, ForeignKey<O, AddressRecord> key) {
        super(child, key, ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ADDRESS_ADDRESS_HAS_SCRIPT_IDX, Indexes.ADDRESS_BALANCE_IDX, Indexes.ADDRESS_TX_COUNT_IDX, Indexes.IDX_ADDRESS_ADDRESS, Indexes.IDX_ADDRESS_STAKE_ADDRESS_ID);
    }

    @Override
    public Identity<AddressRecord, Long> getIdentity() {
        return (Identity<AddressRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AddressRecord> getPrimaryKey() {
        return Keys.ADDRESS_PKEY;
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    @Override
    public Address as(Table<?> alias) {
        return new Address(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Table<?> name) {
        return new Address(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Boolean, BigInteger, Long, Long, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super String, ? super Boolean, ? super BigInteger, ? super Long, ? super Long, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super String, ? super Boolean, ? super BigInteger, ? super Long, ? super Long, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}