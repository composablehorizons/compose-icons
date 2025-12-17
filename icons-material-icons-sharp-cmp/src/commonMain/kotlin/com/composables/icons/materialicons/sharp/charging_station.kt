package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Charging_station: ImageVector
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
                    moveTo(14.5f, 11f)
                    lineToRelative(-3f, 6f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(3f, -6f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(14.5f)
                    close()
                    moveTo(5f, 1f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(22f)
                    horizontalLineTo(5f)
                    verticalLineTo(1f)
                    close()
                    moveTo(7f, 6f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(6f)
                    horizontalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Charging_station!!
    }

private var _Charging_station: ImageVector? = null

