package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowLeftRight: ImageVector
    get() {
        if (_ArrowLeftRight != null) return _ArrowLeftRight!!
        
        _ArrowLeftRight = ImageVector.Builder(
            name = "arrow-left-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.793f)
                lineToRelative(-3.147f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineTo(13.293f, 11f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(14f, -7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(2.707f)
                lineToRelative(3.147f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.708f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(2.707f, 4f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
            }
        }.build()
        
        return _ArrowLeftRight!!
    }

private var _ArrowLeftRight: ImageVector? = null

