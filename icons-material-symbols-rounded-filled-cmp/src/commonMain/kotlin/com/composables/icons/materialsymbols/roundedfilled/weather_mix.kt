package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Weather_mix: ImageVector
    get() {
        if (_Weather_mix != null) return _Weather_mix!!
        
        _Weather_mix = ImageVector.Builder(
            name = "weather_mix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17f)
                reflectiveQuadTo(440f, 861f)
                quadToRelative(0f, -12f, 4.5f, -23f)
                reflectiveQuadToRelative(13.5f, -19f)
                lineToRelative(28f, -26f)
                quadToRelative(6f, -5f, 14f, -5f)
                reflectiveQuadToRelative(14f, 5f)
                lineToRelative(28f, 26f)
                quadToRelative(9f, 8f, 13.5f, 19f)
                reflectiveQuadToRelative(4.5f, 23f)
                quadToRelative(0f, 25f, -17.5f, 42f)
                reflectiveQuadTo(500f, 920f)
                close()
                moveToRelative(-159f, -81f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                lineToRelative(76f, -76f)
                quadToRelative(9f, -9f, 21f, -9f)
                reflectiveQuadToRelative(21f, 9f)
                quadToRelative(9f, 9f, 9f, 21f)
                reflectiveQuadToRelative(-9f, 21f)
                lineToRelative(-76f, 76f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-21f, -9f)
                close()
                moveToRelative(265f, -53f)
                lineToRelative(-32f, -32f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(32f, -32f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(32f, 32f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                close()
                moveToRelative(-300f, -32f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-32f, -32f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(32f, -32f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(32f, 32f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                close()
                moveToRelative(-6f, -114f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -83f, 55f, -145f)
                reflectiveQuadToRelative(136f, -73f)
                quadToRelative(32f, -57f, 87.5f, -89.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(90f, 0f, 156.5f, 57.5f)
                reflectiveQuadTo(717f, 281f)
                quadToRelative(69f, 6f, 116f, 57f)
                reflectiveQuadToRelative(47f, 122f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 640f)
                horizontalLineTo(300f)
                close()
            }
        }.build()
        
        return _Weather_mix!!
    }

private var _Weather_mix: ImageVector? = null

