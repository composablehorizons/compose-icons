package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Schedule_send: ImageVector
    get() {
        if (_Schedule_send != null) return _Schedule_send!!
        
        _Schedule_send = ImageVector.Builder(
            name = "schedule_send",
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
                        moveTo(17f, 10f)
                        curveToRelative(0.1f, 0f, 0.19f, 0.01f, 0.28f, 0.01f)
                        lineTo(4.39f, 4.58f)
                        curveTo(3.73f, 4.31f, 3f, 4.79f, 3f, 5.51f)
                        verticalLineToRelative(3.71f)
                        curveToRelative(0f, 0.46f, 0.31f, 0.86f, 0.76f, 0.97f)
                        lineTo(11f, 12f)
                        lineToRelative(-7.24f, 1.81f)
                        curveTo(3.31f, 13.92f, 3f, 14.32f, 3f, 14.78f)
                        verticalLineToRelative(3.71f)
                        curveToRelative(0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f)
                        lineTo(10f, 17.05f)
                        curveToRelative(0f, -0.02f, 0f, -0.03f, 0f, -0.05f)
                        curveTo(10f, 13.14f, 13.14f, 10f, 17f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 12f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                        reflectiveCurveTo(19.76f, 12f, 17f, 12f)
                        close()
                        moveTo(18.29f, 19f)
                        lineToRelative(-1.65f, -1.65f)
                        curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                        verticalLineToRelative(-2.5f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(2.29f)
                        lineToRelative(1.5f, 1.5f)
                        curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(0f, 0f)
                        curveTo(18.8f, 19.2f, 18.49f, 19.2f, 18.29f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Schedule_send!!
    }

private var _Schedule_send: ImageVector? = null

