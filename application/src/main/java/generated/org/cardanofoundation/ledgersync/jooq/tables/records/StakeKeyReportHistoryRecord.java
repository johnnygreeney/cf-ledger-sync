/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import java.time.LocalDateTime;

import org.cardanofoundation.ledgersync.jooq.tables.StakeKeyReportHistory;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StakeKeyReportHistoryRecord extends UpdatableRecordImpl<StakeKeyReportHistoryRecord> implements Record12<Long, String, LocalDateTime, LocalDateTime, Boolean, Boolean, Long, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stake_key_report_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>stake_key_report_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>stake_key_report_history.stake_key</code>.
     */
    public void setStakeKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>stake_key_report_history.stake_key</code>.
     */
    public String getStakeKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>stake_key_report_history.from_date</code>.
     */
    public void setFromDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>stake_key_report_history.from_date</code>.
     */
    public LocalDateTime getFromDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>stake_key_report_history.to_date</code>.
     */
    public void setToDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>stake_key_report_history.to_date</code>.
     */
    public LocalDateTime getToDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>stake_key_report_history.is_ada_transfer</code>.
     */
    public void setIsAdaTransfer(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>stake_key_report_history.is_ada_transfer</code>.
     */
    public Boolean getIsAdaTransfer() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>stake_key_report_history.is_fees_paid</code>.
     */
    public void setIsFeesPaid(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>stake_key_report_history.is_fees_paid</code>.
     */
    public Boolean getIsFeesPaid() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>stake_key_report_history.report_id</code>.
     */
    public void setReportId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>stake_key_report_history.report_id</code>.
     */
    public Long getReportId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>stake_key_report_history.event_registration</code>.
     */
    public void setEventRegistration(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>stake_key_report_history.event_registration</code>.
     */
    public Boolean getEventRegistration() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>stake_key_report_history.event_delegation</code>.
     */
    public void setEventDelegation(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>stake_key_report_history.event_delegation</code>.
     */
    public Boolean getEventDelegation() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>stake_key_report_history.event_rewards</code>.
     */
    public void setEventRewards(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>stake_key_report_history.event_rewards</code>.
     */
    public Boolean getEventRewards() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>stake_key_report_history.event_withdrawal</code>.
     */
    public void setEventWithdrawal(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>stake_key_report_history.event_withdrawal</code>.
     */
    public Boolean getEventWithdrawal() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>stake_key_report_history.event_deregistration</code>.
     */
    public void setEventDeregistration(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>stake_key_report_history.event_deregistration</code>.
     */
    public Boolean getEventDeregistration() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, LocalDateTime, LocalDateTime, Boolean, Boolean, Long, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, LocalDateTime, LocalDateTime, Boolean, Boolean, Long, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.ID;
    }

    @Override
    public Field<String> field2() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.STAKE_KEY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.FROM_DATE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.TO_DATE;
    }

    @Override
    public Field<Boolean> field5() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.IS_ADA_TRANSFER;
    }

    @Override
    public Field<Boolean> field6() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.IS_FEES_PAID;
    }

    @Override
    public Field<Long> field7() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.REPORT_ID;
    }

    @Override
    public Field<Boolean> field8() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_REGISTRATION;
    }

    @Override
    public Field<Boolean> field9() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_DELEGATION;
    }

    @Override
    public Field<Boolean> field10() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_REWARDS;
    }

    @Override
    public Field<Boolean> field11() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_WITHDRAWAL;
    }

    @Override
    public Field<Boolean> field12() {
        return StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_DEREGISTRATION;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getStakeKey();
    }

    @Override
    public LocalDateTime component3() {
        return getFromDate();
    }

    @Override
    public LocalDateTime component4() {
        return getToDate();
    }

    @Override
    public Boolean component5() {
        return getIsAdaTransfer();
    }

    @Override
    public Boolean component6() {
        return getIsFeesPaid();
    }

    @Override
    public Long component7() {
        return getReportId();
    }

    @Override
    public Boolean component8() {
        return getEventRegistration();
    }

    @Override
    public Boolean component9() {
        return getEventDelegation();
    }

    @Override
    public Boolean component10() {
        return getEventRewards();
    }

    @Override
    public Boolean component11() {
        return getEventWithdrawal();
    }

    @Override
    public Boolean component12() {
        return getEventDeregistration();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getStakeKey();
    }

    @Override
    public LocalDateTime value3() {
        return getFromDate();
    }

    @Override
    public LocalDateTime value4() {
        return getToDate();
    }

    @Override
    public Boolean value5() {
        return getIsAdaTransfer();
    }

    @Override
    public Boolean value6() {
        return getIsFeesPaid();
    }

    @Override
    public Long value7() {
        return getReportId();
    }

    @Override
    public Boolean value8() {
        return getEventRegistration();
    }

    @Override
    public Boolean value9() {
        return getEventDelegation();
    }

    @Override
    public Boolean value10() {
        return getEventRewards();
    }

    @Override
    public Boolean value11() {
        return getEventWithdrawal();
    }

    @Override
    public Boolean value12() {
        return getEventDeregistration();
    }

    @Override
    public StakeKeyReportHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value2(String value) {
        setStakeKey(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value3(LocalDateTime value) {
        setFromDate(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value4(LocalDateTime value) {
        setToDate(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value5(Boolean value) {
        setIsAdaTransfer(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value6(Boolean value) {
        setIsFeesPaid(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value7(Long value) {
        setReportId(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value8(Boolean value) {
        setEventRegistration(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value9(Boolean value) {
        setEventDelegation(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value10(Boolean value) {
        setEventRewards(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value11(Boolean value) {
        setEventWithdrawal(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord value12(Boolean value) {
        setEventDeregistration(value);
        return this;
    }

    @Override
    public StakeKeyReportHistoryRecord values(Long value1, String value2, LocalDateTime value3, LocalDateTime value4, Boolean value5, Boolean value6, Long value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StakeKeyReportHistoryRecord
     */
    public StakeKeyReportHistoryRecord() {
        super(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY);
    }

    /**
     * Create a detached, initialised StakeKeyReportHistoryRecord
     */
    public StakeKeyReportHistoryRecord(Long id, String stakeKey, LocalDateTime fromDate, LocalDateTime toDate, Boolean isAdaTransfer, Boolean isFeesPaid, Long reportId, Boolean eventRegistration, Boolean eventDelegation, Boolean eventRewards, Boolean eventWithdrawal, Boolean eventDeregistration) {
        super(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY);

        setId(id);
        setStakeKey(stakeKey);
        setFromDate(fromDate);
        setToDate(toDate);
        setIsAdaTransfer(isAdaTransfer);
        setIsFeesPaid(isFeesPaid);
        setReportId(reportId);
        setEventRegistration(eventRegistration);
        setEventDelegation(eventDelegation);
        setEventRewards(eventRewards);
        setEventWithdrawal(eventWithdrawal);
        setEventDeregistration(eventDeregistration);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StakeKeyReportHistoryRecord
     */
    public StakeKeyReportHistoryRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory value) {
        super(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY);

        if (value != null) {
            setId(value.getId());
            setStakeKey(value.getStakeKey());
            setFromDate(value.getFromDate());
            setToDate(value.getToDate());
            setIsAdaTransfer(value.getIsAdaTransfer());
            setIsFeesPaid(value.getIsFeesPaid());
            setReportId(value.getReportId());
            setEventRegistration(value.getEventRegistration());
            setEventDelegation(value.getEventDelegation());
            setEventRewards(value.getEventRewards());
            setEventWithdrawal(value.getEventWithdrawal());
            setEventDeregistration(value.getEventDeregistration());
            resetChangedOnNotNull();
        }
    }
}
