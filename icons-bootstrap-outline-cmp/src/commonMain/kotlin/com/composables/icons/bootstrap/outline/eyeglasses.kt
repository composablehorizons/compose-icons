package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Eyeglasses: ImageVector
    get() {
        if (_Eyeglasses != null) return _Eyeglasses!!
        
        _Eyeglasses = ImageVector.Builder(
            name = "eyeglasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 6f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                moveToRelative(2.625f, 0.547f)
                arcToRelative(3f, 3f, 0f, false, false, -5.584f, 0.953f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.541f)
                arcTo(3f, 3f, 0f, false, false, 7f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, 5.959f, 0.5f)
                horizontalLineToRelative(0.541f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-0.541f)
                arcToRelative(3f, 3f, 0f, false, false, -5.584f, -0.953f)
                arcTo(2f, 2f, 0f, false, false, 8f, 6f)
                curveToRelative(-0.532f, 0f, -1.016f, 0.208f, -1.375f, 0.547f)
                moveTo(14f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
            }
        }.build()
        
        return _Eyeglasses!!
    }

private var _Eyeglasses: ImageVector? = null

