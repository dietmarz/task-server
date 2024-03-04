package de.centronic.task.server.infrastructure;

import de.centronic.task.server.core.Document;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class GitHubFileService implements FileService {
    private final RestTemplate restTemplate;

    @Override
    public Document getContent(String path) {
        String content = restTemplate.getForObject(path, String.class);
        return new Document(path, content);
    }


}
