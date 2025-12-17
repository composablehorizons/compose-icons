package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Emoji_food_beverage: ImageVector
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
                moveToRelative(160f, -160f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(400f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveTo(560f, 600f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 520f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(16f)
                lineToRelative(72f, 58f)
                quadToRelative(2f, 2f, 8f, 16f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(300f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -2f, 8f, -16f)
                lineToRelative(72f, -58f)
                verticalLineToRelative(-16f)
                horizontalLineTo(240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 600f)
                horizontalLineToRelative(240f)
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

