package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Landslide: ImageVector
    get() {
        if (_Landslide != null) return _Landslide!!
        
        _Landslide = ImageVector.Builder(
            name = "landslide",
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
                        moveTo(11f, 12f)
                        lineTo(8f, 8f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(20f)
                        lineToRelative(-6f, -8f)
                        lineTo(11f, 12f)
                        close()
                        moveTo(12.53f, 14.77f)
                        lineTo(6f, 16.95f)
                        lineToRelative(-2f, -0.67f)
                        verticalLineToRelative(-1.89f)
                        lineToRelative(2f, 0.67f)
                        lineToRelative(3.95f, -1.32f)
                        lineTo(12.53f, 14.77f)
                        close()
                        moveTo(7f, 10f)
                        lineToRelative(1.57f, 2.09f)
                        lineTo(6f, 12.95f)
                        lineToRelative(-2f, -0.67f)
                        verticalLineTo(10f)
                        horizontalLineTo(7f)
                        close()
                        moveTo(4f, 20f)
                        verticalLineToRelative(-1.61f)
                        lineToRelative(2f, 0.67f)
                        lineToRelative(9.03f, -3.01f)
                        lineTo(18f, 20f)
                        horizontalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 6f)
                        verticalLineTo(1f)
                        lineToRelative(-5f, -1f)
                        lineTo(9f, 2f)
                        verticalLineToRelative(4f)
                        lineToRelative(3f, 2f)
                        lineTo(17f, 6f)
                        close()
                        moveTo(11f, 3.07f)
                        lineToRelative(1.42f, -0.95f)
                        lineTo(15f, 2.64f)
                        verticalLineToRelative(2.01f)
                        lineToRelative(-2.77f, 1.11f)
                        lineTo(11f, 4.93f)
                        verticalLineTo(3.07f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.5f, 7f)
                        lineTo(16f, 9f)
                        verticalLineToRelative(3f)
                        lineToRelative(2.5f, 2f)
                        lineToRelative(4.5f, -2f)
                        verticalLineTo(8f)
                        lineTo(18.5f, 7f)
                        close()
                        moveTo(21f, 10.7f)
                        lineToRelative(-2.2f, 0.98f)
                        lineTo(18f, 11.04f)
                        verticalLineTo(9.96f)
                        lineToRelative(1f, -0.8f)
                        lineToRelative(2f, 0.44f)
                        verticalLineTo(10.7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null

