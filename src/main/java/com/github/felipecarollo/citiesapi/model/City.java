package com.github.felipecarollo.citiesapi.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cidade")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@TypeDefs(value = {
	    @TypeDef(name = "point", typeClass = PointType.class)
	})
public class City {

	  @Id
	  private Long id;

	  @Column(name = "nome")
	  private String name;

	  private Integer uf;

	  private Integer ibge;

	  // 1st
	  @Column(name = "lat_lon")
	  private String geolocation;

	  // 2nd
	  @Type(type = "point")
	  @Column(name = "lat_lon", updatable = false, insertable = false)
	  private Point location;
}
