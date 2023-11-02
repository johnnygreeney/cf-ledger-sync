/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressToken implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private BigInteger balance;
    private Long ident;
    private Long txId;
    private Long addressId;

    public AddressToken() {}

    public AddressToken(AddressToken value) {
        this.id = value.id;
        this.balance = value.balance;
        this.ident = value.ident;
        this.txId = value.txId;
        this.addressId = value.addressId;
    }

    public AddressToken(
        Long id,
        BigInteger balance,
        Long ident,
        Long txId,
        Long addressId
    ) {
        this.id = id;
        this.balance = balance;
        this.ident = ident;
        this.txId = txId;
        this.addressId = addressId;
    }

    /**
     * Getter for <code>address_token.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>address_token.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>address_token.balance</code>.
     */
    public BigInteger getBalance() {
        return this.balance;
    }

    /**
     * Setter for <code>address_token.balance</code>.
     */
    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    /**
     * Getter for <code>address_token.ident</code>.
     */
    public Long getIdent() {
        return this.ident;
    }

    /**
     * Setter for <code>address_token.ident</code>.
     */
    public void setIdent(Long ident) {
        this.ident = ident;
    }

    /**
     * Getter for <code>address_token.tx_id</code>.
     */
    public Long getTxId() {
        return this.txId;
    }

    /**
     * Setter for <code>address_token.tx_id</code>.
     */
    public void setTxId(Long txId) {
        this.txId = txId;
    }

    /**
     * Getter for <code>address_token.address_id</code>.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>address_token.address_id</code>.
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AddressToken other = (AddressToken) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.balance == null) {
            if (other.balance != null)
                return false;
        }
        else if (!this.balance.equals(other.balance))
            return false;
        if (this.ident == null) {
            if (other.ident != null)
                return false;
        }
        else if (!this.ident.equals(other.ident))
            return false;
        if (this.txId == null) {
            if (other.txId != null)
                return false;
        }
        else if (!this.txId.equals(other.txId))
            return false;
        if (this.addressId == null) {
            if (other.addressId != null)
                return false;
        }
        else if (!this.addressId.equals(other.addressId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.balance == null) ? 0 : this.balance.hashCode());
        result = prime * result + ((this.ident == null) ? 0 : this.ident.hashCode());
        result = prime * result + ((this.txId == null) ? 0 : this.txId.hashCode());
        result = prime * result + ((this.addressId == null) ? 0 : this.addressId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AddressToken (");

        sb.append(id);
        sb.append(", ").append(balance);
        sb.append(", ").append(ident);
        sb.append(", ").append(txId);
        sb.append(", ").append(addressId);

        sb.append(")");
        return sb.toString();
    }
}
