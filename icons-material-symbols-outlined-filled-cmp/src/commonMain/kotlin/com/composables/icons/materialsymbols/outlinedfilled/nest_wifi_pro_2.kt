package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_wifi_pro_2: ImageVector
    get() {
        if (_Nest_wifi_pro_2 != null) return _Nest_wifi_pro_2!!
        
        _Nest_wifi_pro_2 = ImageVector.Builder(
            name = "nest_wifi_pro_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(280f, -360f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -95f, -53f, -167f)
                reflectiveQuadToRelative(-149f, -73f)
                quadToRelative(-16f, 0f, -27f, 12f)
                reflectiveQuadToRelative(-11f, 29f)
                quadToRelative(0f, 17f, 12f, 28f)
                reflectiveQuadToRelative(29f, 11f)
                quadToRelative(57f, 0f, 87.5f, 49.5f)
                reflectiveQuadTo(600f, 481f)
                quadToRelative(0f, 17f, 11.5f, 28f)
                reflectiveQuadToRelative(28.5f, 11f)
                close()
            }
        }.build()
        
        return _Nest_wifi_pro_2!!
    }

private var _Nest_wifi_pro_2: ImageVector? = null

