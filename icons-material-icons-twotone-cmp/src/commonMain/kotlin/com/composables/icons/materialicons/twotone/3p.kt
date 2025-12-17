package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.`3p`: ImageVector
    get() {
        if (_3p != null) return _3p!!
        
        _3p = ImageVector.Builder(
            name = "3p",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 4f)
                    verticalLineToRelative(13.17f)
                    lineTo(5.17f, 16f)
                    horizontalLineTo(20f)
                    verticalLineTo(4f)
                    horizontalLineTo(4f)
                    close()
                    moveTo(12f, 6f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveTo(10.9f, 6f, 12f, 6f)
                    close()
                    moveTo(16f, 14f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-0.57f)
                    curveToRelative(0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                    curveTo(10.07f, 11.21f, 11.01f, 11f, 12f, 11f)
                    curveToRelative(0.99f, 0f, 1.93f, 0.21f, 2.78f, 0.58f)
                    curveTo(15.52f, 11.9f, 16f, 12.62f, 16f, 13.43f)
                    verticalLineTo(14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 2f)
                    horizontalLineTo(4.01f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    lineTo(2f, 22f)
                    lineToRelative(4f, -4f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(20f, 16f)
                    horizontalLineTo(5.17f)
                    lineTo(4f, 17.17f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(16f)
                    close()
                    moveTo(12f, 10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                    close()
                    moveTo(16f, 13.43f)
                    curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                    curveTo(13.93f, 11.21f, 12.99f, 11f, 12f, 11f)
                    curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                    curveTo(8.48f, 11.9f, 8f, 12.62f, 8f, 13.43f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(13.43f)
                    close()
                }
            }
        }.build()
        
        return _3p!!
    }

private var _3p: ImageVector? = null

