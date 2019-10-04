package com.bios.model;

import lombok.Data;

public @Data class Municipio {
	private Integer id;
	private String nome;
	private UF uf;
	private Long populacao;
}
