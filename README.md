This repository acts as an MCVE for https://github.com/eclipse/org.aspectj/issues/85.

## Problem #1

Aspects compiled by plain javac to a java library are being woven into target class but there is 
```
Exception in thread "main" java.lang.NoSuchMethodError: pl.example.aspect1.PublicMethodAspect1.aspectOf()Lpl/example/aspect1/PublicMethodAspect1;
        at pl.example.impl.App.main(App.java:12)
``` 
at runtime.

### Steps to reproduce
- clone project
- run `./gradlew -i publishToMavenLocal` at both *aspect1* and *aspect2*
- run `./gradlew -i run` at `impl` project

### Workaround
Using `id "io.freefair.aspectj" version "4.1.6"` plugin for both aspects projects seems to fix the issue.

## Problem #2 (not reproducible)
The original issue that made me create the issue in org.aspectj project is that, at my project, when multiple aspects are being used only the last one is being applied. I still work on that.
