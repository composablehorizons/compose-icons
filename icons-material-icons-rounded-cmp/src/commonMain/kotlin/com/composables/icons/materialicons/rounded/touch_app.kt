package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Touch_app: ImageVector
    get() {
        if (_Touch_app != null) return _Touch_app!!
        
        _Touch_app = ImageVector.Builder(
            name = "touch_app",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.79f, 9.24f)
                        verticalLineTo(5.5f)
                        curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                        reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                        verticalLineToRelative(3.74f)
                        curveToRelative(1.21f, -0.81f, 2f, -2.18f, 2f, -3.74f)
                        curveToRelative(0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f)
                        reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f)
                        curveTo(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f)
                        close()
                        moveTo(14.29f, 11.71f)
                        curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f)
                        horizontalLineToRelative(-0.61f)
                        verticalLineToRelative(-6f)
                        curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                        verticalLineToRelative(10.74f)
                        lineToRelative(-3.44f, -0.72f)
                        curveToRelative(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f)
                        curveToRelative(-0.43f, 0.44f, -0.43f, 1.14f, 0f, 1.58f)
                        lineToRelative(4.01f, 4.01f)
                        curveTo(9.71f, 21.79f, 10.22f, 22f, 10.75f, 22f)
                        horizontalLineToRelative(6.1f)
                        curveToRelative(1f, 0f, 1.84f, -0.73f, 1.98f, -1.72f)
                        lineToRelative(0.63f, -4.47f)
                        curveToRelative(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f)
                        lineTo(14.29f, 11.71f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Touch_app!!
    }

private var _Touch_app: ImageVector? = null

