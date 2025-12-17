package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_wifi_pro: ImageVector
    get() {
        if (_Nest_wifi_pro != null) return _Nest_wifi_pro!!
        
        _Nest_wifi_pro = ImageVector.Builder(
            name = "nest_wifi_pro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(360f, 880f)
                quadToRelative(-77f, 0f, -124f, -40f)
                reflectiveQuadToRelative(-73f, -100f)
                quadToRelative(-26f, -61f, -34.5f, -130f)
                reflectiveQuadTo(120f, 481f)
                quadToRelative(0f, -102f, 15.5f, -176.5f)
                reflectiveQuadTo(192f, 179f)
                quadToRelative(41f, -50f, 110f, -74.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(109f, 0f, 178f, 24.5f)
                reflectiveQuadTo(768f, 179f)
                quadToRelative(41f, 51f, 56.5f, 125.5f)
                reflectiveQuadTo(840f, 481f)
                quadToRelative(0f, 60f, -8.5f, 129f)
                reflectiveQuadTo(797f, 740f)
                quadToRelative(-26f, 60f, -73f, 100f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Nest_wifi_pro!!
    }

private var _Nest_wifi_pro: ImageVector? = null

