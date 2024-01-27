SUMMARY = "Python module and CLI for hashing of file system directories."
HOMEPAGE = "https://github.com/andhus/dirhash-python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb3640b011d154584a9f7c03a619279d"

SRC_URI[sha256sum] = "31bf8192fbb6e09a2a7ff4de31b9eb127c58545af22125ca1fa67c91c8e2d898"

PYPI_PACKAGE = "dirhash"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-scantree \
"
