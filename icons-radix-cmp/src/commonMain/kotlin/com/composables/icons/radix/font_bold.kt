package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FontBold: ImageVector
    get() {
        if (_FontBold != null) return _FontBold!!
        
        _FontBold = ImageVector.Builder(
            name = "font-bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.02832f, 3f)
                curveTo(10.1371f, 3f, 11.0537f, 3.98152f, 11.0537f, 5.18457f)
                curveTo(11.0537f, 6.08498f, 10.6035f, 6.81887f, 9.70312f, 7.23633f)
                curveTo(10.8656f, 7.44882f, 11.5176f, 8.62804f, 11.5176f, 9.48145f)
                curveTo(11.5175f, 10.5126f, 10.9901f, 12f, 9.27734f, 12f)
                horizontalLineTo(5.10547f)
                curveTo(4.70868f, 12f, 4.42388f, 11.9121f, 4.25195f, 11.7363f)
                curveTo(4.08417f, 11.5563f, 4.00002f, 11.2716f, 4f, 10.8828f)
                verticalLineTo(4.11719f)
                curveTo(4.00002f, 3.72026f, 4.08594f, 3.43555f, 4.25781f, 3.26367f)
                curveTo(4.43381f, 3.08778f, 4.71676f, 3f, 5.10547f, 3f)
                horizontalLineTo(9.02832f)
                close()
                moveTo(5.7998f, 10.6309f)
                horizontalLineTo(8.37891f)
                curveTo(8.89999f, 10.6309f, 9.62985f, 10.1211f, 9.62988f, 9.29883f)
                curveTo(9.62988f, 8.47649f, 8.9f, 8.00293f, 8.37891f, 8.00293f)
                horizontalLineTo(5.7998f)
                verticalLineTo(10.6309f)
                close()
                moveTo(5.7998f, 6.69531f)
                horizontalLineTo(8.17969f)
                curveTo(8.53906f, 6.69531f, 9.27734f, 6.35938f, 9.27734f, 5.5f)
                curveTo(9.27733f, 4.64064f, 8.48047f, 4.36914f, 8.17969f, 4.36914f)
                horizontalLineTo(5.7998f)
                verticalLineTo(6.69531f)
                close()
            }
        }.build()
        
        return _FontBold!!
    }

private var _FontBold: ImageVector? = null

