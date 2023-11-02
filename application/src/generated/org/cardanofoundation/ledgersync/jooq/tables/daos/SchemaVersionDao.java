/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.SchemaVersion;
import org.cardanofoundation.ledgersync.jooq.tables.records.SchemaVersionRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class SchemaVersionDao extends AbstractSpringDAOImpl<SchemaVersionRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion, Long> {

    /**
     * Create a new SchemaVersionDao without any configuration
     */
    public SchemaVersionDao() {
        super(SchemaVersion.SCHEMA_VERSION, org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion.class);
    }

    /**
     * Create a new SchemaVersionDao with an attached configuration
     */
    @Autowired
    public SchemaVersionDao(Configuration configuration) {
        super(SchemaVersion.SCHEMA_VERSION, org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(SchemaVersion.SCHEMA_VERSION.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchById(Long... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion fetchOneById(Long value) {
        return fetchOne(SchemaVersion.SCHEMA_VERSION.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchOptionalById(Long value) {
        return fetchOptional(SchemaVersion.SCHEMA_VERSION.ID, value);
    }

    /**
     * Fetch records that have <code>stage_one BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchRangeOfStageOne(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(SchemaVersion.SCHEMA_VERSION.STAGE_ONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stage_one IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchByStageOne(Long... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.STAGE_ONE, values);
    }

    /**
     * Fetch records that have <code>stage_three BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchRangeOfStageThree(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(SchemaVersion.SCHEMA_VERSION.STAGE_THREE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stage_three IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchByStageThree(Long... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.STAGE_THREE, values);
    }

    /**
     * Fetch records that have <code>stage_two BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchRangeOfStageTwo(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(SchemaVersion.SCHEMA_VERSION.STAGE_TWO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stage_two IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.SchemaVersion> fetchByStageTwo(Long... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.STAGE_TWO, values);
    }
}
