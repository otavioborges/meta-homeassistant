SUMMARY = "GitPython is a Python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5279a7ab369ba336989dcf2a107e5c8e"

SRC_URI[sha256sum] = "22b126e9ffb671fdd0c129796343a02bf67bf2994b35449ffc9321aa755e18a4"

PYPI_PACKAGE = "GitPython"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-gitdb \
    ${PYTHON_PN}-typing-extensions \
"
