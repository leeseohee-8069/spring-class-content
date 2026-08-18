# Task: Spring boot 프로젝트 생성

다음 스펙으로 Spring boot Maven 프로젝트 생성:
- Group: com.yonsai / Artifact: Day60_20260818
- Java 17 / Spring Boot 4.0.7
- Dependencies: web, devtools , thymeleaf

```powershell
curl.exe "https://start.spring.io/starter.zip?type=maven-project&groupId=com.yonsai&artifactId=Day60_20260818&name=Day60_20260818&javaVersion=17&bootVersion=4.0.7&dependencies=web,devtools,thymeleaf" -o project.zip
mkdir Day60_20260818
tar -xf project.zip -C Day60_20260818
rm project.zip
```

**검증**: `Day60_20260818/pom.xml`, `Day60_20260818/src` 존재 확인