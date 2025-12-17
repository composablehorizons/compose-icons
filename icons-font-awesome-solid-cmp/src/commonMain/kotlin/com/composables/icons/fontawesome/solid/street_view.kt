package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StreetView: ImageVector
    get() {
        if (_StreetView != null) return _StreetView!!
        
        _StreetView = ImageVector.Builder(
            name = "street-view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(367.9f, 329.76f)
                curveToRelative(-4.62f, 5.3f, -9.78f, 10.1f, -15.9f, 13.65f)
                verticalLineToRelative(22.94f)
                curveToRelative(66.52f, 9.34f, 112f, 28.05f, 112f, 49.65f)
                curveToRelative(0f, 30.93f, -93.12f, 56f, -208f, 56f)
                reflectiveCurveTo(48f, 446.93f, 48f, 416f)
                curveToRelative(0f, -21.6f, 45.48f, -40.3f, 112f, -49.65f)
                verticalLineToRelative(-22.94f)
                curveToRelative(-6.12f, -3.55f, -11.28f, -8.35f, -15.9f, -13.65f)
                curveTo(58.87f, 345.34f, 0f, 378.05f, 0f, 416f)
                curveToRelative(0f, 53.02f, 114.62f, 96f, 256f, 96f)
                reflectiveCurveToRelative(256f, -42.98f, 256f, -96f)
                curveToRelative(0f, -37.95f, -58.87f, -70.66f, -144.1f, -86.24f)
                close()
                moveTo(256f, 128f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                reflectiveCurveTo(291.35f, 0f, 256f, 0f)
                reflectiveCurveToRelative(-64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                close()
                moveToRelative(-64f, 192f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineToRelative(-11.8f)
                curveToRelative(-11.07f, 5.03f, -23.26f, 8f, -36.2f, 8f)
                reflectiveCurveToRelative(-25.13f, -2.97f, -36.2f, -8f)
                horizontalLineTo(208f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                close()
            }
        }.build()
        
        return _StreetView!!
    }

private var _StreetView: ImageVector? = null

