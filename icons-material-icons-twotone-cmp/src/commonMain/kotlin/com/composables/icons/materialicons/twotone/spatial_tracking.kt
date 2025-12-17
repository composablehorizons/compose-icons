package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Spatial_tracking: ImageVector
    get() {
        if (_Spatial_tracking != null) return _Spatial_tracking!!
        
        _Spatial_tracking = ImageVector.Builder(
            name = "spatial_tracking",
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
                        moveTo(20.05f, 2.41f)
                        lineTo(18.64f, 1f)
                        curveToRelative(-3.51f, 3.51f, -3.51f, 9.21f, 0f, 12.73f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(17.32f, 9.58f, 17.32f, 5.14f, 20.05f, 2.41f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.88f, 5.24f)
                        lineToRelative(-1.41f, -1.41f)
                        curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(21.71f, 8.32f, 21.71f, 6.41f, 22.88f, 5.24f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.48f, 17.34f)
                        curveTo(14.29f, 16.73f, 12.37f, 16f, 10f, 16f)
                        curveToRelative(-2.37f, 0f, -4.29f, 0.73f, -5.48f, 1.34f)
                        curveTo(4.2f, 17.5f, 4f, 17.84f, 4f, 18.22f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-0.78f)
                        curveTo(16f, 17.84f, 15.8f, 17.5f, 15.48f, 17.34f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 9f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 11f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 9f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 13f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveTo(6f, 6.79f, 6f, 9f)
                        curveTo(6f, 11.21f, 7.79f, 13f, 10f, 13f)
                        close()
                        moveTo(10f, 7f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        curveTo(8f, 7.9f, 8.9f, 7f, 10f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.39f, 15.56f)
                        curveTo(14.71f, 14.7f, 12.53f, 14f, 10f, 14f)
                        curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                        curveTo(2.61f, 16.07f, 2f, 17.1f, 2f, 18.22f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2.78f)
                        curveTo(18f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                        close()
                        moveTo(16f, 19f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-0.78f)
                        curveToRelative(0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                        curveTo(5.71f, 16.73f, 7.63f, 16f, 10f, 16f)
                        curveToRelative(2.37f, 0f, 4.29f, 0.73f, 5.48f, 1.34f)
                        curveTo(15.8f, 17.5f, 16f, 17.84f, 16f, 18.22f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Spatial_tracking!!
    }

private var _Spatial_tracking: ImageVector? = null

