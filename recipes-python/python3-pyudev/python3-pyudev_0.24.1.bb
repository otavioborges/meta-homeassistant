SUMMARY = "A libudev binding"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rst;md5=1bacf33a4675eb72377765bf627ee61e"

SRC_URI[sha256sum] = "75e54d37218f5ac45b0da1f0fd9cc5e526a3cac3ef1cfad410cf7ab338b01471"

PYPI_PACKAGE = "pyudev"

inherit pypi python_setuptools_build_meta setuptools3
