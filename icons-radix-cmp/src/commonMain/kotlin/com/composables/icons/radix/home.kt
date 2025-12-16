package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Home: ImageVector
    get() {
        if (_Home != null) return _Home!!
        
        _Home = ImageVector.Builder(
            name = "home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.17269f, 0.146853f)
                curveTo(7.40386f, -0.0038436f, 7.7164f, 0.021395f, 7.92074f, 0.222048f)
                lineTo(14.6707f, 6.8617f)
                lineTo(14.7479f, 6.95545f)
                curveTo(14.9037f, 7.18704f, 14.8809f, 7.50355f, 14.6776f, 7.71033f)
                curveTo(14.4742f, 7.91711f, 14.1578f, 7.94537f, 13.9237f, 7.79334f)
                lineTo(13.8289f, 7.71716f)
                lineTo(12.9998f, 6.90076f)
                verticalLineTo(12.5004f)
                curveTo(12.9997f, 12.7764f, 12.7759f, 13.0004f, 12.4998f, 13.0004f)
                horizontalLineTo(2.49984f)
                curveTo(2.22393f, 13.0002f, 1.99994f, 12.7763f, 1.99984f, 12.5004f)
                verticalLineTo(6.90076f)
                lineTo(1.17074f, 7.71716f)
                curveTo(0.934507f, 7.94955f, 0.554487f, 7.94656f, 0.322105f, 7.71033f)
                curveTo(0.0902207f, 7.47406f, 0.0928771f, 7.09391f, 0.328941f, 6.8617f)
                lineTo(7.07894f, 0.222048f)
                lineTo(7.17269f, 0.146853f)
                close()
                moveTo(2.99984f, 5.91736f)
                verticalLineTo(12.0004f)
                horizontalLineTo(5.99984f)
                verticalLineTo(8.50037f)
                lineTo(6.00961f, 8.39978f)
                curveTo(6.05611f, 8.17193f, 6.25829f, 8.00054f, 6.49984f, 8.00037f)
                horizontalLineTo(9.49984f)
                lineTo(9.60043f, 8.01013f)
                curveTo(9.82839f, 8.05666f, 9.99984f, 8.25865f, 9.99984f, 8.50037f)
                verticalLineTo(12.0004f)
                horizontalLineTo(11.9998f)
                verticalLineTo(5.91736f)
                lineTo(7.49984f, 1.4906f)
                lineTo(2.99984f, 5.91736f)
                close()
                moveTo(6.99984f, 12.0004f)
                horizontalLineTo(8.99984f)
                verticalLineTo(9.00037f)
                horizontalLineTo(6.99984f)
                verticalLineTo(12.0004f)
                close()
            }
        }.build()
        
        return _Home!!
    }

private var _Home: ImageVector? = null

