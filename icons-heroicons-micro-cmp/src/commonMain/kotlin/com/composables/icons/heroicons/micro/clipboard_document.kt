package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ClipboardDocument: ImageVector
    get() {
        if (_ClipboardDocument != null) return _ClipboardDocument!!
        
        _ClipboardDocument = ImageVector.Builder(
            name = "clipboard-document",
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
                verticalLineToRelative(-2.523f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.732f, -1.768f)
                lineTo(8.354f, 5.232f)
                arcTo(2.5f, 2.5f, 0f, false, false, 6.586f, 4.5f)
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
                verticalLineToRelative(-3.586f)
                arcToRelative(1f, 1f, 0f, false, false, -0.293f, -0.707f)
                lineTo(7.293f, 6.293f)
                arcTo(1f, 1f, 0f, false, false, 6.586f, 6f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _ClipboardDocument!!
    }

private var _ClipboardDocument: ImageVector? = null

