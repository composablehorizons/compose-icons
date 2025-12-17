package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeTtf: ImageVector
    get() {
        if (_FiletypeTtf != null) return _FiletypeTtf!!
        
        _FiletypeTtf = ImageVector.Builder(
            name = "filetype-ttf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(1.928f, 15.849f)
                verticalLineToRelative(-3.337f)
                horizontalLineToRelative(2.269f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(0.794f)
                verticalLineToRelative(-3.337f)
                horizontalLineToRelative(1.137f)
                verticalLineToRelative(-0.662f)
                horizontalLineTo(0f)
                verticalLineToRelative(0.662f)
                horizontalLineToRelative(1.134f)
                verticalLineToRelative(3.337f)
                close()
                moveToRelative(5.315f, -1.59f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-0.791f)
                verticalLineTo(11.85f)
                horizontalLineTo(9f)
                verticalLineToRelative(0.653f)
                horizontalLineTo(7.243f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(0.638f)
                close()
            }
        }.build()
        
        return _FiletypeTtf!!
    }

private var _FiletypeTtf: ImageVector? = null

