package com.sap.integration.anywhere.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.sap.integration.anywhere.dto.enumeration.AnwSalesOrderLineCalculationBaseDto;

/**
 * Sales Order Line object used by JSON for communication with SAP Anywhere.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnwSalesOrderLineDto {

    private Long id;
    private Long orderId;
    private Integer quantity;
    private Integer inventoryUomQuantity;
    private Double grossUnitPrice;
    private AnwAmountDto grossAmount;
    private AnwSalesOrderLineCalculationBaseDto calculationBase;
    private AnwSkuDto sku;
    private AnwUomDto salesUom;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getInventoryUomQuantity() {
        return this.inventoryUomQuantity;
    }

    public void setInventoryUomQuantity(Integer inventoryUomQuantity) {
        this.inventoryUomQuantity = inventoryUomQuantity;
    }

	public Double getGrossUnitPrice() {
		return this.grossUnitPrice;
	}

	public void setGrossUnitPrice(Double grossUnitPrice) {
		this.grossUnitPrice = grossUnitPrice;
	}

	public AnwAmountDto getGrossAmount() {
		return this.grossAmount;
	}

	public void setGrossAmount(AnwAmountDto grossAmount) {
		this.grossAmount = grossAmount;
	}
    
    public AnwSalesOrderLineCalculationBaseDto getCalculationBase() {
        return this.calculationBase;
    }

    public void setCalculationBase(AnwSalesOrderLineCalculationBaseDto calculationBase) {
        this.calculationBase = calculationBase;
    }

    public AnwSkuDto getSku() {
        return this.sku;
    }

    public void setSku(AnwSkuDto sku) {
        this.sku = sku;
    }

    public AnwUomDto getSalesUom() {
        return this.salesUom;
    }

    public void setSalesUom(AnwUomDto salesUom) {
        this.salesUom = salesUom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append(" [id=");
        sb.append(this.id);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", inventoryUomQuantity=");
        sb.append(this.inventoryUomQuantity);
        sb.append(", calculationBase=");
        sb.append(this.calculationBase);
        sb.append(", sku=");
        sb.append(this.sku);
        sb.append(", salesUom=");
        sb.append(this.salesUom);
        sb.append("]");
        return sb.toString();
    }
}
