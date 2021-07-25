package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@Document(collection = "ImpactEvent")
public class ImpactEvent {

    @Id
    private String id;
    private String name;
    private String revImpact;
    private EventEffect effect;
    private String type;
    private Frequency frequency;
    private String interval;
    private Integer duration;
    private Integer managementCompanyId;
    private Integer propertyId;
    private List<EventInstance> eventInstances;
    private boolean isMappedWithManagementCompany;

  public enum Frequency {
    ONETIME("One Time"),
    REPEATING("Repeating");

    private final String displayName;

    Frequency(String displayName) {
      this.displayName = displayName;
    }

    public String displayName() {
      return displayName;
    }

    static Map<String, Frequency> frequencies = Arrays.stream(Frequency.values()).collect(Collectors.toMap(Enum::name, dp -> dp));
    public static Frequency search(String key) {
      return frequencies.get(key);
    }

  }

  enum EventEffect {
    Positive,
    Negative;
  }
    @Getter
    @Setter
    @NoArgsConstructor
    class EventInstance {
        private Date startDate;
        private Date endDate;

    }
}




