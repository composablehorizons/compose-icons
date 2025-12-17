package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileBinary: ImageVector
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
                moveTo(5.526f, 9.273f)
                curveToRelative(-0.542f, 0f, -0.832f, 0.563f, -0.832f, 1.612f)
                quadToRelative(0f, 0.133f, 0.006f, 0.252f)
                lineToRelative(1.56f, -1.143f)
                curveToRelative(-0.126f, -0.474f, -0.375f, -0.72f, -0.733f, -0.72f)
                close()
                moveToRelative(-0.732f, 2.508f)
                curveToRelative(0.126f, 0.472f, 0.372f, 0.718f, 0.732f, 0.718f)
                curveToRelative(0.54f, 0f, 0.83f, -0.563f, 0.83f, -1.614f)
                quadToRelative(0f, -0.129f, -0.006f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(7.05f, 10.885f)
                curveToRelative(0f, 1.415f, -0.548f, 2.206f, -1.524f, 2.206f)
                curveTo(4.548f, 13.09f, 4f, 12.3f, 4f, 10.885f)
                curveToRelative(0f, -1.412f, 0.548f, -2.203f, 1.526f, -2.203f)
                curveToRelative(0.976f, 0f, 1.524f, 0.79f, 1.524f, 2.203f)
                moveToRelative(3.805f, 1.52f)
                verticalLineTo(13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.595f)
                horizontalLineToRelative(1.181f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-1.136f, 0.747f)
                verticalLineToRelative(-0.688f)
                lineToRelative(1.19f, -0.786f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(3.633f)
                close()
            }
        }.build()
        
        return _FileBinary!!
    }

private var _FileBinary: ImageVector? = null

