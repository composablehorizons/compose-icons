package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stack_hexagon: ImageVector
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
                moveToRelative(-67f, 220f)
                horizontalLineToRelative(217f)
                lineToRelative(7f, 53f)
                lineToRelative(-589f, 72f)
                lineToRelative(-74f, -597f)
                lineToRelative(126f, -14f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 5f)
                lineToRelative(54f, 437f)
                lineToRelative(295f, -36f)
                close()
                moveToRelative(-233f, -80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(360f)
                verticalLineToRelative(440f)
                close()
                moveTo(218f, 796f)
                close()
                moveToRelative(362f, -416f)
                close()
            }
        }.build()
        
        return _Stack_hexagon!!
    }

private var _Stack_hexagon: ImageVector? = null

