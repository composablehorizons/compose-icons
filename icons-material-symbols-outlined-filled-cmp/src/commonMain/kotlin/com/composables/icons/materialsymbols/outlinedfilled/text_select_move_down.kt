package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Text_select_move_down: ImageVector
    get() {
        if (_Text_select_move_down != null) return _Text_select_move_down!!
        
        _Text_select_move_down = ImageVector.Builder(
            name = "text_select_move_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, 480f)
                lineTo(320f, 520f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-247f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(247f)
                lineToRelative(64f, -63f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Text_select_move_down!!
    }

private var _Text_select_move_down: ImageVector? = null

