package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Picture_in_picture_off: ImageVector
    get() {
        if (_Picture_in_picture_off != null) return _Picture_in_picture_off!!
        
        _Picture_in_picture_off = ImageVector.Builder(
            name = "picture_in_picture_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 520f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 460f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 280f)
                horizontalLineTo(480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 360f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 17f, 12f, 28.5f)
                reflectiveQuadToRelative(29f, 11.5f)
                horizontalLineToRelative(59f)
                close()
                moveToRelative(140f, 200f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 679f)
                verticalLineToRelative(-439f)
                horizontalLineTo(361f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(321f, 200f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(439f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 720f)
                close()
                moveTo(577f, 463f)
                close()
                moveToRelative(-194f, 34f)
                close()
                moveTo(790f, 903f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineTo(54f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(54f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 903f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_off!!
    }

private var _Picture_in_picture_off: ImageVector? = null

