package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Battery_30: ImageVector
    get() {
        if (_Battery_30 != null) return _Battery_30!!
        
        _Battery_30 = ImageVector.Builder(
            name = "battery_30",
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
                moveTo(17f, 5.33f)
                curveTo(17f, 4.6f, 16.4f, 4f, 15.67f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineTo(8.33f)
                curveTo(7.6f, 4f, 7f, 4.6f, 7f, 5.33f)
                verticalLineTo(15f)
                horizontalLineToRelative(10f)
                verticalLineTo(5.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 15f)
                verticalLineToRelative(5.67f)
                curveTo(7f, 21.4f, 7.6f, 22f, 8.33f, 22f)
                horizontalLineToRelative(7.33f)
                curveToRelative(0.74f, 0f, 1.34f, -0.6f, 1.34f, -1.33f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Battery_30!!
    }

private var _Battery_30: ImageVector? = null

