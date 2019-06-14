package dev.bradleypage.kitchen.core.domain.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class RecipeItem(
        val _id : ObjectId,
        val name: String,
        val description: String?,
        val packaging : ItemPackaging?,
        val amount : Double,
        val unit : QuantityUnit?
)

data class ItemPackaging(
        val packagingType : PackagingType,
        val amount : Double,
        val unit : QuantityUnit
)

//Can, bottle, jar, etc.
data class PackagingType(
        val _id : ObjectId,
        val name : String
)

// gram(g), Millilitre (ml), etc
data class QuantityUnit(
        val _id : ObjectId,
        val name : String,
        val symbol : String
)