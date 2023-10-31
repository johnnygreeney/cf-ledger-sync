/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.daos;


import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.cardanofoundation.ledgersync.jooq.AbstractSpringDAOImpl;
import org.cardanofoundation.ledgersync.jooq.tables.AddressToken;
import org.cardanofoundation.ledgersync.jooq.tables.records.AddressTokenRecord;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class AddressTokenDao extends AbstractSpringDAOImpl<AddressTokenRecord, org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken, Long> {

    /**
     * Create a new AddressTokenDao without any configuration
     */
    public AddressTokenDao() {
        super(AddressToken.ADDRESS_TOKEN, org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken.class);
    }

    /**
     * Create a new AddressTokenDao with an attached configuration
     */
    @Autowired
    public AddressTokenDao(Configuration configuration) {
        super(AddressToken.ADDRESS_TOKEN, org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken.class, configuration);
    }

    @Override
    public Long getId(org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AddressToken.ADDRESS_TOKEN.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchById(Long... values) {
        return fetch(AddressToken.ADDRESS_TOKEN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken fetchOneById(Long value) {
        return fetchOne(AddressToken.ADDRESS_TOKEN.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchOptionalById(Long value) {
        return fetchOptional(AddressToken.ADDRESS_TOKEN.ID, value);
    }

    /**
     * Fetch records that have <code>balance BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchRangeOfBalance(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(AddressToken.ADDRESS_TOKEN.BALANCE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchByBalance(BigInteger... values) {
        return fetch(AddressToken.ADDRESS_TOKEN.BALANCE, values);
    }

    /**
     * Fetch records that have <code>ident BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchRangeOfIdent(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AddressToken.ADDRESS_TOKEN.IDENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ident IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchByIdent(Long... values) {
        return fetch(AddressToken.ADDRESS_TOKEN.IDENT, values);
    }

    /**
     * Fetch records that have <code>tx_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchRangeOfTxId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AddressToken.ADDRESS_TOKEN.TX_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tx_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchByTxId(Long... values) {
        return fetch(AddressToken.ADDRESS_TOKEN.TX_ID, values);
    }

    /**
     * Fetch records that have <code>address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchRangeOfAddressId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AddressToken.ADDRESS_TOKEN.ADDRESS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    public List<org.cardanofoundation.ledgersync.jooq.tables.pojos.AddressToken> fetchByAddressId(Long... values) {
        return fetch(AddressToken.ADDRESS_TOKEN.ADDRESS_ID, values);
    }
}
