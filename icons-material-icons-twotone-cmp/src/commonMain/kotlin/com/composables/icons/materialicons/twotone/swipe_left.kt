package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Swipe_left: ImageVector
    get() {
        if (_Swipe_left != null) return _Swipe_left!!
        
        _Swipe_left = ImageVector.Builder(
            name = "swipe_left",
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
                    moveTo(17.08f, 21f)
                    horizontalLineToRelative(-6.55f)
                    lineToRelative(-3.7f, -3.78f)
                    lineTo(11f, 18.11f)
                    verticalLineTo(7.5f)
                    curveTo(11f, 7.22f, 11.22f, 7f, 11.5f, 7f)
                    reflectiveCurveTo(12f, 7.22f, 12f, 7.5f)
                    verticalLineToRelative(6.18f)
                    horizontalLineToRelative(1.76f)
                    lineTo(18f, 15.56f)
                    lineTo(17.08f, 21f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.89f, 13.77f)
                    lineToRelative(-3.8f, -1.67f)
                    curveTo(14.96f, 12.04f, 14.81f, 12f, 14.65f, 12f)
                    horizontalLineTo(14f)
                    verticalLineTo(7.5f)
                    curveTo(14f, 6.12f, 12.88f, 5f, 11.5f, 5f)
                    reflectiveCurveTo(9f, 6.12f, 9f, 7.5f)
                    verticalLineToRelative(8.15f)
                    lineToRelative(-1.87f, -0.4f)
                    curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                    lineTo(4f, 17.22f)
                    lineToRelative(5.12f, 5.19f)
                    curveTo(9.49f, 22.79f, 10f, 23f, 10.53f, 23f)
                    horizontalLineToRelative(6.55f)
                    curveToRelative(0.98f, 0f, 1.81f, -0.7f, 1.97f, -1.67f)
                    lineToRelative(0.92f, -5.44f)
                    curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f)
                    close()
                    moveTo(17.08f, 21f)
                    horizontalLineToRelative(-6.55f)
                    lineToRelative(-3.7f, -3.78f)
                    lineTo(11f, 18.11f)
                    verticalLineTo(7.5f)
                    curveTo(11f, 7.22f, 11.22f, 7f, 11.5f, 7f)
                    reflectiveCurveTo(12f, 7.22f, 12f, 7.5f)
                    verticalLineToRelative(6.18f)
                    horizontalLineToRelative(1.76f)
                    lineTo(18f, 15.56f)
                    lineTo(17.08f, 21f)
                    close()
                    moveTo(4.09f, 5.5f)
                    horizontalLineTo(7f)
                    verticalLineTo(7f)
                    horizontalLineTo(2f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.02f)
                    curveTo(5.82f, 2.13f, 8.78f, 1f, 12f, 1f)
                    curveToRelative(5.49f, 0f, 9.27f, 3.12f, 10f, 6f)
                    horizontalLineToRelative(-1.57f)
                    curveTo(19.67f, 5.02f, 16.74f, 2.5f, 12f, 2.5f)
                    curveTo(8.97f, 2.5f, 6.21f, 3.64f, 4.09f, 5.5f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_left!!
    }

private var _Swipe_left: ImageVector? = null

