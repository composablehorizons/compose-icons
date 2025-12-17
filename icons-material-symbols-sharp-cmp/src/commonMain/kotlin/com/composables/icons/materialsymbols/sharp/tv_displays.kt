package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tv_displays: ImageVector
    get() {
        if (_Tv_displays != null) return _Tv_displays!!
        
        _Tv_displays = ImageVector.Builder(
            name = "tv_displays",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 640f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(560f)
                horizontalLineTo(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                close()
                moveTo(320f, 720f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-400f)
                horizontalLineTo(320f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(260f, -200f)
                close()
            }
        }.build()
        
        return _Tv_displays!!
    }

private var _Tv_displays: ImageVector? = null

