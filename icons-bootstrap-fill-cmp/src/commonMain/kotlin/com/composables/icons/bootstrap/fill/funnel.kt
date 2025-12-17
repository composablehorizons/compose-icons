package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Funnel: ImageVector
    get() {
        if (_Funnel != null) return _Funnel!!
        
        _Funnel = ImageVector.Builder(
            name = "funnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.128f, 0.334f)
                lineTo(10f, 8.692f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.342f, 0.474f)
                lineToRelative(-3f, 1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 14.5f)
                verticalLineTo(8.692f)
                lineTo(1.628f, 3.834f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Funnel!!
    }

private var _Funnel: ImageVector? = null

