/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.TokenInfoCheckpoint;
import org.cardanofoundation.ledgersync.jooq.tables.records.TokenInfoCheckpointRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TokenInfoCheckpointDao extends AbstractSpringDAOImpl<TokenInfoCheckpointRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint, Long> {

    /**
     * Create a new TokenInfoCheckpointDao without any configuration
     */
    public TokenInfoCheckpointDao() {
        super(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT, org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint.class);
    }

    /**
     * Create a new TokenInfoCheckpointDao with an attached configuration
     */
    @Autowired
    public TokenInfoCheckpointDao(Configuration configuration) {
        super(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT, org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchById(Long... values) {
        return fetch(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint fetchOneById(Long value) {
        return fetchOne(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchOptionalById(Long value) {
        return fetchOptional(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.ID, value);
    }

    /**
     * Fetch records that have <code>block_no BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchRangeOfBlockNo(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.BLOCK_NO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>block_no IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchByBlockNo(Long... values) {
        return fetch(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.BLOCK_NO, values);
    }

    /**
     * Fetch records that have <code>update_time BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchRangeOfUpdateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.TokenInfoCheckpoint> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT.UPDATE_TIME, values);
    }
}