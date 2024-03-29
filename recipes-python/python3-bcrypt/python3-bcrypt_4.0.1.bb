inherit cargo

SUMMARY = "Modern password hashing for your software and your servers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI += " \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bcrypt-pbkdf/0.8.1 \
    crate://crates.io/bcrypt/0.13.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.3 \
    crate://crates.io/blowfish/0.9.1 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cipher/0.4.3 \
    crate://crates.io/cpufeatures/0.2.5 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/digest/0.10.5 \
    crate://crates.io/generic-array/0.14.6 \
    crate://crates.io/getrandom/0.2.7 \
    crate://crates.io/indoc-impl/0.3.6 \
    crate://crates.io/indoc/0.3.6 \
    crate://crates.io/inout/0.1.3 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/libc/0.2.134 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/once_cell/1.15.0 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot_core/0.8.5 \
    crate://crates.io/paste-impl/0.1.18 \
    crate://crates.io/paste/0.1.18 \
    crate://crates.io/pbkdf2/0.10.1 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro2/1.0.46 \
    crate://crates.io/pyo3-build-config/0.15.2 \
    crate://crates.io/pyo3-macros-backend/0.15.2 \
    crate://crates.io/pyo3-macros/0.15.2 \
    crate://crates.io/pyo3/0.15.2 \
    crate://crates.io/quote/1.0.21 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.102 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/unicode-ident/1.0.4 \
    crate://crates.io/unindent/0.1.10 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/zeroize/1.5.7 \
"

SRC_URI[sha256sum] = "27d375903ac8261cfe4047f6709d16f7d18d39b1ec92aaf72af989552a650ebd"

PYPI_PACKAGE = "bcrypt"
CARGO_SRC_DIR = "src/_bcrypt"
inherit pypi python_setuptools_build_meta setuptools3 python_pyo3 setuptools3_rust
