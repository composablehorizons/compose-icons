package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileBinary: ImageVector
    get() {
        if (_FileBinary != null) return _FileBinary!!
        
        _FileBinary = ImageVector.Builder(
            name = "file-binary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.526f, 13.09f)
                curveToRelative(0.976f, 0f, 1.524f, -0.79f, 1.524f, -2.205f)
                curveToRelative(0f, -1.412f, -0.548f, -2.203f, -1.524f, -2.203f)
                curveToRelative(-0.978f, 0f, -1.526f, 0.79f, -1.526f, 2.203f)
                curveToRelative(0f, 1.415f, 0.548f, 2.206f, 1.526f, 2.206f)
                close()
                moveToRelative(-0.832f, -2.205f)
                curveToRelative(0f, -1.05f, 0.29f, -1.612f, 0.832f, -1.612f)
                curveToRelative(0.358f, 0f, 0.607f, 0.247f, 0.733f, 0.721f)
                lineTo(4.7f, 11.137f)
                arcToRelative(7f, 7f, 0f, false, true, -0.006f, -0.252f)
                moveToRelative(0.832f, 1.614f)
                curveToRelative(-0.36f, 0f, -0.606f, -0.246f, -0.732f, -0.718f)
                lineToRelative(1.556f, -1.145f)
                quadToRelative(0.005f, 0.12f, 0.005f, 0.249f)
                curveToRelative(0f, 1.052f, -0.29f, 1.614f, -0.829f, 1.614f)
                moveToRelative(5.329f, 0.501f)
                verticalLineToRelative(-0.595f)
                horizontalLineTo(9.73f)
                verticalLineTo(8.772f)
                horizontalLineToRelative(-0.69f)
                lineToRelative(-1.19f, 0.786f)
                verticalLineToRelative(0.688f)
                lineTo(8.986f, 9.5f)
                horizontalLineToRelative(0.05f)
                verticalLineToRelative(2.906f)
                horizontalLineToRelative(-1.18f)
                verticalLineTo(13f)
                horizontalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _FileBinary!!
    }

private var _FileBinary: ImageVector? = null

