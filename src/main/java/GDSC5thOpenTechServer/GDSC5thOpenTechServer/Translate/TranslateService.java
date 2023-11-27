package GDSC5thOpenTechServer.GDSC5thOpenTechServer.Translate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TranslateService {
    private final TranslateRepository translateRepository;

    public Long saveTranslate(Translate translate){
        translateRepository.save(translate);
        return translate.getId();
    }

    public List<Translate> findTranslates(){
        return translateRepository.findAll();
    }
}
