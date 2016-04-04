package brosync.communications

enum ReplyStatus {
   OK(definition: 'The command was processed successfully.'),
   DATABASE_ERROR(definition: 'The command failed because of a database-level error.')

   String definition

   @Override
   def String toString() {
      "${this.name()}: ${this.definition}"
   }
}
