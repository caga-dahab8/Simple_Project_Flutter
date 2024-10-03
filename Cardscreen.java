import 'package:flutter/material.dart';

class Cardscreen extends StatelessWidget {
  const Cardscreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: const Icon(
          Icons.menu,
          size: 25,
          color: Colors.white,
        ),
        title: const Center(
          child: Text(
            "Global Design",
            style: TextStyle(fontSize: 22, color: Colors.white),
          ),
        ),
        actions: const [
          Icon(
            Icons.more_vert,
            size: 25,
            color: Colors.white,
          )
        ],
        backgroundColor: Colors.red,
      ),
      body: Column(
        children: [
          Image.asset(
            "img/background.jpg",
            height: 300,
            width: 450,
            fit: BoxFit.cover,
          ),
          const Row(
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            children: [
              Padding(
                padding: EdgeInsets.only(top: 10),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      "Keymaha duleedka Baladweyne",
                      style:
                          TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                    ),
                    Text(
                      "Mogadishu Somalia",
                      style: TextStyle(fontSize: 18),
                    ),
                  ],
                ),
              ),
              Padding(
                padding: EdgeInsets.only(top: 20),
                child: Row(
                  crossAxisAlignment: CrossAxisAlignment.end,
                  children: [
                    Icon(
                      Icons.favorite,
                      size: 40,
                      color: Colors.red,
                    ),
                    Text(
                      "22",
                      style: TextStyle(
                        fontSize: 18,
                      ),
                    ),
                  ],
                ),
              ),
            ],
          ),
          const Padding(
            padding: EdgeInsets.only(top: 25),
            child: Divider(
              color: Colors.black,
              thickness: 0.5,
            ),
          ),
          const Padding(
            padding: EdgeInsets.only(top: 80),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: [
                Column(
                  children: [
                    Icon(
                      Icons.call,
                      size: 30,
                      color: Colors.red,
                    ),
                    Padding(
                      padding: EdgeInsets.only(top: 5),
                      child: Text(
                        "CALL",
                        style: TextStyle(fontSize: 20, color: Colors.red),
                      ),
                    )
                  ],
                ),
                Column(
                  children: [
                    Icon(
                      Icons.send,
                      size: 30,
                      color: Colors.red,
                    ),
                    Padding(
                      padding: EdgeInsets.only(top: 5),
                      child: Text(
                        "ROUTE",
                        style: TextStyle(fontSize: 20, color: Colors.red),
                      ),
                    ),
                  ],
                ),
                Column(
                  children: [
                    Icon(
                      Icons.share_rounded,
                      size: 30,
                      color: Colors.red,
                    ),
                    Padding(
                      padding: EdgeInsets.only(top: 5),
                      child: Text(
                        "SHERE",
                        style: TextStyle(fontSize: 20, color: Colors.red),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
      Container(
            height: 300,
            child: const Padding(
              padding: EdgeInsets.all(16),
              child: SingleChildScrollView(
                child: Text(
                  "A forest is oute icon similar to the one in your image, you can use Flutter's Icons class. The route icon is typically reprea vast, you can use the Divider widget for horizontal lines and the VerticalDivider widget for vertical lines. Here's how you can implement bothdense area dominated by trees, encompassing a rich variety of ecosystems that support diverse life forms. Covering about one-third of the Earth’s land surface, forests are vital to both ecological balance and human existence. These ecosystems range from tropical rainforests near the equator to temperate forests and boreal forests in higher latitudes, each with its unique climate, vegetation, and biodiversity",
                  style: TextStyle(fontSize: 18),
                ),
              ),
            ),
          )
        ],
      ),
      floatingActionButton: const FloatingActionButton(
        onPressed: null,
        backgroundColor: Colors.red,
        child: Text(
          "+",
          style: TextStyle(fontSize: 30, color: Colors.white),
        ),
      ),
    );
  }
}