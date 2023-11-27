package GDSC5thOpenTechServer.GDSC5thOpenTechServer.Translate;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TranslateRepository {

    //메모리 기반 DB를 Map으로 구현한다.
    private static Map<Long, Translate> translateMap = new HashMap<>();
    private static long sequence = 0L; //0, 1, 2... 이렇게 key 값을 생성해준다.

    /* 저장하기 위한 메서드*/
    public Translate save(Translate translate) {
        translate.setId(++sequence); //ID를 지정해준다.
        translateMap.put(translate.getId(), translate); //map에 저장(DB 대체용)
        return translate;
    }

    /*찾기 위한 메서드*/
    public List<Translate> findAll() {
        return new ArrayList<>(translateMap.values()); //편리성을 위해서 List 형식으로 변환
    }
}
