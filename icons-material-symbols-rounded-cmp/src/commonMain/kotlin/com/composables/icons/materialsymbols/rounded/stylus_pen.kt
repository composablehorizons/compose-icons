package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stylus_pen: ImageVector
    get() {
        if (_Stylus_pen != null) return _Stylus_pen!!
        
        _Stylus_pen = ImageVector.Builder(
            name = "stylus_pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(254f, 589f)
                lineToRelative(78f, -280f)
                quadToRelative(4f, -13f, 14f, -21f)
                reflectiveQuadToRelative(24f, -8f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(-44f)
                quadToRelative(0f, -8f, 1.5f, -15.5f)
                reflectiveQuadTo(406f, 205f)
                lineToRelative(49f, -114f)
                quadToRelative(2f, -5f, 7f, -8f)
                reflectiveQuadToRelative(10f, -3f)
                horizontalLineToRelative(16f)
                quadToRelative(5f, 0f, 10f, 3f)
                reflectiveQuadToRelative(7f, 8f)
                lineToRelative(49f, 114f)
                quadToRelative(3f, 8f, 4.5f, 15.5f)
                reflectiveQuadTo(560f, 236f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(30f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 21f)
                lineToRelative(78f, 280f)
                quadToRelative(5f, 19f, -7f, 35f)
                reflectiveQuadToRelative(-32f, 16f)
                horizontalLineTo(293f)
                quadToRelative(-20f, 0f, -32f, -16f)
                reflectiveQuadToRelative(-7f, -35f)
                close()
                moveToRelative(91f, -29f)
                horizontalLineToRelative(270f)
                lineToRelative(-56f, -200f)
                horizontalLineTo(401f)
                lineToRelative(-56f, 200f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(270f)
                horizontalLineToRelative(-270f)
                close()
                moveTo(215f, 840f)
                quadToRelative(-20f, 0f, -32.5f, -16.5f)
                reflectiveQuadTo(177f, 787f)
                lineToRelative(5f, -12f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(5f, 12f)
                quadToRelative(7f, 20f, -5.5f, 36.5f)
                reflectiveQuadTo(745f, 840f)
                horizontalLineTo(215f)
                close()
            }
        }.build()
        
        return _Stylus_pen!!
    }

private var _Stylus_pen: ImageVector? = null

