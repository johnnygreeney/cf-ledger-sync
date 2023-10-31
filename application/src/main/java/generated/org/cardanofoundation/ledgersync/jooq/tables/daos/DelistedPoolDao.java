/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.DelistedPool;
import org.cardanofoundation.ledgersync.jooq.tables.records.DelistedPoolRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class DelistedPoolDao extends AbstractSpringDAOImpl<DelistedPoolRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool, Long> {

    /**
     * Create a new DelistedPoolDao without any configuration
     */
    public DelistedPoolDao() {
        super(DelistedPool.DELISTED_POOL, org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool.class);
    }

    /**
     * Create a new DelistedPoolDao with an attached configuration
     */
    @Autowired
    public DelistedPoolDao(Configuration configuration) {
        super(DelistedPool.DELISTED_POOL, org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(DelistedPool.DELISTED_POOL.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool> fetchById(Long... values) {
        return fetch(DelistedPool.DELISTED_POOL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool fetchOneById(Long value) {
        return fetchOne(DelistedPool.DELISTED_POOL.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool> fetchOptionalById(Long value) {
        return fetchOptional(DelistedPool.DELISTED_POOL.ID, value);
    }

    /**
     * Fetch records that have <code>hash_raw BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool> fetchRangeOfHashRaw(String lowerInclusive, String upperInclusive) {
        return fetchRange(DelistedPool.DELISTED_POOL.HASH_RAW, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>hash_raw IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool> fetchByHashRaw(String... values) {
        return fetch(DelistedPool.DELISTED_POOL.HASH_RAW, values);
    }

    /**
     * Fetch a unique record that has <code>hash_raw = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool fetchOneByHashRaw(String value) {
        return fetchOne(DelistedPool.DELISTED_POOL.HASH_RAW, value);
    }

    /**
     * Fetch a unique record that has <code>hash_raw = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.DelistedPool> fetchOptionalByHashRaw(String value) {
        return fetchOptional(DelistedPool.DELISTED_POOL.HASH_RAW, value);
    }
}
