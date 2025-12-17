package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Headphones_battery: ImageVector
    get() {
        if (_Headphones_battery != null) return _Headphones_battery!!
        
        _Headphones_battery = ImageVector.Builder(
            name = "headphones_battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(240f)
                horizontalLineTo(400f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(320f, 300f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(140f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineTo(640f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Headphones_battery!!
    }

private var _Headphones_battery: ImageVector? = null

