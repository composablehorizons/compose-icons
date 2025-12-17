package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileMusic: ImageVector
    get() {
        if (_FileMusic != null) return _FileMusic!!
        
        _FileMusic = ImageVector.Builder(
            name = "file-music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.304f, 3.13f)
                arcToRelative(1f, 1f, 0f, false, true, 1.196f, 0.98f)
                verticalLineToRelative(1.8f)
                lineToRelative(-2.5f, 0.5f)
                verticalLineToRelative(5.09f)
                curveToRelative(0f, 0.495f, -0.301f, 0.883f, -0.662f, 1.123f)
                curveTo(7.974f, 12.866f, 7.499f, 13f, 7f, 13f)
                reflectiveCurveToRelative(-0.974f, -0.134f, -1.338f, -0.377f)
                curveTo(5.302f, 12.383f, 5f, 11.995f, 5f, 11.5f)
                reflectiveCurveToRelative(0.301f, -0.883f, 0.662f, -1.123f)
                curveTo(6.026f, 10.134f, 6.501f, 10f, 7f, 10f)
                curveToRelative(0.356f, 0f, 0.7f, 0.068f, 1f, 0.196f)
                verticalLineTo(4.41f)
                arcToRelative(1f, 1f, 0f, false, true, 0.804f, -0.98f)
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
        
        return _FileMusic!!
    }

private var _FileMusic: ImageVector? = null

