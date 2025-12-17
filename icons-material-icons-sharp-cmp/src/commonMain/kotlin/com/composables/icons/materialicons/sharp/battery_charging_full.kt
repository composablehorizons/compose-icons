package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Battery_charging_full: ImageVector
    get() {
        if (_Battery_charging_full != null) return _Battery_charging_full!!
        
        _Battery_charging_full = ImageVector.Builder(
            name = "battery_charging_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(10f)
                verticalLineTo(4f)
                close()
                moveToRelative(-6f, 16f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(9f)
                lineTo(13f, 7f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2f)
                lineTo(11f, 20f)
                close()
            }
        }.build()
        
        return _Battery_charging_full!!
    }

private var _Battery_charging_full: ImageVector? = null

