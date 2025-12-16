package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Eraser: ImageVector
    get() {
        if (_Eraser != null) return _Eraser!!
        
        _Eraser = ImageVector.Builder(
            name = "eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.36026f, 0.729266f)
                curveTo(8.55547f, 0.534048f, 8.87201f, 0.534137f, 9.06729f, 0.729266f)
                lineTo(14.2704f, 5.93239f)
                lineTo(14.3349f, 6.01052f)
                curveTo(14.4631f, 6.20461f, 14.4413f, 6.46852f, 14.2704f, 6.63942f)
                lineTo(7.34658f, 13.5633f)
                curveTo(6.76081f, 14.149f, 5.81128f, 14.149f, 5.22549f, 13.5633f)
                lineTo(1.43643f, 9.77419f)
                curveTo(0.88738f, 9.22493f, 0.853223f, 8.35644f, 1.33389f, 7.76735f)
                lineTo(1.43643f, 7.65309f)
                lineTo(8.36026f, 0.729266f)
                close()
                moveTo(2.14346f, 8.36013f)
                curveTo(1.94827f, 8.55532f, 1.9484f, 8.87188f, 2.14346f, 9.06716f)
                lineTo(5.93252f, 12.8562f)
                curveTo(6.12779f, 13.0514f, 6.4443f, 13.0515f, 6.63955f, 12.8562f)
                lineTo(7.89443f, 11.6013f)
                lineTo(3.39834f, 7.10524f)
                lineTo(2.14346f, 8.36013f)
                close()
                moveTo(4.10537f, 6.39821f)
                lineTo(8.60147f, 10.8943f)
                lineTo(13.2099f, 6.28591f)
                lineTo(8.71377f, 1.78981f)
                lineTo(4.10537f, 6.39821f)
                close()
            }
        }.build()
        
        return _Eraser!!
    }

private var _Eraser: ImageVector? = null

