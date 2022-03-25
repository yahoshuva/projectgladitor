package com.lti.home.pojo;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="app7")
public class Applicationdoc
{
		@Id
		@Column(name="appid")
		private int appid;
		@Column(name="gender")
		private String gender;
		@Column(name="pancard")
		private String pancard;
		@Column(name="address")
		private String address;
		@Column(name="nationality")
		private String nationality;
		@Column(name="aadharcard")
		private int aadharcard;
		@Column(name="propertyloc")
		private String propertyloc;
		@Column(name="propertyname")
		private String propertyname;
		@Column(name="estimatedamount")
		private int estimatedamount;
		@Column(name="retirementage")
		private int retirementage;
		@Column(name="orgtype")
		private String orgtype;
		@Column(name="empname")
		private String empname;
		@Column(name="income")
		private int income;
		public int getAppid() {
			return appid;
		}
		public void setAppid(int appid) {
			this.appid = appid;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPancard() {
			return pancard;
		}
		public void setPancard(String pancard) {
			this.pancard = pancard;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public int getAadharcard() {
			return aadharcard;
		}
		public void setAadharcard(int aadharcard) {
			this.aadharcard = aadharcard;
		}
		public String getPropertyloc() {
			return propertyloc;
		}
		public void setPropertyloc(String propertyloc) {
			this.propertyloc = propertyloc;
		}
		public String getPropertyname() {
			return propertyname;
		}
		public void setPropertyname(String propertyname) {
			this.propertyname = propertyname;
		}
		public int getEstimatedamount() {
			return estimatedamount;
		}
		public void setEstimatedamount(int estimatedamount) {
			this.estimatedamount = estimatedamount;
		}
		public int getRetirementage() {
			return retirementage;
		}
		public void setRetirementage(int retirementage) {
			this.retirementage = retirementage;
		}
		public String getOrgtype() {
			return orgtype;
		}
		public void setOrgtype(String orgtype) {
			this.orgtype = orgtype;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		@Override
		public String toString() {
			return "Applicationdoc [appid=" + appid + ", gender=" + gender + ", pancard=" + pancard + ", address="
					+ address + ", nationality=" + nationality + ", aadharcard=" + aadharcard + ", propertyloc="
					+ propertyloc + ", propertyname=" + propertyname + ", estimatedamount=" + estimatedamount
					+ ", retirementage=" + retirementage + ", orgtype=" + orgtype + ", empname=" + empname + ", income="
					+ income + "]";
		}
		public Applicationdoc(int appid, String gender, String pancard, String address, String nationality,
				int aadharcard, String propertyloc, String propertyname, int estimatedamount, int retirementage,
				String orgtype, String empname, int income) {
			super();
			this.appid = appid;
			this.gender = gender;
			this.pancard = pancard;
			this.address = address;
			this.nationality = nationality;
			this.aadharcard = aadharcard;
			this.propertyloc = propertyloc;
			this.propertyname = propertyname;
			this.estimatedamount = estimatedamount;
			this.retirementage = retirementage;
			this.orgtype = orgtype;
			this.empname = empname;
			this.income = income;
		}
		public Applicationdoc() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}


