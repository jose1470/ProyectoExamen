package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProducto {
	//declaramos los metodos
	
	public void RegistrarProducto(TblProductocl2 Producto);
	public void ActualizarProducto(TblProductocl2 Producto);
	public void EliminarProducto(TblProductocl2 Producto);
	public TblProductocl2 BuscarProducto(TblProductocl2 Producto);
	public List<TblProductocl2> ListadoProducto();

}
