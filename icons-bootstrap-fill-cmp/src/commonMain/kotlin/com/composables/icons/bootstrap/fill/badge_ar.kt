package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeAr: ImageVector
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
                moveTo(6.031f, 8.574f)
                lineToRelative(-0.734f, -2.426f)
                horizontalLineToRelative(-0.052f)
                lineTo(4.51f, 8.574f)
                horizontalLineToRelative(1.52f)
                close()
                moveToRelative(3.642f, -2.641f)
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
                moveToRelative(4.265f, 5.458f)
                horizontalLineToRelative(2.004f)
                lineTo(6.739f, 11f)
                horizontalLineTo(8f)
                lineTo(5.996f, 5.001f)
                horizontalLineTo(4.607f)
                lineTo(2.595f, 11f)
                horizontalLineToRelative(1.2f)
                close()
                moveTo(8.5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.173f)
                verticalLineTo(8.763f)
                horizontalLineToRelative(1.064f)
                lineTo(11.787f, 11f)
                horizontalLineToRelative(1.327f)
                lineTo(11.91f, 8.583f)
                curveTo(12.455f, 8.373f, 13f, 7.779f, 13f, 6.9f)
                curveToRelative(0f, -1.147f, -0.773f, -1.9f, -2.105f, -1.9f)
                close()
            }
        }.build()
        
        return _BadgeAr!!
    }

private var _BadgeAr: ImageVector? = null

