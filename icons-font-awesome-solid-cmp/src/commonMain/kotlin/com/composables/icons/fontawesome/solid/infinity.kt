package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Infinity: ImageVector
    get() {
        if (_Infinity != null) return _Infinity!!
        
        _Infinity = ImageVector.Builder(
            name = "infinity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(471.1f, 96f)
                curveTo(405f, 96f, 353.3f, 137.3f, 320f, 174.6f)
                curveTo(286.7f, 137.3f, 235f, 96f, 168.9f, 96f)
                curveTo(75.8f, 96f, 0f, 167.8f, 0f, 256f)
                reflectiveCurveToRelative(75.8f, 160f, 168.9f, 160f)
                curveToRelative(66.1f, 0f, 117.8f, -41.3f, 151.1f, -78.6f)
                curveToRelative(33.3f, 37.3f, 85f, 78.6f, 151.1f, 78.6f)
                curveToRelative(93.1f, 0f, 168.9f, -71.8f, 168.9f, -160f)
                reflectiveCurveTo(564.2f, 96f, 471.1f, 96f)
                close()
                moveTo(168.9f, 320f)
                curveToRelative(-40.2f, 0f, -72.9f, -28.7f, -72.9f, -64f)
                reflectiveCurveToRelative(32.7f, -64f, 72.9f, -64f)
                curveToRelative(38.2f, 0f, 73.4f, 36.1f, 94f, 64f)
                curveToRelative(-20.4f, 27.6f, -55.9f, 64f, -94f, 64f)
                close()
                moveToRelative(302.2f, 0f)
                curveToRelative(-38.2f, 0f, -73.4f, -36.1f, -94f, -64f)
                curveToRelative(20.4f, -27.6f, 55.9f, -64f, 94f, -64f)
                curveToRelative(40.2f, 0f, 72.9f, 28.7f, 72.9f, 64f)
                reflectiveCurveToRelative(-32.7f, 64f, -72.9f, 64f)
                close()
            }
        }.build()
        
        return _Infinity!!
    }

private var _Infinity: ImageVector? = null

