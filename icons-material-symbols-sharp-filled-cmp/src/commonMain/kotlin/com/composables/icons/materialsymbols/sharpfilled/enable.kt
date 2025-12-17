package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Enable: ImageVector
    get() {
        if (_Enable != null) return _Enable!!
        
        _Enable = ImageVector.Builder(
            name = "enable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -132f, 77f, -237.5f)
                reflectiveQuadTo(360f, 98f)
                verticalLineToRelative(86f)
                quadToRelative(-91f, 37f, -145.5f, 117.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -98f, -54.5f, -178.5f)
                reflectiveQuadTo(600f, 184f)
                verticalLineToRelative(-86f)
                quadToRelative(126f, 39f, 203f, 144.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -240f)
                lineTo(280f, 440f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 103f)
                verticalLineToRelative(-407f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(407f)
                lineToRelative(104f, -103f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Enable!!
    }

private var _Enable: ImageVector? = null

