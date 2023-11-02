/*
 * This file is generated by jOOQ.
 */
package org.cardanofoundation.ledgersync.jooq;


import java.util.Arrays;
import java.util.List;

import org.cardanofoundation.ledgersync.jooq.tables.AdaPots;
import org.cardanofoundation.ledgersync.jooq.tables.Address;
import org.cardanofoundation.ledgersync.jooq.tables.AddressToken;
import org.cardanofoundation.ledgersync.jooq.tables.AddressTokenBalance;
import org.cardanofoundation.ledgersync.jooq.tables.AddressTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.AggAddressToken;
import org.cardanofoundation.ledgersync.jooq.tables.AggAddressTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.AggPoolInfo;
import org.cardanofoundation.ledgersync.jooq.tables.AssetMetadata;
import org.cardanofoundation.ledgersync.jooq.tables.Block;
import org.cardanofoundation.ledgersync.jooq.tables.CostModel;
import org.cardanofoundation.ledgersync.jooq.tables.Datum;
import org.cardanofoundation.ledgersync.jooq.tables.Delegation;
import org.cardanofoundation.ledgersync.jooq.tables.DelistedPool;
import org.cardanofoundation.ledgersync.jooq.tables.Epoch;
import org.cardanofoundation.ledgersync.jooq.tables.EpochParam;
import org.cardanofoundation.ledgersync.jooq.tables.EpochStake;
import org.cardanofoundation.ledgersync.jooq.tables.EpochSyncTime;
import org.cardanofoundation.ledgersync.jooq.tables.ExtraKeyWitness;
import org.cardanofoundation.ledgersync.jooq.tables.FailedTxOut;
import org.cardanofoundation.ledgersync.jooq.tables.MaTxMint;
import org.cardanofoundation.ledgersync.jooq.tables.MaTxOut;
import org.cardanofoundation.ledgersync.jooq.tables.Meta;
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
import org.cardanofoundation.ledgersync.jooq.tables.PotTransfer;
import org.cardanofoundation.ledgersync.jooq.tables.Redeemer;
import org.cardanofoundation.ledgersync.jooq.tables.RedeemerData;
import org.cardanofoundation.ledgersync.jooq.tables.ReferenceTxIn;
import org.cardanofoundation.ledgersync.jooq.tables.ReportHistory;
import org.cardanofoundation.ledgersync.jooq.tables.Reserve;
import org.cardanofoundation.ledgersync.jooq.tables.ReservedPoolTicker;
import org.cardanofoundation.ledgersync.jooq.tables.Reward;
import org.cardanofoundation.ledgersync.jooq.tables.RollbackHistory;
import org.cardanofoundation.ledgersync.jooq.tables.SchemaVersion;
import org.cardanofoundation.ledgersync.jooq.tables.Script;
import org.cardanofoundation.ledgersync.jooq.tables.SlotLeader;
import org.cardanofoundation.ledgersync.jooq.tables.StakeAddress;
import org.cardanofoundation.ledgersync.jooq.tables.StakeDeregistration;
import org.cardanofoundation.ledgersync.jooq.tables.StakeKeyReportHistory;
import org.cardanofoundation.ledgersync.jooq.tables.StakeRegistration;
import org.cardanofoundation.ledgersync.jooq.tables.StakeTxBalance;
import org.cardanofoundation.ledgersync.jooq.tables.TokenInfo;
import org.cardanofoundation.ledgersync.jooq.tables.TokenInfoCheckpoint;
import org.cardanofoundation.ledgersync.jooq.tables.Treasury;
import org.cardanofoundation.ledgersync.jooq.tables.Tx;
import org.cardanofoundation.ledgersync.jooq.tables.TxChart;
import org.cardanofoundation.ledgersync.jooq.tables.TxIn;
import org.cardanofoundation.ledgersync.jooq.tables.TxMetadata;
import org.cardanofoundation.ledgersync.jooq.tables.TxMetadataHash;
import org.cardanofoundation.ledgersync.jooq.tables.TxOut;
import org.cardanofoundation.ledgersync.jooq.tables.UnconsumeTxIn;
import org.cardanofoundation.ledgersync.jooq.tables.Withdrawal;
import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>ada_pots</code>.
     */
    public final AdaPots ADA_POTS = AdaPots.ADA_POTS;

    /**
     * The table <code>address</code>.
     */
    public final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>address_token</code>.
     */
    public final AddressToken ADDRESS_TOKEN = AddressToken.ADDRESS_TOKEN;

    /**
     * The table <code>address_token_balance</code>.
     */
    public final AddressTokenBalance ADDRESS_TOKEN_BALANCE = AddressTokenBalance.ADDRESS_TOKEN_BALANCE;

    /**
     * The table <code>address_tx_balance</code>.
     */
    public final AddressTxBalance ADDRESS_TX_BALANCE = AddressTxBalance.ADDRESS_TX_BALANCE;

    /**
     * The table <code>agg_address_token</code>.
     */
    public final AggAddressToken AGG_ADDRESS_TOKEN = AggAddressToken.AGG_ADDRESS_TOKEN;

    /**
     * The table <code>agg_address_tx_balance</code>.
     */
    public final AggAddressTxBalance AGG_ADDRESS_TX_BALANCE = AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE;

    /**
     * The table <code>agg_pool_info</code>.
     */
    public final AggPoolInfo AGG_POOL_INFO = AggPoolInfo.AGG_POOL_INFO;

    /**
     * The table <code>asset_metadata</code>.
     */
    public final AssetMetadata ASSET_METADATA = AssetMetadata.ASSET_METADATA;

    /**
     * The table <code>block</code>.
     */
    public final Block BLOCK = Block.BLOCK;

    /**
     * The table <code>cost_model</code>.
     */
    public final CostModel COST_MODEL = CostModel.COST_MODEL;

    /**
     * The table <code>datum</code>.
     */
    public final Datum DATUM = Datum.DATUM;

    /**
     * The table <code>delegation</code>.
     */
    public final Delegation DELEGATION = Delegation.DELEGATION;

    /**
     * The table <code>delisted_pool</code>.
     */
    public final DelistedPool DELISTED_POOL = DelistedPool.DELISTED_POOL;

    /**
     * The table <code>epoch</code>.
     */
    public final Epoch EPOCH = Epoch.EPOCH;

    /**
     * The table <code>epoch_param</code>.
     */
    public final EpochParam EPOCH_PARAM = EpochParam.EPOCH_PARAM;

    /**
     * The table <code>epoch_stake</code>.
     */
    public final EpochStake EPOCH_STAKE = EpochStake.EPOCH_STAKE;

    /**
     * The table <code>epoch_sync_time</code>.
     */
    public final EpochSyncTime EPOCH_SYNC_TIME = EpochSyncTime.EPOCH_SYNC_TIME;

    /**
     * The table <code>extra_key_witness</code>.
     */
    public final ExtraKeyWitness EXTRA_KEY_WITNESS = ExtraKeyWitness.EXTRA_KEY_WITNESS;

    /**
     * The table <code>failed_tx_out</code>.
     */
    public final FailedTxOut FAILED_TX_OUT = FailedTxOut.FAILED_TX_OUT;

    /**
     * The table <code>ma_tx_mint</code>.
     */
    public final MaTxMint MA_TX_MINT = MaTxMint.MA_TX_MINT;

    /**
     * The table <code>ma_tx_out</code>.
     */
    public final MaTxOut MA_TX_OUT = MaTxOut.MA_TX_OUT;

    /**
     * The table <code>meta</code>.
     */
    public final Meta META = Meta.META;

    /**
     * The table <code>multi_asset</code>.
     */
    public final MultiAsset MULTI_ASSET = MultiAsset.MULTI_ASSET;

    /**
     * The table <code>param_proposal</code>.
     */
    public final ParamProposal PARAM_PROPOSAL = ParamProposal.PARAM_PROPOSAL;

    /**
     * The table <code>pool_hash</code>.
     */
    public final PoolHash POOL_HASH = PoolHash.POOL_HASH;

    /**
     * The table <code>pool_metadata_ref</code>.
     */
    public final PoolMetadataRef POOL_METADATA_REF = PoolMetadataRef.POOL_METADATA_REF;

    /**
     * The table <code>pool_offline_data</code>.
     */
    public final PoolOfflineData POOL_OFFLINE_DATA = PoolOfflineData.POOL_OFFLINE_DATA;

    /**
     * The table <code>pool_offline_fetch_error</code>.
     */
    public final PoolOfflineFetchError POOL_OFFLINE_FETCH_ERROR = PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR;

    /**
     * The table <code>pool_owner</code>.
     */
    public final PoolOwner POOL_OWNER = PoolOwner.POOL_OWNER;

    /**
     * The table <code>pool_relay</code>.
     */
    public final PoolRelay POOL_RELAY = PoolRelay.POOL_RELAY;

    /**
     * The table <code>pool_report_history</code>.
     */
    public final PoolReportHistory POOL_REPORT_HISTORY = PoolReportHistory.POOL_REPORT_HISTORY;

    /**
     * The table <code>pool_retire</code>.
     */
    public final PoolRetire POOL_RETIRE = PoolRetire.POOL_RETIRE;

    /**
     * The table <code>pool_update</code>.
     */
    public final PoolUpdate POOL_UPDATE = PoolUpdate.POOL_UPDATE;

    /**
     * The table <code>pot_transfer</code>.
     */
    public final PotTransfer POT_TRANSFER = PotTransfer.POT_TRANSFER;

    /**
     * The table <code>redeemer</code>.
     */
    public final Redeemer REDEEMER = Redeemer.REDEEMER;

    /**
     * The table <code>redeemer_data</code>.
     */
    public final RedeemerData REDEEMER_DATA = RedeemerData.REDEEMER_DATA;

    /**
     * The table <code>reference_tx_in</code>.
     */
    public final ReferenceTxIn REFERENCE_TX_IN = ReferenceTxIn.REFERENCE_TX_IN;

    /**
     * The table <code>report_history</code>.
     */
    public final ReportHistory REPORT_HISTORY = ReportHistory.REPORT_HISTORY;

    /**
     * The table <code>reserve</code>.
     */
    public final Reserve RESERVE = Reserve.RESERVE;

    /**
     * The table <code>reserved_pool_ticker</code>.
     */
    public final ReservedPoolTicker RESERVED_POOL_TICKER = ReservedPoolTicker.RESERVED_POOL_TICKER;

    /**
     * The table <code>reward</code>.
     */
    public final Reward REWARD = Reward.REWARD;

    /**
     * The table <code>rollback_history</code>.
     */
    public final RollbackHistory ROLLBACK_HISTORY = RollbackHistory.ROLLBACK_HISTORY;

    /**
     * The table <code>schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>script</code>.
     */
    public final Script SCRIPT = Script.SCRIPT;

    /**
     * The table <code>slot_leader</code>.
     */
    public final SlotLeader SLOT_LEADER = SlotLeader.SLOT_LEADER;

    /**
     * The table <code>stake_address</code>.
     */
    public final StakeAddress STAKE_ADDRESS = StakeAddress.STAKE_ADDRESS;

    /**
     * The table <code>stake_deregistration</code>.
     */
    public final StakeDeregistration STAKE_DEREGISTRATION = StakeDeregistration.STAKE_DEREGISTRATION;

    /**
     * The table <code>stake_key_report_history</code>.
     */
    public final StakeKeyReportHistory STAKE_KEY_REPORT_HISTORY = StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY;

    /**
     * The table <code>stake_registration</code>.
     */
    public final StakeRegistration STAKE_REGISTRATION = StakeRegistration.STAKE_REGISTRATION;

    /**
     * The table <code>stake_tx_balance</code>.
     */
    public final StakeTxBalance STAKE_TX_BALANCE = StakeTxBalance.STAKE_TX_BALANCE;

    /**
     * The table <code>token_info</code>.
     */
    public final TokenInfo TOKEN_INFO = TokenInfo.TOKEN_INFO;

    /**
     * The table <code>token_info_checkpoint</code>.
     */
    public final TokenInfoCheckpoint TOKEN_INFO_CHECKPOINT = TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT;

    /**
     * The table <code>treasury</code>.
     */
    public final Treasury TREASURY = Treasury.TREASURY;

    /**
     * The table <code>tx</code>.
     */
    public final Tx TX = Tx.TX;

    /**
     * The table <code>tx_chart</code>.
     */
    public final TxChart TX_CHART = TxChart.TX_CHART;

    /**
     * The table <code>tx_in</code>.
     */
    public final TxIn TX_IN = TxIn.TX_IN;

    /**
     * The table <code>tx_metadata</code>.
     */
    public final TxMetadata TX_METADATA = TxMetadata.TX_METADATA;

    /**
     * The table <code>tx_metadata_hash</code>.
     */
    public final TxMetadataHash TX_METADATA_HASH = TxMetadataHash.TX_METADATA_HASH;

    /**
     * The table <code>tx_out</code>.
     */
    public final TxOut TX_OUT = TxOut.TX_OUT;

    /**
     * The table <code>unconsume_tx_in</code>.
     */
    public final UnconsumeTxIn UNCONSUME_TX_IN = UnconsumeTxIn.UNCONSUME_TX_IN;

    /**
     * The table <code>withdrawal</code>.
     */
    public final Withdrawal WITHDRAWAL = Withdrawal.WITHDRAWAL;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.asList(
            Sequences.SCHEMA_VERSION_ID_SEQ
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            AdaPots.ADA_POTS,
            Address.ADDRESS,
            AddressToken.ADDRESS_TOKEN,
            AddressTokenBalance.ADDRESS_TOKEN_BALANCE,
            AddressTxBalance.ADDRESS_TX_BALANCE,
            AggAddressToken.AGG_ADDRESS_TOKEN,
            AggAddressTxBalance.AGG_ADDRESS_TX_BALANCE,
            AggPoolInfo.AGG_POOL_INFO,
            AssetMetadata.ASSET_METADATA,
            Block.BLOCK,
            CostModel.COST_MODEL,
            Datum.DATUM,
            Delegation.DELEGATION,
            DelistedPool.DELISTED_POOL,
            Epoch.EPOCH,
            EpochParam.EPOCH_PARAM,
            EpochStake.EPOCH_STAKE,
            EpochSyncTime.EPOCH_SYNC_TIME,
            ExtraKeyWitness.EXTRA_KEY_WITNESS,
            FailedTxOut.FAILED_TX_OUT,
            MaTxMint.MA_TX_MINT,
            MaTxOut.MA_TX_OUT,
            Meta.META,
            MultiAsset.MULTI_ASSET,
            ParamProposal.PARAM_PROPOSAL,
            PoolHash.POOL_HASH,
            PoolMetadataRef.POOL_METADATA_REF,
            PoolOfflineData.POOL_OFFLINE_DATA,
            PoolOfflineFetchError.POOL_OFFLINE_FETCH_ERROR,
            PoolOwner.POOL_OWNER,
            PoolRelay.POOL_RELAY,
            PoolReportHistory.POOL_REPORT_HISTORY,
            PoolRetire.POOL_RETIRE,
            PoolUpdate.POOL_UPDATE,
            PotTransfer.POT_TRANSFER,
            Redeemer.REDEEMER,
            RedeemerData.REDEEMER_DATA,
            ReferenceTxIn.REFERENCE_TX_IN,
            ReportHistory.REPORT_HISTORY,
            Reserve.RESERVE,
            ReservedPoolTicker.RESERVED_POOL_TICKER,
            Reward.REWARD,
            RollbackHistory.ROLLBACK_HISTORY,
            SchemaVersion.SCHEMA_VERSION,
            Script.SCRIPT,
            SlotLeader.SLOT_LEADER,
            StakeAddress.STAKE_ADDRESS,
            StakeDeregistration.STAKE_DEREGISTRATION,
            StakeKeyReportHistory.STAKE_KEY_REPORT_HISTORY,
            StakeRegistration.STAKE_REGISTRATION,
            StakeTxBalance.STAKE_TX_BALANCE,
            TokenInfo.TOKEN_INFO,
            TokenInfoCheckpoint.TOKEN_INFO_CHECKPOINT,
            Treasury.TREASURY,
            Tx.TX,
            TxChart.TX_CHART,
            TxIn.TX_IN,
            TxMetadata.TX_METADATA,
            TxMetadataHash.TX_METADATA_HASH,
            TxOut.TX_OUT,
            UnconsumeTxIn.UNCONSUME_TX_IN,
            Withdrawal.WITHDRAWAL
        );
    }
}