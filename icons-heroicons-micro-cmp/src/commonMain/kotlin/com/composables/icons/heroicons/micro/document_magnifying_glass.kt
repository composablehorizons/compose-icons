package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentMagnifyingGlass: ImageVector
    get() {
        if (_DocumentMagnifyingGlass != null) return _DocumentMagnifyingGlass!!
        
        _DocumentMagnifyingGlass = ImageVector.Builder(
            name = "document-magnifying-glass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 14f)
                horizontalLineToRelative(8f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(9.94f, 2.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8.878f, 2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(3.5f, 2.5f)
                arcToRelative(3f, 3f, 0f, true, false, 1.524f, 5.585f)
                lineToRelative(1.196f, 1.195f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.195f, -1.196f)
                arcTo(3f, 3f, 0f, false, false, 7.5f, 4.5f)
                close()
            }
        }.build()
        
        return _DocumentMagnifyingGlass!!
    }

private var _DocumentMagnifyingGlass: ImageVector? = null

