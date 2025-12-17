package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_multi_room: ImageVector
    get() {
        if (_Nest_multi_room != null) return _Nest_multi_room!!
        
        _Nest_multi_room = ImageVector.Builder(
            name = "nest_multi_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(360f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-119f)
                horizontalLineTo(240f)
                verticalLineToRelative(119f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-119f)
                horizontalLineTo(440f)
                verticalLineToRelative(119f)
                close()
                moveTo(292f, 361f)
                horizontalLineToRelative(376f)
                lineTo(480f, 220f)
                lineTo(292f, 361f)
                close()
            }
        }.build()
        
        return _Nest_multi_room!!
    }

private var _Nest_multi_room: ImageVector? = null

