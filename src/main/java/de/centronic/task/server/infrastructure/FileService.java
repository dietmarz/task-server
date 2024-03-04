package de.centronic.task.server.infrastructure;

import de.centronic.task.server.core.Document;
import org.springframework.stereotype.Service;

public interface FileService {
    Document getContent(String path);

}
