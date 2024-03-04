package de.centronic.task.server.interfaces;

import lombok.Value;


@Value
public class DocumentResponse {
    String path;
    String content;
}
