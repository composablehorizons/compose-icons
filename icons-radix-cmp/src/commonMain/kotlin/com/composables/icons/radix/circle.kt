package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Circle: ImageVector
    get() {
        if (_Circle != null) return _Circle!!
        
        _Circle = ImageVector.Builder(
            name = "circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49915f, 0.877075f)
                curveTo(11.1566f, 0.877075f, 14.1218f, 3.84181f, 14.1222f, 7.49915f)
                curveTo(14.1222f, 11.1568f, 11.1568f, 14.1222f, 7.49915f, 14.1222f)
                curveTo(3.84181f, 14.1218f, 0.877075f, 11.1566f, 0.877075f, 7.49915f)
                curveTo(0.877487f, 3.84206f, 3.84206f, 0.877487f, 7.49915f, 0.877075f)
                close()
                moveTo(7.49915f, 1.82629f)
                curveTo(4.36674f, 1.82671f, 1.82671f, 4.36674f, 1.82629f, 7.49915f)
                curveTo(1.82629f, 10.6319f, 4.36648f, 13.1716f, 7.49915f, 13.172f)
                curveTo(10.6321f, 13.172f, 13.172f, 10.6321f, 13.172f, 7.49915f)
                curveTo(13.1716f, 4.36648f, 10.6319f, 1.82629f, 7.49915f, 1.82629f)
                close()
            }
        }.build()
        
        return _Circle!!
    }

private var _Circle: ImageVector? = null

