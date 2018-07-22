package com.ripplehire.candidate.entities;

// Generated May 8, 2015 11:12:07 AM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CandidateFormFields generated by hbm2java
 */
@Entity
@Table(name = "candidate_form_fields")
public class CandidateFormFields implements java.io.Serializable {

	private Integer candidateFormFieldsSeq;
	private int companyMstrSeq;
	private String fieldLabel;
	private String fieldName;
	private String fieldPlaceholder;
	private String fieldType;
	private Character fieldRequired;
	private Character fieldRequiredRec;
	private String fieldClass;
	private String groupClass;
	private String fieldInputClass;
	private String fieldPostText;
	private String fieldExport;
	private Character fieldDuplicate;
	private int fieldMaxLength;
	private String fieldGroup;
	private Character experienceRequired;
	private Character candidateField;
	private Character interviewerField;
	private int colSize;
	private int priority;
	private String defaultExport;
	private Character status;
	private int createdBy;
	private Date createdDttm;
	private Integer updateBy;
	private Date updateDttm;

	public CandidateFormFields() {
	}

	public CandidateFormFields(int companyMstrSeq, int createdBy,
							   Date createdDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public CandidateFormFields(int companyMstrSeq, String fieldLabel,
							   String fieldName, String fieldPlaceholder, String fieldType, Character fieldRequired, Character fieldRequiredRec, String fieldClass, String groupClass,
							   String fieldInputClass, String fieldPostText, String fieldExport, int fieldMaxLength,
							   String fieldGroup, Character experienceRequired, Character candidateField, int colSize, int priority, String defaultExport,
							   Character status, int createdBy,
							   Date createdDttm, Integer updateBy, Date updateDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.fieldLabel = fieldLabel;
		this.fieldName = fieldName;
		this.fieldPlaceholder = fieldPlaceholder;
		this.fieldType = fieldType;
		this.fieldRequired = fieldRequired;
		this.fieldRequiredRec = fieldRequiredRec;
		this.fieldClass = fieldClass;
		this.groupClass = groupClass;
		this.fieldInputClass = fieldInputClass;
		this.fieldPostText = fieldPostText;
		this.fieldExport = fieldExport;
		this.fieldMaxLength = fieldMaxLength;
		this.fieldGroup = fieldGroup;
		this.experienceRequired = experienceRequired;
		this.candidateField = candidateField;
		this.colSize = colSize;
		this.priority = priority;
		this.defaultExport = defaultExport;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updateBy = updateBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CANDIDATE_FORM_FIELDS_SEQ", unique = true, nullable = false)
	public Integer getCandidateFormFieldsSeq() {
		return this.candidateFormFieldsSeq;
	}

	public void setCandidateFormFieldsSeq(Integer candidateFormFieldsSeq) {
		this.candidateFormFieldsSeq = candidateFormFieldsSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "FIELD_LABEL", length = 100)
	public String getFieldLabel() {
		return this.fieldLabel;
	}

	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
	}

	@Column(name = "FIELD_TYPE", length = 50)
	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	@Column(name = "FIELD_PLACEHOLDER", length = 100)
	public String getFieldPlaceholder() {
		return this.fieldPlaceholder;
	}

	public void setFieldPlaceholder(String fieldPlaceholder) {
		this.fieldPlaceholder = fieldPlaceholder;
	}

	@Column(name = "FIELD_NAME", length = 100)
	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	@Column(name = "FIELD_REQUIRED", length = 1)
	public Character getFieldRequired() {
		return this.fieldRequired;
	}

	public void setFieldRequired(Character fieldRequired) {
		this.fieldRequired = fieldRequired;
	}

	@Column(name = "FIELD_REQUIRED_REC", length = 1)
	public Character getFieldRequiredRec() {
		return fieldRequiredRec;
	}

	public void setFieldRequiredRec(Character fieldRequiredRec) {
		this.fieldRequiredRec = fieldRequiredRec;
	}

	@Column(name = "FIELD_CLASS", length = 50)
	public String getFieldClass() {
		return this.fieldClass;
	}

	public void setFieldClass(String fieldClass) {
		this.fieldClass = fieldClass;
	}

	@Column(name = "GROUP_CLASS", length = 50)
	public String getGroupClass() {
		return this.groupClass;
	}

	public void setGroupClass(String groupClass) {
		this.groupClass = groupClass;
	}

	@Column(name = "FIELD_INPUT_CLASS", length = 10)
	public String getFieldInputClass() {
		return this.fieldInputClass;
	}

	public void setFieldInputClass(String fieldInputClass) {
		this.fieldInputClass = fieldInputClass;
	}

	@Column(name = "FIELD_POST_TEXT", length = 10)
	public String getFieldPostText() {
		return this.fieldPostText;
	}

	public void setFieldPostText(String fieldPostText) {
		this.fieldPostText = fieldPostText;
	}

	@Column(name = "FIELD_EXPORT", length = 50)
	public String getFieldExport() {
		return this.fieldExport;
	}

	public void setFieldExport(String fieldExport) {
		this.fieldExport = fieldExport;
	}

	@Column(name = "FIELD_DUPLICATE", length = 1)
	public Character getFieldDuplicate() {
		return this.fieldDuplicate;
	}

	public void setFieldDuplicate(Character fieldDuplicate) {
		this.fieldDuplicate = fieldDuplicate;
	}

	@Column(name = "FIELD_MAX_LENGTH", length = 10)
	public int getFieldMaxLength() {
		return this.fieldMaxLength;
	}

	public void setFieldMaxLength(int fieldMaxLength) {
		this.fieldMaxLength = fieldMaxLength;
	}

	@Column(name = "FIELD_GROUP", length = 50)
	public String getFieldGroup() {
		return this.fieldGroup;
	}

	public void setFieldGroup(String fieldGroup) {
		this.fieldGroup = fieldGroup;
	}

	@Column(name = "CANDIDATE_FIELD", length = 1)
	public Character getCandidateField() {
		return this.candidateField;
	}

	public void setCandidateField(Character candidateField) {
		this.candidateField = candidateField;
	}

	@Column(name = "INTERVIEWER_FIELD", length = 1)
	public Character getInterviewerField() {
		return interviewerField;
	}

	public void setInterviewerField(Character interviewerField) {
		this.interviewerField = interviewerField;
	}

	@Column(name = "COL_SIZE", length = 10)
	public int getColSize() {
		return this.colSize;
	}

	public void setColSize(int colSize) {
		this.colSize = colSize;
	}

	@Column(name = "EXPERIENCE_REQUIRED", length = 1)
	public Character getExperienceRequired() {
		return this.experienceRequired;
	}

	public void setExperienceRequired(Character experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	@Column(name = "PRIORITY", length = 10)
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Column(name = "DEFAULT_EXPORT", length = 50)
	public String getDefaultExport() {
		return this.defaultExport;
	}

	public void setDefaultExport(String defaultExport) {
		this.defaultExport = defaultExport;
	}

	@Column(name = "STATUS", length = 1)
	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	@Column(name = "CREATED_BY", nullable = false)
	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DTTM", nullable = false, length = 19)
	public Date getCreatedDttm() {
		return this.createdDttm;
	}

	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

	@Column(name = "UPDATE_BY")
	public Integer getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DTTM", length = 19)
	public Date getUpdateDttm() {
		return this.updateDttm;
	}

	public void setUpdateDttm(Date updateDttm) {
		this.updateDttm = updateDttm;
	}

}