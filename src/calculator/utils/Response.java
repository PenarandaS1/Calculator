/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.utils;

import calculator.model.History;
import calculator.model.Operation;

/**
 *
 * @author RYZEN
 */
public class Response {

    private String message;
    private int status;
    private Operation object;
    private History history;

    public Response(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public Response(String message, int status, Operation object) {
        this.message = message;
        this.status = status;
        this.object = object;
    }

    public Response(String message, int status, History history) {
        this.message = message;
        this.status = status;
        this.history = history;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Operation getObject() {
        return this.object;
    }

    public History getHistory() {
        return history;
    }

}
