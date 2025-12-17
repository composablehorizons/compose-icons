package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ClipboardDocumentCheck: ImageVector
    get() {
        if (_ClipboardDocumentCheck != null) return _ClipboardDocumentCheck!!
        
        _ClipboardDocumentCheck = ImageVector.Builder(
            name = "clipboard-document-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 5.25f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.012f, -2.238f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.75f, 1f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.238f, 2.012f)
                curveToRelative(-0.875f, 0.092f, -1.6f, 0.686f, -1.884f, 1.488f)
                horizontalLineTo(11f)
                arcTo(2.5f, 2.5f, 0f, false, true, 13.5f, 7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 11.75f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(12.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(3f)
                close()
                moveToRelative(6.874f, 4.166f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.248f, -0.832f)
                lineToRelative(-2.493f, 3.739f)
                lineToRelative(-0.853f, -0.853f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.154f, -0.114f)
                lineToRelative(3f, -4.5f)
                close()
            }
        }.build()
        
        return _ClipboardDocumentCheck!!
    }

private var _ClipboardDocumentCheck: ImageVector? = null

