package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ClipboardDocumentList: ImageVector
    get() {
        if (_ClipboardDocumentList != null) return _ClipboardDocumentList!!
        
        _ClipboardDocumentList = ImageVector.Builder(
            name = "clipboard-document-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.988f, 3.012f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 5.25f)
                verticalLineToRelative(6.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 14f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                arcTo(2.5f, 2.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineTo(8.128f)
                arcToRelative(2.252f, 2.252f, 0f, false, true, 1.884f, -1.488f)
                arcTo(2.25f, 2.25f, 0f, false, true, 12.25f, 1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.238f, 2.012f)
                close()
                moveTo(11.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                close()
                moveToRelative(2f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(0f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ClipboardDocumentList!!
    }

private var _ClipboardDocumentList: ImageVector? = null

