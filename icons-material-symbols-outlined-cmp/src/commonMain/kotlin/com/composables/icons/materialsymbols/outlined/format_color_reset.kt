package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Format_color_reset: ImageVector
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
                moveTo(800f, 524f)
                quadToRelative(0f, 36f, -8f, 69f)
                reflectiveQuadToRelative(-22f, 63f)
                lineToRelative(-62f, -60f)
                quadToRelative(6f, -17f, 9f, -34.5f)
                reflectiveQuadToRelative(3f, -37.5f)
                quadToRelative(0f, -47f, -17.5f, -89f)
                reflectiveQuadTo(650f, 360f)
                lineTo(480f, 192f)
                lineToRelative(-88f, 86f)
                lineToRelative(-56f, -56f)
                lineToRelative(144f, -142f)
                lineToRelative(226f, 222f)
                quadToRelative(44f, 42f, 69f, 99.5f)
                reflectiveQuadTo(800f, 524f)
                close()
                moveToRelative(-8f, 380f)
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
                moveTo(480f, 760f)
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
                moveToRelative(110f, -116f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

