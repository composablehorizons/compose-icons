package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_color_reset: ImageVector
    get() {
        if (_Format_color_reset != null) return _Format_color_reset!!
        
        _Format_color_reset = ImageVector.Builder(
            name = "format_color_reset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(770f, 656f)
                lineTo(336f, 222f)
                lineToRelative(144f, -142f)
                lineToRelative(226f, 222f)
                quadToRelative(44f, 42f, 69f, 99.5f)
                reflectiveQuadTo(800f, 524f)
                quadToRelative(0f, 36f, -8f, 69f)
                reflectiveQuadToRelative(-22f, 63f)
                close()
                moveToRelative(22f, 248f)
                lineTo(668f, 780f)
                quadToRelative(-41f, 29f, -88f, 44.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-133f, 0f, -226.5f, -92.5f)
                reflectiveQuadTo(160f, 524f)
                quadToRelative(0f, -51f, 16f, -98f)
                reflectiveQuadToRelative(48f, -90f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

