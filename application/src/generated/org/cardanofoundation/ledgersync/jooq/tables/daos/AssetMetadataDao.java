/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.AssetMetadata;
import org.cardanofoundation.ledgersync.jooq.tables.records.AssetMetadataRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class AssetMetadataDao extends AbstractSpringDAOImpl<AssetMetadataRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata, Long> {

    /**
     * Create a new AssetMetadataDao without any configuration
     */
    public AssetMetadataDao() {
        super(AssetMetadata.ASSET_METADATA, org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata.class);
    }

    /**
     * Create a new AssetMetadataDao with an attached configuration
     */
    @Autowired
    public AssetMetadataDao(Configuration configuration) {
        super(AssetMetadata.ASSET_METADATA, org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchById(Long... values) {
        return fetch(AssetMetadata.ASSET_METADATA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata fetchOneById(Long value) {
        return fetchOne(AssetMetadata.ASSET_METADATA.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchOptionalById(Long value) {
        return fetchOptional(AssetMetadata.ASSET_METADATA.ID, value);
    }

    /**
     * Fetch records that have <code>decimals BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfDecimals(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.DECIMALS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>decimals IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByDecimals(Integer... values) {
        return fetch(AssetMetadata.ASSET_METADATA.DECIMALS, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByDescription(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>logo BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfLogo(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.LOGO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>logo IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByLogo(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.LOGO, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByName(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.NAME, values);
    }

    /**
     * Fetch records that have <code>policy BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfPolicy(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.POLICY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>policy IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByPolicy(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.POLICY, values);
    }

    /**
     * Fetch records that have <code>subject BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfSubject(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.SUBJECT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subject IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchBySubject(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.SUBJECT, values);
    }

    /**
     * Fetch records that have <code>ticker BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfTicker(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.TICKER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ticker IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByTicker(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.TICKER, values);
    }

    /**
     * Fetch records that have <code>url BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfUrl(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.URL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByUrl(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.URL, values);
    }

    /**
     * Fetch records that have <code>ident BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfIdent(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.IDENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ident IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByIdent(Long... values) {
        return fetch(AssetMetadata.ASSET_METADATA.IDENT, values);
    }

    /**
     * Fetch records that have <code>logo_hash BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchRangeOfLogoHash(String lowerInclusive, String upperInclusive) {
        return fetchRange(AssetMetadata.ASSET_METADATA.LOGO_HASH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>logo_hash IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AssetMetadata> fetchByLogoHash(String... values) {
        return fetch(AssetMetadata.ASSET_METADATA.LOGO_HASH, values);
    }
}