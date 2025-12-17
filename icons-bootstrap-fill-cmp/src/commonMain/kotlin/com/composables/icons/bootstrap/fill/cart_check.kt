package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CartCheck: ImageVector
    get() {
        if (_CartCheck != null) return _CartCheck!!
        
        _CartCheck = ImageVector.Builder(
            name = "cart-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.11f)
                lineToRelative(0.401f, 1.607f)
                lineToRelative(1.498f, 7.985f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4f, 12f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.491f, -0.408f)
                lineToRelative(1.5f, -8f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14.5f, 3f)
                horizontalLineTo(2.89f)
                lineToRelative(-0.405f, -1.621f)
                arcTo(0.5f, 0.5f, 0f, false, false, 2f, 1f)
                close()
                moveTo(6f, 14f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(-1.646f, -7.646f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(8f, 8.293f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
            }
        }.build()
        
        return _CartCheck!!
    }

private var _CartCheck: ImageVector? = null

