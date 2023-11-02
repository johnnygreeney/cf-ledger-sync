/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables;


import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.cardanofoundation.ledgersync.jooq.DefaultSchema;
import org.cardanofoundation.ledgersync.jooq.Indexes;
import org.cardanofoundation.ledgersync.jooq.Keys;
import org.cardanofoundation.ledgersync.jooq.tables.records.EpochRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
public class Epoch extends TableImpl<EpochRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>epoch</code>
     */
    public static final Epoch EPOCH = new Epoch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpochRecord> getRecordType() {
        return EpochRecord.class;
    }

    /**
     * The column <code>epoch.id</code>.
     */
    public final TableField<EpochRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>epoch.blk_count</code>.
     */
    public final TableField<EpochRecord, Integer> BLK_COUNT = createField(DSL.name("blk_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>epoch.end_time</code>.
     */
    public final TableField<EpochRecord, LocalDateTime> END_TIME = createField(DSL.name("end_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>epoch.fees</code>.
     */
    public final TableField<EpochRecord, BigInteger> FEES = createField(DSL.name("fees"), SQLDataType.DECIMAL_INTEGER(20).nullable(false), this, "");

    /**
     * The column <code>epoch.max_slot</code>.
     */
    public final TableField<EpochRecord, Integer> MAX_SLOT = createField(DSL.name("max_slot"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>epoch.no</code>.
     */
    public final TableField<EpochRecord, Integer> NO = createField(DSL.name("no"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>epoch.out_sum</code>.
     */
    public final TableField<EpochRecord, BigInteger> OUT_SUM = createField(DSL.name("out_sum"), SQLDataType.DECIMAL_INTEGER(39).nullable(false), this, "");

    /**
     * The column <code>epoch.start_time</code>.
     */
    public final TableField<EpochRecord, LocalDateTime> START_TIME = createField(DSL.name("start_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>epoch.tx_count</code>.
     */
    public final TableField<EpochRecord, Integer> TX_COUNT = createField(DSL.name("tx_count"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>epoch.era</code>.
     */
    public final TableField<EpochRecord, Integer> ERA = createField(DSL.name("era"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>epoch.rewards_distributed</code>.
     */
    public final TableField<EpochRecord, BigInteger> REWARDS_DISTRIBUTED = createField(DSL.name("rewards_distributed"), SQLDataType.DECIMAL_INTEGER(20), this, "");

    private Epoch(Name alias, Table<EpochRecord> aliased) {
        this(alias, aliased, null);
    }

    private Epoch(Name alias, Table<EpochRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>epoch</code> table reference
     */
    public Epoch(String alias) {
        this(DSL.name(alias), EPOCH);
    }

    /**
     * Create an aliased <code>epoch</code> table reference
     */
    public Epoch(Name alias) {
        this(alias, EPOCH);
    }

    /**
     * Create a <code>epoch</code> table reference
     */
    public Epoch() {
        this(DSL.name("epoch"), null);
    }

    public <O extends Record> Epoch(Table<O> child, ForeignKey<O, EpochRecord> key) {
        super(child, key, EPOCH);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_EPOCH_NO);
    }

    @Override
    public Identity<EpochRecord, Long> getIdentity() {
        return (Identity<EpochRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<EpochRecord> getPrimaryKey() {
        return Keys.EPOCH_PKEY;
    }

    @Override
    public List<UniqueKey<EpochRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_EPOCH);
    }

    @Override
    public Epoch as(String alias) {
        return new Epoch(DSL.name(alias), this);
    }

    @Override
    public Epoch as(Name alias) {
        return new Epoch(alias, this);
    }

    @Override
    public Epoch as(Table<?> alias) {
        return new Epoch(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Epoch rename(String name) {
        return new Epoch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Epoch rename(Name name) {
        return new Epoch(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Epoch rename(Table<?> name) {
        return new Epoch(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Integer, LocalDateTime, BigInteger, Integer, Integer, BigInteger, LocalDateTime, Integer, Integer, BigInteger> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Long, ? super Integer, ? super LocalDateTime, ? super BigInteger, ? super Integer, ? super Integer, ? super BigInteger, ? super LocalDateTime, ? super Integer, ? super Integer, ? super BigInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Long, ? super Integer, ? super LocalDateTime, ? super BigInteger, ? super Integer, ? super Integer, ? super BigInteger, ? super LocalDateTime, ? super Integer, ? super Integer, ? super BigInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
