SUMMARY = "Python client for Sentry (https://sentry.io)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=03dc788d9a9486be5e6a1d99c2c1ce3a"

SRC_URI[sha256sum] = "24c83b0b41c887d33328a9166f5950dc37ad58f01c9f2fbff6b87a6f1094170c"

PYPI_PACKAGE = "sentry-sdk"

inherit pypi python_setuptools_build_meta setuptools3
