/*
package GDSC5thOpenTechServer.GDSC5thOpenTechServer.Translate;

import GDSC5thOpenTechServer.GDSC5thOpenTechServer.Common.CommonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController //메서드의 반환값이 자동으로 JSON으로 변환된다.
@Tag(name = "예제 API", description = "오픈 테크 세미나용 API")
@RequestMapping("/api")
@RequiredArgsConstructor
public class AdvancedController {
    private final TranslateService translateService;
    @GetMapping("/")
    public CommonResponse<List<Translate>> getTranslates(){
        //모든 "외계인어-지구인어" 리스트 가져오기
    }

    @PostMapping("/translate")
    @Operation(summary = "외계인 번역 포스트", description = "외계어와 한국어 번역을 포스트하는 API 입니다.")
    public CommonResponse<Translate> translateAlien(@RequestBody Translate translate) {
        //새로운 "외계인어-지구인어" 번역 만들기
    }
}
 */
