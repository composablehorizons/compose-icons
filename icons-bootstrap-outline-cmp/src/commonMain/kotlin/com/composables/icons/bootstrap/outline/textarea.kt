package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Textarea: ImageVector
    get() {
        if (_Textarea != null) return _Textarea!!
        
        _Textarea = ImageVector.Builder(
            name = "textarea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.563f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 3.874f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 15f)
                horizontalLineTo(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineTo(9.937f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -3.874f)
                close()
                moveToRelative(1f, 3.563f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 3.874f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(9.937f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -3.874f)
                verticalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13f, 2f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(2f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(12f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _Textarea!!
    }

private var _Textarea: ImageVector? = null

