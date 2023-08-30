package com.AulaJava.curso.Entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_order")
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private Instant moment;
@ManyToOne
@JoinColumn(name= "cliente_id")
private User cliente;
public Order() {
}
public Order(Long id, Instant moment, User cliente) {
	super();
	Id = id;
	this.moment = moment;
	this.cliente = cliente;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public Instant getMoment() {
	return moment;
}
public void setMoment(Instant moment) {
	this.moment = moment;
}
public User getCliente() {
	return cliente;
}
public void setCliente(User cliente) {
	this.cliente = cliente;
}
@Override
public int hashCode() {
	return Objects.hash(Id, cliente, moment);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	return Objects.equals(Id, other.Id) && Objects.equals(cliente, other.cliente)
			&& Objects.equals(moment, other.moment);
}

}
