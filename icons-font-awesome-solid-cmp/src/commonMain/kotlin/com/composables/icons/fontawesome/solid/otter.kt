package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Otter: ImageVector
    get() {
        if (_Otter != null) return _Otter!!
        
        _Otter = ImageVector.Builder(
            name = "otter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 32f)
                horizontalLineToRelative(-32f)
                lineToRelative(-13.25f, -13.25f)
                arcTo(63.97f, 63.97f, 0f, false, false, 517.49f, 0f)
                horizontalLineTo(497f)
                curveToRelative(-11.14f, 0f, -22.08f, 2.91f, -31.75f, 8.43f)
                lineTo(312f, 96f)
                horizontalLineToRelative(-56f)
                curveTo(149.96f, 96f, 64f, 181.96f, 64f, 288f)
                verticalLineToRelative(1.61f)
                curveToRelative(0f, 32.75f, -16f, 62.14f, -39.56f, 84.89f)
                curveToRelative(-18.19f, 17.58f, -28.1f, 43.68f, -23.19f, 71.8f)
                curveToRelative(6.76f, 38.8f, 42.9f, 65.7f, 82.28f, 65.7f)
                horizontalLineTo(192f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                horizontalLineTo(80f)
                curveToRelative(-8.83f, 0f, -16f, -7.17f, -16f, -16f)
                reflectiveCurveToRelative(7.17f, -16f, 16f, -16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-64f)
                lineToRelative(149.49f, -80.5f)
                lineTo(448f, 416f)
                horizontalLineToRelative(80f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-28.22f)
                lineToRelative(-55.11f, -110.21f)
                lineTo(521.14f, 192f)
                horizontalLineTo(544f)
                curveToRelative(53.02f, 0f, 96f, -42.98f, 96f, -96f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-96f, 16f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                close()
                moveToRelative(32f, 96f)
                horizontalLineToRelative(-34.96f)
                lineTo(407.2f, 198.84f)
                lineToRelative(-13.77f, -27.55f)
                lineTo(512f, 112f)
                horizontalLineToRelative(77.05f)
                curveToRelative(-6.62f, 18.58f, -24.22f, 32f, -45.05f, 32f)
                close()
            }
        }.build()
        
        return _Otter!!
    }

private var _Otter: ImageVector? = null

