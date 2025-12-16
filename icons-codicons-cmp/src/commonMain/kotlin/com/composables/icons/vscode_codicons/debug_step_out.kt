package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStepOut: ImageVector
    get() {
        if (_DebugStepOut != null) return _DebugStepOut!!
        
        _DebugStepOut = ImageVector.Builder(
            name = "debug-step-out",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.99802f, 13f)
                curveTo(9.99802f, 14.103f, 9.10102f, 15f, 7.99802f, 15f)
                curveTo(6.89502f, 15f, 5.99802f, 14.103f, 5.99802f, 13f)
                curveTo(5.99802f, 11.897f, 6.89502f, 11f, 7.99802f, 11f)
                curveTo(9.10102f, 11f, 9.99802f, 11.897f, 9.99802f, 13f)
                close()
                moveTo(12.03f, 4.71999f)
                lineTo(8.53002f, 1.21999f)
                curveTo(8.23702f, 0.926994f, 7.76202f, 0.926994f, 7.46902f, 1.21999f)
                lineTo(3.96902f, 4.71999f)
                curveTo(3.67602f, 5.01299f, 3.67602f, 5.48799f, 3.96902f, 5.78099f)
                curveTo(4.26202f, 6.07399f, 4.73702f, 6.07399f, 5.03002f, 5.78099f)
                lineTo(7.25002f, 3.56099f)
                verticalLineTo(9.24999f)
                curveTo(7.25002f, 9.66399f, 7.58602f, 9.99999f, 8.00002f, 9.99999f)
                curveTo(8.41402f, 9.99999f, 8.75002f, 9.66399f, 8.75002f, 9.24999f)
                verticalLineTo(3.56099f)
                lineTo(10.97f, 5.78099f)
                curveTo(11.116f, 5.92699f, 11.308f, 6.00099f, 11.5f, 6.00099f)
                curveTo(11.692f, 6.00099f, 11.884f, 5.92799f, 12.03f, 5.78099f)
                curveTo(12.323f, 5.48799f, 12.323f, 5.01299f, 12.03f, 4.71999f)
                close()
            }
        }.build()
        
        return _DebugStepOut!!
    }

private var _DebugStepOut: ImageVector? = null

