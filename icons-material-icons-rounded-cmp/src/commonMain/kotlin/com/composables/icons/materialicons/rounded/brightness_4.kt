package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Brightness_4: ImageVector
    get() {
        if (_Brightness_4 != null) return _Brightness_4!!
        
        _Brightness_4 = ImageVector.Builder(
            name = "brightness_4",
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
                            moveTo(22.6f, 11.29f)
                            lineTo(20f, 8.69f)
                            verticalLineTo(5f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineToRelative(-3.69f)
                            lineToRelative(-2.6f, -2.6f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineTo(8.69f, 4f)
                            horizontalLineTo(5f)
                            curveTo(4.45f, 4f, 4f, 4.45f, 4f, 5f)
                            verticalLineToRelative(3.69f)
                            lineToRelative(-2.6f, 2.6f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineTo(4f, 15.3f)
                            verticalLineTo(19f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(3.69f)
                            lineToRelative(2.6f, 2.6f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(2.6f, -2.6f)
                            horizontalLineTo(19f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-3.69f)
                            lineToRelative(2.6f, -2.6f)
                            curveTo(22.99f, 12.32f, 22.99f, 11.68f, 22.6f, 11.29f)
                            close()
                            moveTo(17.92f, 12.98f)
                            curveToRelative(-0.34f, 2.12f, -1.85f, 3.94f, -3.88f, 4.66f)
                            curveToRelative(-1.21f, 0.43f, -2.41f, 0.45f, -3.5f, 0.18f)
                            curveToRelative(-0.41f, -0.1f, -0.48f, -0.65f, -0.13f, -0.9f)
                            curveTo(11.98f, 15.84f, 13f, 14.04f, 13f, 12f)
                            reflectiveCurveToRelative(-1.02f, -3.84f, -2.58f, -4.92f)
                            curveToRelative(-0.35f, -0.24f, -0.29f, -0.79f, 0.13f, -0.9f)
                            curveToRelative(1.09f, -0.27f, 2.29f, -0.25f, 3.5f, 0.18f)
                            curveToRelative(2.02f, 0.72f, 3.54f, 2.54f, 3.88f, 4.66f)
                            curveTo(17.98f, 11.35f, 18f, 11.68f, 18f, 12f)
                            curveTo(17.99f, 12.32f, 17.97f, 12.65f, 17.92f, 12.98f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Brightness_4!!
    }

private var _Brightness_4: ImageVector? = null

