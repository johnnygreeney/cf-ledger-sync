/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.StakeTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.records.StakeTxBalanceRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class StakeTxBalanceDao extends AbstractSpringDAOImpl<StakeTxBalanceRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance, Long> {

    /**
     * Create a new StakeTxBalanceDao without any configuration
     */
    public StakeTxBalanceDao() {
        super(StakeTxBalance.STAKE_TX_BALANCE, org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance.class);
    }

    /**
     * Create a new StakeTxBalanceDao with an attached configuration
     */
    @Autowired
    public StakeTxBalanceDao(Configuration configuration) {
        super(StakeTxBalance.STAKE_TX_BALANCE, org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(StakeTxBalance.STAKE_TX_BALANCE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchById(Long... values) {
        return fetch(StakeTxBalance.STAKE_TX_BALANCE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance fetchOneById(Long value) {
        return fetchOne(StakeTxBalance.STAKE_TX_BALANCE.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchOptionalById(Long value) {
        return fetchOptional(StakeTxBalance.STAKE_TX_BALANCE.ID, value);
    }

    /**
     * Fetch records that have <code>stake_address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchRangeOfStakeAddressId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(StakeTxBalance.STAKE_TX_BALANCE.STAKE_ADDRESS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stake_address_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchByStakeAddressId(Long... values) {
        return fetch(StakeTxBalance.STAKE_TX_BALANCE.STAKE_ADDRESS_ID, values);
    }

    /**
     * Fetch records that have <code>tx_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchRangeOfTxId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(StakeTxBalance.STAKE_TX_BALANCE.TX_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchByTxId(Long... values) {
        return fetch(StakeTxBalance.STAKE_TX_BALANCE.TX_ID, values);
    }

    /**
     * Fetch records that have <code>balance_change BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchRangeOfBalanceChange(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(StakeTxBalance.STAKE_TX_BALANCE.BALANCE_CHANGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>balance_change IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchByBalanceChange(Long... values) {
        return fetch(StakeTxBalance.STAKE_TX_BALANCE.BALANCE_CHANGE, values);
    }

    /**
     * Fetch records that have <code>time BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchRangeOfTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(StakeTxBalance.STAKE_TX_BALANCE.TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.StakeTxBalance> fetchByTime(LocalDateTime... values) {
        return fetch(StakeTxBalance.STAKE_TX_BALANCE.TIME, values);
    }
}
