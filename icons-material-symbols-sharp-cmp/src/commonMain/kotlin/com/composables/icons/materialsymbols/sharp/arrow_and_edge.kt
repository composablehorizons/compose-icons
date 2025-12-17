package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrow_and_edge: ImageVector
    get() {
        if (_Arrow_and_edge != null) return _Arrow_and_edge!!
        
        _Arrow_and_edge = ImageVector.Builder(
            name = "arrow_and_edge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(320f, 680f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-167f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 440f)
                horizontalLineTo(40f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                quadToRelative(36f, 0f, 67f, 14.5f)
                reflectiveQuadToRelative(53f, 39.5f)
                quadToRelative(22f, -25f, 53f, -39.5f)
                reflectiveQuadToRelative(67f, -14.5f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 520f)
                verticalLineToRelative(167f)
                lineToRelative(63f, -63f)
                lineToRelative(57f, 56f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Arrow_and_edge!!
    }

private var _Arrow_and_edge: ImageVector? = null

