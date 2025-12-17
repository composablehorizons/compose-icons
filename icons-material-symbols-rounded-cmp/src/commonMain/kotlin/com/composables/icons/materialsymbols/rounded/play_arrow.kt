package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Play_arrow: ImageVector
    get() {
        if (_Play_arrow != null) return _Play_arrow!!
        
        _Play_arrow = ImageVector.Builder(
            name = "play_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 687f)
                verticalLineToRelative(-414f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(5f, 0f, 10.5f, 1.5f)
                reflectiveQuadTo(381f, 239f)
                lineToRelative(326f, 207f)
                quadToRelative(9f, 6f, 13.5f, 15f)
                reflectiveQuadToRelative(4.5f, 19f)
                quadToRelative(0f, 10f, -4.5f, 19f)
                reflectiveQuadTo(707f, 514f)
                lineTo(381f, 721f)
                quadToRelative(-5f, 3f, -10.5f, 4.5f)
                reflectiveQuadTo(360f, 727f)
                quadToRelative(-16f, 0f, -28f, -11.5f)
                reflectiveQuadTo(320f, 687f)
                close()
                moveToRelative(80f, -207f)
                close()
                moveToRelative(0f, 134f)
                lineToRelative(210f, -134f)
                lineToRelative(-210f, -134f)
                verticalLineToRelative(268f)
                close()
            }
        }.build()
        
        return _Play_arrow!!
    }

private var _Play_arrow: ImageVector? = null

