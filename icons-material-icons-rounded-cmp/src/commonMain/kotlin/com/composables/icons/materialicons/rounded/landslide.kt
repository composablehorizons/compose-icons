package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Landslide: ImageVector
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
                        moveTo(15.47f, 13.79f)
                        lineTo(12.89f, 12.76f)
                        lineTo(6f, 15.05f)
                        lineTo(2f, 13.51f)
                        lineTo(2f, 15.61f)
                        lineTo(6f, 16.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.57f, 11.42f)
                        lineTo(8.6f, 8.8f)
                        curveTo(8.22f, 8.3f, 7.63f, 8f, 7f, 8f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(1.61f)
                        lineToRelative(4f, 1.33f)
                        lineTo(10.57f, 11.42f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 19.05f)
                        lineToRelative(-4f, -1.33f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.65f, 0f, 2.59f, -1.88f, 1.6f, -3.2f)
                        lineToRelative(-2.57f, -3.42f)
                        lineTo(6f, 19.05f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 4.65f)
                        verticalLineTo(2.64f)
                        curveToRelative(0f, -0.95f, -0.67f, -1.77f, -1.61f, -1.96f)
                        lineToRelative(-2.58f, -0.52f)
                        curveToRelative(-0.52f, -0.1f, -1.06f, 0f, -1.5f, 0.3f)
                        lineTo(9.89f, 1.41f)
                        curveTo(9.33f, 1.78f, 9f, 2.4f, 9f, 3.07f)
                        verticalLineToRelative(1.86f)
                        curveTo(9f, 5.6f, 9.33f, 6.22f, 9.89f, 6.59f)
                        lineToRelative(1.23f, 0.82f)
                        curveToRelative(0.55f, 0.37f, 1.24f, 0.44f, 1.85f, 0.19f)
                        lineToRelative(2.77f, -1.11f)
                        curveTo(16.5f, 6.2f, 17f, 5.46f, 17f, 4.65f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.75f, 7.6f)
                        lineToRelative(-1f, 0.8f)
                        curveTo(16.28f, 8.78f, 16f, 9.35f, 16f, 9.96f)
                        verticalLineToRelative(1.08f)
                        curveToRelative(0f, 0.61f, 0.28f, 1.18f, 0.75f, 1.56f)
                        lineToRelative(0.8f, 0.64f)
                        curveToRelative(0.58f, 0.47f, 1.38f, 0.57f, 2.06f, 0.27f)
                        lineToRelative(2.2f, -0.98f)
                        curveTo(22.53f, 12.21f, 23f, 11.49f, 23f, 10.7f)
                        verticalLineTo(9.6f)
                        curveToRelative(0f, -0.94f, -0.65f, -1.75f, -1.57f, -1.95f)
                        lineToRelative(-2f, -0.44f)
                        curveTo(18.84f, 7.08f, 18.22f, 7.22f, 17.75f, 7.6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null

