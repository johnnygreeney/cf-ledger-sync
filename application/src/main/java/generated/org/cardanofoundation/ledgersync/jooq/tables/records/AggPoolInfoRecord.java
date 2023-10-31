/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq.tables.records;


import java.time.LocalDateTime;

import org.cardanofoundation.ledgersync.jooq.tables.AggPoolInfo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AggPoolInfoRecord extends UpdatableRecordImpl<AggPoolInfoRecord> implements Record7<Long, Long, Long, Long, Long, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>agg_pool_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>agg_pool_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>agg_pool_info.pool_id</code>.
     */
    public void setPoolId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>agg_pool_info.pool_id</code>.
     */
    public Long getPoolId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>agg_pool_info.block_in_epoch</code>.
     */
    public void setBlockInEpoch(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>agg_pool_info.block_in_epoch</code>.
     */
    public Long getBlockInEpoch() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>agg_pool_info.block_life_time</code>.
     */
    public void setBlockLifeTime(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>agg_pool_info.block_life_time</code>.
     */
    public Long getBlockLifeTime() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>agg_pool_info.delegator_cnt</code>.
     */
    public void setDelegatorCnt(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>agg_pool_info.delegator_cnt</code>.
     */
    public Long getDelegatorCnt() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>agg_pool_info.block_check_point</code>.
     */
    public void setBlockCheckPoint(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>agg_pool_info.block_check_point</code>.
     */
    public Long getBlockCheckPoint() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>agg_pool_info.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>agg_pool_info.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, Long, Long, Long, Long, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AggPoolInfo.AGG_POOL_INFO.ID;
    }

    @Override
    public Field<Long> field2() {
        return AggPoolInfo.AGG_POOL_INFO.POOL_ID;
    }

    @Override
    public Field<Long> field3() {
        return AggPoolInfo.AGG_POOL_INFO.BLOCK_IN_EPOCH;
    }

    @Override
    public Field<Long> field4() {
        return AggPoolInfo.AGG_POOL_INFO.BLOCK_LIFE_TIME;
    }

    @Override
    public Field<Long> field5() {
        return AggPoolInfo.AGG_POOL_INFO.DELEGATOR_CNT;
    }

    @Override
    public Field<Long> field6() {
        return AggPoolInfo.AGG_POOL_INFO.BLOCK_CHECK_POINT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return AggPoolInfo.AGG_POOL_INFO.UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getPoolId();
    }

    @Override
    public Long component3() {
        return getBlockInEpoch();
    }

    @Override
    public Long component4() {
        return getBlockLifeTime();
    }

    @Override
    public Long component5() {
        return getDelegatorCnt();
    }

    @Override
    public Long component6() {
        return getBlockCheckPoint();
    }

    @Override
    public LocalDateTime component7() {
        return getUpdateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getPoolId();
    }

    @Override
    public Long value3() {
        return getBlockInEpoch();
    }

    @Override
    public Long value4() {
        return getBlockLifeTime();
    }

    @Override
    public Long value5() {
        return getDelegatorCnt();
    }

    @Override
    public Long value6() {
        return getBlockCheckPoint();
    }

    @Override
    public LocalDateTime value7() {
        return getUpdateTime();
    }

    @Override
    public AggPoolInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord value2(Long value) {
        setPoolId(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord value3(Long value) {
        setBlockInEpoch(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord value4(Long value) {
        setBlockLifeTime(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord value5(Long value) {
        setDelegatorCnt(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord value6(Long value) {
        setBlockCheckPoint(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord value7(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public AggPoolInfoRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AggPoolInfoRecord
     */
    public AggPoolInfoRecord() {
        super(AggPoolInfo.AGG_POOL_INFO);
    }

    /**
     * Create a detached, initialised AggPoolInfoRecord
     */
    public AggPoolInfoRecord(Long id, Long poolId, Long blockInEpoch, Long blockLifeTime, Long delegatorCnt, Long blockCheckPoint, LocalDateTime updateTime) {
        super(AggPoolInfo.AGG_POOL_INFO);

        setId(id);
        setPoolId(poolId);
        setBlockInEpoch(blockInEpoch);
        setBlockLifeTime(blockLifeTime);
        setDelegatorCnt(delegatorCnt);
        setBlockCheckPoint(blockCheckPoint);
        setUpdateTime(updateTime);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AggPoolInfoRecord
     */
    public AggPoolInfoRecord(org.cardanofoundation.ledgersync.jooq.tables.pojos.AggPoolInfo value) {
        super(AggPoolInfo.AGG_POOL_INFO);

        if (value != null) {
            setId(value.getId());
            setPoolId(value.getPoolId());
            setBlockInEpoch(value.getBlockInEpoch());
            setBlockLifeTime(value.getBlockLifeTime());
            setDelegatorCnt(value.getDelegatorCnt());
            setBlockCheckPoint(value.getBlockCheckPoint());
            setUpdateTime(value.getUpdateTime());
            resetChangedOnNotNull();
        }
    }
}
