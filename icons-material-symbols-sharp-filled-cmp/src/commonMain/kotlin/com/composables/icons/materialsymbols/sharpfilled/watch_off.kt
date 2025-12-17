package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Watch_off: ImageVector
    get() {
        if (_Watch_off != null) return _Watch_off!!
        
        _Watch_off = ImageVector.Builder(
            name = "watch_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(638f, 750f)
                lineTo(600f, 880f)
                horizontalLineTo(360f)
                lineToRelative(-54f, -181f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -124f)
                quadToRelative(0f, -36f, 9f, -69.5f)
                reflectiveQuadToRelative(26f, -63.5f)
                lineTo(56f, 168f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 680f)
                quadToRelative(20f, 0f, 38f, -3.5f)
                reflectiveQuadToRelative(35f, -10.5f)
                lineTo(294f, 407f)
                quadToRelative(-7f, 17f, -10.5f, 35f)
                reflectiveQuadToRelative(-3.5f, 38f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(247f, -68f)
                lineToRelative(-60f, -60f)
                quadToRelative(7f, -17f, 10f, -34.5f)
                reflectiveQuadToRelative(3f, -37.5f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -37.5f, 3f)
                reflectiveQuadTo(408f, 293f)
                lineToRelative(-86f, -86f)
                lineToRelative(38f, -127f)
                horizontalLineToRelative(240f)
                lineToRelative(54f, 181f)
                quadToRelative(48f, 38f, 77f, 95f)
                reflectiveQuadToRelative(29f, 124f)
                quadToRelative(0f, 36f, -8f, 69f)
                reflectiveQuadToRelative(-25f, 63f)
                close()
            }
        }.build()
        
        return _Watch_off!!
    }

private var _Watch_off: ImageVector? = null

