package com.sts.dataVisualization.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blackcoffer_table")
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "end_year")
    private int endYear;

    @Column(name = "citylng")
    private String cityLng;

    @Column(name = "citylat")
    private String cityLat;

    @Column(name = "intensity")
    private int intensity;

    @Column(name = "sector")
    private String sector;

    @Column(name = "topic")
    private String topic;

    @Column(name = "insight")
    private String insight;

    @Column(name = "swot")
    private String swot;

    @Column(name = "url")
    private String url;

    @Column(name = "region")
    private String region;

    @Column(name = "start_year")
    private String startYear;

    @Column(name = "impact")
    private String impact;

    @Column(name = "added")
    private String added;

    @Column(name = "published")
    private String published;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "relevance")
    private int relevance;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "source")
    private String source;

    @Column(name = "title")
    private String title;

    @Column(name = "likelihood")
    private int likelihood;
    
    // Getter Setter Method
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public String getCityLng() {
		return cityLng;
	}

	public void setCityLng(String cityLng) {
		this.cityLng = cityLng;
	}

	public String getCityLat() {
		return cityLat;
	}

	public void setCityLat(String cityLat) {
		this.cityLat = cityLat;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getInsight() {
		return insight;
	}

	public void setInsight(String insight) {
		this.insight = insight;
	}

	public String getSwot() {
		return swot;
	}

	public void setSwot(String swot) {
		this.swot = swot;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public String getPestle() {
		return pestle;
	}

	public void setPestle(String pestle) {
		this.pestle = pestle;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}
	
	// constructor
	public DataEntity() {
	}
	
	
	public DataEntity(Long id, int endYear, String cityLng, String cityLat, int intensity, String sector, String topic,
			String insight, String swot, String url, String region, String startYear, String impact, String added,
			String published, String city, String country, int relevance, String pestle, String source, String title,
			int likelihood) {
		super();
		this.id = id;
		this.endYear = endYear;
		this.cityLng = cityLng;
		this.cityLat = cityLat;
		this.intensity = intensity;
		this.sector = sector;
		this.topic = topic;
		this.insight = insight;
		this.swot = swot;
		this.url = url;
		this.region = region;
		this.startYear = startYear;
		this.impact = impact;
		this.added = added;
		this.published = published;
		this.city = city;
		this.country = country;
		this.relevance = relevance;
		this.pestle = pestle;
		this.source = source;
		this.title = title;
		this.likelihood = likelihood;
	}    
}
