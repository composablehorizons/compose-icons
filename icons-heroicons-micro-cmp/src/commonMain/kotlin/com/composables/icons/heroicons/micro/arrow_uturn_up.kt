package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUturnUp: ImageVector
    get() {
        if (_ArrowUturnUp != null) return _ArrowUturnUp!!
        
        _ArrowUturnUp = ImageVector.Builder(
            name = "arrow-uturn-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.25f, 12.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 9f, 9.75f)
                verticalLineTo(4.56f)
                lineTo(6.78f, 6.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineTo(10.5f, 4.56f)
                verticalLineToRelative(5.19f)
                arcToRelative(4.25f, 4.25f, 0f, false, true, -8.5f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 2.75f, 2.75f)
                close()
            }
        }.build()
        
        return _ArrowUturnUp!!
    }

private var _ArrowUturnUp: ImageVector? = null

