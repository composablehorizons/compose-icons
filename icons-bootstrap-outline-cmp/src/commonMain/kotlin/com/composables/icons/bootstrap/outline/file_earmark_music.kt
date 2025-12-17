package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkMusic: ImageVector
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
                moveTo(11f, 6.64f)
                arcToRelative(1f, 1f, 0f, false, false, -1.243f, -0.97f)
                lineToRelative(-1f, 0.25f)
                arcTo(1f, 1f, 0f, false, false, 8f, 6.89f)
                verticalLineToRelative(4.306f)
                arcTo(2.6f, 2.6f, 0f, false, false, 7f, 11f)
                curveToRelative(-0.5f, 0f, -0.974f, 0.134f, -1.338f, 0.377f)
                curveToRelative(-0.36f, 0.24f, -0.662f, 0.628f, -0.662f, 1.123f)
                reflectiveCurveToRelative(0.301f, 0.883f, 0.662f, 1.123f)
                curveToRelative(0.364f, 0.243f, 0.839f, 0.377f, 1.338f, 0.377f)
                reflectiveCurveToRelative(0.974f, -0.134f, 1.338f, -0.377f)
                curveToRelative(0.36f, -0.24f, 0.662f, -0.628f, 0.662f, -1.123f)
                verticalLineTo(8.89f)
                lineToRelative(2f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 14f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(9.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.5f)
                close()
            }
        }.build()
        
        return _FileEarmarkMusic!!
    }

private var _FileEarmarkMusic: ImageVector? = null

