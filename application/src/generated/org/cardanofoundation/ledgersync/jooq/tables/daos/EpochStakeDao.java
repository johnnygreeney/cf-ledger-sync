/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.EpochStake;
import org.cardanofoundation.ledgersync.jooq.tables.records.EpochStakeRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class EpochStakeDao extends AbstractSpringDAOImpl<EpochStakeRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake, Long> {

    /**
     * Create a new EpochStakeDao without any configuration
     */
    public EpochStakeDao() {
        super(EpochStake.EPOCH_STAKE, org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake.class);
    }

    /**
     * Create a new EpochStakeDao with an attached configuration
     */
    @Autowired
    public EpochStakeDao(Configuration configuration) {
        super(EpochStake.EPOCH_STAKE, org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(EpochStake.EPOCH_STAKE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchById(Long... values) {
        return fetch(EpochStake.EPOCH_STAKE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake fetchOneById(Long value) {
        return fetchOne(EpochStake.EPOCH_STAKE.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchOptionalById(Long value) {
        return fetchOptional(EpochStake.EPOCH_STAKE.ID, value);
    }

    /**
     * Fetch records that have <code>amount BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchRangeOfAmount(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(EpochStake.EPOCH_STAKE.AMOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchByAmount(BigInteger... values) {
        return fetch(EpochStake.EPOCH_STAKE.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>epoch_no BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchRangeOfEpochNo(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(EpochStake.EPOCH_STAKE.EPOCH_NO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>epoch_no IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchByEpochNo(Integer... values) {
        return fetch(EpochStake.EPOCH_STAKE.EPOCH_NO, values);
    }

    /**
     * Fetch records that have <code>addr_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchRangeOfAddrId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(EpochStake.EPOCH_STAKE.ADDR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>addr_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchByAddrId(Long... values) {
        return fetch(EpochStake.EPOCH_STAKE.ADDR_ID, values);
    }

    /**
     * Fetch records that have <code>pool_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchRangeOfPoolId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(EpochStake.EPOCH_STAKE.POOL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>pool_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.EpochStake> fetchByPoolId(Long... values) {
        return fetch(EpochStake.EPOCH_STAKE.POOL_ID, values);
    }
}
