clean:
	rm -rf out/
	rm -rf build/

versioncheck:
	./gradlew dependencyUpdates
