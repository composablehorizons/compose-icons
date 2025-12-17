package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkFont: ImageVector
    get() {
        if (_FileEarmarkFont != null) return _FileEarmarkFont!!
        
        _FileEarmarkFont = ImageVector.Builder(
            name = "file-earmark-font",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.943f, 6f)
                horizontalLineTo(5.057f)
                lineTo(5f, 8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.18f, -1.096f, 0.356f, -1.192f, 1.694f, -1.235f)
                lineToRelative(0.293f, -0.01f)
                verticalLineToRelative(5.09f)
                curveToRelative(0f, 0.47f, -0.1f, 0.582f, -0.898f, 0.655f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(9.41f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-0.803f, -0.073f, -0.903f, -0.184f, -0.903f, -0.654f)
                verticalLineTo(6.755f)
                lineToRelative(0.298f, 0.01f)
                curveToRelative(1.338f, 0.043f, 1.514f, 0.14f, 1.694f, 1.235f)
                horizontalLineToRelative(0.5f)
                lineToRelative(-0.057f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveToRelative(-3f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _FileEarmarkFont!!
    }

private var _FileEarmarkFont: ImageVector? = null

