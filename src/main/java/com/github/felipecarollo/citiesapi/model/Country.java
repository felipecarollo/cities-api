package com.github.felipecarollo.citiesapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Country")
@Table(name = "pais")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Country {

	@Id
	private long id;
	
	@Column(name = "nome")
	private String name;

	@Column(name = "nome_pt")
	private String portugueseName;

	@Column(name = "sigla")
	private String code;

	private Integer bacen;

}
