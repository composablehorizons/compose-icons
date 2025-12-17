package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Call_end: ImageVector
    get() {
        if (_Call_end != null) return _Call_end!!
        
        _Call_end = ImageVector.Builder(
            name = "call_end",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(161f, 680f)
                lineTo(16f, 539f)
                lineToRelative(40f, -41f)
                quadToRelative(85f, -91f, 197.5f, -134.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(114f, 0f, 225.5f, 44f)
                reflectiveQuadTo(904f, 498f)
                lineToRelative(40f, 41f)
                lineToRelative(-145f, 141f)
                lineToRelative(-159f, -120f)
                verticalLineToRelative(-134f)
                quadToRelative(-38f, -12f, -78f, -19f)
                reflectiveQuadToRelative(-82f, -7f)
                quadToRelative(-42f, 0f, -82f, 7f)
                reflectiveQuadToRelative(-78f, 19f)
                verticalLineToRelative(134f)
                lineTo(161f, 680f)
                close()
                moveToRelative(79f, -222f)
                quadToRelative(-29f, 15f, -56f, 34.5f)
                reflectiveQuadTo(128f, 536f)
                lineToRelative(40f, 40f)
                lineToRelative(72f, -56f)
                verticalLineToRelative(-62f)
                close()
                moveToRelative(480f, 2f)
                verticalLineToRelative(60f)
                lineToRelative(72f, 56f)
                lineToRelative(40f, -38f)
                quadToRelative(-29f, -26f, -56f, -45f)
                reflectiveQuadToRelative(-56f, -33f)
                close()
                moveToRelative(-480f, -2f)
                close()
                moveToRelative(480f, 2f)
                close()
            }
        }.build()
        
        return _Call_end!!
    }

private var _Call_end: ImageVector? = null

