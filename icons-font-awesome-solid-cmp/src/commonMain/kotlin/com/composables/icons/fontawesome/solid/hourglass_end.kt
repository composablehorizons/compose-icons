package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HourglassEnd: ImageVector
    get() {
        if (_HourglassEnd != null) return _HourglassEnd!!
        
        _HourglassEnd = ImageVector.Builder(
            name = "hourglass-end",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 64f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveTo(10.745f, 0f, 0f, 10.745f, 0f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                curveToRelative(0f, 90.965f, 51.016f, 167.734f, 120.842f, 192f)
                curveTo(75.016f, 280.266f, 24f, 357.035f, 24f, 448f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                curveToRelative(0f, -90.965f, -51.016f, -167.734f, -120.842f, -192f)
                curveTo(308.984f, 231.734f, 360f, 154.965f, 360f, 64f)
                close()
                moveTo(192f, 208f)
                curveToRelative(-57.787f, 0f, -104f, -66.518f, -104f, -144f)
                horizontalLineToRelative(208f)
                curveToRelative(0f, 77.945f, -46.51f, 144f, -104f, 144f)
                close()
            }
        }.build()
        
        return _HourglassEnd!!
    }

private var _HourglassEnd: ImageVector? = null

