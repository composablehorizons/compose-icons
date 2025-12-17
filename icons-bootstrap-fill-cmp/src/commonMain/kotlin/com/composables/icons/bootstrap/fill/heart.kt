package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.314f)
                curveTo(12.438f, -3.248f, 23.534f, 4.735f, 8f, 15f)
                curveTo(-7.534f, 4.736f, 3.562f, -3.248f, 8f, 1.314f)
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null

