package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Usb_off: ImageVector
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
                moveTo(791f, 905f)
                lineTo(526f, 640f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(92f)
                quadToRelative(19f, 10f, 29.5f, 28.5f)
                reflectiveQuadTo(560f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -21f, 11f, -39f)
                reflectiveQuadToRelative(29f, -29f)
                verticalLineToRelative(-92f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(-92f)
                quadToRelative(-19f, -10f, -29.5f, -28.5f)
                reflectiveQuadTo(200f, 400f)
                quadToRelative(0f, -17f, 6.5f, -32.5f)
                reflectiveQuadTo(227f, 341f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-80f, -308f)
                lineToRelative(-71f, -71f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
                moveToRelative(-391f, -37f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-6f)
                lineTo(339f, 453f)
                quadToRelative(-4f, 5f, -9f, 8.5f)
                reflectiveQuadToRelative(-10f, 6.5f)
                verticalLineToRelative(92f)
                close()
                moveToRelative(200f, -154f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(-80f)
                lineToRelative(120f, -160f)
                lineToRelative(120f, 160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(166f)
                close()
            }
        }.build()
        
        return _Usb_off!!
    }

private var _Usb_off: ImageVector? = null

