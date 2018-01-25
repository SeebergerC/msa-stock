package com.predic8.workshop.stock.event;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;

public class Operation {

	private static final Logger log = LoggerFactory.getLogger(Operation.class);

	private String bo;
	private String action;
	private JsonNode object;

	public Operation() {
	}

	public Operation(String bo, String action, JsonNode object) {
		this.bo = bo;
		this.action = action;
		this.object = object;
	}

	public String getBo() {
		return this.bo;
	}

	public String getAction() {
		return this.action;
	}

	public JsonNode getObject() {
		return this.object;
	}

	public String toString() {
		return "Operation( bo=" + bo + " action=" + action + " object=" + object + ")";
	}

	public void logSend() {
		log("send");
	}

	public void logReceive() {
		log("receive");
	}

	private void log(String direction) {

		Map<String, Object> entries = new HashMap();
		entries.put("bo", bo);
		entries.put("action", action);
		entries.put("object", object);
		entries.put("direction", direction);

		// log.info(appendEntries(entries), "");
	}

}