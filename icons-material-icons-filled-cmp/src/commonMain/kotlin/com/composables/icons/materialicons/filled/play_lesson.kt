package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Play_lesson: ImageVector
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
                        moveTo(7f, 11f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(7f)
                        lineTo(9.5f, 9.5f)
                        lineTo(7f, 11f)
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
                        moveTo(16.75f, 20.5f)
                        verticalLineToRelative(-5f)
                        lineToRelative(4f, 2.5f)
                        lineTo(16.75f, 20.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

