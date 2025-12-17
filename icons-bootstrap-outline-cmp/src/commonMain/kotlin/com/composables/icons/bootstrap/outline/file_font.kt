package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileFont: ImageVector
    get() {
        if (_FileFont != null) return _FileFont!!
        
        _FileFont = ImageVector.Builder(
            name = "file-font",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.943f, 4f)
                horizontalLineTo(5.057f)
                lineTo(5f, 6f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.18f, -1.096f, 0.356f, -1.192f, 1.694f, -1.235f)
                lineToRelative(0.293f, -0.01f)
                verticalLineToRelative(6.09f)
                curveToRelative(0f, 0.47f, -0.1f, 0.582f, -0.898f, 0.655f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(9.41f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-0.803f, -0.073f, -0.903f, -0.184f, -0.903f, -0.654f)
                verticalLineTo(4.755f)
                lineToRelative(0.298f, 0.01f)
                curveToRelative(1.338f, 0.043f, 1.514f, 0.14f, 1.694f, 1.235f)
                horizontalLineToRelative(0.5f)
                lineToRelative(-0.057f, -2f)
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
        
        return _FileFont!!
    }

private var _FileFont: ImageVector? = null

