package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pinch: ImageVector
    get() {
        if (_Pinch != null) return _Pinch!!
        
        _Pinch = ImageVector.Builder(
            name = "pinch",
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
                    moveTo(21f, 15.56f)
                    lineToRelative(-4.24f, -1.89f)
                    horizontalLineTo(15f)
                    verticalLineTo(7.5f)
                    curveTo(15f, 7.22f, 14.78f, 7f, 14.5f, 7f)
                    reflectiveCurveTo(14f, 7.22f, 14f, 7.5f)
                    verticalLineToRelative(10.61f)
                    lineToRelative(-4.17f, -0.89f)
                    lineToRelative(3.7f, 3.78f)
                    horizontalLineToRelative(6.55f)
                    lineTo(21f, 15.56f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 2.5f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(9.5f)
                    verticalLineTo(3.56f)
                    lineTo(3.56f, 9.5f)
                    horizontalLineTo(6f)
                    verticalLineTo(11f)
                    horizontalLineTo(1f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.44f)
                    lineTo(8.44f, 2.5f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(21.89f, 13.77f)
                    lineToRelative(-3.8f, -1.67f)
                    curveTo(17.96f, 12.04f, 17.81f, 12f, 17.65f, 12f)
                    horizontalLineTo(17f)
                    verticalLineTo(7.5f)
                    curveTo(17f, 6.12f, 15.88f, 5f, 14.5f, 5f)
                    reflectiveCurveTo(12f, 6.12f, 12f, 7.5f)
                    verticalLineToRelative(8.15f)
                    lineToRelative(-1.87f, -0.4f)
                    curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                    lineTo(7f, 17.22f)
                    lineToRelative(5.12f, 5.19f)
                    curveTo(12.49f, 22.79f, 13f, 23f, 13.53f, 23f)
                    horizontalLineToRelative(6.55f)
                    curveToRelative(0.98f, 0f, 1.81f, -0.7f, 1.97f, -1.67f)
                    lineToRelative(0.92f, -5.44f)
                    curveTo(23.12f, 15.03f, 22.68f, 14.17f, 21.89f, 13.77f)
                    close()
                    moveTo(20.08f, 21f)
                    horizontalLineToRelative(-6.55f)
                    lineToRelative(-3.7f, -3.78f)
                    lineTo(14f, 18.11f)
                    verticalLineTo(7.5f)
                    curveTo(14f, 7.22f, 14.22f, 7f, 14.5f, 7f)
                    reflectiveCurveTo(15f, 7.22f, 15f, 7.5f)
                    verticalLineToRelative(6.18f)
                    horizontalLineToRelative(1.76f)
                    lineTo(21f, 15.56f)
                    lineTo(20.08f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Pinch!!
    }

private var _Pinch: ImageVector? = null

