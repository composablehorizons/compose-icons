package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Circle: ImageVector
    get() {
        if (_Circle != null) return _Circle!!
        
        _Circle = ImageVector.Builder(
            name = "circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, false, true, 8f, 16f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
                arcTo(8f, 8f, 0f, false, true, 16f, 8f)
                close()
            }
        }.build()
        
        return _Circle!!
    }

private var _Circle: ImageVector? = null

