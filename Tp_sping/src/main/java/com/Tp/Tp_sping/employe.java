package com.Tp.Tp_sping;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employer")
public class employe {
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Prenom")
	private String prenom;
	
	@Column(name = "Nom")
	private String nom;
	
	@Column(name = "Adresse")
	private String adresse;
	
	@Column(name = "Salaire")
	private String salaire;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
	

}