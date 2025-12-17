package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BatteryThreeQuarters: ImageVector
    get() {
        if (_BatteryThreeQuarters != null) return _BatteryThreeQuarters!!
        
        _BatteryThreeQuarters = ImageVector.Builder(
            name = "battery-three-quarters",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(544f, 160f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(64f)
                horizontalLineTo(64f)
                verticalLineTo(160f)
                horizontalLineToRelative(480f)
                moveToRelative(16f, -64f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(512f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(8f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(184f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-144f, 96f)
                horizontalLineTo(96f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(320f)
                verticalLineTo(192f)
                close()
            }
        }.build()
        
        return _BatteryThreeQuarters!!
    }

private var _BatteryThreeQuarters: ImageVector? = null

