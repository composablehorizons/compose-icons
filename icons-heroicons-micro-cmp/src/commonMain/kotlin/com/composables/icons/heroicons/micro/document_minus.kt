package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentMinus: ImageVector
    get() {
        if (_DocumentMinus != null) return _DocumentMinus!!
        
        _DocumentMinus = ImageVector.Builder(
            name = "document-minus",
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
                moveToRelative(7f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 11f, 9f)
                close()
            }
        }.build()
        
        return _DocumentMinus!!
    }

private var _DocumentMinus: ImageVector? = null

