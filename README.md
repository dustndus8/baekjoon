# BAEKJOON
백준 알고리즘

## 폴더에서 git bash

- 1. 폴더(ex 1단계폴더)에서 txt 파일 만들기
- 2. 코드 복사해서 넣고 .java 로 저장
- 3. .git 있는 곳에서 git bash 열기
- 4. git add .
- 5. git commit -m "feat: ~"
- 6. git push

##  Intellij 터미널에서 git 할 경우

- 1. git checkout main으로 이동
- 2. git branch hw(n) 만들기
- 3. git checkout hw(n)로 이동
- 4. 폴더 만들고 파일 생성
- 5. git add .
- 6. git commit -m "~~"
- 7. git push origin hw(n)

## 브랜치 생성과 동시에 체크아웃

git checkout -b <브랜치명>

## 브랜치 삭제

- git push origin --delete <삭제할브랜치이름>
또는
- git branch -d <삭제할브랜치이름>
- git push origin <삭제할브랜치이름>
