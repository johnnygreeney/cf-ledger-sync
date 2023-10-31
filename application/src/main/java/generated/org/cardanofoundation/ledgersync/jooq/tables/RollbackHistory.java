/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables;


import java.time.LocalDateTime;
import java.util.function.Function;

import org.cardanofoundation.ledgersync.jooq.DefaultSchema;
import org.cardanofoundation.ledgersync.jooq.Keys;
import org.cardanofoundation.ledgersync.jooq.tables.records.RollbackHistoryRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
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
public class RollbackHistory extends TableImpl<RollbackHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>rollback_history</code>
     */
    public static final RollbackHistory ROLLBACK_HISTORY = new RollbackHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RollbackHistoryRecord> getRecordType() {
        return RollbackHistoryRecord.class;
    }

    /**
     * The column <code>rollback_history.id</code>.
     */
    public final TableField<RollbackHistoryRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rollback_history.block_hash</code>.
     */
    public final TableField<RollbackHistoryRecord, String> BLOCK_HASH = createField(DSL.name("block_hash"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>rollback_history.block_no</code>.
     */
    public final TableField<RollbackHistoryRecord, Long> BLOCK_NO = createField(DSL.name("block_no"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rollback_history.rollback_time</code>.
     */
    public final TableField<RollbackHistoryRecord, LocalDateTime> ROLLBACK_TIME = createField(DSL.name("rollback_time"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>rollback_history.slot_no</code>.
     */
    public final TableField<RollbackHistoryRecord, Long> SLOT_NO = createField(DSL.name("slot_no"), SQLDataType.BIGINT.nullable(false), this, "");

    private RollbackHistory(Name alias, Table<RollbackHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private RollbackHistory(Name alias, Table<RollbackHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>rollback_history</code> table reference
     */
    public RollbackHistory(String alias) {
        this(DSL.name(alias), ROLLBACK_HISTORY);
    }

    /**
     * Create an aliased <code>rollback_history</code> table reference
     */
    public RollbackHistory(Name alias) {
        this(alias, ROLLBACK_HISTORY);
    }

    /**
     * Create a <code>rollback_history</code> table reference
     */
    public RollbackHistory() {
        this(DSL.name("rollback_history"), null);
    }

    public <O extends Record> RollbackHistory(Table<O> child, ForeignKey<O, RollbackHistoryRecord> key) {
        super(child, key, ROLLBACK_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<RollbackHistoryRecord, Long> getIdentity() {
        return (Identity<RollbackHistoryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RollbackHistoryRecord> getPrimaryKey() {
        return Keys.ROLLBACK_HISTORY_PKEY;
    }

    @Override
    public RollbackHistory as(String alias) {
        return new RollbackHistory(DSL.name(alias), this);
    }

    @Override
    public RollbackHistory as(Name alias) {
        return new RollbackHistory(alias, this);
    }

    @Override
    public RollbackHistory as(Table<?> alias) {
        return new RollbackHistory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RollbackHistory rename(String name) {
        return new RollbackHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RollbackHistory rename(Name name) {
        return new RollbackHistory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RollbackHistory rename(Table<?> name) {
        return new RollbackHistory(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Long, LocalDateTime, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super Long, ? super LocalDateTime, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super Long, ? super LocalDateTime, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
