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
public class Tx implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long blockId;
    private Long blockIndex;
    private Long deposit;
    private BigInteger fee;
    private String hash;
    private BigInteger invalidBefore;
    private BigInteger invalidHereafter;
    private BigInteger outSum;
    private Integer scriptSize;
    private Integer size;
    private Boolean validContract;
    private Long txMetadataHashId;

    public Tx() {}

    public Tx(Tx value) {
        this.id = value.id;
        this.blockId = value.blockId;
        this.blockIndex = value.blockIndex;
        this.deposit = value.deposit;
        this.fee = value.fee;
        this.hash = value.hash;
        this.invalidBefore = value.invalidBefore;
        this.invalidHereafter = value.invalidHereafter;
        this.outSum = value.outSum;
        this.scriptSize = value.scriptSize;
        this.size = value.size;
        this.validContract = value.validContract;
        this.txMetadataHashId = value.txMetadataHashId;
    }

    public Tx(
        Long id,
        Long blockId,
        Long blockIndex,
        Long deposit,
        BigInteger fee,
        String hash,
        BigInteger invalidBefore,
        BigInteger invalidHereafter,
        BigInteger outSum,
        Integer scriptSize,
        Integer size,
        Boolean validContract,
        Long txMetadataHashId
    ) {
        this.id = id;
        this.blockId = blockId;
        this.blockIndex = blockIndex;
        this.deposit = deposit;
        this.fee = fee;
        this.hash = hash;
        this.invalidBefore = invalidBefore;
        this.invalidHereafter = invalidHereafter;
        this.outSum = outSum;
        this.scriptSize = scriptSize;
        this.size = size;
        this.validContract = validContract;
        this.txMetadataHashId = txMetadataHashId;
    }

    /**
     * Getter for <code>tx.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>tx.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>tx.block_id</code>.
     */
    public Long getBlockId() {
        return this.blockId;
    }

    /**
     * Setter for <code>tx.block_id</code>.
     */
    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    /**
     * Getter for <code>tx.block_index</code>.
     */
    public Long getBlockIndex() {
        return this.blockIndex;
    }

    /**
     * Setter for <code>tx.block_index</code>.
     */
    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    /**
     * Getter for <code>tx.deposit</code>.
     */
    public Long getDeposit() {
        return this.deposit;
    }

    /**
     * Setter for <code>tx.deposit</code>.
     */
    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    /**
     * Getter for <code>tx.fee</code>.
     */
    public BigInteger getFee() {
        return this.fee;
    }

    /**
     * Setter for <code>tx.fee</code>.
     */
    public void setFee(BigInteger fee) {
        this.fee = fee;
    }

    /**
     * Getter for <code>tx.hash</code>.
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * Setter for <code>tx.hash</code>.
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Getter for <code>tx.invalid_before</code>.
     */
    public BigInteger getInvalidBefore() {
        return this.invalidBefore;
    }

    /**
     * Setter for <code>tx.invalid_before</code>.
     */
    public void setInvalidBefore(BigInteger invalidBefore) {
        this.invalidBefore = invalidBefore;
    }

    /**
     * Getter for <code>tx.invalid_hereafter</code>.
     */
    public BigInteger getInvalidHereafter() {
        return this.invalidHereafter;
    }

    /**
     * Setter for <code>tx.invalid_hereafter</code>.
     */
    public void setInvalidHereafter(BigInteger invalidHereafter) {
        this.invalidHereafter = invalidHereafter;
    }

    /**
     * Getter for <code>tx.out_sum</code>.
     */
    public BigInteger getOutSum() {
        return this.outSum;
    }

    /**
     * Setter for <code>tx.out_sum</code>.
     */
    public void setOutSum(BigInteger outSum) {
        this.outSum = outSum;
    }

    /**
     * Getter for <code>tx.script_size</code>.
     */
    public Integer getScriptSize() {
        return this.scriptSize;
    }

    /**
     * Setter for <code>tx.script_size</code>.
     */
    public void setScriptSize(Integer scriptSize) {
        this.scriptSize = scriptSize;
    }

    /**
     * Getter for <code>tx.size</code>.
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * Setter for <code>tx.size</code>.
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Getter for <code>tx.valid_contract</code>.
     */
    public Boolean getValidContract() {
        return this.validContract;
    }

    /**
     * Setter for <code>tx.valid_contract</code>.
     */
    public void setValidContract(Boolean validContract) {
        this.validContract = validContract;
    }

    /**
     * Getter for <code>tx.tx_metadata_hash_id</code>.
     */
    public Long getTxMetadataHashId() {
        return this.txMetadataHashId;
    }

    /**
     * Setter for <code>tx.tx_metadata_hash_id</code>.
     */
    public void setTxMetadataHashId(Long txMetadataHashId) {
        this.txMetadataHashId = txMetadataHashId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Tx other = (Tx) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.blockId == null) {
            if (other.blockId != null)
                return false;
        }
        else if (!this.blockId.equals(other.blockId))
            return false;
        if (this.blockIndex == null) {
            if (other.blockIndex != null)
                return false;
        }
        else if (!this.blockIndex.equals(other.blockIndex))
            return false;
        if (this.deposit == null) {
            if (other.deposit != null)
                return false;
        }
        else if (!this.deposit.equals(other.deposit))
            return false;
        if (this.fee == null) {
            if (other.fee != null)
                return false;
        }
        else if (!this.fee.equals(other.fee))
            return false;
        if (this.hash == null) {
            if (other.hash != null)
                return false;
        }
        else if (!this.hash.equals(other.hash))
            return false;
        if (this.invalidBefore == null) {
            if (other.invalidBefore != null)
                return false;
        }
        else if (!this.invalidBefore.equals(other.invalidBefore))
            return false;
        if (this.invalidHereafter == null) {
            if (other.invalidHereafter != null)
                return false;
        }
        else if (!this.invalidHereafter.equals(other.invalidHereafter))
            return false;
        if (this.outSum == null) {
            if (other.outSum != null)
                return false;
        }
        else if (!this.outSum.equals(other.outSum))
            return false;
        if (this.scriptSize == null) {
            if (other.scriptSize != null)
                return false;
        }
        else if (!this.scriptSize.equals(other.scriptSize))
            return false;
        if (this.size == null) {
            if (other.size != null)
                return false;
        }
        else if (!this.size.equals(other.size))
            return false;
        if (this.validContract == null) {
            if (other.validContract != null)
                return false;
        }
        else if (!this.validContract.equals(other.validContract))
            return false;
        if (this.txMetadataHashId == null) {
            if (other.txMetadataHashId != null)
                return false;
        }
        else if (!this.txMetadataHashId.equals(other.txMetadataHashId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.blockId == null) ? 0 : this.blockId.hashCode());
        result = prime * result + ((this.blockIndex == null) ? 0 : this.blockIndex.hashCode());
        result = prime * result + ((this.deposit == null) ? 0 : this.deposit.hashCode());
        result = prime * result + ((this.fee == null) ? 0 : this.fee.hashCode());
        result = prime * result + ((this.hash == null) ? 0 : this.hash.hashCode());
        result = prime * result + ((this.invalidBefore == null) ? 0 : this.invalidBefore.hashCode());
        result = prime * result + ((this.invalidHereafter == null) ? 0 : this.invalidHereafter.hashCode());
        result = prime * result + ((this.outSum == null) ? 0 : this.outSum.hashCode());
        result = prime * result + ((this.scriptSize == null) ? 0 : this.scriptSize.hashCode());
        result = prime * result + ((this.size == null) ? 0 : this.size.hashCode());
        result = prime * result + ((this.validContract == null) ? 0 : this.validContract.hashCode());
        result = prime * result + ((this.txMetadataHashId == null) ? 0 : this.txMetadataHashId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tx (");

        sb.append(id);
        sb.append(", ").append(blockId);
        sb.append(", ").append(blockIndex);
        sb.append(", ").append(deposit);
        sb.append(", ").append(fee);
        sb.append(", ").append(hash);
        sb.append(", ").append(invalidBefore);
        sb.append(", ").append(invalidHereafter);
        sb.append(", ").append(outSum);
        sb.append(", ").append(scriptSize);
        sb.append(", ").append(size);
        sb.append(", ").append(validContract);
        sb.append(", ").append(txMetadataHashId);

        sb.append(")");
        return sb.toString();
    }
}