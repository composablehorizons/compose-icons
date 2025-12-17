package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentMagnifyingGlass: ImageVector
    get() {
        if (_DocumentMagnifyingGlass != null) return _DocumentMagnifyingGlass!!
        
        _DocumentMagnifyingGlass = ImageVector.Builder(
            name = "document-magnifying-glass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 10f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 3.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(7.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineToRelative(-4.12f, -4.122f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.378f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(5f, 5f)
                arcToRelative(3f, 3f, 0f, true, false, 1.524f, 5.585f)
                lineToRelative(1.196f, 1.195f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.195f, -1.196f)
                arcTo(3f, 3f, 0f, false, false, 9.5f, 7f)
                close()
            }
        }.build()
        
        return _DocumentMagnifyingGlass!!
    }

private var _DocumentMagnifyingGlass: ImageVector? = null

