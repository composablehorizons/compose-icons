package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Keyboard_off: ImageVector
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
                verticalLineToRelative(-80f)
                horizontalLineToRelative(247f)
                lineToRelative(80f, 80f)
                horizontalLineTo(320f)
                close()
                moveTo(200f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(176f, 337f)
                lineToRelative(-56f, -57f)
                verticalLineToRelative(-400f)
                horizontalLineTo(401f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(479f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(401f)
                quadToRelative(0f, 17f, -6.5f, 31f)
                reflectiveQuadTo(856f, 737f)
                close()
                moveToRelative(-696f, 23f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(47f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(527f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(281f, -440f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(79f)
                lineToRelative(-79f, -79f)
                close()
                moveToRelative(119f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(79f)
                lineToRelative(-80f, -79f)
                close()
                moveToRelative(-187f, 40f)
                close()
                moveToRelative(227f, 0f)
                close()
            }
        }.build()
        
        return _Keyboard_off!!
    }

private var _Keyboard_off: ImageVector? = null

