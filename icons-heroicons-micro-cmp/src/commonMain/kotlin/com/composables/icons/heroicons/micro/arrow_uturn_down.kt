package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUturnDown: ImageVector
    get() {
        if (_ArrowUturnDown != null) return _ArrowUturnDown!!
        
        _ArrowUturnDown = ImageVector.Builder(
            name = "arrow-uturn-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.75f, 3.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 7f, 6.25f)
                verticalLineToRelative(5.19f)
                lineToRelative(2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.22f, 2.22f)
                verticalLineTo(6.25f)
                arcToRelative(4.25f, 4.25f, 0f, false, true, 8.5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1f)
                arcTo(2.75f, 2.75f, 0f, false, false, 9.75f, 3.5f)
                close()
            }
        }.build()
        
        return _ArrowUturnDown!!
    }

private var _ArrowUturnDown: ImageVector? = null

