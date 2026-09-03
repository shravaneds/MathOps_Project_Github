# bitbucket-java-project

A minimal Java/Maven project for testing Bitbucket integration.

## Build & Run
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.bitbucket.BitbucketApp"
```

## Git + Bitbucket setup
```bash
cd bitbucket-java-project
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://bitbucket.org/<your-workspace>/<your-repo>.git
git push -u origin main
```
