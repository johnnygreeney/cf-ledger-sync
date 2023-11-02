/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq;


import org.cardanofoundation.ledgersync.jooq.tables.Address;
import org.cardanofoundation.ledgersync.jooq.tables.AddressToken;
import org.cardanofoundation.ledgersync.jooq.tables.AddressTokenBalance;
import org.cardanofoundation.ledgersync.jooq.tables.AddressTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.AggAddressToken;
import org.cardanofoundation.ledgersync.jooq.tables.AggAddressTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.AggPoolInfo;
import org.cardanofoundation.ledgersync.jooq.tables.AssetMetadata;
import org.cardanofoundation.ledgersync.jooq.tables.Block;
import org.cardanofoundation.ledgersync.jooq.tables.Datum;
import org.cardanofoundation.ledgersync.jooq.tables.Delegation;
import org.cardanofoundation.ledgersync.jooq.tables.Epoch;
import org.cardanofoundation.ledgersync.jooq.tables.EpochParam;
import org.cardanofoundation.ledgersync.jooq.tables.EpochStake;
import org.cardanofoundation.ledgersync.jooq.tables.ExtraKeyWitness;
import org.cardanofoundation.ledgersync.jooq.tables.MaTxMint;
import org.cardanofoundation.ledgersync.jooq.tables.MaTxOut;
import org.cardanofoundation.ledgersync.jooq.tables.MultiAsset;
import org.cardanofoundation.ledgersync.jooq.tables.ParamProposal;
import org.cardanofoundation.ledgersync.jooq.tables.PoolHash;
import org.cardanofoundation.ledgersync.jooq.tables.PoolMetadataRef;
import org.cardanofoundation.ledgersync.jooq.tables.PoolOfflineData;
import org.cardanofoundation.ledgersync.jooq.tables.PoolOfflineFetchError;
import org.cardanofoundation.ledgersync.jooq.tables.PoolOwner;
import org.cardanofoundation.ledgersync.jooq.tables.PoolRelay;
import org.cardanofoundation.ledgersync.jooq.tables.PoolReportHistory;
import org.cardanofoundation.ledgersync.jooq.tables.PoolRetire;
import org.cardanofoundation.ledgersync.jooq.tables.PoolUpdate;
import org.cardanofoundation.ledgersync.jooq.tables.Redeemer;
import org.cardanofoundation.ledgersync.jooq.tables.RedeemerData;
import org.cardanofoundation.ledgersync.jooq.tables.ReferenceTxIn;
import org.cardanofoundation.ledgersync.jooq.tables.ReportHistory;
import org.cardanofoundation.ledgersync.jooq.tables.Reserve;
import org.cardanofoundation.ledgersync.jooq.tables.ReservedPoolTicker;
import org.cardanofoundation.ledgersync.jooq.tables.Reward;
import org.cardanofoundation.ledgersync.jooq.tables.Script;
import org.cardanofoundation.ledgersync.jooq.tables.SlotLeader;
import org.cardanofoundation.ledgersync.jooq.tables.StakeAddress;
import org.cardanofoundation.ledgersync.jooq.tables.StakeDeregistration;
import org.cardanofoundation.ledgersync.jooq.tables.StakeKeyReportHistory;
import org.cardanofoundation.ledgersync.jooq.tables.StakeRegistration;
import org.cardanofoundation.ledgersync.jooq.tables.StakeTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.Treasury;
import org.cardanofoundation.ledgersync.jooq.tables.Tx;
import org.cardanofoundation.ledgersync.jooq.tables.TxChart;
import org.cardanofoundation.ledgersync.jooq.tables.TxIn;
import org.cardanofoundation.ledgersync.jooq.tables.TxMetadata;
import org.cardanofoundation.ledgersync.jooq.tables.TxMetadataHash;
import org.cardanofoundation.ledgersync.jooq.tables.TxOut;
import org.cardanofoundation.ledgersync.jooq.tables.Withdrawal;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ADDRESS_ADDRESS_HAS_SCRIPT_IDX = Internal.createIndex(DSL.name("address_address_has_script_idx"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.ADDRESS_HAS_SCRIPT }, false);
    public static final Index ADDRESS_BALANCE_IDX = Internal.createIndex(DSL.name("address_balance_idx"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.BALANCE }, false);
    public static final Index ADDRESS_TOKEN_BALANCE_IDENT_STAKE_ADDRESS_ID_BALANCE_IDX = Internal.createIndex(DSL.name("address_token_balance_ident_stake_address_id_balance_idx"), AddressTokenBalance.ADDRESS_TOKEN_BALANCE, new OrderField[] { AddressTokenBalance.ADDRESS_TOKEN_BALANCE.IDENT, AddressTokenBalance.ADDRESS_TOKEN_BALANCE.STAKE_ADDRESS_ID, AddressTokenBalance.ADDRESS_TOKEN_BALANCE.BALANCE }, false);
    public static final Index ADDRESS_TOKEN_BALANCE_STAKE_ADDRESS_ID_IDX = Internal.createIndex(DSL.name("address_token_balance_stake_address_id_idx"), AddressTokenBalance.ADDRESS_TOKEN_BALANCE, new OrderField[] { AddressTokenBalance.ADDRESS_TOKEN_BALANCE.STAKE_ADDRESS_ID }, false);
    public static final Index ADDRESS_TOKEN_IDENT_STAKE_TX_ID_BALANCE_IDX = Internal.createIndex(DSL.name("address_token_ident_stake_tx_id_balance_idx"), AddressToken.ADDRESS_TOKEN, new OrderField[] { AddressToken.ADDRESS_TOKEN.IDENT, AddressToken.ADDRESS_TOKEN.TX_ID, AddressToken.ADDRESS_TOKEN.BALANCE }, false);
    public static final Index ADDRESS_TOKEN_IDENT_TX_ID_BALANCE_IDX = Internal.createIndex(DSL.name("address_token_ident_tx_id_balance_idx"), AddressToken.ADDRESS_TOKEN, new OrderField[] { AddressToken.ADDRESS_TOKEN.IDENT, AddressToken.ADDRESS_TOKEN.TX_ID, AddressToken.ADDRESS_TOKEN.BALANCE }, false);
    public static final Index ADDRESS_TX_BALANCE_ADDRESS_ID_TIME_BALANCE_INDEX = Internal.createIndex(DSL.name("address_tx_balance_address_id_time_balance_index"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.ADDRESS_ID, AddressTxBalance.ADDRESS_TX_BALANCE.TIME, AddressTxBalance.ADDRESS_TX_BALANCE.BALANCE }, false);
    public static final Index ADDRESS_TX_BALANCE_STAKE_ADDRESS_ID_IDX = Internal.createIndex(DSL.name("address_tx_balance_stake_address_id_idx"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.STAKE_ADDRESS_ID }, false);
    public static final Index ADDRESS_TX_BALANCE_STAKE_ADDRESS_ID_TX_ID_BALANCE_IDX = Internal.createIndex(DSL.name("address_tx_balance_stake_address_id_tx_id_balance_idx"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.STAKE_ADDRESS_ID, AddressTxBalance.ADDRESS_TX_BALANCE.TX_ID, AddressTxBalance.ADDRESS_TX_BALANCE.BALANCE }, false);
    public static final Index ADDRESS_TX_BALANCE_TX_ID_IDX = Internal.createIndex(DSL.name("address_tx_balance_tx_id_idx"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.TX_ID, AddressTxBalance.ADDRESS_TX_BALANCE.ADDRESS_ID }, true);
    public static final Index ADDRESS_TX_COUNT_IDX = Internal.createIndex(DSL.name("address_tx_count_idx"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.TX_COUNT }, false);
    public static final Index AGG_ADDRESS_TOKEN_DAY_IDX = Internal.createIndex(DSL.name("agg_address_token_day_idx"), AggAddressToken.AGG_ADDRESS_TOKEN, new OrderField[] { AggAddressToken.AGG_ADDRESS_TOKEN.DAY.desc() }, false);
    public static final Index AGG_ADDRESS_TOKEN_IDENT_DAY_BALANCE_IDX = Internal.createIndex(DSL.name("agg_address_token_ident_day_balance_idx"), AggAddressToken.AGG_ADDRESS_TOKEN, new OrderField[] { AggAddressToken.AGG_ADDRESS_TOKEN.IDENT, AggAddressToken.AGG_ADDRESS_TOKEN.DAY, AggAddressToken.AGG_ADDRESS_TOKEN.BALANCE }, false);
    public static final Index AGG_ADDRESS_TX_BALANCE_ADDRESS_ID_DAY_BALANCE_IDX = Internal.createIndex(DSL.name("agg_address_tx_balance_address_id_day_balance_idx"), AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE, new OrderField[] { AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.ADDRESS_ID, AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.DAY, AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.BALANCE }, false);
    public static final Index AGG_ADDRESS_TX_BALANCE_DAY_IDX = Internal.createIndex(DSL.name("agg_address_tx_balance_day_idx"), AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE, new OrderField[] { AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.DAY.desc() }, false);
    public static final Index AGG_ADDRESS_TX_BALANCE_DAY_INDEX = Internal.createIndex(DSL.name("agg_address_tx_balance_day_index"), AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE, new OrderField[] { AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.DAY.desc() }, false);
    public static final Index AGG_ADDRESS_TX_BALANCE_STAKE_ADDRESS_ID_DAY_BALANCE_IDX = Internal.createIndex(DSL.name("agg_address_tx_balance_stake_address_id_day_balance_idx"), AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE, new OrderField[] { AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.STAKE_ADDRESS_ID, AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.DAY, AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE.BALANCE }, false);
    public static final Index AGG_POOL_INFO_BLOCK_IN_EPOCH_IDX = Internal.createIndex(DSL.name("agg_pool_info_block_in_epoch_idx"), AggPoolInfo.AGG_POOL_INFO, new OrderField[] { AggPoolInfo.AGG_POOL_INFO.BLOCK_IN_EPOCH }, false);
    public static final Index AGG_POOL_INFO_BLOCK_LIFE_TIME_IDX = Internal.createIndex(DSL.name("agg_pool_info_block_life_time_idx"), AggPoolInfo.AGG_POOL_INFO, new OrderField[] { AggPoolInfo.AGG_POOL_INFO.BLOCK_LIFE_TIME }, false);
    public static final Index AGG_POOL_INFO_DELEGATOR_CNT_IDX = Internal.createIndex(DSL.name("agg_pool_info_delegator_cnt_idx"), AggPoolInfo.AGG_POOL_INFO, new OrderField[] { AggPoolInfo.AGG_POOL_INFO.DELEGATOR_CNT }, false);
    public static final Index ASSET_METADATA_SUBJECT_IDX = Internal.createIndex(DSL.name("asset_metadata_subject_idx"), AssetMetadata.ASSET_METADATA, new OrderField[] { AssetMetadata.ASSET_METADATA.SUBJECT }, false);
    public static final Index ASSET_METADATA_UX = Internal.createIndex(DSL.name("asset_metadata_ux"), AssetMetadata.ASSET_METADATA, new OrderField[] { AssetMetadata.ASSET_METADATA.IDENT }, true);
    public static final Index DATUM_HASH_UINDEX = Internal.createIndex(DSL.name("datum_hash_uindex"), Datum.DATUM, new OrderField[] { Datum.DATUM.HASH }, true);
    public static final Index EXAGG_POOL_INFO_POOL_ID_IDX = Internal.createIndex(DSL.name("exagg_pool_info_pool_id_idx"), AggPoolInfo.AGG_POOL_INFO, new OrderField[] { AggPoolInfo.AGG_POOL_INFO.POOL_ID }, false);
    public static final Index EXTRA_KEY_WITNESS_HASH_INDEX = Internal.createIndex(DSL.name("extra_key_witness_hash_index"), ExtraKeyWitness.EXTRA_KEY_WITNESS, new OrderField[] { ExtraKeyWitness.EXTRA_KEY_WITNESS.HASH }, false);
    public static final Index IDX_ADDRESS_ADDRESS = Internal.createIndex(DSL.name("idx_address_address"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.ADDRESS_ }, false);
    public static final Index IDX_ADDRESS_STAKE_ADDRESS_ID = Internal.createIndex(DSL.name("idx_address_stake_address_id"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.STAKE_ADDRESS_ID }, false);
    public static final Index IDX_ADDRESS_TOKEN_ADDRESS_ID = Internal.createIndex(DSL.name("idx_address_token_address_id"), AddressToken.ADDRESS_TOKEN, new OrderField[] { AddressToken.ADDRESS_TOKEN.ADDRESS_ID }, false);
    public static final Index IDX_ADDRESS_TOKEN_BALANCE_ADDRESS_ID = Internal.createIndex(DSL.name("idx_address_token_balance_address_id"), AddressTokenBalance.ADDRESS_TOKEN_BALANCE, new OrderField[] { AddressTokenBalance.ADDRESS_TOKEN_BALANCE.ADDRESS_ID }, false);
    public static final Index IDX_ADDRESS_TOKEN_BALANCE_ADDRESS_ID_IDENT = Internal.createIndex(DSL.name("idx_address_token_balance_address_id_ident"), AddressTokenBalance.ADDRESS_TOKEN_BALANCE, new OrderField[] { AddressTokenBalance.ADDRESS_TOKEN_BALANCE.ADDRESS_ID, AddressTokenBalance.ADDRESS_TOKEN_BALANCE.IDENT }, false);
    public static final Index IDX_ADDRESS_TOKEN_BALANCE_IDENT = Internal.createIndex(DSL.name("idx_address_token_balance_ident"), AddressTokenBalance.ADDRESS_TOKEN_BALANCE, new OrderField[] { AddressTokenBalance.ADDRESS_TOKEN_BALANCE.IDENT }, false);
    public static final Index IDX_ADDRESS_TOKEN_BALANCE_IDENT_ADDRESS_ID = Internal.createIndex(DSL.name("idx_address_token_balance_ident_address_id"), AddressTokenBalance.ADDRESS_TOKEN_BALANCE, new OrderField[] { AddressTokenBalance.ADDRESS_TOKEN_BALANCE.IDENT, AddressTokenBalance.ADDRESS_TOKEN_BALANCE.ADDRESS_ID }, false);
    public static final Index IDX_ADDRESS_TOKEN_IDENT = Internal.createIndex(DSL.name("idx_address_token_ident"), AddressToken.ADDRESS_TOKEN, new OrderField[] { AddressToken.ADDRESS_TOKEN.IDENT }, false);
    public static final Index IDX_ADDRESS_TOKEN_TX_ID = Internal.createIndex(DSL.name("idx_address_token_tx_id"), AddressToken.ADDRESS_TOKEN, new OrderField[] { AddressToken.ADDRESS_TOKEN.TX_ID }, false);
    public static final Index IDX_ADDRESS_TX_BALANCE_ADDRESS_ID = Internal.createIndex(DSL.name("idx_address_tx_balance_address_id"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.ADDRESS_ID }, false);
    public static final Index IDX_ADDRESS_TX_BALANCE_TIME = Internal.createIndex(DSL.name("idx_address_tx_balance_time"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.TIME }, false);
    public static final Index IDX_ADDRESS_TX_BALANCE_TX_ID = Internal.createIndex(DSL.name("idx_address_tx_balance_tx_id"), AddressTxBalance.ADDRESS_TX_BALANCE, new OrderField[] { AddressTxBalance.ADDRESS_TX_BALANCE.TX_ID }, false);
    public static final Index IDX_BLOCK_BLOCK_NO = Internal.createIndex(DSL.name("idx_block_block_no"), Block.BLOCK, new OrderField[] { Block.BLOCK.BLOCK_NO }, false);
    public static final Index IDX_BLOCK_EPOCH_NO = Internal.createIndex(DSL.name("idx_block_epoch_no"), Block.BLOCK, new OrderField[] { Block.BLOCK.EPOCH_NO }, false);
    public static final Index IDX_BLOCK_ID_TIME_TX_COUNT = Internal.createIndex(DSL.name("idx_block_id_time_tx_count"), Block.BLOCK, new OrderField[] { Block.BLOCK.ID, Block.BLOCK.TIME, Block.BLOCK.TX_COUNT }, false);
    public static final Index IDX_BLOCK_PREVIOUS_ID = Internal.createIndex(DSL.name("idx_block_previous_id"), Block.BLOCK, new OrderField[] { Block.BLOCK.PREVIOUS_ID }, false);
    public static final Index IDX_BLOCK_SLOT_LEADER_ID = Internal.createIndex(DSL.name("idx_block_slot_leader_id"), Block.BLOCK, new OrderField[] { Block.BLOCK.SLOT_LEADER_ID }, false);
    public static final Index IDX_BLOCK_SLOT_NO = Internal.createIndex(DSL.name("idx_block_slot_no"), Block.BLOCK, new OrderField[] { Block.BLOCK.SLOT_NO }, false);
    public static final Index IDX_BLOCK_TIME = Internal.createIndex(DSL.name("idx_block_time"), Block.BLOCK, new OrderField[] { Block.BLOCK.TIME }, false);
    public static final Index IDX_DATUM_TX_ID = Internal.createIndex(DSL.name("idx_datum_tx_id"), Datum.DATUM, new OrderField[] { Datum.DATUM.TX_ID }, false);
    public static final Index IDX_DELEGATION_ACTIVE_EPOCH_NO = Internal.createIndex(DSL.name("idx_delegation_active_epoch_no"), Delegation.DELEGATION, new OrderField[] { Delegation.DELEGATION.ACTIVE_EPOCH_NO }, false);
    public static final Index IDX_DELEGATION_ADDR_ID = Internal.createIndex(DSL.name("idx_delegation_addr_id"), Delegation.DELEGATION, new OrderField[] { Delegation.DELEGATION.ADDR_ID }, false);
    public static final Index IDX_DELEGATION_POOL_HASH_ID = Internal.createIndex(DSL.name("idx_delegation_pool_hash_id"), Delegation.DELEGATION, new OrderField[] { Delegation.DELEGATION.POOL_HASH_ID }, false);
    public static final Index IDX_DELEGATION_REDEEMER_ID = Internal.createIndex(DSL.name("idx_delegation_redeemer_id"), Delegation.DELEGATION, new OrderField[] { Delegation.DELEGATION.REDEEMER_ID }, false);
    public static final Index IDX_DELEGATION_TX_ID = Internal.createIndex(DSL.name("idx_delegation_tx_id"), Delegation.DELEGATION, new OrderField[] { Delegation.DELEGATION.TX_ID }, false);
    public static final Index IDX_EPOCH_NO = Internal.createIndex(DSL.name("idx_epoch_no"), Epoch.EPOCH, new OrderField[] { Epoch.EPOCH.NO }, false);
    public static final Index IDX_EPOCH_PARAM_BLOCK_ID = Internal.createIndex(DSL.name("idx_epoch_param_block_id"), EpochParam.EPOCH_PARAM, new OrderField[] { EpochParam.EPOCH_PARAM.BLOCK_ID }, false);
    public static final Index IDX_EPOCH_PARAM_COST_MODEL_ID = Internal.createIndex(DSL.name("idx_epoch_param_cost_model_id"), EpochParam.EPOCH_PARAM, new OrderField[] { EpochParam.EPOCH_PARAM.COST_MODEL_ID }, false);
    public static final Index IDX_EPOCH_STAKE_ADDR_ID = Internal.createIndex(DSL.name("idx_epoch_stake_addr_id"), EpochStake.EPOCH_STAKE, new OrderField[] { EpochStake.EPOCH_STAKE.ADDR_ID }, false);
    public static final Index IDX_EPOCH_STAKE_EPOCH_NO = Internal.createIndex(DSL.name("idx_epoch_stake_epoch_no"), EpochStake.EPOCH_STAKE, new OrderField[] { EpochStake.EPOCH_STAKE.EPOCH_NO }, false);
    public static final Index IDX_EPOCH_STAKE_POOL_ID = Internal.createIndex(DSL.name("idx_epoch_stake_pool_id"), EpochStake.EPOCH_STAKE, new OrderField[] { EpochStake.EPOCH_STAKE.POOL_ID }, false);
    public static final Index IDX_EXTRA_KEY_WITNESS_TX_ID = Internal.createIndex(DSL.name("idx_extra_key_witness_tx_id"), ExtraKeyWitness.EXTRA_KEY_WITNESS, new OrderField[] { ExtraKeyWitness.EXTRA_KEY_WITNESS.TX_ID }, false);
    public static final Index IDX_MA_TX_MINT_TX_ID = Internal.createIndex(DSL.name("idx_ma_tx_mint_tx_id"), MaTxMint.MA_TX_MINT, new OrderField[] { MaTxMint.MA_TX_MINT.TX_ID }, false);
    public static final Index IDX_MA_TX_OUT_TX_OUT_ID = Internal.createIndex(DSL.name("idx_ma_tx_out_tx_out_id"), MaTxOut.MA_TX_OUT, new OrderField[] { MaTxOut.MA_TX_OUT.TX_OUT_ID }, false);
    public static final Index IDX_MULTI_ASSET_NAME_VIEW = Internal.createIndex(DSL.name("idx_multi_asset_name_view"), MultiAsset.MULTI_ASSET, new OrderField[] { MultiAsset.MULTI_ASSET.NAME_VIEW }, false);
    public static final Index IDX_PARAM_PROPOSAL_COST_MODEL_ID = Internal.createIndex(DSL.name("idx_param_proposal_cost_model_id"), ParamProposal.PARAM_PROPOSAL, new OrderField[] { ParamProposal.PARAM_PROPOSAL.COST_MODEL_ID }, false);
    public static final Index IDX_PARAM_PROPOSAL_REGISTERED_TX_ID = Internal.createIndex(DSL.name("idx_param_proposal_registered_tx_id"), ParamProposal.PARAM_PROPOSAL, new OrderField[] { ParamProposal.PARAM_PROPOSAL.REGISTERED_TX_ID }, false);
    public static final Index IDX_POOL_METADATA_REF_REGISTERED_TX_ID = Internal.createIndex(DSL.name("idx_pool_metadata_ref_registered_tx_id"), PoolMetadataRef.POOL_METADATA_REF, new OrderField[] { PoolMetadataRef.POOL_METADATA_REF.REGISTERED_TX_ID }, false);
    public static final Index IDX_POOL_OFFLINE_DATA_PMR_ID = Internal.createIndex(DSL.name("idx_pool_offline_data_pmr_id"), PoolOfflineData.POOL_OFFLINE_DATA, new OrderField[] { PoolOfflineData.POOL_OFFLINE_DATA.PMR_ID }, false);
    public static final Index IDX_POOL_OFFLINE_FETCH_ERROR_PMR_ID = Internal.createIndex(DSL.name("idx_pool_offline_fetch_error_pmr_id"), PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR, new OrderField[] { PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR.PMR_ID }, false);
    public static final Index IDX_POOL_RELAY_UPDATE_ID = Internal.createIndex(DSL.name("idx_pool_relay_update_id"), PoolRelay.POOL_RELAY, new OrderField[] { PoolRelay.POOL_RELAY.UPDATE_ID }, false);
    public static final Index IDX_POOL_RETIRE_ANNOUNCED_TX_ID = Internal.createIndex(DSL.name("idx_pool_retire_announced_tx_id"), PoolRetire.POOL_RETIRE, new OrderField[] { PoolRetire.POOL_RETIRE.ANNOUNCED_TX_ID }, false);
    public static final Index IDX_POOL_RETIRE_HASH_ID = Internal.createIndex(DSL.name("idx_pool_retire_hash_id"), PoolRetire.POOL_RETIRE, new OrderField[] { PoolRetire.POOL_RETIRE.HASH_ID }, false);
    public static final Index IDX_POOL_UPDATE_ACTIVE_EPOCH_NO = Internal.createIndex(DSL.name("idx_pool_update_active_epoch_no"), PoolUpdate.POOL_UPDATE, new OrderField[] { PoolUpdate.POOL_UPDATE.ACTIVE_EPOCH_NO }, false);
    public static final Index IDX_POOL_UPDATE_HASH_ID = Internal.createIndex(DSL.name("idx_pool_update_hash_id"), PoolUpdate.POOL_UPDATE, new OrderField[] { PoolUpdate.POOL_UPDATE.HASH_ID }, false);
    public static final Index IDX_POOL_UPDATE_META_ID = Internal.createIndex(DSL.name("idx_pool_update_meta_id"), PoolUpdate.POOL_UPDATE, new OrderField[] { PoolUpdate.POOL_UPDATE.META_ID }, false);
    public static final Index IDX_POOL_UPDATE_REGISTERED_TX_ID = Internal.createIndex(DSL.name("idx_pool_update_registered_tx_id"), PoolUpdate.POOL_UPDATE, new OrderField[] { PoolUpdate.POOL_UPDATE.REGISTERED_TX_ID }, false);
    public static final Index IDX_POOL_UPDATE_REWARD_ADDR = Internal.createIndex(DSL.name("idx_pool_update_reward_addr"), PoolUpdate.POOL_UPDATE, new OrderField[] { PoolUpdate.POOL_UPDATE.REWARD_ADDR_ID }, false);
    public static final Index IDX_RESERVE_ADDR_ID = Internal.createIndex(DSL.name("idx_reserve_addr_id"), Reserve.RESERVE, new OrderField[] { Reserve.RESERVE.ADDR_ID }, false);
    public static final Index IDX_RESERVE_TX_ID = Internal.createIndex(DSL.name("idx_reserve_tx_id"), Reserve.RESERVE, new OrderField[] { Reserve.RESERVE.TX_ID }, false);
    public static final Index IDX_RESERVED_POOL_TICKER_POOL_HASH = Internal.createIndex(DSL.name("idx_reserved_pool_ticker_pool_hash"), ReservedPoolTicker.RESERVED_POOL_TICKER, new OrderField[] { ReservedPoolTicker.RESERVED_POOL_TICKER.POOL_HASH }, false);
    public static final Index IDX_REWARD_ADDR_ID = Internal.createIndex(DSL.name("idx_reward_addr_id"), Reward.REWARD, new OrderField[] { Reward.REWARD.ADDR_ID }, false);
    public static final Index IDX_REWARD_EARNED_EPOCH = Internal.createIndex(DSL.name("idx_reward_earned_epoch"), Reward.REWARD, new OrderField[] { Reward.REWARD.EARNED_EPOCH }, false);
    public static final Index IDX_REWARD_POOL_ID = Internal.createIndex(DSL.name("idx_reward_pool_id"), Reward.REWARD, new OrderField[] { Reward.REWARD.POOL_ID }, false);
    public static final Index IDX_SCRIPT_TX_ID = Internal.createIndex(DSL.name("idx_script_tx_id"), Script.SCRIPT, new OrderField[] { Script.SCRIPT.TX_ID }, false);
    public static final Index IDX_SLOT_LEADER_POOL_HASH_ID = Internal.createIndex(DSL.name("idx_slot_leader_pool_hash_id"), SlotLeader.SLOT_LEADER, new OrderField[] { SlotLeader.SLOT_LEADER.POOL_HASH_ID }, false);
    public static final Index IDX_STAKE_ADDRESS_HASH_RAW = Internal.createIndex(DSL.name("idx_stake_address_hash_raw"), StakeAddress.STAKE_ADDRESS, new OrderField[] { StakeAddress.STAKE_ADDRESS.HASH_RAW }, false);
    public static final Index IDX_STAKE_ADDRESS_VIEW = Internal.createIndex(DSL.name("idx_stake_address_view"), StakeAddress.STAKE_ADDRESS, new OrderField[] { StakeAddress.STAKE_ADDRESS.VIEW }, false);
    public static final Index IDX_STAKE_DEREGISTRATION_ADDR_ID = Internal.createIndex(DSL.name("idx_stake_deregistration_addr_id"), StakeDeregistration.STAKE_DEREGISTRATION, new OrderField[] { StakeDeregistration.STAKE_DEREGISTRATION.ADDR_ID }, false);
    public static final Index IDX_STAKE_DEREGISTRATION_REDEEMER_ID = Internal.createIndex(DSL.name("idx_stake_deregistration_redeemer_id"), StakeDeregistration.STAKE_DEREGISTRATION, new OrderField[] { StakeDeregistration.STAKE_DEREGISTRATION.REDEEMER_ID }, false);
    public static final Index IDX_STAKE_DEREGISTRATION_TX_ID = Internal.createIndex(DSL.name("idx_stake_deregistration_tx_id"), StakeDeregistration.STAKE_DEREGISTRATION, new OrderField[] { StakeDeregistration.STAKE_DEREGISTRATION.TX_ID }, false);
    public static final Index IDX_STAKE_REGISTRATION_ADDR_ID = Internal.createIndex(DSL.name("idx_stake_registration_addr_id"), StakeRegistration.STAKE_REGISTRATION, new OrderField[] { StakeRegistration.STAKE_REGISTRATION.ADDR_ID }, false);
    public static final Index IDX_STAKE_REGISTRATION_TX_ID = Internal.createIndex(DSL.name("idx_stake_registration_tx_id"), StakeRegistration.STAKE_REGISTRATION, new OrderField[] { StakeRegistration.STAKE_REGISTRATION.TX_ID }, false);
    public static final Index IDX_TREASURY_ADDR_ID = Internal.createIndex(DSL.name("idx_treasury_addr_id"), Treasury.TREASURY, new OrderField[] { Treasury.TREASURY.ADDR_ID }, false);
    public static final Index IDX_TREASURY_TX_ID = Internal.createIndex(DSL.name("idx_treasury_tx_id"), Treasury.TREASURY, new OrderField[] { Treasury.TREASURY.TX_ID }, false);
    public static final Index IDX_TX_BLOCK_ID = Internal.createIndex(DSL.name("idx_tx_block_id"), Tx.TX, new OrderField[] { Tx.TX.BLOCK_ID }, false);
    public static final Index IDX_TX_CHART_DAY = Internal.createIndex(DSL.name("idx_tx_chart_day"), TxChart.TX_CHART, new OrderField[] { TxChart.TX_CHART.DAY }, false);
    public static final Index IDX_TX_CHART_HOUR = Internal.createIndex(DSL.name("idx_tx_chart_hour"), TxChart.TX_CHART, new OrderField[] { TxChart.TX_CHART.HOUR }, false);
    public static final Index IDX_TX_CHART_MINUTE = Internal.createIndex(DSL.name("idx_tx_chart_minute"), TxChart.TX_CHART, new OrderField[] { TxChart.TX_CHART.MINUTE }, false);
    public static final Index IDX_TX_CHART_MONTH = Internal.createIndex(DSL.name("idx_tx_chart_month"), TxChart.TX_CHART, new OrderField[] { TxChart.TX_CHART.MONTH }, false);
    public static final Index IDX_TX_IN_REDEEMER_ID = Internal.createIndex(DSL.name("idx_tx_in_redeemer_id"), TxIn.TX_IN, new OrderField[] { TxIn.TX_IN.REDEEMER_ID }, false);
    public static final Index IDX_TX_IN_SOURCE_TX = Internal.createIndex(DSL.name("idx_tx_in_source_tx"), TxIn.TX_IN, new OrderField[] { TxIn.TX_IN.TX_IN_ID }, false);
    public static final Index IDX_TX_IN_TX_IN_ID = Internal.createIndex(DSL.name("idx_tx_in_tx_in_id"), TxIn.TX_IN, new OrderField[] { TxIn.TX_IN.TX_IN_ID }, false);
    public static final Index IDX_TX_IN_TX_OUT_ID = Internal.createIndex(DSL.name("idx_tx_in_tx_out_id"), TxIn.TX_IN, new OrderField[] { TxIn.TX_IN.TX_OUT_ID }, false);
    public static final Index IDX_TX_METADATA_TX_ID = Internal.createIndex(DSL.name("idx_tx_metadata_tx_id"), TxMetadata.TX_METADATA, new OrderField[] { TxMetadata.TX_METADATA.TX_ID }, false);
    public static final Index IDX_TX_OUT_ADDRESS = Internal.createIndex(DSL.name("idx_tx_out_address"), TxOut.TX_OUT, new OrderField[] { TxOut.TX_OUT.ADDRESS }, false);
    public static final Index IDX_TX_OUT_PAYMENT_CRED = Internal.createIndex(DSL.name("idx_tx_out_payment_cred"), TxOut.TX_OUT, new OrderField[] { TxOut.TX_OUT.PAYMENT_CRED }, false);
    public static final Index IDX_TX_OUT_STAKE_ADDRESS_ID = Internal.createIndex(DSL.name("idx_tx_out_stake_address_id"), TxOut.TX_OUT, new OrderField[] { TxOut.TX_OUT.STAKE_ADDRESS_ID }, false);
    public static final Index IDX_TX_OUT_TX_ID = Internal.createIndex(DSL.name("idx_tx_out_tx_id"), TxOut.TX_OUT, new OrderField[] { TxOut.TX_OUT.TX_ID }, false);
    public static final Index IDX_WITHDRAWAL_ADDR_ID = Internal.createIndex(DSL.name("idx_withdrawal_addr_id"), Withdrawal.WITHDRAWAL, new OrderField[] { Withdrawal.WITHDRAWAL.ADDR_ID }, false);
    public static final Index IDX_WITHDRAWAL_REDEEMER_ID = Internal.createIndex(DSL.name("idx_withdrawal_redeemer_id"), Withdrawal.WITHDRAWAL, new OrderField[] { Withdrawal.WITHDRAWAL.REDEEMER_ID }, false);
    public static final Index IDX_WITHDRAWAL_TX_ID = Internal.createIndex(DSL.name("idx_withdrawal_tx_id"), Withdrawal.WITHDRAWAL, new OrderField[] { Withdrawal.WITHDRAWAL.TX_ID }, false);
    public static final Index MA_TX_MINT_IDENT_INDEX = Internal.createIndex(DSL.name("ma_tx_mint_ident_index"), MaTxMint.MA_TX_MINT, new OrderField[] { MaTxMint.MA_TX_MINT.IDENT }, false);
    public static final Index MA_TX_OUT_IDENT_INDEX = Internal.createIndex(DSL.name("ma_tx_out_ident_index"), MaTxOut.MA_TX_OUT, new OrderField[] { MaTxOut.MA_TX_OUT.IDENT }, false);
    public static final Index MULTI_ASSET_FINGERPRINT_UINDEX = Internal.createIndex(DSL.name("multi_asset_fingerprint_uindex"), MultiAsset.MULTI_ASSET, new OrderField[] { MultiAsset.MULTI_ASSET.FINGERPRINT }, true);
    public static final Index MULTI_ASSET_SUPPLY_IDX = Internal.createIndex(DSL.name("multi_asset_supply_idx"), MultiAsset.MULTI_ASSET, new OrderField[] { MultiAsset.MULTI_ASSET.SUPPLY }, false);
    public static final Index MULTI_ASSET_TIME_IDX = Internal.createIndex(DSL.name("multi_asset_time_idx"), MultiAsset.MULTI_ASSET, new OrderField[] { MultiAsset.MULTI_ASSET.TIME }, false);
    public static final Index POOL_HASH_HASH_RAW_INDEX = Internal.createIndex(DSL.name("pool_hash_hash_raw_index"), PoolHash.POOL_HASH, new OrderField[] { PoolHash.POOL_HASH.HASH_RAW }, true);
    public static final Index POOL_OFFLINE_DATA_POOL_ID_INDEX = Internal.createIndex(DSL.name("pool_offline_data_pool_id_index"), PoolOfflineData.POOL_OFFLINE_DATA, new OrderField[] { PoolOfflineData.POOL_OFFLINE_DATA.POOL_ID }, false);
    public static final Index POOL_OFFLINE_FETCH_ERROR_POOL_ID_IDX = Internal.createIndex(DSL.name("pool_offline_fetch_error_pool_id_idx"), PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR, new OrderField[] { PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR.POOL_ID }, false);
    public static final Index POOL_OFFLINE_FETCH_ERROR_POOL_ID_PMR_ID_IDX = Internal.createIndex(DSL.name("pool_offline_fetch_error_pool_id_pmr_id_idx"), PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR, new OrderField[] { PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR.POOL_ID, PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR.PMR_ID }, false);
    public static final Index POOL_OWNER_POOL_UPDATE_ID_IDX = Internal.createIndex(DSL.name("pool_owner_pool_update_id_idx"), PoolOwner.POOL_OWNER, new OrderField[] { PoolOwner.POOL_OWNER.POOL_UPDATE_ID }, false);
    public static final Index POOL_REPORT_HISTORY_POOL_ID_IDX = Internal.createIndex(DSL.name("pool_report_history_pool_id_idx"), PoolReportHistory.POOL_REPORT_HISTORY, new OrderField[] { PoolReportHistory.POOL_REPORT_HISTORY.POOL_ID }, false);
    public static final Index POOL_REPORT_HISTORY_POOL_ID_REPORT_ID_IDX = Internal.createIndex(DSL.name("pool_report_history_pool_id_report_id_idx"), PoolReportHistory.POOL_REPORT_HISTORY, new OrderField[] { PoolReportHistory.POOL_REPORT_HISTORY.POOL_ID, PoolReportHistory.POOL_REPORT_HISTORY.REPORT_ID }, false);
    public static final Index POOL_REPORT_HISTORY_REPORT_ID_IDX = Internal.createIndex(DSL.name("pool_report_history_report_id_idx"), PoolReportHistory.POOL_REPORT_HISTORY, new OrderField[] { PoolReportHistory.POOL_REPORT_HISTORY.REPORT_ID }, false);
    public static final Index REDEEMER_DATA_HASH_INDEX = Internal.createIndex(DSL.name("redeemer_data_hash_index"), RedeemerData.REDEEMER_DATA, new OrderField[] { RedeemerData.REDEEMER_DATA.HASH }, false);
    public static final Index REDEEMER_DATA_TX_ID_IDX = Internal.createIndex(DSL.name("redeemer_data_tx_id_idx"), RedeemerData.REDEEMER_DATA, new OrderField[] { RedeemerData.REDEEMER_DATA.TX_ID }, false);
    public static final Index REDEEMER_REDEEMER_DATA_ID_IDX = Internal.createIndex(DSL.name("redeemer_redeemer_data_id_idx"), Redeemer.REDEEMER, new OrderField[] { Redeemer.REDEEMER.REDEEMER_DATA_ID }, false);
    public static final Index REFERENCE_TX_IN_TX_OUT_ID_IDX = Internal.createIndex(DSL.name("reference_tx_in_tx_out_id_idx"), ReferenceTxIn.REFERENCE_TX_IN, new OrderField[] { ReferenceTxIn.REFERENCE_TX_IN.TX_OUT_ID }, false);
    public static final Index REPORT_HISTORY_STATUS_IDX = Internal.createIndex(DSL.name("report_history_status_idx"), ReportHistory.REPORT_HISTORY, new OrderField[] { ReportHistory.REPORT_HISTORY.STATUS }, false);
    public static final Index REPORT_HISTORY_USERNAME_IDX = Internal.createIndex(DSL.name("report_history_username_idx"), ReportHistory.REPORT_HISTORY, new OrderField[] { ReportHistory.REPORT_HISTORY.USERNAME }, false);
    public static final Index REWARD_ADDR_ID_IDX = Internal.createIndex(DSL.name("reward_addr_id_idx"), Reward.REWARD, new OrderField[] { Reward.REWARD.ADDR_ID }, false);
    public static final Index REWARD_EARNED_EPOCH_IDX = Internal.createIndex(DSL.name("reward_earned_epoch_idx"), Reward.REWARD, new OrderField[] { Reward.REWARD.EARNED_EPOCH }, false);
    public static final Index REWARD_POOL_ID_IDX = Internal.createIndex(DSL.name("reward_pool_id_idx"), Reward.REWARD, new OrderField[] { Reward.REWARD.POOL_ID }, false);
    public static final Index REWARD_SPENDABLE_EPOCH_IDX = Internal.createIndex(DSL.name("reward_spendable_epoch_idx"), Reward.REWARD, new OrderField[] { Reward.REWARD.SPENDABLE_EPOCH }, false);
    public static final Index REWARD_TYPE_IDX = Internal.createIndex(DSL.name("reward_type_idx"), Reward.REWARD, new OrderField[] { Reward.REWARD.TYPE }, false);
    public static final Index SCRIPT_HASH_UINDEX = Internal.createIndex(DSL.name("script_hash_uindex"), Script.SCRIPT, new OrderField[] { Script.SCRIPT.HASH }, true);
    public static final Index SLOT_LEADER_HASH_INDEX = Internal.createIndex(DSL.name("slot_leader_hash_index"), SlotLeader.SLOT_LEADER, new OrderField[] { SlotLeader.SLOT_LEADER.HASH }, false);
    public static final Index STAKE_ADDRESS_BALANCE_IDX = Internal.createIndex(DSL.name("stake_address_balance_idx"), StakeAddress.STAKE_ADDRESS, new OrderField[] { StakeAddress.STAKE_ADDRESS.BALANCE }, false);
    public static final Index STAKE_KEY_REPORT_HISTORY_REPORT_ID_IDX = Internal.createIndex(DSL.name("stake_key_report_history_report_id_idx"), StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY, new OrderField[] { StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.REPORT_ID }, false);
    public static final Index STAKE_KEY_REPORT_HISTORY_STAKE_KEY_IDX = Internal.createIndex(DSL.name("stake_key_report_history_stake_key_idx"), StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY, new OrderField[] { StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.STAKE_KEY }, false);
    public static final Index STAKE_KEY_REPORT_HISTORY_STAKE_KEY_REPORT_ID_IDX = Internal.createIndex(DSL.name("stake_key_report_history_stake_key_report_id_idx"), StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY, new OrderField[] { StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.STAKE_KEY, StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY.REPORT_ID }, false);
    public static final Index STAKE_TX_BALANCE_STAKE_ADDRESS_ID_IDX = Internal.createIndex(DSL.name("stake_tx_balance_stake_address_id_idx"), StakeTxBalance.STAKE_TX_BALANCE, new OrderField[] { StakeTxBalance.STAKE_TX_BALANCE.STAKE_ADDRESS_ID }, false);
    public static final Index STAKE_TX_BALANCE_TIME_IDX = Internal.createIndex(DSL.name("stake_tx_balance_time_idx"), StakeTxBalance.STAKE_TX_BALANCE, new OrderField[] { StakeTxBalance.STAKE_TX_BALANCE.TIME }, false);
    public static final Index STAKE_TX_BALANCE_TX_ID_IDX = Internal.createIndex(DSL.name("stake_tx_balance_tx_id_idx"), StakeTxBalance.STAKE_TX_BALANCE, new OrderField[] { StakeTxBalance.STAKE_TX_BALANCE.TX_ID }, false);
    public static final Index TX__TX_METADATA_HASH_IDX = Internal.createIndex(DSL.name("tx__tx_metadata_hash_idx"), Tx.TX, new OrderField[] { Tx.TX.TX_METADATA_HASH_ID }, false);
    public static final Index TX_BLOCK_ID_ID_IDX = Internal.createIndex(DSL.name("tx_block_id_id_idx"), Tx.TX, new OrderField[] { Tx.TX.BLOCK_ID, Tx.TX.ID }, false);
    public static final Index TX_COUNT_IDX = Internal.createIndex(DSL.name("tx_count_idx"), Block.BLOCK, new OrderField[] { Block.BLOCK.TX_COUNT }, false);
    public static final Index TX_FEE_IDX = Internal.createIndex(DSL.name("tx_fee_idx"), Tx.TX, new OrderField[] { Tx.TX.FEE }, false);
    public static final Index TX_METADATA_HASH_IDX = Internal.createIndex(DSL.name("tx_metadata_hash_idx"), TxMetadataHash.TX_METADATA_HASH, new OrderField[] { TxMetadataHash.TX_METADATA_HASH.HASH }, false);
    public static final Index TX_OUT_INLINE_DATUM_ID_IDX = Internal.createIndex(DSL.name("tx_out_inline_datum_id_idx"), TxOut.TX_OUT, new OrderField[] { TxOut.TX_OUT.INLINE_DATUM_ID }, false);
    public static final Index TX_OUT_REFERENCE_SCRIPT_ID_IDX = Internal.createIndex(DSL.name("tx_out_reference_script_id_idx"), TxOut.TX_OUT, new OrderField[] { TxOut.TX_OUT.REFERENCE_SCRIPT_ID }, false);
    public static final Index TX_OUT_SUM_IDX = Internal.createIndex(DSL.name("tx_out_sum_idx"), Tx.TX, new OrderField[] { Tx.TX.OUT_SUM }, false);
}