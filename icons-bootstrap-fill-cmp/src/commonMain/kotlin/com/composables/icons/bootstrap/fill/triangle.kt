package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Triangle: ImageVector
    get() {
        if (_Triangle != null) return _Triangle!!
        
        _Triangle = ImageVector.Builder(
            name = "triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.022f, 1.566f)
                arcToRelative(1.13f, 1.13f, 0f, false, true, 1.96f, 0f)
                lineToRelative(6.857f, 11.667f)
                curveToRelative(0.457f, 0.778f, -0.092f, 1.767f, -0.98f, 1.767f)
                horizontalLineTo(1.144f)
                curveToRelative(-0.889f, 0f, -1.437f, -0.99f, -0.98f, -1.767f)
                close()
            }
        }.build()
        
        return _Triangle!!
    }

private var _Triangle: ImageVector? = null

