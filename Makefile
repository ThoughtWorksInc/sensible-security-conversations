define green
	@tput setaf 2; echo $1; tput sgr0;
endef

.PHONY: run
run: 
	lein figwheel

.PHONY: update
update: 
	wget -P tmp/ -rpk http://localhost:3449/index.html
	cd tmp/; mv localhost:3449/ ../docs/
	cp google98adc5a61a6c45f5.html ./docs/
	$(call green,"[Upped]")


.PHONY: clean
clean:
	rm -Rf docs/
	git rm -r docs/

