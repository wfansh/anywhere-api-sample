package com.sap.integration.anywhere.dto;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.joda.time.DateTime;

import com.sap.integration.core.transformation.ProductTransformation;
import com.sap.integration.erp.dto.IErpDto;

/**
 * Product object used by JSON for communication with SAP Anywhere.
 */
public class AnwProductDto implements IAnwDto {

    private Long id;
    private String name;
    private String code;
    private String type;
    private String status;
    private Boolean inventoryEnabled;
    private Boolean variantEnabled;
    private DateTime updateTime;

    // For following properties is not implemented integration, added only because of need in reports
    private List<AnwSkuDto> skus;

    public AnwProductDto() {
    }

    public AnwProductDto(String code, String name) {
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getVariantEnabled() {
        return this.variantEnabled;
    }

    public void setVariantEnabled(Boolean variantEnabled) {
        this.variantEnabled = variantEnabled;
    }

    public Boolean getInventoryEnabled() {
        return this.inventoryEnabled;
    }

    public void setInventoryEnabled(Boolean inventoryEnabled) {
        this.inventoryEnabled = inventoryEnabled;
    }

    public DateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
    }

    public List<AnwSkuDto> getSkus() {
        return skus;
    }

    public void setSkus(List<AnwSkuDto> skus) {
        this.skus = skus;
    }

    public DateTime getLastSyncTime() {
        return getUpdateTime();
    }

    public IErpDto transform() {
        return ProductTransformation.run(this);
    }

    public boolean isDifferent(IAnwDto other) {
        if (other == null || !(other instanceof AnwProductDto)) {
            return false;
        }
        AnwProductDto r = (AnwProductDto) other;
        return !new EqualsBuilder()
                .append(code, r.code)
                .append(name, r.name)
                .isEquals();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append(" [id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", inventoryEnabled=");
        sb.append(this.inventoryEnabled);
        sb.append(", variantEnabled=");
        sb.append(this.variantEnabled);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append("]");
        return sb.toString();
    }
}
