package de.centronic.task.server.interfaces;

import de.centronic.task.server.core.Document;
import de.centronic.task.server.infrastructure.FileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ContentRestController {

    private FileService fileService;

    @GetMapping("/path")
    public DocumentResponse getDocument(String path) {
        Document document = fileService.getContent(path);
        return new DocumentResponse(document.getPath(), document.getContent());
    }
}
