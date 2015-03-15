#!/bin/bash

M2_REPO=~/.m2/repository

LOMBOK_DEP=org/projectlombok/lombok/1.16.2/lombok-1.16.2.jar

j2objc.lombok -begin-java-args -javaagent:${M2_REPO}/${LOMBOK_DEP} -end-java-args \
       -classpath ${M2_REPO}/${LOMBOK_DEP} \
       -d target/j2objc-generated \
       src/main/java/com/mgl/j2objctests/LombokTest.java

exit $?

