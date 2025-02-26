#!/usr/bin/env bash

rm -fr ./src/main/java/io/openweb3/wallet/internal
rm -fr ./src/test/java/io/openweb3/wallet/internal
rm -fr ./src/test/java/io/openweb3/wallet/models
openapi-generator generate -i ./api/openapi.yaml -g java -o ./ -c generator-config.json --additional-properties=library=okhttp-gson
