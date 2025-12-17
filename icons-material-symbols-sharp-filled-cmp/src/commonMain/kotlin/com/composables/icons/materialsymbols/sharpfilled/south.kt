package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.South: ImageVector
    get() {
        if (_South != null) return _South!!
        
        _South = ImageVector.Builder(
            name = "south",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(200f, 600f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                verticalLineToRelative(-647f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(647f)
                lineToRelative(184f, -184f)
                lineToRelative(56f, 57f)
                lineTo(480f, 880f)
                close()
            }
        }.build()
        
        return _South!!
    }

private var _South: ImageVector? = null

