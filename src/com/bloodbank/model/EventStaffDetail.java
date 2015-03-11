package com.bloodbank.model;

// Generated Mar 16, 2013 12:03:45 PM by Hibernate Tools 3.3.0.GA

/**
 * EventStaffDetail generated by hbm2java
 */
public class EventStaffDetail implements java.io.Serializable {

	private EventStaffDetailId id;
	private StaffDetail staffDetail;
	private EventDetail eventDetail;

	public EventStaffDetail() {
	}

	public EventStaffDetail(EventStaffDetailId id) {
		this.id = id;
	}

	public EventStaffDetail(EventStaffDetailId id, StaffDetail staffDetail,
			EventDetail eventDetail) {
		this.id = id;
		this.staffDetail = staffDetail;
		this.eventDetail = eventDetail;
	}

	public EventStaffDetailId getId() {
		return this.id;
	}

	public void setId(EventStaffDetailId id) {
		this.id = id;
	}

	public StaffDetail getStaffDetail() {
		return this.staffDetail;
	}

	public void setStaffDetail(StaffDetail staffDetail) {
		this.staffDetail = staffDetail;
	}

	public EventDetail getEventDetail() {
		return this.eventDetail;
	}

	public void setEventDetail(EventDetail eventDetail) {
		this.eventDetail = eventDetail;
	}

}
