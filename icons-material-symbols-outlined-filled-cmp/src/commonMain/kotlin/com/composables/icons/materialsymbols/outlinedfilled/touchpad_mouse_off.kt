package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Touchpad_mouse_off: ImageVector
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
                quadToRelative(0f, 36f, 8.5f, 72f)
                reflectiveQuadToRelative(25.5f, 68f)
                horizontalLineTo(160f)
                close()
                moveToRelative(500f, -560f)
                quadToRelative(-63f, 0f, -118f, 24.5f)
                reflectiveQuadTo(446f, 331f)
                lineTo(275f, 160f)
                horizontalLineToRelative(525f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(96f)
                quadToRelative(-43f, -47f, -99.5f, -71.5f)
                reflectiveQuadTo(660f, 240f)
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
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-70f, -70f)
                quadToRelative(-20f, 9f, -42.5f, 13.5f)
                reflectiveQuadTo(660f, 880f)
                close()
            }
        }.build()
        
        return _Touchpad_mouse_off!!
    }

private var _Touchpad_mouse_off: ImageVector? = null

