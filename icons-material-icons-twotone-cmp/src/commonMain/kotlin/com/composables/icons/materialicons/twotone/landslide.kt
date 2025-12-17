package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Landslide: ImageVector
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
                        moveTo(8.57f, 12.09f)
                        lineTo(7f, 10f)
                        lineTo(4f, 10f)
                        lineTo(4f, 12.28f)
                        lineTo(6f, 12.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.53f, 14.77f)
                        lineTo(9.95f, 13.74f)
                        lineTo(6f, 15.05f)
                        lineTo(4f, 14.39f)
                        lineTo(4f, 16.28f)
                        lineTo(6f, 16.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 4.65f)
                        lineTo(15f, 2.64f)
                        lineTo(12.42f, 2.12f)
                        lineTo(11f, 3.07f)
                        lineTo(11f, 4.93f)
                        lineTo(12.23f, 5.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 19.05f)
                        lineTo(4f, 18.39f)
                        lineTo(4f, 20f)
                        lineTo(18f, 20f)
                        lineTo(15.03f, 16.04f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 9.96f)
                        lineTo(18f, 11.04f)
                        lineTo(18.8f, 11.68f)
                        lineTo(21f, 10.7f)
                        lineTo(21f, 9.6f)
                        lineTo(19f, 9.16f)
                        close()
                    }
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
                        moveTo(4f, 10f)
                        horizontalLineToRelative(3f)
                        lineToRelative(1.57f, 2.09f)
                        lineTo(6f, 12.95f)
                        lineToRelative(-2f, -0.67f)
                        verticalLineTo(10f)
                        close()
                        moveTo(4f, 14.39f)
                        lineToRelative(2f, 0.67f)
                        lineToRelative(3.95f, -1.32f)
                        lineToRelative(2.58f, 1.03f)
                        lineTo(6f, 16.95f)
                        lineToRelative(-2f, -0.67f)
                        verticalLineTo(14.39f)
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

