package com.cg.flight.app.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class FlightReview {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "flight_Id")
	private int flightId;

	@Column(name = "number_of_stars")
	private Integer numberOfStars;

	@Column(name = "content")
	private String content;
//onetomany

	public FlightReview(Integer numberOfStars, String content) {
		super();
		this.numberOfStars = numberOfStars;
		this.content = content;
	}
	
	

}// end of class