package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeAr: ImageVector
    get() {
        if (_BadgeAr != null) return _BadgeAr!!
        
        _BadgeAr = ImageVector.Builder(
            name = "badge-ar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.794f, 11f)
                lineToRelative(0.47f, -1.542f)
                horizontalLineTo(6.27f)
                lineTo(6.739f, 11f)
                horizontalLineTo(8f)
                lineTo(5.996f, 5.001f)
                horizontalLineTo(4.607f)
                lineTo(2.595f, 11f)
                close()
                moveToRelative(1.503f, -4.852f)
                lineToRelative(0.734f, 2.426f)
                horizontalLineToRelative(-1.52f)
                lineToRelative(0.734f, -2.426f)
                close()
                moveToRelative(5.598f, -1.147f)
                horizontalLineTo(8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.173f)
                verticalLineTo(8.763f)
                horizontalLineToRelative(1.064f)
                lineTo(11.787f, 11f)
                horizontalLineToRelative(1.327f)
                lineTo(11.91f, 8.583f)
                curveTo(12.455f, 8.373f, 13f, 7.779f, 13f, 6.9f)
                curveToRelative(0f, -1.147f, -0.773f, -1.9f, -2.105f, -1.9f)
                close()
                moveToRelative(-1.222f, 2.87f)
                verticalLineTo(5.933f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.63f, 0f, 1.05f, 0.347f, 1.05f, 0.989f)
                curveToRelative(0f, 0.633f, -0.408f, 0.95f, -1.067f, 0.95f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _BadgeAr!!
    }

private var _BadgeAr: ImageVector? = null

