package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Globe2: ImageVector
    get() {
        if (_Globe2 != null) return _Globe2!!
        
        _Globe2 = ImageVector.Builder(
            name = "globe-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50049f, 0.900055f)
                curveTo(11.1453f, 0.900372f, 14.1001f, 3.85576f, 14.1001f, 7.50064f)
                curveTo(14.0998f, 11.1453f, 11.1451f, 14.0999f, 7.50049f, 14.1003f)
                curveTo(3.8556f, 14.1003f, 0.900219f, 11.1455f, 0.899902f, 7.50064f)
                curveTo(0.899902f, 3.85556f, 3.85541f, 0.900055f, 7.50049f, 0.900055f)
                close()
                moveTo(10.2144f, 7.94986f)
                curveTo(10.1279f, 9.83381f, 9.49621f, 11.7024f, 8.30225f, 13.1422f)
                curveTo(10.9244f, 12.7728f, 12.9717f, 10.6205f, 13.1802f, 7.94986f)
                horizontalLineTo(10.2144f)
                close()
                moveTo(1.81885f, 7.94986f)
                curveTo(2.01868f, 10.509f, 3.90778f, 12.5919f, 6.37256f, 13.0866f)
                curveTo(5.24135f, 11.6536f, 4.64281f, 9.80853f, 4.56006f, 7.94986f)
                horizontalLineTo(1.81885f)
                close()
                moveTo(5.4624f, 7.94986f)
                curveTo(5.55203f, 9.79091f, 6.19192f, 11.5713f, 7.35498f, 12.8571f)
                curveTo(8.55873f, 11.5705f, 9.22047f, 9.7898f, 9.31299f, 7.94986f)
                horizontalLineTo(5.4624f)
                close()
                moveTo(7.35498f, 2.14127f)
                curveTo(6.19153f, 3.42699f, 5.55217f, 5.20823f, 5.4624f, 7.04947f)
                horizontalLineTo(9.31299f)
                curveTo(9.22031f, 5.20935f, 8.55911f, 3.42779f, 7.35498f, 2.14127f)
                close()
                moveTo(8.30225f, 1.85709f)
                curveTo(9.49629f, 3.29682f, 10.1278f, 5.16558f, 10.2144f, 7.04947f)
                horizontalLineTo(13.1802f)
                curveTo(12.9711f, 4.37932f, 10.9241f, 2.22654f, 8.30225f, 1.85709f)
                close()
                moveTo(6.37354f, 1.9108f)
                curveTo(3.90845f, 2.40502f, 2.02021f, 4.4904f, 1.81982f, 7.04947f)
                horizontalLineTo(4.56006f)
                curveTo(4.64297f, 5.19012f, 5.24138f, 3.34389f, 6.37354f, 1.9108f)
                close()
            }
        }.build()
        
        return _Globe2!!
    }

private var _Globe2: ImageVector? = null

