#!/bin/bash

M2_REPO=~/.m2/repository
HBM_SRC_DEP=/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final-sources.jar

j2objc -sourcepath ${M2_REPO}/${HBM_SRC_DEP} \
       -d target/j2objc-generated \
       src/main/java/com/mgl/j2objctests/JpaEntityTest.java

exit $?

