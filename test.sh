#!/bin/bash

set -o errexit
set -o noglob
set -o nounset
set -o pipefail

mvn clean compile test
