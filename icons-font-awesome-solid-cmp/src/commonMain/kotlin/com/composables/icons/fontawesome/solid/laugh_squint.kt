package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LaughSquint: ImageVector
    get() {
        if (_LaughSquint != null) return _LaughSquint!!
        
        _LaughSquint = ImageVector.Builder(
            name = "laugh-squint",
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
                moveToRelative(33.8f, 161.7f)
                lineToRelative(80f, -48f)
                curveToRelative(11.6f, -6.9f, 24f, 7.7f, 15.4f, 18f)
                lineTo(343.6f, 180f)
                lineToRelative(33.6f, 40.3f)
                curveToRelative(8.7f, 10.4f, -3.9f, 24.8f, -15.4f, 18f)
                lineToRelative(-80f, -48f)
                curveToRelative(-7.7f, -4.7f, -7.7f, -15.9f, 0f, -20.6f)
                close()
                moveToRelative(-163f, -30f)
                curveToRelative(-8.6f, -10.3f, 3.8f, -24.9f, 15.4f, -18f)
                lineToRelative(80f, 48f)
                curveToRelative(7.8f, 4.7f, 7.8f, 15.9f, 0f, 20.6f)
                lineToRelative(-80f, 48f)
                curveToRelative(-11.5f, 6.8f, -24f, -7.6f, -15.4f, -18f)
                lineToRelative(33.6f, -40.3f)
                lineToRelative(-33.6f, -40.3f)
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
        
        return _LaughSquint!!
    }

private var _LaughSquint: ImageVector? = null

