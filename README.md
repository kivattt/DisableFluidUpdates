# DisableFluidUpdates
- Disables water/lava updates

This mod was made for cleaning up water placed on sky island clouds.\
If there is too much water, there will be too many water updates causing immense server lag.\
Stop your server, install this mod, and you will be free to clean up the mess (See below) without lagging the server!

# Commands
`//replacereal <old block id> <new block id>` (OP-only) \
This is just the FoxLoader `//replace` command, but with no size limit

There is no built-in toggling in this mod, you'll have to just add and delete the file from your `mods` folder manually.

## Note about `//replace` & `//replacereal`
After you've selected an area with a wooden axe as OP in creative mode, type
`//replacereal 8 0` To remove flowing water blocks\
`//replacereal 9 0` To remove stationary water blocks

You will have to do both of these twice (or more) for some reason.\
(Doing it only once can leave a weird checkerboard pattern of water blocks remaining)

**You have to be near the blocks you're removing to remove them, they have to be in loaded chunk(s)!**