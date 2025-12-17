package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_multi_room: ImageVector
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
                moveTo(160f, 360f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineTo(600f)
                close()
                moveTo(160f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(160f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Nest_multi_room!!
    }

private var _Nest_multi_room: ImageVector? = null

