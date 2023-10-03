package org.cardanofoundation.ledgersync.common.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.cardanofoundation.ledgersync.common.common.cost.mdl.CostModelKeys;
import org.cardanofoundation.ledgersync.common.common.cost.mdl.PlutusV2Keys;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class PlutusKeysTest {

  @Test
  void plutusV2() {
    var gson = new Gson();
    Type type = new TypeToken<Map<String, String>>(){}.getType();
    Map<String, String> gsonMap = gson.fromJson("{ "
        + " bData-cpu-arguments: 1000,"
        + "    iData-cpu-arguments: 1000,"
        + "    trace-cpu-arguments: 212342,"
        + "    mkCons-cpu-arguments: 65493,"
        + "    fstPair-cpu-arguments: 80436,"
        + "    mapData-cpu-arguments: 64832,"
        + "    sndPair-cpu-arguments: 85931,"
        + "    unBData-cpu-arguments: 31220,"
        + "    unIData-cpu-arguments: 43357,"
        + "    bData-memory-arguments: 32,"
        + "    cekLamCost-exBudgetCPU: 23000,"
        + "    cekVarCost-exBudgetCPU: 23000,"
        + "    headList-cpu-arguments: 43249,"
        + "    iData-memory-arguments: 32,"
        + "    listData-cpu-arguments: 52467,"
        + "    nullList-cpu-arguments: 60091,"
        + "    tailList-cpu-arguments: 41182,"
        + "    trace-memory-arguments: 32,"
        + "    mkCons-memory-arguments: 32,"
        + "    mkNilData-cpu-arguments: 22558,"
        + "    unMapData-cpu-arguments: 38314,"
        + "    cekApplyCost-exBudgetCPU: 23000,"
        + "    cekConstCost-exBudgetCPU: 23000,"
        + "    cekDelayCost-exBudgetCPU: 23000,"
        + "    cekForceCost-exBudgetCPU: 23000,"
        + "    chooseData-cpu-arguments: 19537,"
        + "    chooseList-cpu-arguments: 175354,"
        + "    chooseUnit-cpu-arguments: 46417,"
        + "    constrData-cpu-arguments: 89141,"
        + "    fstPair-memory-arguments: 32,"
        + "    ifThenElse-cpu-arguments: 80556,"
        + "    mapData-memory-arguments: 32,"
        + "    mkPairData-cpu-arguments: 76511,"
        + "    sndPair-memory-arguments: 32,"
        + "    unBData-memory-arguments: 32,"
        + "    unIData-memory-arguments: 32,"
        + "    unListData-cpu-arguments: 32247,"
        + "    cekLamCost-exBudgetMemory: 100,"
        + "    cekVarCost-exBudgetMemory: 100,"
        + "    headList-memory-arguments: 32,"
        + "    listData-memory-arguments: 32,"
        + "    nullList-memory-arguments: 32,"
        + "    sha2_256-memory-arguments: 4,"
        + "    sha3_256-memory-arguments: 4,"
        + "    tailList-memory-arguments: 32,"
        + "    cekBuiltinCost-exBudgetCPU: 23000,"
        + "    cekStartupCost-exBudgetCPU: 100,"
        + "    mkNilData-memory-arguments: 32,"
        + "    unConstrData-cpu-arguments: 32696,"
        + "    unMapData-memory-arguments: 32,"
        + "    cekApplyCost-exBudgetMemory: 100,"
        + "    cekConstCost-exBudgetMemory: 100,"
        + "    cekDelayCost-exBudgetMemory: 100,"
        + "    cekForceCost-exBudgetMemory: 100,"
        + "    chooseData-memory-arguments: 32,"
        + "    chooseList-memory-arguments: 32,"
        + "    chooseUnit-memory-arguments: 4,"
        + "    constrData-memory-arguments: 32,"
        + "    equalsData-memory-arguments: 1,"
        + "    ifThenElse-memory-arguments: 1,"
        + "    mkNilPairData-cpu-arguments: 16563,"
        + "    mkPairData-memory-arguments: 32,"
        + "    unListData-memory-arguments: 32,"
        + "    blake2b_256-memory-arguments: 4,"
        + "    sha2_256-cpu-arguments-slope: 30482,"
        + "    sha3_256-cpu-arguments-slope: 82523,"
        + "    cekBuiltinCost-exBudgetMemory: 100,"
        + "    cekStartupCost-exBudgetMemory: 100,"
        + "    equalsString-memory-arguments: 1,"
        + "    indexByteString-cpu-arguments: 57667,"
        + "    unConstrData-memory-arguments: 32,"
        + "    addInteger-cpu-arguments-slope: 812,"
        + "    decodeUtf8-cpu-arguments-slope: 14068,"
        + "    encodeUtf8-cpu-arguments-slope: 28662,"
        + "    equalsData-cpu-arguments-slope: 12586,"
        + "    equalsInteger-memory-arguments: 1,"
        + "    mkNilPairData-memory-arguments: 32,"
        + "    blake2b_256-cpu-arguments-slope: 10475,"
        + "    appendString-cpu-arguments-slope: 24177,"
        + "    equalsString-cpu-arguments-slope: 52998,"
        + "    indexByteString-memory-arguments: 4,"
        + "    lengthOfByteString-cpu-arguments: 1000,"
        + "    lessThanInteger-memory-arguments: 1,"
        + "    sha2_256-cpu-arguments-intercept: 806990,"
        + "    sha3_256-cpu-arguments-intercept: 1927926,"
        + "    addInteger-memory-arguments-slope: 1,"
        + "    decodeUtf8-memory-arguments-slope: 2,"
        + "    encodeUtf8-memory-arguments-slope: 2,"
        + "    equalsByteString-memory-arguments: 1,"
        + "    equalsInteger-cpu-arguments-slope: 421,"
        + "    modInteger-cpu-arguments-constant: 196500,"
        + "    modInteger-memory-arguments-slope: 1,"
        + "    serialiseData-cpu-arguments-slope: 392670,"
        + "    addInteger-cpu-arguments-intercept: 205665,"
        + "    consByteString-cpu-arguments-slope: 511,"
        + "    decodeUtf8-cpu-arguments-intercept: 497525,"
        + "    encodeUtf8-cpu-arguments-intercept: 1000,"
        + "    equalsData-cpu-arguments-intercept: 1060367,"
        + "    appendString-memory-arguments-slope: 1,"
        + "    blake2b_256-cpu-arguments-intercept: 117366,"
        + "    equalsString-cpu-arguments-constant: 187000,"
        + "    lengthOfByteString-memory-arguments: 10,"
        + "    lessThanByteString-memory-arguments: 1,"
        + "    lessThanInteger-cpu-arguments-slope: 511,"
        + "    modInteger-memory-arguments-minimum: 1,"
        + "    multiplyInteger-cpu-arguments-slope: 11687,"
        + "    sliceByteString-cpu-arguments-slope: 0,"
        + "    subtractInteger-cpu-arguments-slope: 812,"
        + "    appendByteString-cpu-arguments-slope: 571,"
        + "    appendString-cpu-arguments-intercept: 1000,"
        + "    divideInteger-cpu-arguments-constant: 196500,"
        + "    divideInteger-memory-arguments-slope: 1,"
        + "    equalsByteString-cpu-arguments-slope: 62,"
        + "    equalsString-cpu-arguments-intercept: 1000,"
        + "    serialiseData-memory-arguments-slope: 2,"
        + "    addInteger-memory-arguments-intercept: 1,"
        + "    consByteString-memory-arguments-slope: 1,"
        + "    decodeUtf8-memory-arguments-intercept: 4,"
        + "    encodeUtf8-memory-arguments-intercept: 4,"
        + "    equalsInteger-cpu-arguments-intercept: 208512,"
        + "    modInteger-memory-arguments-intercept: 0,"
        + "    serialiseData-cpu-arguments-intercept: 1159724,"
        + "    consByteString-cpu-arguments-intercept: 221973,"
        + "    divideInteger-memory-arguments-minimum: 1,"
        + "    lessThanByteString-cpu-arguments-slope: 156,"
        + "    lessThanEqualsInteger-memory-arguments: 1,"
        + "    multiplyInteger-memory-arguments-slope: 1,"
        + "    quotientInteger-cpu-arguments-constant: 196500,"
        + "    quotientInteger-memory-arguments-slope: 1,"
        + "    sliceByteString-memory-arguments-slope: 0,"
        + "    subtractInteger-memory-arguments-slope: 1,"
        + "    appendByteString-memory-arguments-slope: 1,"
        + "    appendString-memory-arguments-intercept: 4,"
        + "    equalsByteString-cpu-arguments-constant: 245000,"
        + "    lessThanInteger-cpu-arguments-intercept: 208896,"
        + "    multiplyInteger-cpu-arguments-intercept: 69522,"
        + "    remainderInteger-cpu-arguments-constant: 196500,"
        + "    remainderInteger-memory-arguments-slope: 1,"
        + "    sliceByteString-cpu-arguments-intercept: 265318,"
        + "    subtractInteger-cpu-arguments-intercept: 205665,"
        + "    verifyEd25519Signature-memory-arguments: 10,"
        + "    appendByteString-cpu-arguments-intercept: 1000,"
        + "    divideInteger-memory-arguments-intercept: 0,"
        + "    equalsByteString-cpu-arguments-intercept: 216773,"
        + "    quotientInteger-memory-arguments-minimum: 1,"
        + "    serialiseData-memory-arguments-intercept: 0,"
        + "    consByteString-memory-arguments-intercept: 0,"
        + "    lessThanEqualsByteString-memory-arguments: 1,"
        + "    lessThanEqualsInteger-cpu-arguments-slope: 473,"
        + "    remainderInteger-memory-arguments-minimum: 1,"
        + "    lessThanByteString-cpu-arguments-intercept: 197145,"
        + "    multiplyInteger-memory-arguments-intercept: 0,"
        + "    quotientInteger-memory-arguments-intercept: 0,"
        + "    sliceByteString-memory-arguments-intercept: 4,"
        + "    subtractInteger-memory-arguments-intercept: 1,"
        + "    verifyEd25519Signature-cpu-arguments-slope: 1021,"
        + "    appendByteString-memory-arguments-intercept: 0,"
        + "    remainderInteger-memory-arguments-intercept: 0,"
        + "    verifyEcdsaSecp256k1Signature-cpu-arguments: 35892428,"
        + "    lessThanEqualsByteString-cpu-arguments-slope: 156,"
        + "    lessThanEqualsInteger-cpu-arguments-intercept: 204924,"
        + "    modInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    verifyEcdsaSecp256k1Signature-memory-arguments: 10,"
        + "    verifyEd25519Signature-cpu-arguments-intercept: 9462713,"
        + "    lessThanEqualsByteString-cpu-arguments-intercept: 197145,"
        + "    verifySchnorrSecp256k1Signature-memory-arguments: 10,"
        + "    divideInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    modInteger-cpu-arguments-model-arguments-intercept: 453240,"
        + "    quotientInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    verifySchnorrSecp256k1Signature-cpu-arguments-slope: 32947,"
        + "    remainderInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    divideInteger-cpu-arguments-model-arguments-intercept: 453240,"
        + "    quotientInteger-cpu-arguments-model-arguments-intercept: 453240,"
        + "    verifySchnorrSecp256k1Signature-cpu-arguments-intercept: 38887044,"
        + "    remainderInteger-cpu-arguments-model-arguments-intercept: 453240"
        + "  }", type);

    Map<String, BigInteger> expectMap = new HashMap<>();
    gsonMap.forEach((key, value1) -> expectMap.put(key, BigInteger.valueOf(
        Long.parseLong(value1))));

    List<Integer> value = Arrays.asList(205665, 812, 1, 1, 1000, 571, 0, 1, 1000, 24177, 4, 1, 1000, 32, 117366, 10475, 4, 23000, 100, 23000, 100, 23000, 100, 23000, 100, 23000, 100, 23000, 100, 100, 100, 23000, 100, 19537, 32, 175354, 32, 46417, 4, 221973, 511, 0, 1, 89141, 32, 497525, 14068, 4, 2, 196500, 453240, 220, 0, 1, 1, 1000, 28662, 4, 2, 245000, 216773, 62, 1, 1060367, 12586, 1, 208512, 421, 1, 187000, 1000, 52998, 1, 80436, 32, 43249, 32, 1000, 32, 80556, 1, 57667, 4, 1000, 10, 197145, 156, 1, 197145, 156, 1, 204924, 473, 1, 208896, 511, 1, 52467, 32, 64832, 32, 65493, 32, 22558, 32, 16563, 32, 76511, 32, 196500, 453240, 220, 0, 1, 1, 69522, 11687, 0, 1, 60091, 32, 196500, 453240, 220, 0, 1, 1, 196500, 453240, 220, 0, 1, 1, 1159724, 392670, 0, 2, 806990, 30482, 4, 1927926, 82523, 4, 265318, 0, 4, 0, 85931, 32, 205665, 812, 1, 1, 41182, 32, 212342, 32, 31220, 32, 32696, 32, 43357, 32, 32247, 32, 38314, 32, 35892428, 10, 9462713, 1021, 10, 38887044, 32947, 10);
    CostModelKeys costModelKeys = new PlutusV2Keys();
    Map<String, BigInteger> actual = costModelKeys.getCostModelMap(value.stream().map(BigInteger::valueOf).collect(Collectors.toList()));
    assertThat(actual).isEqualTo(expectMap);
  }


  @Test
  void plutusV2_3721973(){
    var gson = new Gson();
    Type type = new TypeToken<Map<String, String>>() {}.getType();
    Map<String, String> gsonMap = gson.fromJson("{"
        + "    bData-cpu-arguments: 1000,"
        + "    iData-cpu-arguments: 1000,"
        + "    trace-cpu-arguments: 212342,"
        + "    mkCons-cpu-arguments: 65493,"
        + "    fstPair-cpu-arguments: 80436,"
        + "    mapData-cpu-arguments: 64832,"
        + "    sndPair-cpu-arguments: 85931,"
        + "    unBData-cpu-arguments: 31220,"
        + "    unIData-cpu-arguments: 43357,"
        + "    bData-memory-arguments: 32,"
        + "    cekLamCost-exBudgetCPU: 23000,"
        + "    cekVarCost-exBudgetCPU: 23000,"
        + "    headList-cpu-arguments: 43249,"
        + "    iData-memory-arguments: 32,"
        + "    listData-cpu-arguments: 52467,"
        + "    nullList-cpu-arguments: 60091,"
        + "    tailList-cpu-arguments: 41182,"
        + "    trace-memory-arguments: 32,"
        + "    mkCons-memory-arguments: 32,"
        + "    mkNilData-cpu-arguments: 22558,"
        + "    unMapData-cpu-arguments: 38314,"
        + "    cekApplyCost-exBudgetCPU: 23000,"
        + "    cekConstCost-exBudgetCPU: 23000,"
        + "    cekDelayCost-exBudgetCPU: 23000,"
        + "    cekForceCost-exBudgetCPU: 23000,"
        + "    chooseData-cpu-arguments: 19537,"
        + "    chooseList-cpu-arguments: 175354,"
        + "    chooseUnit-cpu-arguments: 46417,"
        + "    constrData-cpu-arguments: 89141,"
        + "    fstPair-memory-arguments: 32,"
        + "    ifThenElse-cpu-arguments: 80556,"
        + "    mapData-memory-arguments: 32,"
        + "    mkPairData-cpu-arguments: 76511,"
        + "    sndPair-memory-arguments: 32,"
        + "    unBData-memory-arguments: 32,"
        + "    unIData-memory-arguments: 32,"
        + "    unListData-cpu-arguments: 32247,"
        + "    cekLamCost-exBudgetMemory: 100,"
        + "    cekVarCost-exBudgetMemory: 100,"
        + "    headList-memory-arguments: 32,"
        + "    listData-memory-arguments: 32,"
        + "    nullList-memory-arguments: 32,"
        + "    sha2_256-memory-arguments: 4,"
        + "    sha3_256-memory-arguments: 4,"
        + "    tailList-memory-arguments: 32,"
        + "    cekBuiltinCost-exBudgetCPU: 23000,"
        + "    cekStartupCost-exBudgetCPU: 100,"
        + "    mkNilData-memory-arguments: 32,"
        + "    unConstrData-cpu-arguments: 32696,"
        + "    unMapData-memory-arguments: 32,"
        + "    cekApplyCost-exBudgetMemory: 100,"
        + "    cekConstCost-exBudgetMemory: 100,"
        + "    cekDelayCost-exBudgetMemory: 100,"
        + "    cekForceCost-exBudgetMemory: 100,"
        + "    chooseData-memory-arguments: 32,"
        + "    chooseList-memory-arguments: 32,"
        + "    chooseUnit-memory-arguments: 4,"
        + "    constrData-memory-arguments: 32,"
        + "    equalsData-memory-arguments: 1,"
        + "    ifThenElse-memory-arguments: 1,"
        + "    mkNilPairData-cpu-arguments: 16563,"
        + "    mkPairData-memory-arguments: 32,"
        + "    unListData-memory-arguments: 32,"
        + "    blake2b_256-memory-arguments: 4,"
        + "    sha2_256-cpu-arguments-slope: 30482,"
        + "    sha3_256-cpu-arguments-slope: 82523,"
        + "    cekBuiltinCost-exBudgetMemory: 100,"
        + "    cekStartupCost-exBudgetMemory: 100,"
        + "    equalsString-memory-arguments: 1,"
        + "    indexByteString-cpu-arguments: 57667,"
        + "    unConstrData-memory-arguments: 32,"
        + "    addInteger-cpu-arguments-slope: 812,"
        + "    decodeUtf8-cpu-arguments-slope: 14068,"
        + "    encodeUtf8-cpu-arguments-slope: 28662,"
        + "    equalsData-cpu-arguments-slope: 12586,"
        + "    equalsInteger-memory-arguments: 1,"
        + "    mkNilPairData-memory-arguments: 32,"
        + "    blake2b_256-cpu-arguments-slope: 10475,"
        + "    appendString-cpu-arguments-slope: 24177,"
        + "    equalsString-cpu-arguments-slope: 52998,"
        + "    indexByteString-memory-arguments: 4,"
        + "    lengthOfByteString-cpu-arguments: 1000,"
        + "    lessThanInteger-memory-arguments: 1,"
        + "    sha2_256-cpu-arguments-intercept: 806990,"
        + "    sha3_256-cpu-arguments-intercept: 1927926,"
        + "    addInteger-memory-arguments-slope: 1,"
        + "    decodeUtf8-memory-arguments-slope: 2,"
        + "    encodeUtf8-memory-arguments-slope: 2,"
        + "    equalsByteString-memory-arguments: 1,"
        + "    equalsInteger-cpu-arguments-slope: 421,"
        + "    modInteger-cpu-arguments-constant: 196500,"
        + "    modInteger-memory-arguments-slope: 1,"
        + "    serialiseData-cpu-arguments-slope: 392670,"
        + "    addInteger-cpu-arguments-intercept: 205665,"
        + "    consByteString-cpu-arguments-slope: 511,"
        + "    decodeUtf8-cpu-arguments-intercept: 497525,"
        + "    encodeUtf8-cpu-arguments-intercept: 1000,"
        + "    equalsData-cpu-arguments-intercept: 1060367,"
        + "    appendString-memory-arguments-slope: 1,"
        + "    blake2b_256-cpu-arguments-intercept: 117366,"
        + "    equalsString-cpu-arguments-constant: 187000,"
        + "    lengthOfByteString-memory-arguments: 10,"
        + "    lessThanByteString-memory-arguments: 1,"
        + "    lessThanInteger-cpu-arguments-slope: 511,"
        + "    modInteger-memory-arguments-minimum: 1,"
        + "    multiplyInteger-cpu-arguments-slope: 11687,"
        + "    sliceByteString-cpu-arguments-slope: 0,"
        + "    subtractInteger-cpu-arguments-slope: 812,"
        + "    appendByteString-cpu-arguments-slope: 571,"
        + "    appendString-cpu-arguments-intercept: 1000,"
        + "    divideInteger-cpu-arguments-constant: 196500,"
        + "    divideInteger-memory-arguments-slope: 1,"
        + "    equalsByteString-cpu-arguments-slope: 62,"
        + "    equalsString-cpu-arguments-intercept: 1000,"
        + "    serialiseData-memory-arguments-slope: 2,"
        + "    addInteger-memory-arguments-intercept: 1,"
        + "    consByteString-memory-arguments-slope: 1,"
        + "    decodeUtf8-memory-arguments-intercept: 4,"
        + "    encodeUtf8-memory-arguments-intercept: 4,"
        + "    equalsInteger-cpu-arguments-intercept: 208512,"
        + "    modInteger-memory-arguments-intercept: 0,"
        + "    serialiseData-cpu-arguments-intercept: 1159724,"
        + "    consByteString-cpu-arguments-intercept: 221973,"
        + "    divideInteger-memory-arguments-minimum: 1,"
        + "    lessThanByteString-cpu-arguments-slope: 156,"
        + "    lessThanEqualsInteger-memory-arguments: 1,"
        + "    multiplyInteger-memory-arguments-slope: 1,"
        + "    quotientInteger-cpu-arguments-constant: 196500,"
        + "    quotientInteger-memory-arguments-slope: 1,"
        + "    sliceByteString-memory-arguments-slope: 0,"
        + "    subtractInteger-memory-arguments-slope: 1,"
        + "    appendByteString-memory-arguments-slope: 1,"
        + "    appendString-memory-arguments-intercept: 4,"
        + "    equalsByteString-cpu-arguments-constant: 245000,"
        + "    lessThanInteger-cpu-arguments-intercept: 208896,"
        + "    multiplyInteger-cpu-arguments-intercept: 69522,"
        + "    remainderInteger-cpu-arguments-constant: 196500,"
        + "    remainderInteger-memory-arguments-slope: 1,"
        + "    sliceByteString-cpu-arguments-intercept: 265318,"
        + "    subtractInteger-cpu-arguments-intercept: 205665,"
        + "    verifyEd25519Signature-memory-arguments: 10,"
        + "    appendByteString-cpu-arguments-intercept: 1000,"
        + "    divideInteger-memory-arguments-intercept: 0,"
        + "    equalsByteString-cpu-arguments-intercept: 216773,"
        + "    quotientInteger-memory-arguments-minimum: 1,"
        + "    serialiseData-memory-arguments-intercept: 0,"
        + "    consByteString-memory-arguments-intercept: 0,"
        + "    lessThanEqualsByteString-memory-arguments: 1,"
        + "    lessThanEqualsInteger-cpu-arguments-slope: 473,"
        + "    remainderInteger-memory-arguments-minimum: 1,"
        + "    lessThanByteString-cpu-arguments-intercept: 197145,"
        + "    multiplyInteger-memory-arguments-intercept: 0,"
        + "    quotientInteger-memory-arguments-intercept: 0,"
        + "    sliceByteString-memory-arguments-intercept: 4,"
        + "    subtractInteger-memory-arguments-intercept: 1,"
        + "    verifyEd25519Signature-cpu-arguments-slope: 1021,"
        + "    appendByteString-memory-arguments-intercept: 0,"
        + "    remainderInteger-memory-arguments-intercept: 0,"
        + "    verifyEcdsaSecp256k1Signature-cpu-arguments: 20000000000,"
        + "    lessThanEqualsByteString-cpu-arguments-slope: 156,"
        + "    lessThanEqualsInteger-cpu-arguments-intercept: 204924,"
        + "    modInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    verifyEcdsaSecp256k1Signature-memory-arguments: 20000000000,"
        + "    verifyEd25519Signature-cpu-arguments-intercept: 9462713,"
        + "    lessThanEqualsByteString-cpu-arguments-intercept: 197145,"
        + "    verifySchnorrSecp256k1Signature-memory-arguments: 20000000000,"
        + "    divideInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    modInteger-cpu-arguments-model-arguments-intercept: 453240,"
        + "    quotientInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    verifySchnorrSecp256k1Signature-cpu-arguments-slope: 0,"
        + "    remainderInteger-cpu-arguments-model-arguments-slope: 220,"
        + "    divideInteger-cpu-arguments-model-arguments-intercept: 453240,"
        + "    quotientInteger-cpu-arguments-model-arguments-intercept: 453240,"
        + "    verifySchnorrSecp256k1Signature-cpu-arguments-intercept: 20000000000,"
        + "    remainderInteger-cpu-arguments-model-arguments-intercept: 453240"
        + "  }", type);

    Map<String, BigInteger> expectMap = new HashMap<>();
    gsonMap.forEach( (k, v) -> expectMap.put(k,new BigInteger(v)));

    List<? extends Number> value = Arrays.asList(205665, 812, 1, 1, 1000, 571, 0, 1, 1000, 24177, 4, 1, 1000, 32, 117366, 10475, 4, 23000, 100, 23000, 100, 23000, 100, 23000, 100, 23000, 100, 23000, 100, 100, 100, 23000, 100, 19537, 32, 175354, 32, 46417, 4, 221973, 511, 0, 1, 89141, 32, 497525, 14068, 4, 2, 196500, 453240, 220, 0, 1, 1, 1000, 28662, 4, 2, 245000, 216773, 62, 1, 1060367, 12586, 1, 208512, 421, 1, 187000, 1000, 52998, 1, 80436, 32, 43249, 32, 1000, 32, 80556, 1, 57667, 4, 1000, 10, 197145, 156, 1, 197145, 156, 1, 204924, 473, 1, 208896, 511, 1, 52467, 32, 64832, 32, 65493, 32, 22558, 32, 16563, 32, 76511, 32, 196500, 453240, 220, 0, 1, 1, 69522, 11687, 0, 1, 60091, 32, 196500, 453240, 220, 0, 1, 1, 196500, 453240, 220, 0, 1, 1, 1159724, 392670, 0, 2, 806990, 30482, 4, 1927926, 82523, 4, 265318, 0, 4, 0, 85931, 32, 205665, 812, 1, 1, 41182, 32, 212342, 32, 31220, 32, 32696, 32, 43357, 32, 32247, 32, 38314, 32, 20000000000L, 20000000000L, 9462713, 1021, 10, 20000000000L, 0, 20000000000L);
    CostModelKeys costModelKeys = new PlutusV2Keys();
    var actual = costModelKeys.getCostModelMap(value.stream().map(number -> BigInteger.valueOf(number.longValue())).collect(Collectors.toList()));
    assertThat(actual).isEqualTo(expectMap);
  }
}
