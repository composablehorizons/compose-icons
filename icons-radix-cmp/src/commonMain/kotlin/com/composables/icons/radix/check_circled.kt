package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CheckCircled: ImageVector
    get() {
        if (_CheckCircled != null) return _CheckCircled!!
        
        _CheckCircled = ImageVector.Builder(
            name = "check-circled",
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
                moveTo(9.34094f, 4.96201f)
                curveTo(9.49988f, 4.73626f, 9.81241f, 4.68202f, 10.0382f, 4.84091f)
                curveTo(10.2639f, 4.99988f, 10.3182f, 5.31242f, 10.1593f, 5.53818f)
                lineTo(6.99231f, 10.0382f)
                curveTo(6.90692f, 10.1594f, 6.7719f, 10.236f, 6.62415f, 10.2481f)
                curveTo(6.47636f, 10.2602f, 6.33063f, 10.2064f, 6.22668f, 10.1007f)
                lineTo(4.64368f, 8.4874f)
                lineTo(5.00012f, 8.13779f)
                lineTo(5.35657f, 7.7872f)
                lineTo(6.51965f, 8.97079f)
                lineTo(9.34094f, 4.96201f)
                close()
                moveTo(4.64954f, 7.78036f)
                curveTo(4.84653f, 7.58696f, 5.16309f, 7.5903f, 5.35657f, 7.7872f)
                lineTo(4.64368f, 8.4874f)
                curveTo(4.45023f, 8.29035f, 4.4525f, 7.97382f, 4.64954f, 7.78036f)
                close()
            }
        }.build()
        
        return _CheckCircled!!
    }

private var _CheckCircled: ImageVector? = null

