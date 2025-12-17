package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeVr: ImageVector
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
                moveTo(9.673f, 5.933f)
                verticalLineToRelative(1.938f)
                horizontalLineToRelative(1.033f)
                curveToRelative(0.66f, 0f, 1.068f, -0.316f, 1.068f, -0.95f)
                curveToRelative(0f, -0.64f, -0.422f, -0.988f, -1.05f, -0.988f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(5.937f, 7f)
                lineToRelative(1.99f, -5.999f)
                horizontalLineTo(6.61f)
                lineTo(5.277f, 9.708f)
                horizontalLineTo(5.22f)
                lineTo(3.875f, 5.001f)
                horizontalLineTo(2.5f)
                lineTo(4.508f, 11f)
                close()
                moveTo(8.5f, 5.001f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.173f)
                verticalLineTo(8.763f)
                horizontalLineToRelative(1.064f)
                lineTo(11.787f, 11f)
                horizontalLineToRelative(1.327f)
                lineTo(11.91f, 8.583f)
                curveTo(12.455f, 8.373f, 13f, 7.779f, 13f, 6.9f)
                curveToRelative(0f, -1.147f, -0.773f, -1.9f, -2.105f, -1.9f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        
        return _BadgeVr!!
    }

private var _BadgeVr: ImageVector? = null

