package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Unknown_5: ImageVector
    get() {
        if (_Unknown_5 != null) return _Unknown_5!!
        
        _Unknown_5 = ImageVector.Builder(
            name = "unknown_5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 400f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-80f, 0f, -153.5f, -29.5f)
                reflectiveQuadTo(196f, 764f)
                quadToRelative(-5f, -5f, -8.5f, -12.5f)
                reflectiveQuadTo(184f, 736f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(224f, 696f)
                quadToRelative(8f, 0f, 15.5f, 3.5f)
                reflectiveQuadTo(252f, 708f)
                quadToRelative(47f, 44f, 106f, 68f)
                reflectiveQuadToRelative(122f, 24f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                close()
            }
        }.build()
        
        return _Unknown_5!!
    }

private var _Unknown_5: ImageVector? = null

