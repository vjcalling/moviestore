package com.project.moviestore.model;// Generated Dec 14, 2016 8:17:09 PM by Hibernate Tools 5.1.0.Alpha1

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Film generated by hbm2java
 */
@Entity
@Table(name = "film", catalog = "sakila")
public class Film implements java.io.Serializable {

	private Short filmId;
	private Language languageByLanguageId;
	private Language languageByOriginalLanguageId;
	private String title;
	private String description;
	private Date releaseYear;
	private byte rentalDuration;
	private BigDecimal rentalRate;
	private Short length;
	private BigDecimal replacementCost;
	private String rating;
	private String specialFeatures;
	private Date lastUpdate;
	private String language;
	private String releaseYear_1;
	private int rentalDuration_1;
	private double rentalRate_1;
	private String specialFeatures_1;
	private Set<Inventory> inventories = new HashSet<Inventory>(0);
	private Set<FilmActor> filmActors = new HashSet<FilmActor>(0);
	private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>(0);

	public Film() {
	}

	public Film(Language languageByLanguageId, String title, byte rentalDuration, BigDecimal rentalRate,
			BigDecimal replacementCost, Date lastUpdate, int rentalDuration_1, double rentalRate_1) {
		this.languageByLanguageId = languageByLanguageId;
		this.title = title;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.replacementCost = replacementCost;
		this.lastUpdate = lastUpdate;
		this.rentalDuration_1 = rentalDuration_1;
		this.rentalRate_1 = rentalRate_1;
	}

	public Film(Language languageByLanguageId, Language languageByOriginalLanguageId, String title, String description,
			Date releaseYear, byte rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost,
			String rating, String specialFeatures, Date lastUpdate, String language, String releaseYear_1,
			int rentalDuration_1, double rentalRate_1, String specialFeatures_1, Set<Inventory> inventories,
			Set<FilmActor> filmActors, Set<FilmCategory> filmCategories) {
		this.languageByLanguageId = languageByLanguageId;
		this.languageByOriginalLanguageId = languageByOriginalLanguageId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.lastUpdate = lastUpdate;
		this.language = language;
		this.releaseYear_1 = releaseYear_1;
		this.rentalDuration_1 = rentalDuration_1;
		this.rentalRate_1 = rentalRate_1;
		this.specialFeatures_1 = specialFeatures_1;
		this.inventories = inventories;
		this.filmActors = filmActors;
		this.filmCategories = filmCategories;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "film_id", unique = true, nullable = false)
	public Short getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Short filmId) {
		this.filmId = filmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", nullable = false)
	public Language getLanguageByLanguageId() {
		return this.languageByLanguageId;
	}

	public void setLanguageByLanguageId(Language languageByLanguageId) {
		this.languageByLanguageId = languageByLanguageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "original_language_id")
	public Language getLanguageByOriginalLanguageId() {
		return this.languageByOriginalLanguageId;
	}

	public void setLanguageByOriginalLanguageId(Language languageByOriginalLanguageId) {
		this.languageByOriginalLanguageId = languageByOriginalLanguageId;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "release_year", length = 0)
	public Date getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Column(name = "rental_duration", nullable = false)
	public byte getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(byte rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	@Column(name = "rental_rate", nullable = false, precision = 4)
	public BigDecimal getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}

	@Column(name = "length")
	public Short getLength() {
		return this.length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	@Column(name = "replacement_cost", nullable = false, precision = 5)
	public BigDecimal getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	@Column(name = "rating", length = 5)
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "special_features", length = 54)
	public String getSpecialFeatures() {
		return this.specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 0)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "language")
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "releaseYear")
	public String getReleaseYear_1() {
		return this.releaseYear_1;
	}

	public void setReleaseYear_1(String releaseYear_1) {
		this.releaseYear_1 = releaseYear_1;
	}

	@Column(name = "rentalDuration", nullable = false)
	public int getRentalDuration_1() {
		return this.rentalDuration_1;
	}

	public void setRentalDuration_1(int rentalDuration_1) {
		this.rentalDuration_1 = rentalDuration_1;
	}

	@Column(name = "rentalRate", nullable = false, precision = 22, scale = 0)
	public double getRentalRate_1() {
		return this.rentalRate_1;
	}

	public void setRentalRate_1(double rentalRate_1) {
		this.rentalRate_1 = rentalRate_1;
	}

	@Column(name = "specialFeatures")
	public String getSpecialFeatures_1() {
		return this.specialFeatures_1;
	}

	public void setSpecialFeatures_1(String specialFeatures_1) {
		this.specialFeatures_1 = specialFeatures_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	public Set<FilmActor> getFilmActors() {
		return this.filmActors;
	}

	public void setFilmActors(Set<FilmActor> filmActors) {
		this.filmActors = filmActors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	public Set<FilmCategory> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(Set<FilmCategory> filmCategories) {
		this.filmCategories = filmCategories;
	}

}
