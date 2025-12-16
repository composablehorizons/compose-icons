package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Attach: ImageVector
    get() {
        if (_Attach != null) return _Attach!!
        
        _Attach = ImageVector.Builder(
            name = "attach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.2832f, 7.97549f)
                curveTo(2.2832f, 8.25149f, 2.5072f, 8.47549f, 2.7832f, 8.47549f)
                curveTo(2.9112f, 8.47549f, 3.0392f, 8.42649f, 3.1372f, 8.32949f)
                lineTo(7.7322f, 3.73249f)
                curveTo(8.2202f, 3.24449f, 8.8602f, 3.00049f, 9.5002f, 3.00049f)
                curveTo(10.8812f, 3.00049f, 12.0002f, 4.11949f, 12.0002f, 5.50049f)
                curveTo(12.0002f, 6.14049f, 11.7562f, 6.78049f, 11.2682f, 7.26849f)
                lineTo(5.9652f, 12.5715f)
                curveTo(5.7702f, 12.7665f, 5.5142f, 12.8645f, 5.2582f, 12.8645f)
                curveTo(4.7062f, 12.8645f, 4.2582f, 12.4165f, 4.2582f, 11.8645f)
                curveTo(4.2582f, 11.6085f, 4.3562f, 11.3525f, 4.5512f, 11.1575f)
                lineTo(9.8542f, 5.85449f)
                curveTo(9.9522f, 5.75649f, 10.0002f, 5.62849f, 10.0002f, 5.50049f)
                curveTo(10.0002f, 5.22449f, 9.7762f, 5.00049f, 9.5002f, 5.00049f)
                curveTo(9.3722f, 5.00049f, 9.2442f, 5.04949f, 9.1462f, 5.14649f)
                lineTo(3.8432f, 10.4505f)
                curveTo(3.4522f, 10.8415f, 3.2572f, 11.3525f, 3.2572f, 11.8645f)
                curveTo(3.2572f, 12.9695f, 4.1522f, 13.8645f, 5.2572f, 13.8645f)
                curveTo(5.7692f, 13.8645f, 6.2812f, 13.6695f, 6.6712f, 13.2785f)
                lineTo(11.9742f, 7.97549f)
                curveTo(12.6572f, 7.29249f, 12.9992f, 6.39649f, 12.9992f, 5.50049f)
                curveTo(12.9992f, 3.56749f, 11.4322f, 2.00049f, 9.4992f, 2.00049f)
                curveTo(8.6032f, 2.00049f, 7.7082f, 2.34249f, 7.0242f, 3.02549f)
                lineTo(2.4292f, 7.62149f)
                curveTo(2.3312f, 7.71949f, 2.2832f, 7.84749f, 2.2832f, 7.97549f)
                close()
            }
        }.build()
        
        return _Attach!!
    }

private var _Attach: ImageVector? = null

