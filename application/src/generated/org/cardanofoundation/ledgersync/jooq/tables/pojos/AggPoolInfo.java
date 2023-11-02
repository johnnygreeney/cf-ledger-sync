/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AggPoolInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long poolId;
    private Long blockInEpoch;
    private Long blockLifeTime;
    private Long delegatorCnt;
    private Long blockCheckPoint;
    private LocalDateTime updateTime;

    public AggPoolInfo() {}

    public AggPoolInfo(AggPoolInfo value) {
        this.id = value.id;
        this.poolId = value.poolId;
        this.blockInEpoch = value.blockInEpoch;
        this.blockLifeTime = value.blockLifeTime;
        this.delegatorCnt = value.delegatorCnt;
        this.blockCheckPoint = value.blockCheckPoint;
        this.updateTime = value.updateTime;
    }

    public AggPoolInfo(
        Long id,
        Long poolId,
        Long blockInEpoch,
        Long blockLifeTime,
        Long delegatorCnt,
        Long blockCheckPoint,
        LocalDateTime updateTime
    ) {
        this.id = id;
        this.poolId = poolId;
        this.blockInEpoch = blockInEpoch;
        this.blockLifeTime = blockLifeTime;
        this.delegatorCnt = delegatorCnt;
        this.blockCheckPoint = blockCheckPoint;
        this.updateTime = updateTime;
    }

    /**
     * Getter for <code>agg_pool_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>agg_pool_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>agg_pool_info.pool_id</code>.
     */
    public Long getPoolId() {
        return this.poolId;
    }

    /**
     * Setter for <code>agg_pool_info.pool_id</code>.
     */
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    /**
     * Getter for <code>agg_pool_info.block_in_epoch</code>.
     */
    public Long getBlockInEpoch() {
        return this.blockInEpoch;
    }

    /**
     * Setter for <code>agg_pool_info.block_in_epoch</code>.
     */
    public void setBlockInEpoch(Long blockInEpoch) {
        this.blockInEpoch = blockInEpoch;
    }

    /**
     * Getter for <code>agg_pool_info.block_life_time</code>.
     */
    public Long getBlockLifeTime() {
        return this.blockLifeTime;
    }

    /**
     * Setter for <code>agg_pool_info.block_life_time</code>.
     */
    public void setBlockLifeTime(Long blockLifeTime) {
        this.blockLifeTime = blockLifeTime;
    }

    /**
     * Getter for <code>agg_pool_info.delegator_cnt</code>.
     */
    public Long getDelegatorCnt() {
        return this.delegatorCnt;
    }

    /**
     * Setter for <code>agg_pool_info.delegator_cnt</code>.
     */
    public void setDelegatorCnt(Long delegatorCnt) {
        this.delegatorCnt = delegatorCnt;
    }

    /**
     * Getter for <code>agg_pool_info.block_check_point</code>.
     */
    public Long getBlockCheckPoint() {
        return this.blockCheckPoint;
    }

    /**
     * Setter for <code>agg_pool_info.block_check_point</code>.
     */
    public void setBlockCheckPoint(Long blockCheckPoint) {
        this.blockCheckPoint = blockCheckPoint;
    }

    /**
     * Getter for <code>agg_pool_info.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Setter for <code>agg_pool_info.update_time</code>.
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
        final AggPoolInfo other = (AggPoolInfo) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.poolId == null) {
            if (other.poolId != null)
                return false;
        }
        else if (!this.poolId.equals(other.poolId))
            return false;
        if (this.blockInEpoch == null) {
            if (other.blockInEpoch != null)
                return false;
        }
        else if (!this.blockInEpoch.equals(other.blockInEpoch))
            return false;
        if (this.blockLifeTime == null) {
            if (other.blockLifeTime != null)
                return false;
        }
        else if (!this.blockLifeTime.equals(other.blockLifeTime))
            return false;
        if (this.delegatorCnt == null) {
            if (other.delegatorCnt != null)
                return false;
        }
        else if (!this.delegatorCnt.equals(other.delegatorCnt))
            return false;
        if (this.blockCheckPoint == null) {
            if (other.blockCheckPoint != null)
                return false;
        }
        else if (!this.blockCheckPoint.equals(other.blockCheckPoint))
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
        result = prime * result + ((this.poolId == null) ? 0 : this.poolId.hashCode());
        result = prime * result + ((this.blockInEpoch == null) ? 0 : this.blockInEpoch.hashCode());
        result = prime * result + ((this.blockLifeTime == null) ? 0 : this.blockLifeTime.hashCode());
        result = prime * result + ((this.delegatorCnt == null) ? 0 : this.delegatorCnt.hashCode());
        result = prime * result + ((this.blockCheckPoint == null) ? 0 : this.blockCheckPoint.hashCode());
        result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AggPoolInfo (");

        sb.append(id);
        sb.append(", ").append(poolId);
        sb.append(", ").append(blockInEpoch);
        sb.append(", ").append(blockLifeTime);
        sb.append(", ").append(delegatorCnt);
        sb.append(", ").append(blockCheckPoint);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}