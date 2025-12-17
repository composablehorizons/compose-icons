package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowUpRightCircle: ImageVector
    get() {
        if (_ArrowUpRightCircle != null) return _ArrowUpRightCircle!!
        
        _ArrowUpRightCircle = ImageVector.Builder(
            name = "arrow-up-right-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.854f, 10.803f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.707f)
                lineTo(9.243f, 6f)
                horizontalLineTo(6.475f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                horizontalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineTo(6.707f)
                close()
            }
        }.build()
        
        return _ArrowUpRightCircle!!
    }

private var _ArrowUpRightCircle: ImageVector? = null

