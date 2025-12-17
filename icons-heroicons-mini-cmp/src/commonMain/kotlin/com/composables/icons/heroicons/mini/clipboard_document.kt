package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ClipboardDocument: ImageVector
    get() {
        if (_ClipboardDocument != null) return _ClipboardDocument!!
        
        _ClipboardDocument = ImageVector.Builder(
            name = "clipboard-document",
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
                verticalLineToRelative(-3.379f)
                arcToRelative(3f, 3f, 0f, false, false, -0.879f, -2.121f)
                lineToRelative(-3.12f, -3.121f)
                arcToRelative(3f, 3f, 0f, false, false, -1.402f, -0.791f)
                arcToRelative(2.252f, 2.252f, 0f, false, true, 1.913f, -1.576f)
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
                moveTo(3.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 7.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 18f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(8.44f, 6.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 7.378f, 6f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _ClipboardDocument!!
    }

private var _ClipboardDocument: ImageVector? = null

