package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowUpLeftCircle: ImageVector
    get() {
        if (_ArrowUpLeftCircle != null) return _ArrowUpLeftCircle!!
        
        _ArrowUpLeftCircle = ImageVector.Builder(
            name = "arrow-up-left-circle",
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
                moveToRelative(-5.904f, 2.803f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.707f, -0.707f)
                lineTo(6.707f, 6f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(6.707f)
                close()
            }
        }.build()
        
        return _ArrowUpLeftCircle!!
    }

private var _ArrowUpLeftCircle: ImageVector? = null

