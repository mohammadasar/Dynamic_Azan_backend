package com.exaple.demo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("AzanTimings")
public class DynamicAzanTime {
	
	@Id
	private String id;
	private String currentDate ;
	private String District;
	private String endDate ;
	private String fnamaz;
	private String dnamaz;
	private String anamaz;
	private String mnamaz;
	private String inamaz;
	private String fiquamath;
	private String diquamath;
	private String aiquamath;
	private String miquamath;
	private String iiquamath;
	private String sahar;
	private String sunrise;
	private String sunset;
	private String solorpeak;
	private String israak;
	private String luha;
	private String ifthar;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getFnamaz() {
		return fnamaz;
	}
	public void setFnamaz(String fnamaz) {
		this.fnamaz = fnamaz;
	}
	public String getDnamaz() {
		return dnamaz;
	}
	public void setDnamaz(String dnamaz) {
		this.dnamaz = dnamaz;
	}
	public String getAnamaz() {
		return anamaz;
	}
	public void setAnamaz(String anamaz) {
		this.anamaz = anamaz;
	}
	public String getMnamaz() {
		return mnamaz;
	}
	public void setMnamaz(String mnamaz) {
		this.mnamaz = mnamaz;
	}
	public String getInamaz() {
		return inamaz;
	}
	public void setInamaz(String inamaz) {
		this.inamaz = inamaz;
	}
	public String getFiquamath() {
		return fiquamath;
	}
	public void setFiquamath(String fiquamath) {
		this.fiquamath = fiquamath;
	}
	public String getDiquamath() {
		return diquamath;
	}
	public void setDiquamath(String diquamath) {
		this.diquamath = diquamath;
	}
	public String getAiquamath() {
		return aiquamath;
	}
	public void setAiquamath(String aiquamath) {
		this.aiquamath = aiquamath;
	}
	public String getMiquamath() {
		return miquamath;
	}
	public void setMiquamath(String miquamath) {
		this.miquamath = miquamath;
	}
	public String getIiquamath() {
		return iiquamath;
	}
	public void setIiquamath(String iiquamath) {
		this.iiquamath = iiquamath;
	}
	public String getSahar() {
		return sahar;
	}
	public void setSahar(String sahar) {
		this.sahar = sahar;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getSolorpeak() {
		return solorpeak;
	}
	public void setSolorpeak(String solorpeak) {
		this.solorpeak = solorpeak;
	}
	public String getIsraak() {
		return israak;
	}
	public void setIsraak(String israak) {
		this.israak = israak;
	}
	public String getLuha() {
		return luha;
	}
	public void setLuha(String luha) {
		this.luha = luha;
	}
	public String getIfthar() {
		return ifthar;
	}
	public void setIfthar(String ifthar) {
		this.ifthar = ifthar;
	}
	
	
	
	

}
