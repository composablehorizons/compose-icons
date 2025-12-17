package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LaughWink: ImageVector
    get() {
        if (_LaughWink != null) return _LaughWink!!
        
        _LaughWink = ImageVector.Builder(
            name = "laugh-wink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(20.1f, 198.1f)
                curveToRelative(4f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveToRelative(55.9f, 16.9f, 59.9f, 42.1f)
                curveToRelative(1.7f, 11.1f, -11.4f, 18.3f, -19.8f, 10.8f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61f, 0f)
                lineTo(288f, 217f)
                curveToRelative(-8.4f, 7.4f, -21.6f, 0.3f, -19.9f, -10.9f)
                close()
                moveTo(168f, 160f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveToRelative(230.9f, 146f)
                curveTo(390f, 377f, 329.4f, 432f, 256f, 432f)
                horizontalLineToRelative(-16f)
                curveToRelative(-73.4f, 0f, -134f, -55f, -142.9f, -126f)
                curveToRelative(-1.2f, -9.5f, 6.3f, -18f, 15.9f, -18f)
                horizontalLineToRelative(270f)
                curveToRelative(9.6f, 0f, 17.1f, 8.4f, 15.9f, 18f)
                close()
            }
        }.build()
        
        return _LaughWink!!
    }

private var _LaughWink: ImageVector? = null

