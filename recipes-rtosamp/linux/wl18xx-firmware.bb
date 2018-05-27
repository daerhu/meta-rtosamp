DESCRIPTION = "Firmware files for use with TI wl18xx"
LICENSE = "TI-TSPA"
LIC_FILES_CHKSUM = "file://LICENCE;md5=4977a0fe767ee17765ae63c435a32a9e"

inherit allarch

PV = "R8.6+git${SRCPV}"
PR = "r7"

PROVIDES += "wl12xx-firmware"
RPROVIDES_${PN} += "wl12xx-firmware"
RREPLACES_${PN} += "wl12xx-firmware"
RCONFLICTS_${PN} += "wl12xx-firmware"

SRCREV = "ad6b6e9fa75c5585297111de379a595670391342"
BRANCH = "ap_dfs"
SRC_URI = "git://git.ti.com/wilink8-wlan/wl18xx_fw.git;protocol=git;branch=${BRANCH}"
FILES_${PN} = "/lib/firmware/ti-connectivity/*"
S = "${WORKDIR}/git"

CLEANBROKEN = "1"

do_compile() {
    :
}

do_install() {
    install -d ${D}/lib/firmware/ti-connectivity
    install -m 0755 -D ${S}/*.bin ${D}/lib/firmware/ti-connectivity
}
