package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Search: ImageVector
    get() {
        if (_Search != null) return _Search!!
        
        _Search = ImageVector.Builder(
            name = "search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.0195f, 10.7266f)
                curveTo(9.06578f, 11.5217f, 7.83875f, 12f, 6.5f, 12f)
                curveTo(3.46243f, 12f, 1f, 9.53757f, 1f, 6.5f)
                curveTo(1f, 3.46243f, 3.46243f, 1f, 6.5f, 1f)
                curveTo(9.53757f, 1f, 12f, 3.46243f, 12f, 6.5f)
                curveTo(12f, 7.83875f, 11.5217f, 9.06578f, 10.7266f, 10.0195f)
                lineTo(13.8535f, 13.1464f)
                curveTo(14.0488f, 13.3417f, 14.0488f, 13.6583f, 13.8535f, 13.8536f)
                curveTo(13.6583f, 14.0488f, 13.3417f, 14.0488f, 13.1464f, 13.8536f)
                lineTo(10.0195f, 10.7266f)
                close()
                moveTo(11f, 6.5f)
                curveTo(11f, 4.01472f, 8.98528f, 2f, 6.5f, 2f)
                curveTo(4.01472f, 2f, 2f, 4.01472f, 2f, 6.5f)
                curveTo(2f, 8.98528f, 4.01472f, 11f, 6.5f, 11f)
                curveTo(8.98528f, 11f, 11f, 8.98528f, 11f, 6.5f)
                close()
            }
        }.build()
        
        return _Search!!
    }

private var _Search: ImageVector? = null

