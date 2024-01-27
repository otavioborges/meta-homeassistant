SUMMARY = "a toolset to deeply merge python dictionaries."
HOMEPAGE = "http://deepmerge.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5461efe2d19ce359c7d72d7be3c05e1c"

DEPENDS = "\
    python3-cython-native \
    python3-setuptools-scm-native \
"
SRC_URI[sha256sum] = "53a489dc9449636e480a784359ae2aab3191748c920649551c8e378622f0eca4"

PYPI_PACKAGE = "deepmerge"
inherit python_setuptools_build_meta pypi

