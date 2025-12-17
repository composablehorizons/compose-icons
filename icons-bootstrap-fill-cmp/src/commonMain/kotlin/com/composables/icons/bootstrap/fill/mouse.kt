package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, true, -10f, 0f)
                close()
                moveToRelative(5.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

