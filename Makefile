SUBDIRS := Python Haskell Go Scala OCaml Rust
.PHONY: all $(SUBDIRS) clean
all: $(SUBDIRS)

$(SUBDIRS):
	$(MAKE) -C $@ $(MAKECMDGOALS)

test: $(SUBDIRS)
clean: $(SUBDIRS)
