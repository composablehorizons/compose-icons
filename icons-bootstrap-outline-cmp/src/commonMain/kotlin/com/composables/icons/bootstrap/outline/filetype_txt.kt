package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeTxt: ImageVector
    get() {
        if (_FiletypeTxt != null) return _FiletypeTxt!!
        
        _FiletypeTxt = ImageVector.Builder(
            name = "filetype-txt",
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
                horizontalLineToRelative(1.136f)
                verticalLineToRelative(-0.662f)
                horizontalLineTo(0f)
                verticalLineToRelative(0.662f)
                horizontalLineToRelative(1.134f)
                verticalLineToRelative(3.337f)
                close()
                moveToRelative(4.689f, -3.999f)
                horizontalLineToRelative(-0.894f)
                lineTo(4.9f, 13.289f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.832f, -1.439f)
                horizontalLineToRelative(-0.932f)
                lineToRelative(1.228f, 1.983f)
                lineToRelative(-1.24f, 2.016f)
                horizontalLineToRelative(0.862f)
                lineToRelative(0.853f, -1.415f)
                horizontalLineToRelative(0.035f)
                lineToRelative(0.85f, 1.415f)
                horizontalLineToRelative(0.907f)
                lineToRelative(-1.253f, -1.992f)
                close()
                moveToRelative(1.93f, 0.662f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(-0.794f)
                verticalLineToRelative(-3.337f)
                horizontalLineTo(6.619f)
                verticalLineToRelative(-0.662f)
                horizontalLineToRelative(3.064f)
                verticalLineToRelative(0.662f)
                horizontalLineTo(8.546f)
                close()
            }
        }.build()
        
        return _FiletypeTxt!!
    }

private var _FiletypeTxt: ImageVector? = null

