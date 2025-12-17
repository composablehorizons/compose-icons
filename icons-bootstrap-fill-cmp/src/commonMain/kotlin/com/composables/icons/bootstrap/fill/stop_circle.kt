package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) return _StopCircle!!
        
        _StopCircle = ImageVector.Builder(
            name = "stop-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 6.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 11f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 9.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 5f)
                close()
            }
        }.build()
        
        return _StopCircle!!
    }

private var _StopCircle: ImageVector? = null

