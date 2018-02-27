<?php


use Phinx\Migration\AbstractMigration;

class CreateActivityTable extends AbstractMigration
{
    /**
     * Change Method.
     *
     * Write your reversible migrations using this method.
     *
     * More information on writing migrations is available here:
     * http://docs.phinx.org/en/latest/migrations.html#the-abstractmigration-class
     *
     * The following commands can be used in this method and Phinx will
     * automatically reverse them when rolling back:
     *
     *    createTable
     *    renameTable
     *    addColumn
     *    renameColumn
     *    addIndex
     *    addForeignKey
     *
     * Remember to call "create()" or "update()" and NOT "save()" when working
     * with the Table class.
     */
    public function change()
    {
        $table = $this->table('directus_activity');

        $table->addColumn('type', 'string', [
            'limit' => 45,
            'null' => false
        ]);

        $table->addColumn('action', 'string', [
            'limit' => 45,
            'null' => false
        ]);

        $table->addColumn('user', 'integer', [
            'signed' => false,
            'null' => false,
            'default' => 0
        ]);

        $table->addColumn('datetime', 'datetime', [
            'default' => null
        ]);

        $table->addColumn('ip', 'string', [
            'limit' => 50,
            'default' => null
        ]);

        $table->addColumn('user_agent', 'string', [
            'limit' => 255
        ]);

        $table->addColumn('collection', 'string', [
            'limit' => 64,
            'null' => false
        ]);

        $table->addColumn('item', 'string',[
            'limit' => 255
        ]);

        $table->addColumn('message', 'text', [
            'null' => true
        ]);

        $table->create();
    }
}