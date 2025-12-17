package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.DocumentCheck: ImageVector
    get() {
        if (_DocumentCheck != null) return _DocumentCheck!!
        
        _DocumentCheck = ImageVector.Builder(
            name = "document-check",
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
                moveToRelative(6.713f, 4.16f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.127f, 1.053f)
                lineToRelative(-2.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.078f, 0.106f)
                lineToRelative(-1.75f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.976f, -1.138f)
                lineToRelative(1.156f, 0.99f)
                lineTo(9.66f, 6.287f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.053f, -0.127f)
                close()
            }
        }.build()
        
        return _DocumentCheck!!
    }

private var _DocumentCheck: ImageVector? = null

