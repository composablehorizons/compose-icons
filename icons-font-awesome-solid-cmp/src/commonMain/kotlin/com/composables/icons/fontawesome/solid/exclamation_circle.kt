package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ExclamationCircle: ImageVector
    get() {
        if (_ExclamationCircle != null) return _ExclamationCircle!!
        
        _ExclamationCircle = ImageVector.Builder(
            name = "exclamation-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveToRelative(0f, 136.997f, -111.043f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 392.997f, 8f, 256f)
                curveTo(8f, 119.083f, 119.043f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111.083f, 248f, 248f)
                close()
                moveToRelative(-248f, 50f)
                curveToRelative(-25.405f, 0f, -46f, 20.595f, -46f, 46f)
                reflectiveCurveToRelative(20.595f, 46f, 46f, 46f)
                reflectiveCurveToRelative(46f, -20.595f, 46f, -46f)
                reflectiveCurveToRelative(-20.595f, -46f, -46f, -46f)
                close()
                moveToRelative(-43.673f, -165.346f)
                lineToRelative(7.418f, 136f)
                curveToRelative(0.347f, 6.364f, 5.609f, 11.346f, 11.982f, 11.346f)
                horizontalLineToRelative(48.546f)
                curveToRelative(6.373f, 0f, 11.635f, -4.982f, 11.982f, -11.346f)
                lineToRelative(7.418f, -136f)
                curveToRelative(0.375f, -6.874f, -5.098f, -12.654f, -11.982f, -12.654f)
                horizontalLineToRelative(-63.383f)
                curveToRelative(-6.884f, 0f, -12.356f, 5.78f, -11.981f, 12.654f)
                close()
            }
        }.build()
        
        return _ExclamationCircle!!
    }

private var _ExclamationCircle: ImageVector? = null

