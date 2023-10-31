/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.Treasury;
import org.cardanofoundation.ledgersync.jooq.tables.records.TreasuryRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TreasuryDao extends AbstractSpringDAOImpl<TreasuryRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury, Long> {

    /**
     * Create a new TreasuryDao without any configuration
     */
    public TreasuryDao() {
        super(Treasury.TREASURY, org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury.class);
    }

    /**
     * Create a new TreasuryDao with an attached configuration
     */
    @Autowired
    public TreasuryDao(Configuration configuration) {
        super(Treasury.TREASURY, org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Treasury.TREASURY.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchById(Long... values) {
        return fetch(Treasury.TREASURY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury fetchOneById(Long value) {
        return fetchOne(Treasury.TREASURY.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchOptionalById(Long value) {
        return fetchOptional(Treasury.TREASURY.ID, value);
    }

    /**
     * Fetch records that have <code>amount BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchRangeOfAmount(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Treasury.TREASURY.AMOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchByAmount(BigInteger... values) {
        return fetch(Treasury.TREASURY.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>cert_index BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchRangeOfCertIndex(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Treasury.TREASURY.CERT_INDEX, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>cert_index IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchByCertIndex(Integer... values) {
        return fetch(Treasury.TREASURY.CERT_INDEX, values);
    }

    /**
     * Fetch records that have <code>addr_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchRangeOfAddrId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Treasury.TREASURY.ADDR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>addr_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchByAddrId(Long... values) {
        return fetch(Treasury.TREASURY.ADDR_ID, values);
    }

    /**
     * Fetch records that have <code>tx_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchRangeOfTxId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Treasury.TREASURY.TX_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.Treasury> fetchByTxId(Long... values) {
        return fetch(Treasury.TREASURY.TX_ID, values);
    }
}
