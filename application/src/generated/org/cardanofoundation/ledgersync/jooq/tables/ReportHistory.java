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
import org.cardanofoundation.ledgersync.jooq.tables.records.ReportHistoryRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
public class ReportHistory extends TableImpl<ReportHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>report_history</code>
     */
    public static final ReportHistory REPORT_HISTORY = new ReportHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReportHistoryRecord> getRecordType() {
        return ReportHistoryRecord.class;
    }

    /**
     * The column <code>report_history.id</code>.
     */
    public final TableField<ReportHistoryRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>report_history.report_name</code>.
     */
    public final TableField<ReportHistoryRecord, String> REPORT_NAME = createField(DSL.name("report_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>report_history.created_at</code>.
     */
    public final TableField<ReportHistoryRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>report_history.username</code>.
     */
    public final TableField<ReportHistoryRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>report_history.status</code>.
     */
    public final TableField<ReportHistoryRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>report_history.type</code>.
     */
    public final TableField<ReportHistoryRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>report_history.storage_key</code>.
     */
    public final TableField<ReportHistoryRecord, String> STORAGE_KEY = createField(DSL.name("storage_key"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>report_history.uploaded_at</code>.
     */
    public final TableField<ReportHistoryRecord, LocalDateTime> UPLOADED_AT = createField(DSL.name("uploaded_at"), SQLDataType.LOCALDATETIME(6), this, "");

    private ReportHistory(Name alias, Table<ReportHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReportHistory(Name alias, Table<ReportHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>report_history</code> table reference
     */
    public ReportHistory(String alias) {
        this(DSL.name(alias), REPORT_HISTORY);
    }

    /**
     * Create an aliased <code>report_history</code> table reference
     */
    public ReportHistory(Name alias) {
        this(alias, REPORT_HISTORY);
    }

    /**
     * Create a <code>report_history</code> table reference
     */
    public ReportHistory() {
        this(DSL.name("report_history"), null);
    }

    public <O extends Record> ReportHistory(Table<O> child, ForeignKey<O, ReportHistoryRecord> key) {
        super(child, key, REPORT_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REPORT_HISTORY_STATUS_IDX, Indexes.REPORT_HISTORY_USERNAME_IDX);
    }

    @Override
    public Identity<ReportHistoryRecord, Long> getIdentity() {
        return (Identity<ReportHistoryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReportHistoryRecord> getPrimaryKey() {
        return Keys.REPORT_HISTORY_PKEY;
    }

    @Override
    public List<UniqueKey<ReportHistoryRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.STORAGE_KEY_UNIQUE);
    }

    @Override
    public ReportHistory as(String alias) {
        return new ReportHistory(DSL.name(alias), this);
    }

    @Override
    public ReportHistory as(Name alias) {
        return new ReportHistory(alias, this);
    }

    @Override
    public ReportHistory as(Table<?> alias) {
        return new ReportHistory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReportHistory rename(String name) {
        return new ReportHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReportHistory rename(Name name) {
        return new ReportHistory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReportHistory rename(Table<?> name) {
        return new ReportHistory(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, LocalDateTime, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
