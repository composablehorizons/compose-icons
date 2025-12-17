package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Power_settings_new: ImageVector
    get() {
        if (_Power_settings_new != null) return _Power_settings_new!!
        
        _Power_settings_new = ImageVector.Builder(
            name = "power_settings_new",
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
                moveTo(13f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(4.83f, 2.17f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(17.99f, 7.86f, 19f, 9.81f, 19f, 12f)
                curveToRelative(0f, 3.87f, -3.13f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.13f, -7f, -7f)
                curveToRelative(0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f)
                lineTo(6.17f, 5.17f)
                curveTo(4.23f, 6.82f, 3f, 9.26f, 3f, 12f)
                curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                curveToRelative(0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f)
                close()
            }
        }.build()
        
        return _Power_settings_new!!
    }

private var _Power_settings_new: ImageVector? = null

