package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wifi_2_bar: ImageVector
    get() {
        if (_Wifi_2_bar != null) return _Wifi_2_bar!!
        
        _Wifi_2_bar = ImageVector.Builder(
            name = "wifi_2_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(254f, 614f)
                lineToRelative(-84f, -86f)
                quadToRelative(59f, -59f, 138.5f, -93.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(92f, 0f, 171.5f, 35f)
                reflectiveQuadTo(790f, 530f)
                lineToRelative(-84f, 84f)
                quadToRelative(-44f, -44f, -102f, -69f)
                reflectiveQuadToRelative(-124f, -25f)
                quadToRelative(-66f, 0f, -124f, 25f)
                reflectiveQuadToRelative(-102f, 69f)
                close()
            }
        }.build()
        
        return _Wifi_2_bar!!
    }

private var _Wifi_2_bar: ImageVector? = null

