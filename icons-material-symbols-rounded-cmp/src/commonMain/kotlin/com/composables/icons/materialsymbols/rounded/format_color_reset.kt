package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Format_color_reset: ImageVector
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
                moveToRelative(0f, -80f)
                quadToRelative(36f, 0f, 68.5f, -10f)
                reflectiveQuadToRelative(61.5f, -28f)
                lineTo(280f, 394f)
                quadToRelative(-21f, 32f, -30.5f, 64f)
                reflectiveQuadToRelative(-9.5f, 66f)
                quadToRelative(0f, 98f, 70f, 167f)
                reflectiveQuadToRelative(170f, 69f)
                close()
                moveToRelative(-37f, -204f)
                close()
                moveToRelative(263f, -254f)
                quadToRelative(60f, 60f, 81.5f, 136.5f)
                reflectiveQuadTo(791f, 593f)
                quadToRelative(-3f, 14f, -14f, 22f)
                reflectiveQuadToRelative(-25f, 8f)
                quadToRelative(-22f, 0f, -31.5f, -18f)
                reflectiveQuadToRelative(-4.5f, -38f)
                quadToRelative(15f, -55f, -5f, -110.5f)
                reflectiveQuadTo(650f, 360f)
                lineTo(480f, 192f)
                lineToRelative(-60f, 59f)
                quadToRelative(-11f, 11f, -28f, 10.5f)
                reflectiveQuadTo(364f, 250f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -27.5f)
                lineToRelative(74f, -73f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 12.5f)
                lineToRelative(184f, 181f)
                close()
                moveToRelative(-128f, 78f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

