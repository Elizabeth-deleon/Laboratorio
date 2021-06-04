package modelogui;

import controller.AbstractController;
import controller.FactController;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelobd.VFactura;
import modelobd.VFacturaDetalle;
import utilidades.Helper;

/**
 *
 * @author Grupo#3
 */
public class ModeloTablaFactura extends AbstractTableModel{
    ArrayList<VFactura> facturas = new ArrayList();
    FactController fc = new FactController();
    String[] nomColums = {"Nro.","Cliente","Vendedor","Fecha","Cant. Articulos","Total"};

    
    
    public ModeloTablaFactura() {
        facturas = fc.getRegistros(AbstractController.TODO, null);
    }

    public ModeloTablaFactura(int tipoConsulta,String dato) {
        cargarRegistros(tipoConsulta,dato);
    }
    private void cargarRegistros(int tipoConsulta,String dato)
    {
        switch(tipoConsulta)
        {
            case  FactController.POR_FECHA:
                facturas = fc.getRegistros(AbstractController.POR_CONDICION, VFactura.SELECT_POR_FECHA+"'"+dato+"'");
             break;
             case  FactController.POR_CODIGO:
                facturas = fc.getRegistros(AbstractController.POR_CONDICION, VFactura.SELECT_POR_CODIGO+"'"+dato+"'");
                System.out.println(VFactura.SELECT_POR_CODIGO+"'"+dato+"'");
             break; 
             default:
                 facturas = fc.getRegistros(AbstractController.TODO, null);
        }        
    }
    

    @Override
    public int getRowCount() {
        return facturas.size();
    }

    @Override
    public int getColumnCount() {
        return nomColums.length;
    }

    @Override
    public String getColumnName(int column) {
        return nomColums[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return facturas.get(rowIndex).getNumeroFactura();
            case 1: return facturas.get(rowIndex).getCliente().toString();
            case 2: return facturas.get(rowIndex).getVendedor().toString();
            case 3: return Helper.getFechaFormateada(facturas.get(rowIndex).getFecha(), Helper.DIA_MES_AÑO);    
            case 4: return fc.sumaValoresCampo(VFacturaDetalle.nomTabla, "CANT", "NUM_FACV", facturas.get(rowIndex).getNumeroFactura());    
            case 5: return facturas.get(rowIndex).getSubTotal()-facturas.get(rowIndex).getTotalDescuento()+facturas.get(rowIndex).getTotalIva();
            default:return null;   
        }
    }

    public VFactura getFactura(int indice) {
        return facturas.get(indice);
    }
    
}
