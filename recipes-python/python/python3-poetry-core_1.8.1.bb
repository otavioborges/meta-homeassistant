SUMMARY = "Poetry PEP 517 Build Backend"
HOMEPAGE = "https://python-poetry.org/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c39cfd009863ae44237a7ab1f9cedc"

SRC_URI[sha256sum] = "67a76c671da2a70e55047cddda83566035b701f7e463b32a2abfeac6e2a16376"

PYPI_PACKAGE = "poetry_core"
inherit python_setuptools_build_meta pypi

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

BBCLASSEXTEND = "native nativesdk"

