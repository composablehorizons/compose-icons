package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2f, 4.5f)
                verticalLineToRelative(2.879f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0.732f, 1.767f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 3.536f, 0f)
                lineToRelative(2.878f, -2.878f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -3.536f)
                lineToRelative(-4.5f, -4.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 7.38f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveTo(5f, 6f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

