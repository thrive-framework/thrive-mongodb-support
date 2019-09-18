# thrive-mongodb-support

This will be filled. Right now I do the work, I'll write readme later.

Basically, all that is needed to work with Mongo through Thrive Framework.

## Note to self

I don't really know where to write that down, but it's useful knowledge.

If I have default and profile in application.yml here and use it in external project, then:
- if I don't overwrite ANY of the props defined here (like spring.data.mongodb.host)
- no surprise, values from this repo are used
- if I overwrite some of these props in project-specific application.yml without profile, then:
-  if no profile is used - these project specific values are used
- if a profile defined in this repo is used (like local) - it is not found!