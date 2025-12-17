package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Widgets: ImageVector
    get() {
        if (_Widgets != null) return _Widgets!!
        
        _Widgets = ImageVector.Builder(
            name = "widgets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(666f, 520f)
                lineTo(440f, 294f)
                lineToRelative(226f, -226f)
                lineToRelative(226f, 226f)
                lineToRelative(-226f, 226f)
                close()
                moveToRelative(-546f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(467f, 48f)
                lineToRelative(113f, -113f)
                lineToRelative(-113f, -113f)
                lineToRelative(-113f, 113f)
                lineToRelative(113f, 113f)
                close()
                moveToRelative(-67f, 352f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-400f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, -400f)
                close()
                moveToRelative(194f, -65f)
                close()
                moveTo(360f, 600f)
                close()
                moveToRelative(240f, 0f)
                close()
            }
        }.build()
        
        return _Widgets!!
    }

private var _Widgets: ImageVector? = null

