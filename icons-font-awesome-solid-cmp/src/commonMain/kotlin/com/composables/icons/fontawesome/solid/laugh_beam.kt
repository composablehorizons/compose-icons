package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LaughBeam: ImageVector
    get() {
        if (_LaughBeam != null) return _LaughBeam!!
        
        _LaughBeam = ImageVector.Builder(
            name = "laugh-beam",
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
                moveToRelative(24f, 199.4f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.2f, 7.4f, -15.8f, 4.1f, -15.1f, -4.5f)
                close()
                moveToRelative(-160f, 0f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17f)
                curveToRelative(-4.3f, 7.4f, -15.8f, 4f, -15.1f, -4.5f)
                close()
                moveTo(398.9f, 306f)
                curveTo(390f, 377f, 329.4f, 432f, 256f, 432f)
                horizontalLineToRelative(-16f)
                curveToRelative(-73.4f, 0f, -134f, -55f, -142.9f, -126f)
                curveToRelative(-1.2f, -9.5f, 6.3f, -18f, 15.9f, -18f)
                horizontalLineToRelative(270f)
                curveToRelative(9.6f, 0f, 17.1f, 8.4f, 15.9f, 18f)
                close()
            }
        }.build()
        
        return _LaughBeam!!
    }

private var _LaughBeam: ImageVector? = null

