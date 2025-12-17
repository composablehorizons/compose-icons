package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Send_time_extension: ImageVector
    get() {
        if (_Send_time_extension != null) return _Send_time_extension!!
        
        _Send_time_extension = ImageVector.Builder(
            name = "send_time_extension",
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
                        moveTo(18f, 6f)
                        verticalLineToRelative(6.26f)
                        lineToRelative(2f, 1f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                        reflectiveCurveTo(9f, 2.62f, 9f, 4f)
                        horizontalLineTo(5.01f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(3.8f)
                        curveTo(5.7f, 9.8f, 6f, 11.96f, 6f, 12.5f)
                        curveToRelative(0f, 0.54f, -0.29f, 2.7f, -3f, 2.7f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(3.8f)
                        curveToRelative(0f, -2.16f, 1.37f, -2.78f, 2.2f, -2.94f)
                        verticalLineToRelative(-2.03f)
                        curveTo(9.57f, 16.2f, 7.85f, 17.07f, 7.13f, 19f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-2.13f)
                        curveToRelative(2.17f, -0.8f, 3f, -2.87f, 3f, -4.37f)
                        curveToRelative(0f, -1.49f, -0.83f, -3.56f, -2.99f, -4.37f)
                        verticalLineTo(6f)
                        horizontalLineTo(11f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        reflectiveCurveTo(12f, 3.72f, 12f, 4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 12f)
                        lineTo(13f, 16f)
                        lineTo(17f, 17f)
                        lineTo(13f, 18f)
                        lineTo(13f, 22f)
                        lineTo(23f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Send_time_extension!!
    }

private var _Send_time_extension: ImageVector? = null

