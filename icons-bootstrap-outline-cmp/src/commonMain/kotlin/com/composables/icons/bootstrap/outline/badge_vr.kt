package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeVr: ImageVector
    get() {
        if (_BadgeVr != null) return _BadgeVr!!
        
        _BadgeVr = ImageVector.Builder(
            name = "badge-vr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.508f, 11f)
                horizontalLineToRelative(1.429f)
                lineToRelative(1.99f, -5.999f)
                horizontalLineTo(6.61f)
                lineTo(5.277f, 9.708f)
                horizontalLineTo(5.22f)
                lineTo(3.875f, 5.001f)
                horizontalLineTo(2.5f)
                close()
                moveToRelative(6.387f, -5.999f)
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
        }.build()
        
        return _BadgeVr!!
    }

private var _BadgeVr: ImageVector? = null

