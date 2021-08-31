package com.bhn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "fragment")
@Data
public class OrderCentralModel {
	@Id
private String _id;
private Object supplementals;
public String get_id() {
	return _id;
}
public void set_id(String _id) {
	this._id = _id;
}
public Object getSupplementals() {
	return supplementals;
}
public void setSupplementals(Object supplementals) {
	this.supplementals = supplementals;
} 

}
