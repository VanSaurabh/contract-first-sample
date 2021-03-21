#!/usr/bin/env bash

build_java() {
  profile=$1; service=$2
  echo "building java packages: $profile $servicename"
  (
    ./mvnw -N -q -P "$profile" clean generate-resources \
      "-DartifactName=$service" \
      "-Dmaven.test.skip=true" \
      || { echo "cannot generate source code"; exit 0; }
    (
      cd "target/generated-sources/java" || { echo "cannot cd to client library generated sources folder"; exit 1; }
      ../../../mvnw -Dmaven.test.skip=true -q clean install
    ) || exit 0;
  ) || exit 0
}

in src/main/resources/*.yaml
  servicename=products
  build_java client-code "$servicename"
  build_java server-code "$servicename"
