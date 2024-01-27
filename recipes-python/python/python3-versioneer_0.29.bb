SUMMARY = "Easy VCS-based management of project version strings"
HOMEPAGE = "https://github.com/python-versioneer/python-versioneer"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f4c62131f879a8445e16a7f265aea635"

SRC_URI[sha256sum] = "5ab283b9857211d61b53318b7c792cf68e798e765ee17c27ade9f6c924235731"

PYPI_PACKAGE = "versioneer"
PIP_INSTALL_PACKAGE = "versioneer"
inherit python_setuptools_build_meta pypi

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

BBCLASSEXTEND = "native nativesdk"

