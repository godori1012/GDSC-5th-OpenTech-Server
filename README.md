# 🚀 GET과 POST API로 우주를 여행하는 외계인과 통신
GDSC 5th기의 Open Tech Seminar 백엔드 세션용 레포지토리입니다.
이 레포지토리에서는 간단하게 GET과 POST API를 만들어 외계인과 통신하는 방법을 배웁니다.


## 🎯 Goals
이 실습의 목표는 다음과 같습니다.
1. Spring MVC 이해하기
2. Controller 코드 작성하기
3. API 이해하기
4. RestController 코드 작성하기


## ☑️ To-Do List
### BasicController.java 수정
"/" 경로에 대한 GET 요청에는 모든 "외계인어-지구인어" 리스트가 index.html로 반환되도록,
"/translate"경로에 대한 POST 요청에는 새로운 "외계인어-지구인어"가 DB에 저장되도록 만들어주세요.
```java
@GetMapping("/")
public String getTranslates(Model model){
    //모든 "외계인어-지구인어" 리스트 가져오기
}

@PostMapping("/translate")
public String translateAlien(Model model, TranslateForm form) {
    //새로운 "외계인어-지구인어" 번역 만들기
}
```


### Swagger UI 활성화
SwaggerConfig.java의 주석을 해제하고, application.yml의 주석을 해제해주세요.
위에서 만들었던 BasicController.java를 전체 주석처리하고, AdvancedController.java의 주석을 해제해 새로운 컨트롤러를 만듭니다.


### AdvancedController.java 수정
BasicController와 기본적인 로직은 같지만, RestController로 변경해 데이터를 조회/저장 가능하도록 만들어주세요.
```java
@GetMapping("/")
public CommonResponse<List<Translate>> getTranslates(){
    //모든 "외계인어-지구인어" 리스트 가져오기
}

@PostMapping("/translate")
@Operation(summary = "외계인 번역 포스트", description = "외계어와 한국어 번역을 포스트하는 API 입니다.")
public CommonResponse<Translate> translateAlien(@RequestBody Translate translate) {
    //새로운 "외계인어-지구인어" 번역 만들기
}
```


## 🖥️ Result
### 완성된 로직-BasicController
![BasicController 로직](https://github.com/JeonHaeseung/GDSC-5th-OpenTech-Server/assets/89632139/03720891-da37-48c5-a842-3b489387e1e4)
![BasicController 로직](https://github.com/JeonHaeseung/GDSC-5th-OpenTech-Server/assets/89632139/04571850-c673-4477-87c1-1d88aa114d81)

### 완성된 로직-AdvancedController
![AdvancedController 로직](https://github.com/JeonHaeseung/GDSC-5th-OpenTech-Server/assets/89632139/e8ca724c-c09d-4ded-b9dc-e5028c90b39d)

