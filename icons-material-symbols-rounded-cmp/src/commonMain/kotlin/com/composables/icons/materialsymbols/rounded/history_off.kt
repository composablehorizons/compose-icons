package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.History_off: ImageVector
    get() {
        if (_History_off != null) return _History_off!!
        
        _History_off = ImageVector.Builder(
            name = "history_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 200f)
                quadToRelative(-25f, 0f, -54.5f, 6f)
                reflectiveQuadTo(373f, 223f)
                quadToRelative(-15f, 8f, -31f, 1f)
                reflectiveQuadToRelative(-24f, -21f)
                quadToRelative(-8f, -15f, -3f, -29.5f)
                reflectiveQuadToRelative(19f, -22.5f)
                quadToRelative(32f, -16f, 71.5f, -23.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 36f, -8f, 74.5f)
                reflectiveQuadTo(810f, 625f)
                quadToRelative(-7f, 14f, -22.5f, 19.5f)
                reflectiveQuadTo(758f, 642f)
                quadToRelative(-14f, -8f, -20f, -24f)
                reflectiveQuadToRelative(1f, -31f)
                quadToRelative(10f, -23f, 15.5f, -52f)
                reflectiveQuadToRelative(5.5f, -55f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 364f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 324f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(0f, 560f)
                quadToRelative(-69f, 0f, -130.5f, -24.5f)
                reflectiveQuadTo(240f, 748f)
                quadToRelative(-39f, -35f, -67.5f, -81.5f)
                reflectiveQuadTo(130f, 567f)
                quadToRelative(-5f, -16f, 5.5f, -30f)
                reflectiveQuadToRelative(27.5f, -16f)
                quadToRelative(17f, -2f, 30f, 8f)
                reflectiveQuadToRelative(18f, 27f)
                quadToRelative(11f, 39f, 33.5f, 74.5f)
                reflectiveQuadTo(297f, 692f)
                quadToRelative(37f, 32f, 84f, 50f)
                reflectiveQuadToRelative(99f, 18f)
                quadToRelative(37f, 0f, 70.5f, -8.5f)
                reflectiveQuadTo(614f, 726f)
                lineTo(288f, 400f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(-128f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-92f, -92f)
                quadToRelative(-42f, 26f, -90f, 41f)
                reflectiveQuadToRelative(-102f, 15f)
                close()
            }
        }.build()
        
        return _History_off!!
    }

private var _History_off: ImageVector? = null

