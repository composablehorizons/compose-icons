package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tour: ImageVector
    get() {
        if (_Tour != null) return _Tour!!
        
        _Tour = ImageVector.Builder(
            name = "tour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20.45f, 5.37f)
                    curveTo(20.71f, 4.71f, 20.23f, 4f, 19.52f, 4f)
                    horizontalLineTo(13f)
                    horizontalLineToRelative(-1f)
                    horizontalLineTo(7f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveTo(5.45f, 2f, 5f, 2.45f, 5f, 3f)
                    verticalLineToRelative(1f)
                    verticalLineToRelative(10f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(4f)
                    horizontalLineToRelative(1f)
                    horizontalLineToRelative(7.52f)
                    curveToRelative(0.71f, 0f, 1.19f, -0.71f, 0.93f, -1.37f)
                    lineTo(19f, 9f)
                    lineTo(20.45f, 5.37f)
                    close()
                    moveTo(15f, 9f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(15f, 7.9f, 15f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Tour!!
    }

private var _Tour: ImageVector? = null

