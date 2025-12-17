package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentPlus: ImageVector
    get() {
        if (_DocumentPlus != null) return _DocumentPlus!!
        
        _DocumentPlus = ImageVector.Builder(
            name = "document-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
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
                moveToRelative(4.75f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _DocumentPlus!!
    }

private var _DocumentPlus: ImageVector? = null

