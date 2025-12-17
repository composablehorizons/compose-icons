package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Function: ImageVector
    get() {
        if (_Function != null) return _Function!!
        
        _Function = ImageVector.Builder(
            name = "function",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(221f, 840f)
                quadToRelative(-45f, 0f, -73f, -24f)
                reflectiveQuadToRelative(-28f, -64f)
                quadToRelative(0f, -32f, 17f, -51.5f)
                reflectiveQuadToRelative(43f, -19.5f)
                quadToRelative(25f, 0f, 42.5f, 17f)
                reflectiveQuadToRelative(17.5f, 41f)
                quadToRelative(0f, 5f, -0.5f, 9f)
                reflectiveQuadToRelative(-1.5f, 9f)
                quadToRelative(5f, -1f, 8.5f, -5.5f)
                reflectiveQuadTo(252f, 739f)
                lineToRelative(62f, -339f)
                horizontalLineToRelative(-74f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 320f)
                horizontalLineToRelative(89f)
                lineToRelative(21f, -114f)
                quadToRelative(7f, -38f, 37.5f, -62f)
                reflectiveQuadToRelative(72.5f, -24f)
                quadToRelative(44f, 0f, 72f, 26f)
                reflectiveQuadToRelative(28f, 65f)
                quadToRelative(0f, 30f, -17f, 49.5f)
                reflectiveQuadTo(500f, 280f)
                quadToRelative(-25f, 0f, -42.5f, -17f)
                reflectiveQuadTo(440f, 221f)
                quadToRelative(0f, -5f, 0.5f, -9f)
                reflectiveQuadToRelative(1.5f, -9f)
                quadToRelative(-6f, 2f, -9f, 6f)
                reflectiveQuadToRelative(-5f, 12f)
                lineToRelative(-17f, 99f)
                horizontalLineToRelative(149f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 360f)
                quadToRelative(0f, 15f, -9.5f, 26f)
                reflectiveQuadTo(567f, 399f)
                lineToRelative(53f, 60f)
                lineToRelative(53f, -60f)
                quadToRelative(-14f, -2f, -23.5f, -13f)
                reflectiveQuadToRelative(-9.5f, -26f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 400f)
                horizontalLineToRelative(-22f)
                lineTo(673f, 520f)
                lineToRelative(105f, 120f)
                horizontalLineToRelative(22f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, -15f, 9.5f, -26f)
                reflectiveQuadToRelative(23.5f, -13f)
                lineToRelative(-53f, -61f)
                lineToRelative(-53f, 61f)
                quadToRelative(14f, 2f, 23.5f, 13f)
                reflectiveQuadToRelative(9.5f, 26f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 720f)
                horizontalLineTo(440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 640f)
                horizontalLineToRelative(22f)
                lineToRelative(105f, -120f)
                lineToRelative(-105f, -120f)
                horizontalLineToRelative(-66f)
                lineToRelative(-64f, 344f)
                quadToRelative(-8f, 45f, -37f, 70.5f)
                reflectiveQuadTo(221f, 840f)
                close()
            }
        }.build()
        
        return _Function!!
    }

private var _Function: ImageVector? = null

