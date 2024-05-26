/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.model;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;


/**
 *
 * @author RYZEN
 */
public class History {

    private ArrayList<calculator.model.Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public void addOperation(calculator.model.Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<calculator.model.Operation> getOperations() {
        return operations;
    }
    
    public History(ArrayList<calculator.model.Operation> storage) {
        this.operations = storage;
    }
    
    public DefaultListModel history() {
        ArrayList<Operation> operationHistory = getOperations();
        Collections.reverse(operationHistory);

        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        
        return model;
    }
    
}
