from flask_sqlalchemy import SQLAlchemy
from flask_login import UserMixin

db = SQLAlchemy()

class User(UserMixin, db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(100), unique=True)
    password = db.Column(db.String(100))
    role = db.Column(db.String(20))  # owner, party, employee
    units = db.Column(db.Float, default=1)
    balance = db.Column(db.Float, default=0)

class Trip(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    total_amount = db.Column(db.Float)
    owner_percent = db.Column(db.Float)
    expenses = db.Column(db.Float)
