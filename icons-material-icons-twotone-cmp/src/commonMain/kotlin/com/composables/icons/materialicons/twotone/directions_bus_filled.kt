package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Directions_bus_filled: ImageVector
    get() {
        if (_Directions_bus_filled != null) return _Directions_bus_filled!!
        
        _Directions_bus_filled = ImageVector.Builder(
            name = "directions_bus_filled",
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
                        moveTo(6f, 15f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(6f)
                        verticalLineTo(15f)
                        close()
                        moveTo(15.5f, 13f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(16.33f, 16f, 15.5f, 16f)
                        reflectiveCurveTo(14f, 15.33f, 14f, 14.5f)
                        reflectiveCurveTo(14.67f, 13f, 15.5f, 13f)
                        close()
                        moveTo(8.5f, 13f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(9.33f, 16f, 8.5f, 16f)
                        reflectiveCurveTo(7f, 15.33f, 7f, 14.5f)
                        reflectiveCurveTo(7.67f, 13f, 8.5f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 4f)
                        curveTo(8.48f, 4f, 7.03f, 4.48f, 6.43f, 5f)
                        horizontalLineToRelative(11.24f)
                        curveTo(17.13f, 4.46f, 15.71f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(8f, 2f, 4f, 2.5f, 4f, 6f)
                        verticalLineToRelative(9.5f)
                        curveToRelative(0f, 0.95f, 0.38f, 1.81f, 1f, 2.44f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-2.06f)
                        curveToRelative(0.62f, -0.63f, 1f, -1.49f, 1f, -2.44f)
                        verticalLineTo(6f)
                        curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 4f)
                        curveToRelative(3.71f, 0f, 5.13f, 0.46f, 5.67f, 1f)
                        horizontalLineTo(6.43f)
                        curveTo(7.03f, 4.48f, 8.48f, 4f, 12f, 4f)
                        close()
                        moveTo(18f, 15f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineTo(8f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(15f)
                        close()
                        moveTo(18f, 10f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 14f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 17f, 14.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_bus_filled!!
    }

private var _Directions_bus_filled: ImageVector? = null

