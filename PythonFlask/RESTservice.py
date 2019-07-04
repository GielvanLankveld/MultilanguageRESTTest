from flask import Flask, jsonify

app = Flask(__name__)

ping = [
	{
		"id": 1,
		"content": "Ping"
	}
]

@app.route("/ping")
def Ping():
	return jsonify(ping);
	
if __name__ == "__main__":
	app.run()