package de.centronic.task.server.core;

import lombok.Value;


@Value
public class Document {
    String path;
    String content;
}
