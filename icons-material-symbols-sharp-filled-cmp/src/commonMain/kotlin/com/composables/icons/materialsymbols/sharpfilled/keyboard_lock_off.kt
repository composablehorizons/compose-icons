package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Keyboard_lock_off: ImageVector
    get() {
        if (_Keyboard_lock_off != null) return _Keyboard_lock_off!!
        
        _Keyboard_lock_off = ImageVector.Builder(
            name = "keyboard_lock_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(40f)
                horizontalLineTo(640f)
                close()
                moveToRelative(240f, -114f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(-9f, 0f, -17.5f, 4f)
                reflectiveQuadTo(729f, 615f)
                lineToRelative(-28f, -29f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(-800f, -6f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                lineToRelative(360f, 360f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(244f)
                quadToRelative(-2f, 10f, -3f, 19.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(819f, 932f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(200f, 440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, 80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(314f, 200f)
                horizontalLineToRelative(566f)
                verticalLineToRelative(320f)
                quadToRelative(-26f, -20f, -57f, -30f)
                reflectiveQuadToRelative(-63f, -10f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(57f)
                quadToRelative(-11f, 5f, -21f, 10.5f)
                reflectiveQuadTo(640f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(6f)
                lineToRelative(-46f, -46f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(6f)
                lineTo(314f, 200f)
                close()
            }
        }.build()
        
        return _Keyboard_lock_off!!
    }

private var _Keyboard_lock_off: ImageVector? = null

