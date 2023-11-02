/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressTxBalance implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private BigInteger balance;
    private LocalDateTime time;
    private Long txId;
    private Long addressId;
    private Long stakeAddressId;

    public AddressTxBalance() {}

    public AddressTxBalance(AddressTxBalance value) {
        this.id = value.id;
        this.balance = value.balance;
        this.time = value.time;
        this.txId = value.txId;
        this.addressId = value.addressId;
        this.stakeAddressId = value.stakeAddressId;
    }

    public AddressTxBalance(
        Long id,
        BigInteger balance,
        LocalDateTime time,
        Long txId,
        Long addressId,
        Long stakeAddressId
    ) {
        this.id = id;
        this.balance = balance;
        this.time = time;
        this.txId = txId;
        this.addressId = addressId;
        this.stakeAddressId = stakeAddressId;
    }

    /**
     * Getter for <code>address_tx_balance.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>address_tx_balance.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>address_tx_balance.balance</code>.
     */
    public BigInteger getBalance() {
        return this.balance;
    }

    /**
     * Setter for <code>address_tx_balance.balance</code>.
     */
    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    /**
     * Getter for <code>address_tx_balance.time</code>.
     */
    public LocalDateTime getTime() {
        return this.time;
    }

    /**
     * Setter for <code>address_tx_balance.time</code>.
     */
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    /**
     * Getter for <code>address_tx_balance.tx_id</code>.
     */
    public Long getTxId() {
        return this.txId;
    }

    /**
     * Setter for <code>address_tx_balance.tx_id</code>.
     */
    public void setTxId(Long txId) {
        this.txId = txId;
    }

    /**
     * Getter for <code>address_tx_balance.address_id</code>.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>address_tx_balance.address_id</code>.
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * Getter for <code>address_tx_balance.stake_address_id</code>.
     */
    public Long getStakeAddressId() {
        return this.stakeAddressId;
    }

    /**
     * Setter for <code>address_tx_balance.stake_address_id</code>.
     */
    public void setStakeAddressId(Long stakeAddressId) {
        this.stakeAddressId = stakeAddressId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AddressTxBalance other = (AddressTxBalance) obj;
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
        if (this.time == null) {
            if (other.time != null)
                return false;
        }
        else if (!this.time.equals(other.time))
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
        if (this.stakeAddressId == null) {
            if (other.stakeAddressId != null)
                return false;
        }
        else if (!this.stakeAddressId.equals(other.stakeAddressId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.balance == null) ? 0 : this.balance.hashCode());
        result = prime * result + ((this.time == null) ? 0 : this.time.hashCode());
        result = prime * result + ((this.txId == null) ? 0 : this.txId.hashCode());
        result = prime * result + ((this.addressId == null) ? 0 : this.addressId.hashCode());
        result = prime * result + ((this.stakeAddressId == null) ? 0 : this.stakeAddressId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AddressTxBalance (");

        sb.append(id);
        sb.append(", ").append(balance);
        sb.append(", ").append(time);
        sb.append(", ").append(txId);
        sb.append(", ").append(addressId);
        sb.append(", ").append(stakeAddressId);

        sb.append(")");
        return sb.toString();
    }
}