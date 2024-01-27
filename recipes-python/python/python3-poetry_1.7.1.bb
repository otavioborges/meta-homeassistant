SUMMARY = "Python dependency management and packaging made easy."
HOMEPAGE = "https://python-poetry.org/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1facaac5bbfd8cfb94a95185e366c42"

DEPENDS = "\
    python3-poetry-core-native \
"
SRC_URI[sha256sum] = "b348a70e7d67ad9c0bd3d0ea255bc6df84c24cf4b16f8d104adb30b425d6ff32"

PYPI_PACKAGE = "poetry"
inherit python_setuptools_build_meta pypi

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

BBCLASSEXTEND = "native nativesdk"

