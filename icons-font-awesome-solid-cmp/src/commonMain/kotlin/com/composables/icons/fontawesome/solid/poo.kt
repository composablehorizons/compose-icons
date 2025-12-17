package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Poo: ImageVector
    get() {
        if (_Poo != null) return _Poo!!
        
        _Poo = ImageVector.Builder(
            name = "poo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(451.4f, 369.1f)
                curveTo(468.7f, 356f, 480f, 335.4f, 480f, 312f)
                curveToRelative(0f, -39.8f, -32.2f, -72f, -72f, -72f)
                horizontalLineToRelative(-14.1f)
                curveToRelative(13.4f, -11.7f, 22.1f, -28.8f, 22.1f, -48f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                horizontalLineToRelative(-5.9f)
                curveToRelative(3.6f, -10.1f, 5.9f, -20.7f, 5.9f, -32f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                curveToRelative(-5.2f, 0f, -10.2f, 0.7f, -15.1f, 1.5f)
                curveTo(250.3f, 14.6f, 256f, 30.6f, 256f, 48f)
                curveToRelative(0f, 44.2f, -35.8f, 80f, -80f, 80f)
                horizontalLineToRelative(-16f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                curveToRelative(0f, 19.2f, 8.7f, 36.3f, 22.1f, 48f)
                horizontalLineTo(104f)
                curveToRelative(-39.8f, 0f, -72f, 32.2f, -72f, 72f)
                curveToRelative(0f, 23.4f, 11.3f, 44f, 28.6f, 57.1f)
                curveTo(26.3f, 374.6f, 0f, 404.1f, 0f, 440f)
                curveToRelative(0f, 39.8f, 32.2f, 72f, 72f, 72f)
                horizontalLineToRelative(368f)
                curveToRelative(39.8f, 0f, 72f, -32.2f, 72f, -72f)
                curveToRelative(0f, -35.9f, -26.3f, -65.4f, -60.6f, -70.9f)
                close()
                moveTo(192f, 256f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveToRelative(159.5f, 139f)
                curveTo(341f, 422.9f, 293f, 448f, 256f, 448f)
                reflectiveCurveToRelative(-85f, -25.1f, -95.5f, -53f)
                curveToRelative(-2f, -5.3f, 2f, -11f, 7.8f, -11f)
                horizontalLineToRelative(175.4f)
                curveToRelative(5.8f, 0f, 9.8f, 5.7f, 7.8f, 11f)
                close()
                moveTo(320f, 320f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Poo!!
    }

private var _Poo: ImageVector? = null

