package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hearts: ImageVector
    get() {
        if (_Hearts != null) return _Hearts!!
        
        _Hearts = ImageVector.Builder(
            name = "hearts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.931f, 0.481f)
                curveToRelative(1.627f, -1.671f, 5.692f, 1.254f, 0f, 5.015f)
                curveToRelative(-5.692f, -3.76f, -1.626f, -6.686f, 0f, -5.015f)
                moveToRelative(6.84f, 1.794f)
                curveToRelative(1.084f, -1.114f, 3.795f, 0.836f, 0f, 3.343f)
                curveToRelative(-3.795f, -2.507f, -1.084f, -4.457f, 0f, -3.343f)
                moveTo(7.84f, 7.642f)
                curveToRelative(2.71f, -2.786f, 9.486f, 2.09f, 0f, 8.358f)
                curveToRelative(-9.487f, -6.268f, -2.71f, -11.144f, 0f, -8.358f)
            }
        }.build()
        
        return _Hearts!!
    }

private var _Hearts: ImageVector? = null

