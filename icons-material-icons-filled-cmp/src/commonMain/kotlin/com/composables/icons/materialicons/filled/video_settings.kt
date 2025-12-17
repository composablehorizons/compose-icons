package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Video_settings: ImageVector
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
                        horizontalLineToRelative(18f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(3f)
                        curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(3f)
                        verticalLineTo(6f)
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
                        moveTo(22.71f, 18.43f)
                        curveToRelative(0.03f, -0.29f, 0.04f, -0.58f, 0.01f, -0.86f)
                        lineToRelative(1.07f, -0.85f)
                        curveToRelative(0.1f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f)
                        lineToRelative(-1.03f, -1.79f)
                        curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f)
                        lineTo(21.23f, 15f)
                        curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f)
                        lineToRelative(-0.2f, -1.36f)
                        curveTo(20.26f, 13.09f, 20.16f, 13f, 20.03f, 13f)
                        horizontalLineToRelative(-2.07f)
                        curveToRelative(-0.12f, 0f, -0.23f, 0.09f, -0.25f, 0.21f)
                        lineToRelative(-0.2f, 1.36f)
                        curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f)
                        lineToRelative(-1.28f, -0.5f)
                        curveToRelative(-0.12f, -0.05f, -0.25f, 0f, -0.31f, 0.11f)
                        lineToRelative(-1.03f, 1.79f)
                        curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f)
                        lineToRelative(1.07f, 0.86f)
                        curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f)
                        lineToRelative(-1.07f, 0.85f)
                        curveToRelative(-0.1f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f)
                        lineToRelative(1.03f, 1.79f)
                        curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f)
                        lineToRelative(1.27f, -0.5f)
                        curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f)
                        lineToRelative(0.2f, 1.36f)
                        curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f)
                        horizontalLineToRelative(2.07f)
                        curveToRelative(0.12f, 0f, 0.23f, -0.09f, 0.25f, -0.21f)
                        lineToRelative(0.2f, -1.36f)
                        curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f)
                        lineToRelative(1.28f, 0.5f)
                        curveToRelative(0.12f, 0.05f, 0.25f, 0f, 0.31f, -0.11f)
                        lineToRelative(1.03f, -1.79f)
                        curveToRelative(0.06f, -0.11f, 0.04f, -0.24f, -0.06f, -0.32f)
                        lineTo(22.71f, 18.43f)
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

