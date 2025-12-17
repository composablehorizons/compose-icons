package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) return _Paperclip!!
        
        _Paperclip = ImageVector.Builder(
            name = "paperclip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                verticalLineToRelative(9f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 5f, 0f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                close()
            }
        }.build()
        
        return _Paperclip!!
    }

private var _Paperclip: ImageVector? = null

