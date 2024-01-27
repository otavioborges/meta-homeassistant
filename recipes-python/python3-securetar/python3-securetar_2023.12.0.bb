SUMMARY = "Python module to handle tarfile backups."
HOMEPAGE = "https://github.com/pvizeli/securetar"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "ff400fded51af01ad9f7a24165897d630a145a65bcf3b74d4079ed79407d1f89"

PYPI_PACKAGE = "securetar"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-cryptography \
"
