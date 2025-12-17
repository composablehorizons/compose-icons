package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Weather_hail: ImageVector
    get() {
        if (_Weather_hail != null) return _Weather_hail!!
        
        _Weather_hail = ImageVector.Builder(
            name = "weather_hail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 920f)
                lineToRelative(-60f, -60f)
                lineToRelative(60f, -60f)
                lineToRelative(60f, 60f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(-138f, -60f)
                lineToRelative(-42f, -42f)
                lineToRelative(118f, -118f)
                lineToRelative(42f, 42f)
                lineToRelative(-118f, 118f)
                close()
                moveToRelative(258f, -60f)
                lineToRelative(-60f, -60f)
                lineToRelative(60f, -60f)
                lineToRelative(60f, 60f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(-360f, 0f)
                lineToRelative(-60f, -60f)
                lineToRelative(60f, -60f)
                lineToRelative(60f, 60f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(40f, -160f)
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
        
        return _Weather_hail!!
    }

private var _Weather_hail: ImageVector? = null

