package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pinch_zoom_in: ImageVector
    get() {
        if (_Pinch_zoom_in != null) return _Pinch_zoom_in!!
        
        _Pinch_zoom_in = ImageVector.Builder(
            name = "pinch_zoom_in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(62f, 500f)
                lineToRelative(-42f, -42f)
                lineToRelative(117f, -118f)
                horizontalLineTo(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-97f)
                lineTo(62f, 500f)
                close()
                moveToRelative(218f, -260f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(98f)
                lineToRelative(117f, -118f)
                lineToRelative(43f, 43f)
                lineToRelative(-118f, 117f)
                horizontalLineToRelative(98f)
                verticalLineToRelative(60f)
                horizontalLineTo(280f)
                close()
                moveTo(543f, 920f)
                lineTo(304f, 680f)
                lineToRelative(63f, -65f)
                lineToRelative(113f, 32f)
                verticalLineToRelative(-367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(473f)
                lineToRelative(-97f, -27f)
                lineToRelative(114f, 114f)
                horizontalLineToRelative(263f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(543f)
                close()
                moveToRelative(57f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-20f, 80f)
                close()
            }
        }.build()
        
        return _Pinch_zoom_in!!
    }

private var _Pinch_zoom_in: ImageVector? = null

