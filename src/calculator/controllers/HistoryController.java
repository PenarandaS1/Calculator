/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.controllers;

import calculator.model.History;
import calculator.model.storage.Storage;
import calculator.utils.Response;
import calculator.utils.Status;

/**
 *
 * @author RYZEN
 */
public class HistoryController {

    public static Response updateHistory() {
        
        try {
            Storage storage = Storage.getInstance();
            History history = new History(storage.getOperations());
            return new Response("History updated", Status.OK, history);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
                

    }
}
