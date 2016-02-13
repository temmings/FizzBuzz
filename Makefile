SUBDIRS := Python Haskell Go Scala
.PHONY: all $(SUBDIRS) clean
all: $(SUBDIRS)

$(SUBDIRS):
	$(MAKE) -C $@ $(MAKECMDGOALS)

test: $(SUBDIRS)
clean: $(SUBDIRS)
