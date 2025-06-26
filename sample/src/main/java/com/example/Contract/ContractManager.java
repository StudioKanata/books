package com.example.Contract;

import java.math.BigDecimal;

public class ContractManager {

    private final String ONE_POINT_ZERO = "1.0";

    public ContractAmount contractAmount;

    /**
     * 税込み金額計算
     * @param amountIncludingTax
     * @param salesTaxRate
     * @return
     */
    public int calculateAmountIncludingTax(int amountIncludingTax, BigDecimal salesTaxRate) {
        BigDecimal multiplier = salesTaxRate.add(new BigDecimal(ONE_POINT_ZERO));
        BigDecimal calculatedAmount = multiplier.multiply(new BigDecimal(amountIncludingTax));
        // 300行とか
        //...
        return calculatedAmount.intValue();
    }

    /**
     * 契約締結
     */
    public void conclude() {
        // ここに契約締結のロジックを実装
        // 300行とか
        //...
    }
}
