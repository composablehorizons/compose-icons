package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowDownLeftCircle: ImageVector
    get() {
        if (_ArrowDownLeftCircle != null) return _ArrowDownLeftCircle!!
        
        _ArrowDownLeftCircle = ImageVector.Builder(
            name = "arrow-down-left-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, false, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, false, 16f, 0f)
                moveToRelative(-5.904f, -2.803f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.707f)
                lineTo(6.707f, 10f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(6.525f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(2.768f)
                close()
            }
        }.build()
        
        return _ArrowDownLeftCircle!!
    }

private var _ArrowDownLeftCircle: ImageVector? = null

