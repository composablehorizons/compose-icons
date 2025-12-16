package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ExclamationCircled: ImageVector
    get() {
        if (_ExclamationCircled != null) return _ExclamationCircled!!
        
        _ExclamationCircled = ImageVector.Builder(
            name = "exclamation-circled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49915f, 0.877045f)
                curveTo(11.1566f, 0.877045f, 14.1218f, 3.84178f, 14.1222f, 7.49911f)
                curveTo(14.1222f, 11.1568f, 11.1568f, 14.1222f, 7.49915f, 14.1222f)
                curveTo(3.84181f, 14.1218f, 0.877075f, 11.1565f, 0.877075f, 7.49911f)
                curveTo(0.877486f, 3.84203f, 3.84206f, 0.877456f, 7.49915f, 0.877045f)
                close()
                moveTo(7.49915f, 1.82626f)
                curveTo(4.36673f, 1.82667f, 1.8267f, 4.3667f, 1.82629f, 7.49911f)
                curveTo(1.82629f, 10.6319f, 4.36648f, 13.1716f, 7.49915f, 13.172f)
                curveTo(10.6321f, 13.172f, 13.172f, 10.6321f, 13.172f, 7.49911f)
                curveTo(13.1716f, 4.36645f, 10.6319f, 1.82626f, 7.49915f, 1.82626f)
                close()
                moveTo(7.50012f, 9.72568f)
                curveTo(7.91422f, 9.72568f, 8.24994f, 10.0616f, 8.25012f, 10.4757f)
                curveTo(8.25012f, 10.8899f, 7.91434f, 11.2257f, 7.50012f, 11.2257f)
                curveTo(7.08591f, 11.2257f, 6.75012f, 10.8899f, 6.75012f, 10.4757f)
                curveTo(6.7503f, 10.0616f, 7.08602f, 9.72568f, 7.50012f, 9.72568f)
                close()
                moveTo(7.50012f, 3.78622f)
                curveTo(7.88229f, 3.78622f, 8.18766f, 4.10453f, 8.17297f, 4.48642f)
                lineTo(8.01965f, 8.4874f)
                curveTo(8.00874f, 8.76622f, 7.7792f, 8.98642f, 7.50012f, 8.98642f)
                curveTo(7.22105f, 8.98641f, 6.9915f, 8.76621f, 6.98059f, 8.4874f)
                lineTo(6.82727f, 4.48642f)
                curveTo(6.81258f, 4.10454f, 7.11796f, 3.78624f, 7.50012f, 3.78622f)
                close()
            }
        }.build()
        
        return _ExclamationCircled!!
    }

private var _ExclamationCircled: ImageVector? = null

