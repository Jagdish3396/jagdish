package com.bikkadIt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIMING_DTLS")
public class Timing {
	@Id
	@Column(name = "TIMING_ID")
	private int timingId;
	@Column(name = "TIMING_NAME")
	private String timing;

	public int getTimingId() {
		return timingId;
	}

	public void setTimingId(int timingId) {
		this.timingId = timingId;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Override
	public String toString() {
		return "Timing [timingId=" + timingId + ", timingName=" + timing + "]";
	}

}
