package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CircleBackslash: ImageVector
    get() {
        if (_CircleBackslash != null) return _CircleBackslash!!
        
        _CircleBackslash = ImageVector.Builder(
            name = "circle-backslash",
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
                moveTo(3.15051f, 3.85754f)
                curveTo(2.32445f, 4.84289f, 1.82648f, 6.11293f, 1.82629f, 7.49915f)
                curveTo(1.82629f, 10.6319f, 4.36648f, 13.1716f, 7.49915f, 13.172f)
                curveTo(8.88559f, 13.172f, 10.1553f, 12.6739f, 11.1407f, 11.8478f)
                lineTo(3.15051f, 3.85754f)
                close()
                moveTo(7.49915f, 1.82629f)
                curveTo(6.11293f, 1.82648f, 4.84289f, 2.32445f, 3.85754f, 3.15051f)
                lineTo(11.8478f, 11.1407f)
                curveTo(12.6739f, 10.1553f, 13.172f, 8.88559f, 13.172f, 7.49915f)
                curveTo(13.1716f, 4.36648f, 10.6319f, 1.82629f, 7.49915f, 1.82629f)
                close()
            }
        }.build()
        
        return _CircleBackslash!!
    }

private var _CircleBackslash: ImageVector? = null

