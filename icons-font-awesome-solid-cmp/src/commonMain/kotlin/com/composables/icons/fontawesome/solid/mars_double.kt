package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MarsDouble: ImageVector
    get() {
        if (_MarsDouble != null) return _MarsDouble!!
        
        _MarsDouble = ImageVector.Builder(
            name = "mars-double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 0f)
                horizontalLineToRelative(-79f)
                curveToRelative(-10.7f, 0f, -16f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-48.7f, 48.7f)
                curveTo(198.5f, 72.1f, 172.2f, 64f, 144f, 64f)
                curveTo(64.5f, 64f, 0f, 128.5f, 0f, 208f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.5f, 144f, -144f)
                curveToRelative(0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(48.7f, -48.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(2.4f, 2.4f, 5.5f, 3.5f, 8.4f, 3.5f)
                curveToRelative(6.2f, 0f, 12.1f, -4.8f, 12.1f, -12f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveTo(144f, 288f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
                moveToRelative(356f, -128.1f)
                horizontalLineToRelative(-79f)
                curveToRelative(-10.7f, 0f, -16f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-48.7f, 48.7f)
                curveToRelative(-18.2f, -11.4f, -39f, -18.9f, -61.5f, -21.3f)
                curveToRelative(-2.1f, 21.8f, -8.2f, 43.3f, -18.4f, 63.3f)
                curveToRelative(1.1f, 0f, 2.2f, -0.1f, 3.2f, -0.1f)
                curveToRelative(44.1f, 0f, 80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                reflectiveCurveToRelative(-80f, -35.9f, -80f, -80f)
                curveToRelative(0f, -1.1f, 0f, -2.2f, 0.1f, -3.2f)
                curveToRelative(-20f, 10.2f, -41.5f, 16.4f, -63.3f, 18.4f)
                curveTo(168.4f, 455.6f, 229.6f, 512f, 304f, 512f)
                curveToRelative(79.5f, 0f, 144f, -64.5f, 144f, -144f)
                curveToRelative(0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(48.7f, -48.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(2.4f, 2.4f, 5.4f, 3.5f, 8.4f, 3.5f)
                curveToRelative(6.2f, 0f, 12.1f, -4.8f, 12.1f, -12f)
                verticalLineToRelative(-79f)
                curveToRelative(0f, -6.7f, -5.4f, -12.1f, -12f, -12.1f)
                close()
            }
        }.build()
        
        return _MarsDouble!!
    }

private var _MarsDouble: ImageVector? = null

