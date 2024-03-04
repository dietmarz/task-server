package de.centronic.task.server.infrastructure.shell;


import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.Locale;

@ShellComponent
public class TaskCommands {
    @ShellMethod("Returns content of a document")
    public String getContent(String path) {
        return "Test content";
    }
    @ShellMethod("Lowercase")
    public String toLowerCase(String in ) {
        return in.toLowerCase(Locale.ROOT);
    }
}
