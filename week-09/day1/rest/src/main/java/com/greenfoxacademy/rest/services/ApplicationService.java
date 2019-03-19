package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
import com.greenfoxacademy.rest.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public ApplicationService() {
    }

    public DoubledNumber doubleNumber(int input) {
        DoubledNumber number = new DoubledNumber();
        number.setReceived(input);
        number.setResult(input * 2);
        return number;
    }

    public InputError showErrorMessage(String message) {
        InputError error = new InputError();
        error.setError(message);
        return error;
    }

    public Greeting showGreeting(String name, String title) {
        Greeting greeting = new Greeting();
        greeting.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
        return greeting;
    }

    public Appended appendAToString(String word) {
        Appended appended = new Appended();
        appended.setAppended(word + "a");
        return appended;
    }

    public UntilResult sumResult(Until until) {
        UntilResult sumResult = new UntilResult();
        int sum = 0;
        for (int i = until.getUntil(); i > 0; i--) {
            sum += i;
        }
        sumResult.setResult(sum);
        return sumResult;
    }

    public UntilResult factorResult(Until until) {
        UntilResult factorResult = new UntilResult();
        int factor = 1;
        for (int i = until.getUntil(); i > 0; i--) {
            factor *= i;
        }
        factorResult.setResult(factor);
        return factorResult;
    }

    public Map<String, Object> calculateResult(ArrayHandler arrayHandler) {
        Map<String, Object> resultMap = new HashMap<>();
        if (arrayHandler.getWhat().equals("sum")) {
            Integer result = 0;
            for (int i : arrayHandler.getNumbers()) {
                result += i;
            }
            resultMap.put("result", result);
        } else if (arrayHandler.getWhat().equals("multiply")) {
            Integer result = 1;
            for (int i : arrayHandler.getNumbers()) {
                result *= i;
            }
            resultMap.put("result", result);
        } else if (arrayHandler.getWhat().equals("double")) {
            int[] result = new int[arrayHandler.getNumbers().length];
            for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
                result[i] = arrayHandler.getNumbers()[i] * 2;
            }
            resultMap.put("result", result);
        }
        return resultMap;
    }

    public void addNewLog(String endpoint, String data){
        Log newLog = new Log(endpoint, data);
        applicationRepository.save(newLog);
    }

    public LogEntries getLogEntries(){
        LogEntries logEntries = new LogEntries();
        applicationRepository.findAll().forEach(logEntries.getEntries()::add);
        logEntries.setEntry_count(logEntries.getEntries().size());
        return logEntries;
    }
}
