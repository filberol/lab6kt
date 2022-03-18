package lab5.data.commands

import lab5.data.annotations.ServerCommand
import lab5.data.utilities.CollectionManager
import lab5.data.utilities.LanguageManager

/**
 * Removes collection element by its ID
 */
@ServerCommand
class RemoveByID(
    private val language: LanguageManager,
    private val collection: CollectionManager
): AbstractCommand(language) {
    fun execute(arguments: ArrayList<String>) {
        if (arguments.isNotEmpty()) {
            collection.deleteByID(arguments[0].toInt())
            println(language getString "Done")
        } else {
            println(language getString "NotEnoughArgs")
        }
    }
}