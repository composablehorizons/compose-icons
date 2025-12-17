package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowsExpandVertical: ImageVector
    get() {
        if (_ArrowsExpandVertical != null) return _ArrowsExpandVertical!!
        
        _ArrowsExpandVertical = ImageVector.Builder(
            name = "arrows-expand-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                moveTo(0.146f, 8.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(1.707f, 7.5f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(1.707f)
                lineToRelative(1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                close()
                moveTo(10f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.793f)
                lineToRelative(-1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(14.293f, 8.5f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 8f)
            }
        }.build()
        
        return _ArrowsExpandVertical!!
    }

private var _ArrowsExpandVertical: ImageVector? = null

