package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Touchpad_mouse_off: ImageVector
    get() {
        if (_Touchpad_mouse_off != null) return _Touchpad_mouse_off!!
        
        _Touchpad_mouse_off = ImageVector.Builder(
            name = "touchpad_mouse_off",
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
                horizontalLineToRelative(1f)
                lineToRelative(236f, 236f)
                quadToRelative(-18f, 32f, -27.5f, 68.5f)
                reflectiveQuadTo(360f, 540f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 23f, 3.5f, 46.5f)
                reflectiveQuadTo(375f, 753f)
                quadToRelative(5f, 17f, -5f, 32f)
                reflectiveQuadToRelative(-27f, 15f)
                horizontalLineTo(160f)
                close()
                moveToRelative(500f, -560f)
                quadToRelative(-63f, 0f, -118f, 24.5f)
                reflectiveQuadTo(446f, 331f)
                lineTo(343f, 228f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(372f, 160f)
                horizontalLineToRelative(428f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(35f)
                quadToRelative(0f, 17f, -16f, 24f)
                reflectiveQuadToRelative(-30f, -4f)
                quadToRelative(-38f, -27f, -82f, -41f)
                reflectiveQuadToRelative(-92f, -14f)
                close()
                moveToRelative(40f, 280f)
                verticalLineToRelative(-197f)
                quadToRelative(75f, 13f, 126f, 67.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(700f)
                close()
                moveToRelative(-80f, -197f)
                verticalLineToRelative(182f)
                lineTo(500f, 385f)
                quadToRelative(24f, -24f, 54.5f, -40f)
                reflectiveQuadToRelative(65.5f, -22f)
                close()
                moveToRelative(242f, 424f)
                lineTo(715f, 600f)
                horizontalLineToRelative(165f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 23f, -5f, 45f)
                reflectiveQuadToRelative(-13f, 42f)
                close()
                moveTo(660f, 880f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadToRelative(-64f, -156f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(47f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 904f)
                lineToRelative(-42f, -42f)
                quadToRelative(-20f, 9f, -42.5f, 13.5f)
                reflectiveQuadTo(660f, 880f)
                close()
            }
        }.build()
        
        return _Touchpad_mouse_off!!
    }

private var _Touchpad_mouse_off: ImageVector? = null

