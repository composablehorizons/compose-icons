package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUturnRight: ImageVector
    get() {
        if (_ArrowUturnRight != null) return _ArrowUturnRight!!
        
        _ArrowUturnRight = ImageVector.Builder(
            name = "arrow-uturn-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 9.75f)
                arcTo(2.75f, 2.75f, 0f, false, true, 6.25f, 7f)
                horizontalLineToRelative(5.19f)
                lineTo(9.22f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.22f, 2.22f)
                horizontalLineTo(6.25f)
                arcToRelative(4.25f, 4.25f, 0f, false, false, 0f, 8.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1f)
                arcTo(2.75f, 2.75f, 0f, false, true, 3.5f, 9.75f)
                close()
            }
        }.build()
        
        return _ArrowUturnRight!!
    }

private var _ArrowUturnRight: ImageVector? = null

