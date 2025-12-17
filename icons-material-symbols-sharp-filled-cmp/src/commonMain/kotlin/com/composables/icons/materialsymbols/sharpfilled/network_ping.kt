package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Network_ping: ImageVector
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
                moveTo(160f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(260f)
                lineTo(80f, 300f)
                lineToRelative(56f, -56f)
                lineToRelative(344f, 343f)
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
                horizontalLineToRelative(260f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Network_ping!!
    }

private var _Network_ping: ImageVector? = null

