package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ClipboardDocumentCheck: ImageVector
    get() {
        if (_ClipboardDocumentCheck != null) return _ClipboardDocumentCheck!!
        
        _ClipboardDocumentCheck = ImageVector.Builder(
            name = "clipboard-document-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.986f, 3f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.5f, 1.937f)
                verticalLineTo(7f)
                arcTo(2.5f, 2.5f, 0f, false, false, 10f, 4.5f)
                horizontalLineTo(4.063f)
                arcTo(2f, 2f, 0f, false, true, 6f, 3f)
                horizontalLineToRelative(0.014f)
                arcTo(2.25f, 2.25f, 0f, false, true, 8.25f, 1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.236f, 2f)
                close()
                moveTo(10.5f, 4f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                close()
                moveToRelative(6.585f, 1.08f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.336f, 1.005f)
                lineToRelative(-1.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.16f, 0.234f)
                lineToRelative(-1.75f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.977f, -1.139f)
                lineToRelative(1.02f, 0.875f)
                lineToRelative(1.321f, -2.64f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.006f, -0.336f)
                close()
            }
        }.build()
        
        return _ClipboardDocumentCheck!!
    }

private var _ClipboardDocumentCheck: ImageVector? = null

