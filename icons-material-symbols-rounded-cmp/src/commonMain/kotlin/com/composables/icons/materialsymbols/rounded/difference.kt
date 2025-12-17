package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Difference: ImageVector
    get() {
        if (_Difference != null) return _Difference!!
        
        _Difference = ImageVector.Builder(
            name = "difference",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 360f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(660f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(620f, 280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(420f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(460f, 360f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(-40f, 240f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(660f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(620f, 520f)
                horizontalLineTo(460f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(420f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(460f, 600f)
                close()
                moveTo(320f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(247f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(367f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-360f)
                lineTo(560f, 120f)
                horizontalLineTo(320f)
                verticalLineToRelative(560f)
                close()
                moveTo(160f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -240f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Difference!!
    }

private var _Difference: ImageVector? = null

