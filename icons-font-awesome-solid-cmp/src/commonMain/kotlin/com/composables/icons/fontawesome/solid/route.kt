package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Route: ImageVector
    get() {
        if (_Route != null) return _Route!!
        
        _Route = ImageVector.Builder(
            name = "route",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 320f)
                horizontalLineToRelative(-96f)
                curveToRelative(-17.6f, 0f, -32f, -14.4f, -32f, -32f)
                reflectiveCurveToRelative(14.4f, -32f, 32f, -32f)
                horizontalLineToRelative(96f)
                reflectiveCurveToRelative(96f, -107f, 96f, -160f)
                reflectiveCurveToRelative(-43f, -96f, -96f, -96f)
                reflectiveCurveToRelative(-96f, 43f, -96f, 96f)
                curveToRelative(0f, 25.5f, 22.2f, 63.4f, 45.3f, 96f)
                horizontalLineTo(320f)
                curveToRelative(-52.9f, 0f, -96f, 43.1f, -96f, 96f)
                reflectiveCurveToRelative(43.1f, 96f, 96f, 96f)
                horizontalLineToRelative(96f)
                curveToRelative(17.6f, 0f, 32f, 14.4f, 32f, 32f)
                reflectiveCurveToRelative(-14.4f, 32f, -32f, 32f)
                horizontalLineTo(185.5f)
                curveToRelative(-16f, 24.8f, -33.8f, 47.7f, -47.3f, 64f)
                horizontalLineTo(416f)
                curveToRelative(52.9f, 0f, 96f, -43.1f, 96f, -96f)
                reflectiveCurveToRelative(-43.1f, -96f, -96f, -96f)
                close()
                moveToRelative(0f, -256f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveTo(96f, 256f)
                curveToRelative(-53f, 0f, -96f, 43f, -96f, 96f)
                reflectiveCurveToRelative(96f, 160f, 96f, 160f)
                reflectiveCurveToRelative(96f, -107f, 96f, -160f)
                reflectiveCurveToRelative(-43f, -96f, -96f, -96f)
                close()
                moveToRelative(0f, 128f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Route!!
    }

private var _Route: ImageVector? = null

