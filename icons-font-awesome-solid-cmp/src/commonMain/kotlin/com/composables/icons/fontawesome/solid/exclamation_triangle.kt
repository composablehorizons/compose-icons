package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(569.517f, 440.013f)
                curveTo(587.975f, 472.007f, 564.806f, 512f, 527.94f, 512f)
                horizontalLineTo(48.054f)
                curveToRelative(-36.937f, 0f, -59.999f, -40.055f, -41.577f, -71.987f)
                lineTo(246.423f, 23.985f)
                curveToRelative(18.467f, -32.009f, 64.72f, -31.951f, 83.154f, 0f)
                lineToRelative(239.94f, 416.028f)
                close()
                moveTo(288f, 354f)
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
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

