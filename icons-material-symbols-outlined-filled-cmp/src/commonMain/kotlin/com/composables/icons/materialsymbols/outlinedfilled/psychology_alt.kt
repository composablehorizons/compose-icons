package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Psychology_alt: ImageVector
    get() {
        if (_Psychology_alt != null) return _Psychology_alt!!
        
        _Psychology_alt = ImageVector.Builder(
            name = "psychology_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-172f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(-30f, -128f)
                horizontalLineToRelative(61f)
                quadToRelative(0f, -25f, 6.5f, -40.5f)
                reflectiveQuadTo(544f, 434f)
                quadToRelative(18f, -20f, 35f, -40.5f)
                reflectiveQuadToRelative(17f, -53.5f)
                quadToRelative(0f, -42f, -32.5f, -71f)
                reflectiveQuadTo(483f, 240f)
                quadToRelative(-40f, 0f, -72.5f, 23f)
                reflectiveQuadTo(365f, 323f)
                lineToRelative(55f, 23f)
                quadToRelative(7f, -22f, 24.5f, -35.5f)
                reflectiveQuadTo(483f, 297f)
                quadToRelative(22f, 0f, 36.5f, 12f)
                reflectiveQuadToRelative(14.5f, 31f)
                quadToRelative(0f, 21f, -12.5f, 37.5f)
                reflectiveQuadTo(492f, 411f)
                quadToRelative(-20f, 21f, -31f, 42f)
                reflectiveQuadToRelative(-11f, 59f)
                close()
            }
        }.build()
        
        return _Psychology_alt!!
    }

private var _Psychology_alt: ImageVector? = null

