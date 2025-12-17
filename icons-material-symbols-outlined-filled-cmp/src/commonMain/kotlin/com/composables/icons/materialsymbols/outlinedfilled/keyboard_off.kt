package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Keyboard_off: ImageVector
    get() {
        if (_Keyboard_off != null) return _Keyboard_off!!
        
        _Keyboard_off = ImageVector.Builder(
            name = "keyboard_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(794f, 901f)
                lineTo(59f, 166f)
                lineToRelative(57f, -57f)
                lineToRelative(735f, 735f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(320f, 640f)
                horizontalLineToRelative(327f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 520f)
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
                moveToRelative(360f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(360f, 0f)
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
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(47f)
                lineToRelative(560f, 560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(696f, -23f)
                lineTo(640f, 519f)
                verticalLineToRelative(-79f)
                horizontalLineToRelative(-80f)
                lineToRelative(-40f, -41f)
                verticalLineToRelative(-79f)
                horizontalLineToRelative(-79f)
                lineTo(321f, 200f)
                horizontalLineToRelative(479f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(401f)
                quadToRelative(0f, 17f, -6.5f, 31f)
                reflectiveQuadTo(856f, 737f)
                close()
            }
        }.build()
        
        return _Keyboard_off!!
    }

private var _Keyboard_off: ImageVector? = null

