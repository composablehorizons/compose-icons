package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUturnLeft: ImageVector
    get() {
        if (_ArrowUturnLeft != null) return _ArrowUturnLeft!!
        
        _ArrowUturnLeft = ImageVector.Builder(
            name = "arrow-uturn-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 9.75f)
                arcTo(2.75f, 2.75f, 0f, false, false, 9.75f, 7f)
                horizontalLineTo(4.56f)
                lineToRelative(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineTo(4.56f, 5.5f)
                horizontalLineToRelative(5.19f)
                arcToRelative(4.25f, 4.25f, 0f, false, true, 0f, 8.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 2.75f, -2.75f)
                close()
            }
        }.build()
        
        return _ArrowUturnLeft!!
    }

private var _ArrowUturnLeft: ImageVector? = null

