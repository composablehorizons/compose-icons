package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_damage: ImageVector
    get() {
        if (_Water_damage != null) return _Water_damage!!
        
        _Water_damage = ImageVector.Builder(
            name = "water_damage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 720f)
                verticalLineToRelative(-286f)
                lineToRelative(-80f, 62f)
                quadToRelative(-13f, 10f, -29.5f, 8f)
                reflectiveQuadTo(64f, 488f)
                quadToRelative(-10f, -13f, -7.5f, -29f)
                reflectiveQuadTo(72f, 433f)
                lineToRelative(359f, -276f)
                quadToRelative(22f, -17f, 49f, -17f)
                reflectiveQuadToRelative(49f, 17f)
                lineToRelative(359f, 275f)
                quadToRelative(13f, 10f, 15.5f, 26f)
                reflectiveQuadToRelative(-7.5f, 30f)
                quadToRelative(-10f, 14f, -26f, 15.5f)
                reflectiveQuadToRelative(-30f, -8.5f)
                lineToRelative(-80f, -61f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, -27f, -15f, -57.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-50f, 72f, -65f, 102.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 640f)
                close()
            }
        }.build()
        
        return _Water_damage!!
    }

private var _Water_damage: ImageVector? = null

