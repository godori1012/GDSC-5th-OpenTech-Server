package GDSC5thOpenTechServer.GDSC5thOpenTechServer.Translate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasicController {
    private final TranslateService translateService;
    @GetMapping("/")
    public String getTranslates(Model model){
        //모든 "외계인어-지구인어" 리스트 가져오기
    }

    @PostMapping("/translate")
    public String translateAlien(Model model, TranslateForm form) {
        //새로운 "외계인어-지구인어" 번역 만들기
    }
}
