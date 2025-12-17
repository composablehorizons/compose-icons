package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Live_tv: ImageVector
    get() {
        if (_Live_tv != null) return _Live_tv!!
        
        _Live_tv = ImageVector.Builder(
            name = "live_tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 17.15f)
                lineToRelative(3.98f, -2.28f)
                curveToRelative(0.67f, -0.38f, 0.67f, -1.35f, 0f, -1.74f)
                lineToRelative(-3.98f, -2.28f)
                curveToRelative(-0.67f, -0.38f, -1.5f, 0.11f, -1.5f, 0.87f)
                verticalLineToRelative(4.55f)
                curveToRelative(0f, 0.77f, 0.83f, 1.26f, 1.5f, 0.88f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-7.59f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineTo(12f, 5.99f)
                lineTo(8.36f, 2.35f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineTo(10.59f, 6f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-1f, 14f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Live_tv!!
    }

private var _Live_tv: ImageVector? = null

