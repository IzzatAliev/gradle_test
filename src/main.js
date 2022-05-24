var Main = /** @class */ (function () {
    function Main() {
    }
    Main.prototype.generateComputer = function () {
        var set = new Set();
        for (var i = 0; i < 10; i++) {
            var computer = new Computer(1, "BMW");
            set.add(computer);
        }
        console.log(set);
    };
    return Main;
}());
var Computer = /** @class */ (function () {
    function Computer(_id, _name) {
        this.id = _id;
        this.name = _name;
    }
    return Computer;
}());
