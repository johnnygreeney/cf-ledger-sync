/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.StakeKeyReportHistory;
import org.cardanofoundation.ledgersync.jooq.tables.records.StakeKeyReportHistoryRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class StakeKeyReportHistoryDao extends AbstractSpringDAOImpl<StakeKeyReportHistoryRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory, Long> {

    /**
     * Create a new StakeKeyReportHistoryDao without any configuration
     */
    public StakeKeyReportHistoryDao() {
        super(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY, org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory.class);
    }

    /**
     * Create a new StakeKeyReportHistoryDao with an attached configuration
     */
    @Autowired
    public StakeKeyReportHistoryDao(Configuration configuration) {
        super(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY, org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchById(Long... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory fetchOneById(Long value) {
        return fetchOne(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchOptionalById(Long value) {
        return fetchOptional(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.ID, value);
    }

    /**
     * Fetch records that have <code>stake_key BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfStakeKey(String lowerInclusive, String upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.STAKE_KEY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stake_key IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByStakeKey(String... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.STAKE_KEY, values);
    }

    /**
     * Fetch records that have <code>from_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfFromDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.FROM_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>from_date IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByFromDate(LocalDateTime... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.FROM_DATE, values);
    }

    /**
     * Fetch records that have <code>to_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfToDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.TO_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>to_date IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByToDate(LocalDateTime... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.TO_DATE, values);
    }

    /**
     * Fetch records that have <code>is_ada_transfer BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfIsAdaTransfer(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.IS_ADA_TRANSFER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_ada_transfer IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByIsAdaTransfer(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.IS_ADA_TRANSFER, values);
    }

    /**
     * Fetch records that have <code>is_fees_paid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfIsFeesPaid(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.IS_FEES_PAID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_fees_paid IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByIsFeesPaid(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.IS_FEES_PAID, values);
    }

    /**
     * Fetch records that have <code>report_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfReportId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.REPORT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>report_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByReportId(Long... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.REPORT_ID, values);
    }

    /**
     * Fetch records that have <code>event_registration BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfEventRegistration(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_REGISTRATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>event_registration IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByEventRegistration(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_REGISTRATION, values);
    }

    /**
     * Fetch records that have <code>event_delegation BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfEventDelegation(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_DELEGATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>event_delegation IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByEventDelegation(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_DELEGATION, values);
    }

    /**
     * Fetch records that have <code>event_rewards BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfEventRewards(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_REWARDS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>event_rewards IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByEventRewards(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_REWARDS, values);
    }

    /**
     * Fetch records that have <code>event_withdrawal BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfEventWithdrawal(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_WITHDRAWAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>event_withdrawal IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByEventWithdrawal(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_WITHDRAWAL, values);
    }

    /**
     * Fetch records that have <code>event_deregistration BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchRangeOfEventDeregistration(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_DEREGISTRATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>event_deregistration IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeKeyReportHistory> fetchByEventDeregistration(Boolean... values) {
        return fetch(StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.EVENT_DEREGISTRATION, values);
    }
}
