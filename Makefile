define green
	@tput setaf 2; echo $1; tput sgr0;
endef

.PHONY: run
run: 
	lein figwheel

.PHONY: update
update: clean
	wget -P tmp/ -rpk http://localhost:3449/index.html --content-on-error
	cd tmp/; mv localhost:3449/ ../docs/
	cp ./google98adc5a61a6c45f5.html ./docs/
	git add -A
	$(call green,"[Upped]")


.PHONY: clean
clean:
	rm -Rf docs/

