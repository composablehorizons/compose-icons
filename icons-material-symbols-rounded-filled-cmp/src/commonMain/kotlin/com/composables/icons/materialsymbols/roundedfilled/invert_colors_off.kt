package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Invert_colors_off: ImageVector
    get() {
        if (_Invert_colors_off != null) return _Invert_colors_off!!
        
        _Invert_colors_off = ImageVector.Builder(
            name = "invert_colors_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(706f, 303f)
                quadToRelative(48f, 48f, 71f, 103.5f)
                reflectiveQuadTo(800f, 524f)
                quadToRelative(0f, 17f, -1.5f, 33f)
                reflectiveQuadToRelative(-4.5f, 31f)
                quadToRelative(-3f, 15f, -15f, 23.5f)
                reflectiveQuadToRelative(-26f, 8.5f)
                quadToRelative(-9f, 0f, -17.5f, -3f)
                reflectiveQuadTo(719f, 606f)
                lineTo(503f, 390f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-142f)
                lineToRelative(-61f, 60f)
                quadToRelative(-11f, 11f, -28f, 10.5f)
                reflectiveQuadTo(363f, 251f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(364f, 195f)
                lineToRelative(74f, -73f)
                quadToRelative(9f, -9f, 20f, -13.5f)
                reflectiveQuadToRelative(22f, -4.5f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(184f, 181f)
                close()
                moveTo(480f, 840f)
                quadToRelative(-133f, 0f, -226.5f, -91.5f)
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
                quadToRelative(-42f, 31f, -91.5f, 45.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-167f)
                lineTo(280f, 393f)
                quadToRelative(-21f, 32f, -30.5f, 64.5f)
                reflectiveQuadTo(240f, 524f)
                quadToRelative(0f, 100f, 70f, 168f)
                reflectiveQuadToRelative(170f, 68f)
                close()
            }
        }.build()
        
        return _Invert_colors_off!!
    }

private var _Invert_colors_off: ImageVector? = null

