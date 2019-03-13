package com.greenfoxacademy.dbintegration.controllers;

import com.greenfoxacademy.dbintegration.models.Todo;
import com.greenfoxacademy.dbintegration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("todo", new Todo());
        return "todolist";
    }

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String showActiveTodos(Model model, @RequestParam(name = "isActive") boolean isActive) {
        List<Todo> allTodos = new ArrayList<>();
        todoRepository.findAll().forEach(todo -> allTodos.add(todo));
        List<Todo> activeTodos = allTodos.stream()
                .filter(todo -> todo.isDone() != isActive)
                .collect(Collectors.toList());
        model.addAttribute("todos", activeTodos);
        return "activetodos";
    }*/

    @GetMapping("/add")
    public String addNewTodoForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "add";
    }

    @PostMapping("/add")
    public String addNewTodo(@ModelAttribute(name = "todo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteTodo(@PathVariable("id") long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String updateTodoForm(Model model, @PathVariable("id") long id) {
        todoRepository.findById(id).get().setDone(true);
        //model.addAttribute("todo", todoRepository.findById(id).get());
        return "redirect:/todo/list";
    }

  /*  @RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
    public String updateTodo(@PathVariable("id") long id, @ModelAttribute(name = "todo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }*/

  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public String searchInTodos(Model model, @RequestParam("search") String search){
      
      return "redirect:/todo/list";
  }
}