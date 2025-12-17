package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HourglassHalf: ImageVector
    get() {
        if (_HourglassHalf != null) return _HourglassHalf!!
        
        _HourglassHalf = ImageVector.Builder(
            name = "hourglass-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 0f)
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
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(-75.078f, 384f)
                horizontalLineTo(99.08f)
                curveToRelative(17.059f, -46.797f, 52.096f, -80f, 92.92f, -80f)
                curveToRelative(40.821f, 0f, 75.862f, 33.196f, 92.922f, 80f)
                close()
                moveToRelative(0.019f, -256f)
                horizontalLineTo(99.078f)
                curveTo(91.988f, 108.548f, 88f, 86.748f, 88f, 64f)
                horizontalLineToRelative(208f)
                curveToRelative(0f, 22.805f, -3.987f, 44.587f, -11.059f, 64f)
                close()
            }
        }.build()
        
        return _HourglassHalf!!
    }

private var _HourglassHalf: ImageVector? = null

