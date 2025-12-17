package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Backlight_high: ImageVector
    get() {
        if (_Backlight_high != null) return _Backlight_high!!
        
        _Backlight_high = ImageVector.Builder(
            name = "backlight_high",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 520f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(202f, -238f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-57f, -57f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(57f, 57f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveToRelative(58f, 358f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(280f, 660f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 600f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(680f, 660f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 720f)
                horizontalLineTo(340f)
                close()
                moveToRelative(140f, -440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 240f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(198f, 82f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(57f, -57f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-57f, 57f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(122f, 238f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 600f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Backlight_high!!
    }

private var _Backlight_high: ImageVector? = null

