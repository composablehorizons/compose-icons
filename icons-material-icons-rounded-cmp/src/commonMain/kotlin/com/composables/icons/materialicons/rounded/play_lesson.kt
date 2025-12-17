package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Play_lesson: ImageVector
    get() {
        if (_Play_lesson != null) return _Play_lesson!!
        
        _Play_lesson = ImageVector.Builder(
            name = "play_lesson",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(18f, 11f)
                        curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.08f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 2f, 3f, 2.9f, 3f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(7.26f)
                        curveTo(11.47f, 20.87f, 11f, 19.49f, 11f, 18f)
                        curveTo(11f, 14.13f, 14.13f, 11f, 18f, 11f)
                        close()
                        moveTo(7.76f, 10.55f)
                        curveTo(7.42f, 10.75f, 7f, 10.51f, 7f, 10.12f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(6.12f)
                        curveToRelative(0f, 0.39f, -0.42f, 0.63f, -0.76f, 0.43f)
                        lineTo(9.5f, 9.5f)
                        lineTo(7.76f, 10.55f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 13f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        reflectiveCurveTo(20.76f, 13f, 18f, 13f)
                        close()
                        moveTo(16.75f, 19.6f)
                        verticalLineToRelative(-3.2f)
                        curveToRelative(0f, -0.39f, 0.43f, -0.63f, 0.76f, -0.42f)
                        lineToRelative(2.56f, 1.6f)
                        curveToRelative(0.31f, 0.2f, 0.31f, 0.65f, 0f, 0.85f)
                        lineToRelative(-2.56f, 1.6f)
                        curveTo(17.18f, 20.23f, 16.75f, 19.99f, 16.75f, 19.6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

