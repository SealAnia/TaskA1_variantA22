package com.example.taskA1.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daily_statistics")
public class DailyStatistics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Date date;
	@Column
	private String demand;
	@Column
	private Double generation;
	@Column
	private String engine;
	@Column
	private String turbine;
	@Column(name = "fuel_type")
	private String fuelType;
	@Column
	private String cycle;
	@Column(name = "auxiliary_generation")
	private Integer auxiliaryGeneration;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}

	public Double getGeneration() {
		return generation;
	}

	public void setGeneration(Double generation) {
		this.generation = generation;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTurbine() {
		return turbine;
	}

	public void setTurbine(String turbine) {
		this.turbine = turbine;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Integer getAuxiliaryGenertion() {
		return auxiliaryGeneration;
	}

	public void setAuxiliaryGenertion(Integer auxiliaryGeneration) {
		this.auxiliaryGeneration = auxiliaryGeneration;
	}
	

}
