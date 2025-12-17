package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Emoji_food_beverage: ImageVector
    get() {
        if (_Emoji_food_beverage != null) return _Emoji_food_beverage!!
        
        _Emoji_food_beverage = ImageVector.Builder(
            name = "emoji_food_beverage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -480f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
                moveToRelative(480f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-80f, 280f)
                verticalLineToRelative(-400f)
                horizontalLineTo(400f)
                verticalLineToRelative(16f)
                lineToRelative(80f, 64f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                verticalLineToRelative(-200f)
                lineToRelative(80f, -64f)
                verticalLineToRelative(-16f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                close()
                moveTo(360f, 200f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Emoji_food_beverage!!
    }

private var _Emoji_food_beverage: ImageVector? = null

