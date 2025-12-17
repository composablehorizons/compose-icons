package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Iframe_off: ImageVector
    get() {
        if (_Iframe_off != null) return _Iframe_off!!
        
        _Iframe_off = ImageVector.Builder(
            name = "iframe_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                verticalLineToRelative(114f)
                lineTo(54f, 168f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 903f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(446f)
                lineTo(206f, 320f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(720f, -480f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 679f)
                verticalLineToRelative(-359f)
                horizontalLineTo(467f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(411f, 297f)
                lineToRelative(-69f, -69f)
                quadToRelative(-9f, -10f, -11f, -21f)
                reflectiveQuadToRelative(3f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                close()
                moveTo(720f, 440f)
                verticalLineToRelative(94f)
                quadToRelative(0f, 15f, -9.5f, 22f)
                reflectiveQuadToRelative(-20.5f, 7f)
                quadToRelative(-11f, 0f, -20.5f, -7.5f)
                reflectiveQuadTo(660f, 534f)
                verticalLineToRelative(-74f)
                horizontalLineToRelative(-74f)
                quadToRelative(-14f, 0f, -21.5f, -9.5f)
                reflectiveQuadTo(557f, 430f)
                quadToRelative(0f, -11f, 7f, -20.5f)
                reflectiveQuadToRelative(22f, -9.5f)
                horizontalLineToRelative(94f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 440f)
                close()
            }
        }.build()
        
        return _Iframe_off!!
    }

private var _Iframe_off: ImageVector? = null

