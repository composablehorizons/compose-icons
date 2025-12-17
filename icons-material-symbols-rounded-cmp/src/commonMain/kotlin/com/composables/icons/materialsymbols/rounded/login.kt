package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Login: ImageVector
    get() {
        if (_Login != null) return _Login!!
        
        _Login = ImageVector.Builder(
            name = "login",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 760f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-560f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-73f, -320f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                horizontalLineToRelative(287f)
                lineToRelative(-75f, -75f)
                quadToRelative(-11f, -11f, -11f, -27f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -12f, 28f, -12.5f)
                reflectiveQuadToRelative(29f, 11.5f)
                lineToRelative(143f, 143f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(429f, 651f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(372f, 650f)
                quadToRelative(-11f, -12f, -10.5f, -28.5f)
                reflectiveQuadTo(373f, 594f)
                lineToRelative(74f, -74f)
                close()
            }
        }.build()
        
        return _Login!!
    }

private var _Login: ImageVector? = null

