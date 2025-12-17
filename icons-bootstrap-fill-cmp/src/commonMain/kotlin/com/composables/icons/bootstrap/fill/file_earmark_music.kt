package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkMusic: ImageVector
    get() {
        if (_FileEarmarkMusic != null) return _FileEarmarkMusic!!
        
        _FileEarmarkMusic = ImageVector.Builder(
            name = "file-earmark-music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveTo(11f, 6.64f)
                verticalLineToRelative(1.75f)
                lineToRelative(-2f, 0.5f)
                verticalLineToRelative(3.61f)
                curveToRelative(0f, 0.495f, -0.301f, 0.883f, -0.662f, 1.123f)
                curveTo(7.974f, 13.866f, 7.499f, 14f, 7f, 14f)
                reflectiveCurveToRelative(-0.974f, -0.134f, -1.338f, -0.377f)
                curveTo(5.302f, 13.383f, 5f, 12.995f, 5f, 12.5f)
                reflectiveCurveToRelative(0.301f, -0.883f, 0.662f, -1.123f)
                curveTo(6.026f, 11.134f, 6.501f, 11f, 7f, 11f)
                curveToRelative(0.356f, 0f, 0.7f, 0.068f, 1f, 0.196f)
                verticalLineTo(6.89f)
                arcToRelative(1f, 1f, 0f, false, true, 0.757f, -0.97f)
                lineToRelative(1f, -0.25f)
                arcTo(1f, 1f, 0f, false, true, 11f, 6.64f)
            }
        }.build()
        
        return _FileEarmarkMusic!!
    }

private var _FileEarmarkMusic: ImageVector? = null

