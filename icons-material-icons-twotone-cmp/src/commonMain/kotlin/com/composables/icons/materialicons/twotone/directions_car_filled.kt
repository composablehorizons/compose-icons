package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Directions_car_filled: ImageVector
    get() {
        if (_Directions_car_filled != null) return _Directions_car_filled!!
        
        _Directions_car_filled = ImageVector.Builder(
            name = "directions_car_filled",
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
                        moveTo(5f, 17f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(5f)
                        verticalLineTo(17f)
                        close()
                        moveTo(16.5f, 13f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(17.33f, 16f, 16.5f, 16f)
                        reflectiveCurveTo(15f, 15.33f, 15f, 14.5f)
                        reflectiveCurveTo(15.67f, 13f, 16.5f, 13f)
                        close()
                        moveTo(7.5f, 13f)
                        curveTo(8.33f, 13f, 9f, 13.67f, 9f, 14.5f)
                        reflectiveCurveTo(8.33f, 16f, 7.5f, 16f)
                        reflectiveCurveTo(6f, 15.33f, 6f, 14.5f)
                        reflectiveCurveTo(6.67f, 13f, 7.5f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.92f, 6.01f)
                        curveTo(18.72f, 5.42f, 18.16f, 5f, 17.5f, 5f)
                        horizontalLineToRelative(-11f)
                        curveTo(5.84f, 5f, 5.29f, 5.42f, 5.08f, 6.01f)
                        lineTo(3f, 12f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-8f)
                        lineTo(18.92f, 6.01f)
                        close()
                        moveTo(6.85f, 7f)
                        horizontalLineToRelative(10.29f)
                        lineToRelative(1.04f, 3f)
                        horizontalLineTo(5.81f)
                        lineTo(6.85f, 7f)
                        close()
                        moveTo(19f, 17f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 6f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 18f, 14.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_car_filled!!
    }

private var _Directions_car_filled: ImageVector? = null

