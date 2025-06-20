#!/bin/bash

set -o errexit
set -o noglob
set -o nounset
set -o pipefail

mvn compile package
