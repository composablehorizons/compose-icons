package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Network_ping: ImageVector
    get() {
        if (_Network_ping != null) return _Network_ping!!
        
        _Network_ping = ImageVector.Builder(
            name = "network_ping",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(220f)
                lineTo(108f, 328f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(108f, 272f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(316f, 315f)
                lineToRelative(208f, -208f)
                quadToRelative(-4f, -9f, -6f, -18.5f)
                reflectiveQuadToRelative(-2f, -20.5f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                quadToRelative(-9f, 0f, -17.5f, -1.5f)
                reflectiveQuadTo(746f, 434f)
                lineTo(540f, 640f)
                horizontalLineToRelative(220f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Network_ping!!
    }

private var _Network_ping: ImageVector? = null

