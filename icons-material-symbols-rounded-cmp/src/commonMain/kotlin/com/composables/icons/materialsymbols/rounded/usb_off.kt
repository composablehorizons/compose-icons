package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Usb_off: ImageVector
    get() {
        if (_Usb_off != null) return _Usb_off!!
        
        _Usb_off = ImageVector.Builder(
            name = "usb_off",
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
                quadToRelative(0f, -18f, 7f, -33f)
                reflectiveQuadToRelative(20f, -26f)
                lineTo(83f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineTo(526f, 640f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(92f)
                quadToRelative(19f, 10f, 29.5f, 28f)
                reflectiveQuadToRelative(10.5f, 40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(280f, -540f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(680f, 550f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(640f, 509f)
                verticalLineToRelative(-29f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(120f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                close()
                moveTo(320f, 560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-6f)
                lineTo(339f, 453f)
                quadToRelative(-4f, 5f, -9f, 8.5f)
                reflectiveQuadToRelative(-10f, 6.5f)
                verticalLineToRelative(92f)
                close()
                moveToRelative(120f, -320f)
                horizontalLineToRelative(-40f)
                quadToRelative(-12f, 0f, -18f, -11f)
                reflectiveQuadToRelative(2f, -21f)
                lineToRelative(80f, -107f)
                quadToRelative(3f, -4f, 16f, -8f)
                quadToRelative(5f, 0f, 9f, 1.5f)
                reflectiveQuadToRelative(7f, 6.5f)
                lineToRelative(80f, 107f)
                quadToRelative(8f, 10f, 2f, 21f)
                reflectiveQuadToRelative(-18f, 11f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(480f, 350f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(440f, 309f)
                verticalLineToRelative(-69f)
                close()
            }
        }.build()
        
        return _Usb_off!!
    }

private var _Usb_off: ImageVector? = null

