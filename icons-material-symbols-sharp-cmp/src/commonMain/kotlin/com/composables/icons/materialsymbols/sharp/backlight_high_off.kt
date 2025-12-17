package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Backlight_high_off: ImageVector
    get() {
        if (_Backlight_high_off != null) return _Backlight_high_off!!
        
        _Backlight_high_off = ImageVector.Builder(
            name = "backlight_high_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(400f, -320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(266f, 110f)
                lineToRelative(-56f, -56f)
                lineToRelative(113f, -113f)
                lineToRelative(57f, 56f)
                lineToRelative(-114f, 113f)
                close()
                moveToRelative(54f, 210f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
                moveToRelative(31f, 305f)
                lineTo(606f, 720f)
                horizontalLineTo(280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(206f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Backlight_high_off!!
    }

private var _Backlight_high_off: ImageVector? = null

