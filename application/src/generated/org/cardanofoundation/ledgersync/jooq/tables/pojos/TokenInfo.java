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
public class TokenInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long ident;
    private Long numberOfHolders;
    private BigInteger volume_24h;
    private Long blockNo;
    private LocalDateTime updateTime;

    public TokenInfo() {}

    public TokenInfo(TokenInfo value) {
        this.id = value.id;
        this.ident = value.ident;
        this.numberOfHolders = value.numberOfHolders;
        this.volume_24h = value.volume_24h;
        this.blockNo = value.blockNo;
        this.updateTime = value.updateTime;
    }

    public TokenInfo(
        Long id,
        Long ident,
        Long numberOfHolders,
        BigInteger volume_24h,
        Long blockNo,
        LocalDateTime updateTime
    ) {
        this.id = id;
        this.ident = ident;
        this.numberOfHolders = numberOfHolders;
        this.volume_24h = volume_24h;
        this.blockNo = blockNo;
        this.updateTime = updateTime;
    }

    /**
     * Getter for <code>token_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>token_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>token_info.ident</code>.
     */
    public Long getIdent() {
        return this.ident;
    }

    /**
     * Setter for <code>token_info.ident</code>.
     */
    public void setIdent(Long ident) {
        this.ident = ident;
    }

    /**
     * Getter for <code>token_info.number_of_holders</code>.
     */
    public Long getNumberOfHolders() {
        return this.numberOfHolders;
    }

    /**
     * Setter for <code>token_info.number_of_holders</code>.
     */
    public void setNumberOfHolders(Long numberOfHolders) {
        this.numberOfHolders = numberOfHolders;
    }

    /**
     * Getter for <code>token_info.volume_24h</code>.
     */
    public BigInteger getVolume_24h() {
        return this.volume_24h;
    }

    /**
     * Setter for <code>token_info.volume_24h</code>.
     */
    public void setVolume_24h(BigInteger volume_24h) {
        this.volume_24h = volume_24h;
    }

    /**
     * Getter for <code>token_info.block_no</code>.
     */
    public Long getBlockNo() {
        return this.blockNo;
    }

    /**
     * Setter for <code>token_info.block_no</code>.
     */
    public void setBlockNo(Long blockNo) {
        this.blockNo = blockNo;
    }

    /**
     * Getter for <code>token_info.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Setter for <code>token_info.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TokenInfo other = (TokenInfo) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.ident == null) {
            if (other.ident != null)
                return false;
        }
        else if (!this.ident.equals(other.ident))
            return false;
        if (this.numberOfHolders == null) {
            if (other.numberOfHolders != null)
                return false;
        }
        else if (!this.numberOfHolders.equals(other.numberOfHolders))
            return false;
        if (this.volume_24h == null) {
            if (other.volume_24h != null)
                return false;
        }
        else if (!this.volume_24h.equals(other.volume_24h))
            return false;
        if (this.blockNo == null) {
            if (other.blockNo != null)
                return false;
        }
        else if (!this.blockNo.equals(other.blockNo))
            return false;
        if (this.updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!this.updateTime.equals(other.updateTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.ident == null) ? 0 : this.ident.hashCode());
        result = prime * result + ((this.numberOfHolders == null) ? 0 : this.numberOfHolders.hashCode());
        result = prime * result + ((this.volume_24h == null) ? 0 : this.volume_24h.hashCode());
        result = prime * result + ((this.blockNo == null) ? 0 : this.blockNo.hashCode());
        result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TokenInfo (");

        sb.append(id);
        sb.append(", ").append(ident);
        sb.append(", ").append(numberOfHolders);
        sb.append(", ").append(volume_24h);
        sb.append(", ").append(blockNo);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}