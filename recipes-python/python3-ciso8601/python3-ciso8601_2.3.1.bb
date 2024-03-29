SUMMARY = "Fast ISO8601 date time parser for Python written in C"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=650b6b7ede4fbd14ab012aceb71d69d7"

SRC_URI[sha256sum] = "3212c7ffe5d8080270548b5f2692ffd2039683b6628a8d2ad456122cc5793c4c"

PYPI_PACKAGE = "ciso8601"

inherit pypi python_setuptools_build_meta setuptools3
