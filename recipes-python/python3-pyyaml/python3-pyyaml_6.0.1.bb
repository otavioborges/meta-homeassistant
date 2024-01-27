SUMMARY = "YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

DEPENDS = "\
    python3-cython-native \
"
SRC_URI[sha256sum] = "bfdf460b1736c775f2ba9f6a92bca30bc2095067b8a9d77876d1fad6cc3b4a43"

PYPI_PACKAGE = "PyYAML"
inherit python_setuptools_build_meta pypi

