package com.bios.model;

import lombok.Data;

public @Data class Cliente {
	private Integer id;
	private String nome;
	private String endereco;
	private String observacao;
	private Double dlatitude;
	private Double dlongitude;
	private Municipio municipio;
	private UF uf;
}
