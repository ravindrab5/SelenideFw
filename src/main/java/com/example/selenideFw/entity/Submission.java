package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Submission {

    private String submissionId;
    private String submissionCriteriaId;
    private Date dueDate;
    private Date noSubmissionBeforeDate;
    private Integer managementCompanyId;
    private Integer propertyId;
    private Boolean isActive=true;
    private SubmissionStatus submissionStatus= SubmissionStatus.PENDING;
    private Date startDate;
    private Date endDate;
    private String name;
    private Integer instanceId;

    private SubmissionFor submissionFor;
    private Date submittedDate;
    private String submittedBy;
    private LockedStatus lockedStatus=LockedStatus.UNLOCKED;
    private SubmissionType submissionType;
    private SubmissionMode submissionMode;
    private Date unlockRequestDate;
    private String unlockRequestBy;
    private Date unlockedDate;
    private String unlockedBy;
    private String propertyName;
    private String pin;
    private Date lockDate;

    //Ui updated dates.
    private Date startDateNew;
    private Date endDateNew;
    private Date dueDateNew;
    private boolean submissionAllowed;
    private boolean overdue;
    private boolean isSubmissionDue;
    private boolean isActualsLockInSevenDays;
}
