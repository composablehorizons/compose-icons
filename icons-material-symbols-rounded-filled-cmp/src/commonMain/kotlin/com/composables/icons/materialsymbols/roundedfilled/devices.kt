package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Devices: ImageVector
    get() {
        if (_Devices != null) return _Devices!!
        
        _Devices = ImageVector.Builder(
            name = "devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(140f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 680f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(180f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(420f, 800f)
                horizontalLineTo(140f)
                close()
                moveToRelative(460f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Devices!!
    }

private var _Devices: ImageVector? = null

