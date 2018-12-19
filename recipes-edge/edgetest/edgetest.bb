LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "https://github.com/ClearBlade/Edge/releases/download/4.3.4/edge-darwin-amd64.tar.gz;subdir=${BP}"
SRC_URI[md5sum] = "8dab72b5bb9d176949c437b38a2cd77e"
SRC_URI[sha256sum] = "696b403e296c323abea4bdf9e73749d72415689805ab287cd0b746995b87ce9f"

FILES_${PN} = "/"
do_install() {
	install -d ${D}/usr/local/bin
	install -m 0755 ${S}/edge ${D}/usr/local/bin
}
