package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Call_end: ImageVector
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
                quadToRelative(87f, -89f, 198.5f, -133.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(114f, 0f, 225f, 44.5f)
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
            }
        }.build()
        
        return _Call_end!!
    }

private var _Call_end: ImageVector? = null

