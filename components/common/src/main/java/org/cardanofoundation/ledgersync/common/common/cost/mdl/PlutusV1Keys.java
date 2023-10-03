package org.cardanofoundation.ledgersync.common.common.cost.mdl;

import java.util.Arrays;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public final class PlutusV1Keys implements CostModelKeys {

  public final static List<String> KEYS = Arrays.asList("addInteger-cpu-arguments-intercept",
      "addInteger-cpu-arguments-slope",
      "addInteger-memory-arguments-intercept",
      "addInteger-memory-arguments-slope",
      "appendByteString-cpu-arguments-intercept",
      "appendByteString-cpu-arguments-slope",
      "appendByteString-memory-arguments-intercept",
      "appendByteString-memory-arguments-slope",
      "appendString-cpu-arguments-intercept",
      "appendString-cpu-arguments-slope",
      "appendString-memory-arguments-intercept",
      "appendString-memory-arguments-slope",
      "bData-cpu-arguments",
      "bData-memory-arguments",
      "blake2b-cpu-arguments-intercept",
      "blake2b-cpu-arguments-slope",
      "blake2b-memory-arguments",
      "cekApplyCost-exBudgetCPU",
      "cekApplyCost-exBudgetMemory",
      "cekBuiltinCost-exBudgetCPU",
      "cekBuiltinCost-exBudgetMemory",
      "cekConstCost-exBudgetCPU",
      "cekConstCost-exBudgetMemory",
      "cekDelayCost-exBudgetCPU",
      "cekDelayCost-exBudgetMemory",
      "cekForceCost-exBudgetCPU",
      "cekForceCost-exBudgetMemory",
      "cekLamCost-exBudgetCPU",
      "cekLamCost-exBudgetMemory",
      "cekStartupCost-exBudgetCPU",
      "cekStartupCost-exBudgetMemory",
      "cekVarCost-exBudgetCPU",
      "cekVarCost-exBudgetMemory",
      "chooseData-cpu-arguments",
      "chooseData-memory-arguments",
      "chooseList-cpu-arguments",
      "chooseList-memory-arguments",
      "chooseUnit-cpu-arguments",
      "chooseUnit-memory-arguments",
      "consByteString-cpu-arguments-intercept",
      "consByteString-cpu-arguments-slope",
      "consByteString-memory-arguments-intercept",
      "consByteString-memory-arguments-slope",
      "constrData-cpu-arguments",
      "constrData-memory-arguments",
      "decodeUtf8-cpu-arguments-intercept",
      "decodeUtf8-cpu-arguments-slope",
      "decodeUtf8-memory-arguments-intercept",
      "decodeUtf8-memory-arguments-slope",
      "divideInteger-cpu-arguments-constant",
      "divideInteger-cpu-arguments-model-arguments-intercept",
      "divideInteger-cpu-arguments-model-arguments-slope",
      "divideInteger-memory-arguments-intercept",
      "divideInteger-memory-arguments-minimum",
      "divideInteger-memory-arguments-slope",
      "encodeUtf8-cpu-arguments-intercept",
      "encodeUtf8-cpu-arguments-slope",
      "encodeUtf8-memory-arguments-intercept",
      "encodeUtf8-memory-arguments-slope",
      "equalsByteString-cpu-arguments-constant",
      "equalsByteString-cpu-arguments-intercept",
      "equalsByteString-cpu-arguments-slope",
      "equalsByteString-memory-arguments",
      "equalsData-cpu-arguments-intercept",
      "equalsData-cpu-arguments-slope",
      "equalsData-memory-arguments",
      "equalsInteger-cpu-arguments-intercept",
      "equalsInteger-cpu-arguments-slope",
      "equalsInteger-memory-arguments",
      "equalsString-cpu-arguments-constant",
      "equalsString-cpu-arguments-intercept",
      "equalsString-cpu-arguments-slope",
      "equalsString-memory-arguments",
      "fstPair-cpu-arguments",
      "fstPair-memory-arguments",
      "headList-cpu-arguments",
      "headList-memory-arguments",
      "iData-cpu-arguments",
      "iData-memory-arguments",
      "ifThenElse-cpu-arguments",
      "ifThenElse-memory-arguments",
      "indexByteString-cpu-arguments",
      "indexByteString-memory-arguments",
      "lengthOfByteString-cpu-arguments",
      "lengthOfByteString-memory-arguments",
      "lessThanByteString-cpu-arguments-intercept",
      "lessThanByteString-cpu-arguments-slope",
      "lessThanByteString-memory-arguments",
      "lessThanEqualsByteString-cpu-arguments-intercept",
      "lessThanEqualsByteString-cpu-arguments-slope",
      "lessThanEqualsByteString-memory-arguments",
      "lessThanEqualsInteger-cpu-arguments-intercept",
      "lessThanEqualsInteger-cpu-arguments-slope",
      "lessThanEqualsInteger-memory-arguments",
      "lessThanInteger-cpu-arguments-intercept",
      "lessThanInteger-cpu-arguments-slope",
      "lessThanInteger-memory-arguments",
      "listData-cpu-arguments",
      "listData-memory-arguments",
      "mapData-cpu-arguments",
      "mapData-memory-arguments",
      "mkCons-cpu-arguments",
      "mkCons-memory-arguments",
      "mkNilData-cpu-arguments",
      "mkNilData-memory-arguments",
      "mkNilPairData-cpu-arguments",
      "mkNilPairData-memory-arguments",
      "mkPairData-cpu-arguments",
      "mkPairData-memory-arguments",
      "modInteger-cpu-arguments-constant",
      "modInteger-cpu-arguments-model-arguments-intercept",
      "modInteger-cpu-arguments-model-arguments-slope",
      "modInteger-memory-arguments-intercept",
      "modInteger-memory-arguments-minimum",
      "modInteger-memory-arguments-slope",
      "multiplyInteger-cpu-arguments-intercept",
      "multiplyInteger-cpu-arguments-slope",
      "multiplyInteger-memory-arguments-intercept",
      "multiplyInteger-memory-arguments-slope",
      "nullList-cpu-arguments",
      "nullList-memory-arguments",
      "quotientInteger-cpu-arguments-constant",
      "quotientInteger-cpu-arguments-model-arguments-intercept",
      "quotientInteger-cpu-arguments-model-arguments-slope",
      "quotientInteger-memory-arguments-intercept",
      "quotientInteger-memory-arguments-minimum",
      "quotientInteger-memory-arguments-slope",
      "remainderInteger-cpu-arguments-constant",
      "remainderInteger-cpu-arguments-model-arguments-intercept",
      "remainderInteger-cpu-arguments-model-arguments-slope",
      "remainderInteger-memory-arguments-intercept",
      "remainderInteger-memory-arguments-minimum",
      "remainderInteger-memory-arguments-slope",
      "sha2_256-cpu-arguments-intercept",
      "sha2_256-cpu-arguments-slope",
      "sha2_256-memory-arguments",
      "sha3_256-cpu-arguments-intercept",
      "sha3_256-cpu-arguments-slope",
      "sha3_256-memory-arguments",
      "sliceByteString-cpu-arguments-intercept",
      "sliceByteString-cpu-arguments-slope",
      "sliceByteString-memory-arguments-intercept",
      "sliceByteString-memory-arguments-slope",
      "sndPair-cpu-arguments",
      "sndPair-memory-arguments",
      "subtractInteger-cpu-arguments-intercept",
      "subtractInteger-cpu-arguments-slope",
      "subtractInteger-memory-arguments-intercept",
      "subtractInteger-memory-arguments-slope",
      "tailList-cpu-arguments",
      "tailList-memory-arguments",
      "trace-cpu-arguments",
      "trace-memory-arguments",
      "unBData-cpu-arguments",
      "unBData-memory-arguments",
      "unConstrData-cpu-arguments",
      "unConstrData-memory-arguments",
      "unIData-cpu-arguments",
      "unIData-memory-arguments",
      "unListData-cpu-arguments",
      "unListData-memory-arguments",
      "unMapData-cpu-arguments",
      "unMapData-memory-arguments",
      "verifySignature-cpu-arguments-intercept",
      "verifySignature-cpu-arguments-slope",
      "verifySignature-memory-arguments");

  @Override
  public List<String> getKeys() {
    return KEYS;
  }
}
