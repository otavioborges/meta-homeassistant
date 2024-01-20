SUMMARY = "Python wrapper module around the OpenSSL library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "6b2cba5cc46e822750ec3e5a81ee12819850b11303630d575e98108a079c2b12"

PYPI_PACKAGE = "pyOpenSSL"

inherit pypi python_setuptools_build_meta setuptools3
