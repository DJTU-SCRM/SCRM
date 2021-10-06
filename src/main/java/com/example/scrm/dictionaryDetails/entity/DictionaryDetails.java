package com.example.scrm.dictionaryDetails.entity;

import java.io.Serializable;
import java.util.Objects;

public class DictionaryDetails implements Serializable {
    private String customerType;

    private String customerTypeName;

    private static final long serialVersionUID = 1L;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    @Override
    public String toString() {
        return "DictionaryDetails{" +
                "customerType='" + customerType + '\'' +
                ", customerTypeName='" + customerTypeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DictionaryDetails)) return false;
        DictionaryDetails that = (DictionaryDetails) o;
        return getCustomerType().equals(that.getCustomerType()) &&
                getCustomerTypeName().equals(that.getCustomerTypeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerType(), getCustomerTypeName());
    }
}