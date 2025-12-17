package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Text_rotation_none: ImageVector
    get() {
        if (_Text_rotation_none != null) return _Text_rotation_none!!
        
        _Text_rotation_none = ImageVector.Builder(
            name = "text_rotation_none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(528f)
                lineToRelative(-42f, -42f)
                lineToRelative(56f, -56f)
                lineToRelative(138f, 138f)
                lineToRelative(-138f, 138f)
                lineToRelative(-56f, -56f)
                lineToRelative(42f, -42f)
                horizontalLineTo(160f)
                close()
                moveToRelative(116f, -200f)
                lineToRelative(164f, -440f)
                horizontalLineToRelative(80f)
                lineToRelative(164f, 440f)
                horizontalLineToRelative(-76f)
                lineToRelative(-38f, -112f)
                horizontalLineTo(392f)
                lineToRelative(-40f, 112f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(138f, -176f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
            }
        }.build()
        
        return _Text_rotation_none!!
    }

private var _Text_rotation_none: ImageVector? = null

