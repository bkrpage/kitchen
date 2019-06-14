package dev.bradleypage.kitchen.core.domain.controller

import dev.bradleypage.kitchen.core.domain.model.RecipeItem
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController{
    @GetMapping("/")
    fun home() = RecipeItem(ObjectId.get(), "Test Recipe Item", null, null, 1.0, null)
}