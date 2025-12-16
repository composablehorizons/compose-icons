package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Pencil1: ImageVector
    get() {
        if (_Pencil1 != null) return _Pencil1!!
        
        _Pencil1 = ImageVector.Builder(
            name = "pencil-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.2246f, 1.08204f)
                curveTo(11.4187f, 0.953875f, 11.6826f, 0.975633f, 11.8535f, 1.14649f)
                lineTo(13.8535f, 3.14649f)
                lineTo(13.9179f, 3.22462f)
                curveTo(14.0461f, 3.41869f, 14.0244f, 3.68266f, 13.8535f, 3.85352f)
                lineTo(6.42186f, 11.2852f)
                curveTo(6.35442f, 11.3526f, 6.27771f, 11.4105f, 6.19432f, 11.4561f)
                lineTo(6.10838f, 11.4971f)
                lineTo(2.69725f, 12.96f)
                curveTo(2.50933f, 13.0405f, 2.29103f, 12.9981f, 2.14647f, 12.8535f)
                curveTo(2.0019f, 12.709f, 1.95949f, 12.4907f, 2.04002f, 12.3027f)
                lineTo(3.50291f, 8.89161f)
                lineTo(3.54393f, 8.80567f)
                curveTo(3.58951f, 8.72228f, 3.6474f, 8.64556f, 3.71483f, 8.57813f)
                lineTo(11.1465f, 1.14649f)
                lineTo(11.2246f, 1.08204f)
                close()
                moveTo(4.42186f, 9.28516f)
                lineTo(3.78025f, 10.7803f)
                lineTo(4.21775f, 11.2178f)
                lineTo(5.71483f, 10.5781f)
                lineTo(12.7929f, 3.50001f)
                lineTo(11.5f, 2.20704f)
                lineTo(4.42186f, 9.28516f)
                close()
            }
        }.build()
        
        return _Pencil1!!
    }

private var _Pencil1: ImageVector? = null

