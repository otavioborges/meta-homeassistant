SUMMARY = "Python package for providing Mozilla's CA Bundle."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11618cb6a975948679286b1211bd573c"

SRC_URI[sha256sum] = "9b469f3a900bf28dc19b8cfbf8019bf47f7fdd1a65a1d4ffb98fc14166beb4d1"

PYPI_PACKAGE = "certifi"

inherit pypi python_setuptools_build_meta setuptools3
