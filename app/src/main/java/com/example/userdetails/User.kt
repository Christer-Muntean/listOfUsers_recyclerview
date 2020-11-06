package com.example.userdetails

import java.io.Serializable

class User(val name: String, val email: String, val profileImageUrl: String, val jobTitle: String) : Serializable {
}
