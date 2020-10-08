package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
private int cid;
private String cname;
private String addr;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}


}
