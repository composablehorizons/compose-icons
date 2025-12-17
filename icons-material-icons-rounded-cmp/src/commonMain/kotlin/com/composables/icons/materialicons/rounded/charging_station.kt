package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Charging_station: ImageVector
    get() {
        if (_Charging_station != null) return _Charging_station!!
        
        _Charging_station = ImageVector.Builder(
            name = "charging_station",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 1f)
                    horizontalLineTo(7f)
                    curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(18f)
                    close()
                    moveTo(12.5f, 11f)
                    verticalLineTo(9.12f)
                    curveToRelative(0f, -0.53f, -0.71f, -0.7f, -0.95f, -0.22f)
                    lineToRelative(-1.69f, 3.38f)
                    curveTo(9.7f, 12.61f, 9.94f, 13f, 10.31f, 13f)
                    horizontalLineToRelative(1.19f)
                    verticalLineToRelative(1.88f)
                    curveToRelative(0f, 0.53f, 0.71f, 0.7f, 0.95f, 0.22f)
                    lineToRelative(1.69f, -3.38f)
                    curveTo(14.3f, 11.39f, 14.06f, 11f, 13.69f, 11f)
                    horizontalLineTo(12.5f)
                    close()
                }
            }
        }.build()
        
        return _Charging_station!!
    }

private var _Charging_station: ImageVector? = null

