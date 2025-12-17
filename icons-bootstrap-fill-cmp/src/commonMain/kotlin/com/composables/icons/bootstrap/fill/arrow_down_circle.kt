package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowDownCircle: ImageVector
    get() {
        if (_ArrowDownCircle != null) return _ArrowDownCircle!!
        
        _ArrowDownCircle = ImageVector.Builder(
            name = "arrow-down-circle",
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
                moveTo(8.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(5.793f)
                lineTo(5.354f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(8.5f, 10.293f)
                close()
            }
        }.build()
        
        return _ArrowDownCircle!!
    }

private var _ArrowDownCircle: ImageVector? = null

