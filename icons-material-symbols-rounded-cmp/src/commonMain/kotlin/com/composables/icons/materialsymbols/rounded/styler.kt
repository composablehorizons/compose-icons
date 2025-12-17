package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Styler: ImageVector
    get() {
        if (_Styler != null) return _Styler!!
        
        _Styler = ImageVector.Builder(
            name = "styler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 560f)
                horizontalLineToRelative(64f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 560f)
                horizontalLineToRelative(64f)
                quadToRelative(7f, 0f, 11.5f, -5f)
                reflectiveQuadToRelative(4.5f, -13f)
                quadToRelative(0f, -5f, -2.5f, -8.5f)
                reflectiveQuadTo(750f, 528f)
                lineTo(480f, 408f)
                lineTo(210f, 528f)
                quadToRelative(-5f, 2f, -7.5f, 5.5f)
                reflectiveQuadTo(200f, 542f)
                quadToRelative(0f, 8f, 4.5f, 13f)
                reflectiveQuadToRelative(11.5f, 5f)
                close()
                moveToRelative(144f, 240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineTo(360f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(209f, -594f)
                quadToRelative(-15f, 7f, -30f, 0.5f)
                reflectiveQuadTo(517f, 185f)
                quadToRelative(-5f, -11f, -14.5f, -18f)
                reflectiveQuadToRelative(-22.5f, -7f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                quadTo(520f, 263f, 520f, 280f)
                verticalLineToRelative(58f)
                lineToRelative(262f, 116f)
                quadToRelative(26f, 12f, 42f, 36.5f)
                reflectiveQuadToRelative(16f, 53.5f)
                quadToRelative(0f, 40f, -28f, 68f)
                reflectiveQuadToRelative(-68f, 28f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-64f)
                quadToRelative(-40f, 0f, -68f, -28f)
                reflectiveQuadToRelative(-28f, -68f)
                quadToRelative(0f, -29f, 16f, -53.5f)
                reflectiveQuadToRelative(42f, -36.5f)
                lineToRelative(262f, -116f)
                verticalLineToRelative(-26f)
                quadToRelative(-36f, -13f, -58f, -43.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(38f, 0f, 67.5f, 21f)
                reflectiveQuadToRelative(43.5f, 53f)
                quadToRelative(7f, 15f, 0f, 30f)
                reflectiveQuadToRelative(-22f, 22f)
                close()
                moveTo(360f, 600f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Styler!!
    }

private var _Styler: ImageVector? = null

