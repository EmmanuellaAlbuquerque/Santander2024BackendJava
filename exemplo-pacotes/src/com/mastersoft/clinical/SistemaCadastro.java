package com.mastersoft.clinical;

import com.mastersoft.clinical.model.Cliente;
import com.mastersoft.clinical.util.EstadoBrasileiro;

public class SistemaCadastro {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Manu", "314.124.610-65");
		
		cliente.setEndereco("Rua das Águas");
		
		System.out.println("Cliente");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " +  cliente.getCpf());
		System.out.println("Endereço: " + cliente.getEndereco());
		
		obterEstados();
		EstadoBrasileiro eb = EstadoBrasileiro.PARAIBA;
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
	}
	
	public static void obterEstados() {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + "-" + e.getNome());
		}
	}
}
