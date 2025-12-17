package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Remove_moderator: ImageVector
    get() {
        if (_Remove_moderator != null) return _Remove_moderator!!
        
        _Remove_moderator = ImageVector.Builder(
            name = "remove_moderator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(754f, 642f)
                lineTo(272f, 158f)
                lineToRelative(208f, -78f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 51f, -11.5f, 101f)
                reflectiveQuadTo(754f, 642f)
                close()
                moveToRelative(38f, 262f)
                lineTo(662f, 774f)
                quadToRelative(-38f, 39f, -84.5f, 65.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-172f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Remove_moderator!!
    }

private var _Remove_moderator: ImageVector? = null

