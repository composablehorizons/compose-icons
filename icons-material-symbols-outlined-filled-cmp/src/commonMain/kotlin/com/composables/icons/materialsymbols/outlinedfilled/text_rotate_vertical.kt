package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Text_rotate_vertical: ImageVector
    get() {
        if (_Text_rotate_vertical != null) return _Text_rotate_vertical!!
        
        _Text_rotate_vertical = ImageVector.Builder(
            name = "text_rotate_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(436f, 640f)
                lineToRelative(164f, -440f)
                horizontalLineToRelative(80f)
                lineToRelative(164f, 440f)
                horizontalLineToRelative(-76f)
                lineToRelative(-40f, -112f)
                horizontalLineTo(552f)
                lineToRelative(-40f, 112f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(138f, -176f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
                moveTo(240f, 800f)
                lineTo(100f, 660f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 42f)
                verticalLineToRelative(-526f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(526f)
                lineToRelative(44f, -42f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
            }
        }.build()
        
        return _Text_rotate_vertical!!
    }

private var _Text_rotate_vertical: ImageVector? = null

