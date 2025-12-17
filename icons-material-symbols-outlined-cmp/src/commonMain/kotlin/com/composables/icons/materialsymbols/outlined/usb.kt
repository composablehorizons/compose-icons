package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Usb: ImageVector
    get() {
        if (_Usb != null) return _Usb!!
        
        _Usb = ImageVector.Builder(
            name = "usb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -21f, 11f, -39f)
                reflectiveQuadToRelative(29f, -29f)
                verticalLineToRelative(-92f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(-92f)
                quadToRelative(-18f, -9f, -29f, -27f)
                reflectiveQuadToRelative(-11f, -41f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 400f)
                quadToRelative(0f, 23f, -11f, 40f)
                reflectiveQuadToRelative(-29f, 28f)
                verticalLineToRelative(92f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-80f)
                lineToRelative(120f, -160f)
                lineToRelative(120f, 160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineTo(520f)
                verticalLineToRelative(92f)
                quadToRelative(19f, 10f, 29.5f, 28f)
                reflectiveQuadToRelative(10.5f, 40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Usb!!
    }

private var _Usb: ImageVector? = null

