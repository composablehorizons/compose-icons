package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ClipboardDocumentList: ImageVector
    get() {
        if (_ClipboardDocumentList != null) return _ClipboardDocumentList!!
        
        _ClipboardDocumentList = ImageVector.Builder(
            name = "clipboard-document-list",
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
                moveTo(3f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(3f)
                close()
                moveToRelative(1.75f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(4f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ClipboardDocumentList!!
    }

private var _ClipboardDocumentList: ImageVector? = null

