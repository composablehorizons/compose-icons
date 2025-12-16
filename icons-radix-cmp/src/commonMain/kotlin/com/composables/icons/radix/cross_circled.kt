package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CrossCircled: ImageVector
    get() {
        if (_CrossCircled != null) return _CrossCircled!!
        
        _CrossCircled = ImageVector.Builder(
            name = "cross-circled",
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
                moveTo(9.14661f, 5.14658f)
                curveTo(9.34187f, 4.95131f, 9.65838f, 4.95131f, 9.85364f, 5.14658f)
                curveTo(10.0488f, 5.34185f, 10.0489f, 5.65838f, 9.85364f, 5.85361f)
                lineTo(8.20715f, 7.50009f)
                lineTo(9.85364f, 9.14658f)
                lineTo(9.91809f, 9.2247f)
                curveTo(10.0462f, 9.41877f, 10.0245f, 9.68278f, 9.85364f, 9.85361f)
                curveTo(9.68281f, 10.0244f, 9.4188f, 10.0461f, 9.22473f, 9.91806f)
                lineTo(9.14661f, 9.85361f)
                lineTo(7.50012f, 8.20712f)
                lineTo(5.85364f, 9.85361f)
                curveTo(5.65841f, 10.0488f, 5.34188f, 10.0488f, 5.14661f, 9.85361f)
                curveTo(4.95134f, 9.65835f, 4.95134f, 9.34184f, 5.14661f, 9.14658f)
                lineTo(6.79309f, 7.50009f)
                lineTo(5.14661f, 5.85361f)
                lineTo(5.08215f, 5.77548f)
                curveTo(4.95399f, 5.5814f, 4.97574f, 5.31744f, 5.14661f, 5.14658f)
                curveTo(5.31747f, 4.97571f, 5.58143f, 4.95396f, 5.77551f, 5.08212f)
                lineTo(5.85364f, 5.14658f)
                lineTo(7.50012f, 6.79306f)
                lineTo(9.14661f, 5.14658f)
                close()
            }
        }.build()
        
        return _CrossCircled!!
    }

private var _CrossCircled: ImageVector? = null

