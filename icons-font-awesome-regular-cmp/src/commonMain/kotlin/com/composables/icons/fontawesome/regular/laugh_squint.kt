package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.LaughSquint: ImageVector
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
                moveToRelative(141.4f, 389.4f)
                curveToRelative(-37.8f, 37.8f, -88f, 58.6f, -141.4f, 58.6f)
                reflectiveCurveToRelative(-103.6f, -20.8f, -141.4f, -58.6f)
                reflectiveCurveTo(48f, 309.4f, 48f, 256f)
                reflectiveCurveToRelative(20.8f, -103.6f, 58.6f, -141.4f)
                reflectiveCurveTo(194.6f, 56f, 248f, 56f)
                reflectiveCurveToRelative(103.6f, 20.8f, 141.4f, 58.6f)
                reflectiveCurveTo(448f, 202.6f, 448f, 256f)
                reflectiveCurveToRelative(-20.8f, 103.6f, -58.6f, 141.4f)
                close()
                moveTo(343.6f, 196f)
                lineToRelative(33.6f, -40.3f)
                curveToRelative(8.6f, -10.3f, -3.8f, -24.8f, -15.4f, -18f)
                lineToRelative(-80f, 48f)
                curveToRelative(-7.8f, 4.7f, -7.8f, 15.9f, 0f, 20.6f)
                lineToRelative(80f, 48f)
                curveToRelative(11.5f, 6.8f, 24f, -7.6f, 15.4f, -18f)
                lineTo(343.6f, 196f)
                close()
                moveToRelative(-209.4f, 58.3f)
                lineToRelative(80f, -48f)
                curveToRelative(7.8f, -4.7f, 7.8f, -15.9f, 0f, -20.6f)
                lineToRelative(-80f, -48f)
                curveToRelative(-11.6f, -6.9f, -24f, 7.7f, -15.4f, 18f)
                lineToRelative(33.6f, 40.3f)
                lineToRelative(-33.6f, 40.3f)
                curveToRelative(-8.7f, 10.4f, 3.8f, 24.8f, 15.4f, 18f)
                close()
                moveTo(362.4f, 288f)
                horizontalLineTo(133.6f)
                curveToRelative(-8.2f, 0f, -14.5f, 7f, -13.5f, 15f)
                curveToRelative(7.5f, 59.2f, 58.9f, 105f, 121.1f, 105f)
                horizontalLineToRelative(13.6f)
                curveToRelative(62.2f, 0f, 113.6f, -45.8f, 121.1f, -105f)
                curveToRelative(1f, -8f, -5.3f, -15f, -13.5f, -15f)
                close()
            }
        }.build()
        
        return _LaughSquint!!
    }

private var _LaughSquint: ImageVector? = null

