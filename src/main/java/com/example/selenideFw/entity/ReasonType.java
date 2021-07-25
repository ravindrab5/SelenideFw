package com.example.selenideFw.entity;

import java.beans.Transient;
import java.util.HashMap;
import java.util.Map;

public class ReasonType {

    String id;
    String name;
    Integer propertyId;
    ReasonTypeColor reasonTypeEnum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    public String getColor() {
        return reasonTypeEnum.getValue();
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public ReasonTypeColor getReasonTypeEnum() {
        return reasonTypeEnum;
    }

    public void setReasonTypeEnum(ReasonTypeColor reasonTypeEnum) {
        this.reasonTypeEnum = reasonTypeEnum;
    }

    public enum ReasonTypeColor {
        RED("#f22222"), GRAY("#cccccc"), BLUE("#00bfff"), ORANGE("#ff8000"), YELLOW("#ffff00"), PINK("#ff00bf"), GREEN("#00a100");

        private static Map<String, ReasonTypeColor> valueToTextMapping;
        private final String value;

        ReasonTypeColor(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static Map<String, ReasonTypeColor> getReasonTypeMap() {
            if (valueToTextMapping == null) {
                initMapping();
            }
            return valueToTextMapping;
        }

        private static void initMapping() {
            valueToTextMapping = new HashMap<>();
            for (ReasonTypeColor s : values()) {
                valueToTextMapping.put(s.value, s);
            }
        }
    }

}
