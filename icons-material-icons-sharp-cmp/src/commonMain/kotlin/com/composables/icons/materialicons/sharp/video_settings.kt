package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Video_settings: ImageVector
    get() {
        if (_Video_settings != null) return _Video_settings!!
        
        _Video_settings = ImageVector.Builder(
            name = "video_settings",
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
                        moveTo(3f, 6f)
                        lineTo(21f, 6f)
                        lineTo(21f, 11f)
                        lineTo(23f, 11f)
                        lineTo(23f, 4f)
                        lineTo(1f, 4f)
                        lineTo(1f, 20f)
                        lineTo(12f, 20f)
                        lineTo(12f, 18f)
                        lineTo(3f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 12f)
                        lineTo(9f, 8f)
                        lineTo(9f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.72f, 17.57f)
                        lineToRelative(1.23f, -0.98f)
                        lineToRelative(-1.25f, -2.17f)
                        lineTo(21.23f, 15f)
                        curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f)
                        lineTo(20.25f, 13f)
                        horizontalLineToRelative(-2.5f)
                        lineToRelative(-0.24f, 1.58f)
                        curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f)
                        lineToRelative(-1.48f, -0.58f)
                        lineToRelative(-1.25f, 2.17f)
                        lineToRelative(1.24f, 0.99f)
                        curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f)
                        lineToRelative(-1.23f, 0.98f)
                        lineToRelative(1.25f, 2.17f)
                        lineTo(16.77f, 21f)
                        curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f)
                        lineTo(17.75f, 23f)
                        horizontalLineToRelative(2.5f)
                        lineToRelative(0.24f, -1.58f)
                        curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f)
                        lineToRelative(1.48f, 0.58f)
                        lineToRelative(1.25f, -2.17f)
                        lineToRelative(-1.24f, -0.99f)
                        curveTo(22.75f, 18.14f, 22.75f, 17.85f, 22.72f, 17.57f)
                        close()
                        moveTo(19f, 19.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(19.83f, 19.5f, 19f, 19.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Video_settings!!
    }

private var _Video_settings: ImageVector? = null

