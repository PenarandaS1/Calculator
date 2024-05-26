/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.controllers;


import calculator.model.Calculator;
import calculator.model.Operation;
import calculator.model.operations.Divide;
import calculator.model.storage.Storage;
import calculator.utils.Response;
import calculator.utils.Status;

/**
 *
 * @author RYZEN
 */
public class DivController {
    public static Response addNumbers(String number1, String number2) {
        try {
            double num1, num2;
            String[] decimales;
            if (number1.isEmpty()) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            if (number2.isEmpty()) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            if (number1.contains(".")) {
                decimales = number1.split("\\.");
                if (decimales[1].length() > 3) {
                    return new Response("Number 1 must only have 3 decimals", Status.BAD_REQUEST);
                }
            }
            if (number2.contains(".")) {
                decimales = number2.split("\\.");
                if (decimales[1].length() > 3) {
                    return new Response("Number 2 must only have 3 decimals", Status.BAD_REQUEST);
                }
            }
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

            } catch (NumberFormatException ex) {
                return new Response("Numbers must be numeric", Status.BAD_REQUEST);
            }
            Calculator calculator = new Calculator();
            Storage storage = Storage.getInstance();
            Operation operation = new Operation(num1, num2, "/", calculator.result(Divide.divide(num1,num2)));
            storage.addOperation(operation);
            return new Response("Successful operation", Status.OK, operation);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
