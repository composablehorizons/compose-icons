package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_color_reset: ImageVector
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
                moveTo(706f, 302f)
                quadToRelative(44f, 42f, 69f, 99.5f)
                reflectiveQuadTo(800f, 524f)
                quadToRelative(0f, 21f, -3f, 41f)
                reflectiveQuadToRelative(-8f, 40f)
                quadToRelative(-5f, 18f, -24f, 22.5f)
                reflectiveQuadToRelative(-33f, -9.5f)
                lineTo(364f, 250f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                lineToRelative(73f, -73f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 12.5f)
                lineToRelative(184f, 181f)
                close()
                moveTo(480f, 840f)
                quadToRelative(-133f, 0f, -226.5f, -92.5f)
                reflectiveQuadTo(160f, 524f)
                quadToRelative(0f, -51f, 16f, -98f)
                reflectiveQuadToRelative(48f, -90f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-96f, -96f)
                quadToRelative(-41f, 29f, -88f, 44.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

