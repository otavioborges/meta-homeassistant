SUMMARY = "A Python library for the Docker Engine API."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34f3846f940453127309b920eeb89660"

SRC_URI[sha256sum] = "323736fb92cd9418fc5e7133bc953e11a9da04f4483f828b527db553f1e7e5a3"

PYPI_PACKAGE = "docker"

inherit pypi python_setuptools_build_meta setuptools3
