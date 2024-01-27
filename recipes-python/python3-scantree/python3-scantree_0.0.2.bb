SUMMARY = "Flexible recursive directory iterator"
HOMEPAGE = "https://github.com/andhus/scantree"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb3640b011d154584a9f7c03a619279d"

DEPENDS = "\
    python3-versioneer-native \
"
SRC_URI[sha256sum] = "e64bab9db8a5c58823b9b9e74512db02f4ee7014d2d0f5e2f20925ba8f49293b"

PYPI_PACKAGE = "scantree"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-versioneer \
"

