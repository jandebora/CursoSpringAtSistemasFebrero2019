package com.curso.spring.concesionario.core.negocio;

import org.springframework.stereotype.Component;

import com.curso.spring.concesionario.core.entidades.Pedido;
import com.curso.spring.concesionario.dto.PedidoDto;

@Component
public class PedidoTransformador implements Transformador<PedidoDto, Pedido> {

	@Override
	public Pedido dtoToEntidad(PedidoDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PedidoDto entidadToDto(Pedido entidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
