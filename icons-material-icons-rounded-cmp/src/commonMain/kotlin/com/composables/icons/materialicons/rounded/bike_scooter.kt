package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bike_scooter: ImageVector
    get() {
        if (_Bike_scooter != null) return _Bike_scooter!!
        
        _Bike_scooter = ImageVector.Builder(
            name = "bike_scooter",
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
                        moveTo(10f, 14f)
                        horizontalLineToRelative(0.74f)
                        lineTo(8.82f, 5.56f)
                        curveTo(8.61f, 4.65f, 7.8f, 4f, 6.87f, 4f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 4f, 3f, 4.45f, 3f, 5f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2.87f)
                        lineToRelative(1.42f, 6.25f)
                        curveToRelative(0f, 0f, -0.01f, 0f, -0.01f, 0f)
                        curveTo(6.12f, 12.9f, 4.47f, 14.73f, 4.09f, 17f)
                        horizontalLineTo(0f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-1f)
                        curveTo(6f, 15.79f, 7.79f, 14f, 10f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.75f, 8f)
                        lineToRelative(-0.56f, 0f)
                        lineToRelative(-1.35f, -3.69f)
                        curveTo(16.55f, 3.52f, 15.8f, 3f, 14.96f, 3f)
                        horizontalLineTo(12f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2.96f)
                        lineToRelative(1.1f, 3f)
                        horizontalLineTo(10.4f)
                        lineToRelative(0.46f, 2f)
                        horizontalLineTo(15f)
                        curveToRelative(-0.43f, 0.58f, -0.75f, 1.25f, -0.9f, 2f)
                        horizontalLineToRelative(-2.79f)
                        lineToRelative(0.46f, 2f)
                        horizontalLineToRelative(2.33f)
                        curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f)
                        curveToRelative(3.16f, 0.15f, 5.88f, -2.83f, 5.12f, -6.1f)
                        curveTo(23.34f, 9.57f, 21.13f, 8f, 18.75f, 8f)
                        close()
                        moveTo(18.88f, 16f)
                        curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f)
                        curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f)
                        lineToRelative(0.62f, 1.7f)
                        curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f)
                        lineToRelative(-0.63f, -1.73f)
                        curveToRelative(0f, 0f, 0f, 0f, 0.01f, -0.01f)
                        curveTo(20.64f, 9.96f, 22f, 11.29f, 22f, 13f)
                        curveTo(22f, 14.72f, 20.62f, 16.06f, 18.88f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 15f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                        reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                        reflectiveCurveTo(11.66f, 15f, 10f, 15f)
                        close()
                        moveTo(10f, 19f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(10.55f, 19f, 10f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bike_scooter!!
    }

private var _Bike_scooter: ImageVector? = null

