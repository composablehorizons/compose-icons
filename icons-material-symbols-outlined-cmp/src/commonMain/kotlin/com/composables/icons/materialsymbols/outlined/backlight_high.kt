package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Backlight_high: ImageVector
    get() {
        if (_Backlight_high != null) return _Backlight_high!!
        
        _Backlight_high = ImageVector.Builder(
            name = "backlight_high",
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
                moveToRelative(214f, -210f)
                lineTo(141f, 277f)
                lineToRelative(56f, -57f)
                lineToRelative(113f, 114f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(26f, 330f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                close()
                moveToRelative(160f, -440f)
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
            }
        }.build()
        
        return _Backlight_high!!
    }

private var _Backlight_high: ImageVector? = null

