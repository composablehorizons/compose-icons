package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Disc: ImageVector
    get() {
        if (_Disc != null) return _Disc!!
        
        _Disc = ImageVector.Builder(
            name = "disc",
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
                moveTo(7.68665f, 5.68759f)
                curveTo(8.60556f, 5.78095f, 9.32321f, 6.55659f, 9.32336f, 7.50009f)
                lineTo(9.3136f, 7.68661f)
                curveTo(9.22016f, 8.60551f, 8.44365f, 9.32327f, 7.50012f, 9.32333f)
                lineTo(7.3136f, 9.31357f)
                curveTo(6.45615f, 9.22626f, 5.77484f, 8.54409f, 5.68762f, 7.68661f)
                lineTo(5.67786f, 7.50009f)
                curveTo(5.67802f, 6.49376f, 6.49379f, 5.67799f, 7.50012f, 5.67783f)
                lineTo(7.68665f, 5.68759f)
                close()
                moveTo(7.50012f, 6.62802f)
                curveTo(7.01846f, 6.62819f, 6.62822f, 7.01843f, 6.62805f, 7.50009f)
                curveTo(6.62825f, 7.98173f, 7.01848f, 8.37297f, 7.50012f, 8.37314f)
                curveTo(7.98185f, 8.37307f, 8.37297f, 7.98179f, 8.37317f, 7.50009f)
                curveTo(8.373f, 7.01837f, 7.98187f, 6.62809f, 7.50012f, 6.62802f)
                close()
            }
        }.build()
        
        return _Disc!!
    }

private var _Disc: ImageVector? = null

