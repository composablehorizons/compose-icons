package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Touch_app: ImageVector
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9f, 11.24f)
                            verticalLineTo(7.5f)
                            curveTo(9f, 6.12f, 10.12f, 5f, 11.5f, 5f)
                            reflectiveCurveTo(14f, 6.12f, 14f, 7.5f)
                            verticalLineToRelative(3.74f)
                            curveToRelative(1.21f, -0.81f, 2f, -2.18f, 2f, -3.74f)
                            curveTo(16f, 5.01f, 13.99f, 3f, 11.5f, 3f)
                            reflectiveCurveTo(7f, 5.01f, 7f, 7.5f)
                            curveTo(7f, 9.06f, 7.79f, 10.43f, 9f, 11.24f)
                            close()
                            moveTo(18.84f, 15.87f)
                            lineToRelative(-4.54f, -2.26f)
                            curveToRelative(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f)
                            horizontalLineTo(13f)
                            verticalLineToRelative(-6f)
                            curveTo(13f, 6.67f, 12.33f, 6f, 11.5f, 6f)
                            reflectiveCurveTo(10f, 6.67f, 10f, 7.5f)
                            verticalLineToRelative(10.74f)
                            curveToRelative(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f)
                            curveToRelative(-0.31f, 0f, -0.59f, 0.13f, -0.79f, 0.33f)
                            lineToRelative(-0.79f, 0.8f)
                            lineToRelative(4.94f, 4.94f)
                            curveTo(9.96f, 23.83f, 10.34f, 24f, 10.75f, 24f)
                            horizontalLineToRelative(6.79f)
                            curveToRelative(0.75f, 0f, 1.33f, -0.55f, 1.44f, -1.28f)
                            lineToRelative(0.75f, -5.27f)
                            curveToRelative(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f)
                            curveTo(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Touch_app!!
    }

private var _Touch_app: ImageVector? = null

