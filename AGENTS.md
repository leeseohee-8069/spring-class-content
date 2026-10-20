# Task: Spring boot 프로젝트 생성

다음 스펙으로 Spring boot Maven 프로젝트 생성:

* Group: com.yonsai
* Artifact: Day66_20260903
* Java 17
* Spring Boot 4.0.7
* Dependencies: web, devtools, thymeleaf, lombok

```bash
curl.exe "https://start.spring.io/starter.zip?type=maven-project&groupId=com.yonsai&artifactId=Day66_20260903&name=Day66_20260903&javaVersion=17&bootVersion=4.0.7&dependencies=web,devtools,thymeleaf,lombok,spring-ai-openai" -o project.zip

mkdir Day66_20260903
tar -xf project.zip -C Day66_20260903
rm project.zip
```
