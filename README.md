# 이음노리 서버

## 스택
- Java 17 + Kotlin
- SpringBoot 3.3.8
- PostgreSQL, MongoDB


## dev
### branch
```shell
main: 운영계 배포 버전
develop: 개발계 배포 버전
x.x.x: 개발 중 버전
feat/xxxx: 기능 개발 버전
```
### docker-compose
```shell
docker-compose --env-file .env.local up -d
```