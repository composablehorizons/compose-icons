package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Step: ImageVector
    get() {
        if (_Step != null) return _Step!!
        
        _Step = ImageVector.Builder(
            name = "step",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 600f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -51f, 34.5f, -85.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 51f, -34.5f, 85.5f)
                reflectiveQuadTo(760f, 600f)
                close()
                moveToRelative(-400f, 80f)
                lineToRelative(-56f, -57f)
                lineToRelative(103f, -103f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(304f, 336f)
                lineToRelative(56f, -56f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Step!!
    }

private var _Step: ImageVector? = null

