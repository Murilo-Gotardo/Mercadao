/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.controller;

import com.murilo.mercado.model.ProdutoModel;
import com.murilo.mercado.view.CadastroProdutoView;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murilo
 */
public class CadastroProdutoController {
    
    private final MercadoController mercadoController = new MercadoController();
    
    public  void addProtuctsToTable(JTable table, ProdutoModel produto) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        Object[] prodData = {produto.getId(), produto.getNome(), produto.getDescricao(), produto.getPeso(), produto.getValor()};

        tableModel.addRow(prodData);
        
        mercadoController.addProduto(produto);
    }
    
    public int removeProdutoFromTable(JTable table) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        int selectedRow = table.getSelectedRow();
        int selectedId = 0;
        if (selectedRow != -1) {
            selectedId = ((Number) table.getValueAt(selectedRow, 0)).intValue();
        }

        tableModel.removeRow(table.getSelectedRow());
        tableModel.fireTableCellUpdated(table.getSelectedRow(), table.getSelectedColumn());
        
        return selectedId;
    }
    
    public void flushTable(JTable table) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
        int rowCount = tableModel.getRowCount() - 1;
            
        for (int i = 0; i < rowCount; i++) {
            tableModel.removeRow(i);
        }
    }
    
    public void createView(){
        CadastroProdutoView cadastro = new CadastroProdutoView();
        cadastro.setVisible(true);
    }
}
