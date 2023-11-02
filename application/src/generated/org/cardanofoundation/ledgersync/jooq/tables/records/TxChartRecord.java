/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import org.cardanofoundation.ledgersync.jooq.tables.TxChart;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TxChartRecord extends UpdatableRecordImpl<TxChartRecord> implements Record10<Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>tx_chart.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>tx_chart.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>tx_chart.day</code>.
     */
    public void setDay(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>tx_chart.day</code>.
     */
    public Long getDay() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>tx_chart.hour</code>.
     */
    public void setHour(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>tx_chart.hour</code>.
     */
    public Long getHour() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>tx_chart.minute</code>.
     */
    public void setMinute(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>tx_chart.minute</code>.
     */
    public Long getMinute() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>tx_chart.month</code>.
     */
    public void setMonth(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>tx_chart.month</code>.
     */
    public Long getMonth() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>tx_chart.tx_count</code>.
     */
    public void setTxCount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>tx_chart.tx_count</code>.
     */
    public Long getTxCount() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>tx_chart.tx_simple</code>.
     */
    public void setTxSimple(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>tx_chart.tx_simple</code>.
     */
    public Long getTxSimple() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>tx_chart.tx_with_metadata_without_sc</code>.
     */
    public void setTxWithMetadataWithoutSc(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>tx_chart.tx_with_metadata_without_sc</code>.
     */
    public Long getTxWithMetadataWithoutSc() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>tx_chart.tx_with_sc</code>.
     */
    public void setTxWithSc(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>tx_chart.tx_with_sc</code>.
     */
    public Long getTxWithSc() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>tx_chart.year</code>.
     */
    public void setYear(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>tx_chart.year</code>.
     */
    public Long getYear() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TxChart.TX_CHART.ID;
    }

    @Override
    public Field<Long> field2() {
        return TxChart.TX_CHART.DAY;
    }

    @Override
    public Field<Long> field3() {
        return TxChart.TX_CHART.HOUR;
    }

    @Override
    public Field<Long> field4() {
        return TxChart.TX_CHART.MINUTE;
    }

    @Override
    public Field<Long> field5() {
        return TxChart.TX_CHART.MONTH;
    }

    @Override
    public Field<Long> field6() {
        return TxChart.TX_CHART.TX_COUNT;
    }

    @Override
    public Field<Long> field7() {
        return TxChart.TX_CHART.TX_SIMPLE;
    }

    @Override
    public Field<Long> field8() {
        return TxChart.TX_CHART.TX_WITH_METADATA_WITHOUT_SC;
    }

    @Override
    public Field<Long> field9() {
        return TxChart.TX_CHART.TX_WITH_SC;
    }

    @Override
    public Field<Long> field10() {
        return TxChart.TX_CHART.YEAR;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getDay();
    }

    @Override
    public Long component3() {
        return getHour();
    }

    @Override
    public Long component4() {
        return getMinute();
    }

    @Override
    public Long component5() {
        return getMonth();
    }

    @Override
    public Long component6() {
        return getTxCount();
    }

    @Override
    public Long component7() {
        return getTxSimple();
    }

    @Override
    public Long component8() {
        return getTxWithMetadataWithoutSc();
    }

    @Override
    public Long component9() {
        return getTxWithSc();
    }

    @Override
    public Long component10() {
        return getYear();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getDay();
    }

    @Override
    public Long value3() {
        return getHour();
    }

    @Override
    public Long value4() {
        return getMinute();
    }

    @Override
    public Long value5() {
        return getMonth();
    }

    @Override
    public Long value6() {
        return getTxCount();
    }

    @Override
    public Long value7() {
        return getTxSimple();
    }

    @Override
    public Long value8() {
        return getTxWithMetadataWithoutSc();
    }

    @Override
    public Long value9() {
        return getTxWithSc();
    }

    @Override
    public Long value10() {
        return getYear();
    }

    @Override
    public TxChartRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TxChartRecord value2(Long value) {
        setDay(value);
        return this;
    }

    @Override
    public TxChartRecord value3(Long value) {
        setHour(value);
        return this;
    }

    @Override
    public TxChartRecord value4(Long value) {
        setMinute(value);
        return this;
    }

    @Override
    public TxChartRecord value5(Long value) {
        setMonth(value);
        return this;
    }

    @Override
    public TxChartRecord value6(Long value) {
        setTxCount(value);
        return this;
    }

    @Override
    public TxChartRecord value7(Long value) {
        setTxSimple(value);
        return this;
    }

    @Override
    public TxChartRecord value8(Long value) {
        setTxWithMetadataWithoutSc(value);
        return this;
    }

    @Override
    public TxChartRecord value9(Long value) {
        setTxWithSc(value);
        return this;
    }

    @Override
    public TxChartRecord value10(Long value) {
        setYear(value);
        return this;
    }

    @Override
    public TxChartRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxChartRecord
     */
    public TxChartRecord() {
        super(TxChart.TX_CHART);
    }

    /**
     * Create a detached, initialised TxChartRecord
     */
    public TxChartRecord(Long id, Long day, Long hour, Long minute, Long month, Long txCount, Long txSimple, Long txWithMetadataWithoutSc, Long txWithSc, Long year) {
        super(TxChart.TX_CHART);

        setId(id);
        setDay(day);
        setHour(hour);
        setMinute(minute);
        setMonth(month);
        setTxCount(txCount);
        setTxSimple(txSimple);
        setTxWithMetadataWithoutSc(txWithMetadataWithoutSc);
        setTxWithSc(txWithSc);
        setYear(year);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TxChartRecord
     */
    public TxChartRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.TxChart value) {
        super(TxChart.TX_CHART);

        if (value != null) {
            setId(value.getId());
            setDay(value.getDay());
            setHour(value.getHour());
            setMinute(value.getMinute());
            setMonth(value.getMonth());
            setTxCount(value.getTxCount());
            setTxSimple(value.getTxSimple());
            setTxWithMetadataWithoutSc(value.getTxWithMetadataWithoutSc());
            setTxWithSc(value.getTxWithSc());
            setYear(value.getYear());
            resetChangedOnNotNull();
        }
    }
}