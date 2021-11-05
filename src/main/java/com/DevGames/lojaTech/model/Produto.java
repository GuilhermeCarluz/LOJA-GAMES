package com.DevGames.lojaTech.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "db_produto")
public class Produto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
@Size(min = 5 , max = 80)
private String produto;

@NotNull
private BigDecimal preco;

@NotNull
private int estoque;

@NotNull
private String descricao;

@ManyToOne
@JsonIgnoreProperties("produtos")
private Categoria categoria;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getProduto() {
	return produto;
}

public void setProduto(String produto) {
	this.produto = produto;
}

public BigDecimal getPreco() {
	return preco;
}

public void setPreco(BigDecimal preco) {
	this.preco = preco;
}

public int getEstoque() {
	return estoque;
}

public void setEstoque(int estoque) {
	this.estoque = estoque;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}


}
