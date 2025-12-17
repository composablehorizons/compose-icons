package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stack_hexagon: ImageVector
    get() {
        if (_Stack_hexagon != null) return _Stack_hexagon!!
        
        _Stack_hexagon = ImageVector.Builder(
            name = "stack_hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 540f)
                lineToRelative(140f, -80f)
                verticalLineToRelative(-160f)
                lineToRelative(-140f, -80f)
                lineToRelative(-140f, 80f)
                verticalLineToRelative(160f)
                lineToRelative(140f, 80f)
                close()
                moveTo(148f, 885f)
                lineTo(74f, 288f)
                lineToRelative(126f, -14f)
                verticalLineToRelative(486f)
                horizontalLineToRelative(532f)
                lineToRelative(5f, 53f)
                lineToRelative(-589f, 72f)
                close()
                moveToRelative(132f, -205f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Stack_hexagon!!
    }

private var _Stack_hexagon: ImageVector? = null

