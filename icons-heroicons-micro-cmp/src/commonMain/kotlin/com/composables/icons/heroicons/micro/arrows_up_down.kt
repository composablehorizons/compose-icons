package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowsUpDown: ImageVector
    get() {
        if (_ArrowsUpDown != null) return _ArrowsUpDown!!
        
        _ArrowsUpDown = ImageVector.Builder(
            name = "arrows-up-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.78f, 10.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.97f, 0.97f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(5.69f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveTo(2.22f, 5.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-0.97f, -0.97f)
                verticalLineToRelative(5.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.56f)
                lineToRelative(-0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                close()
            }
        }.build()
        
        return _ArrowsUpDown!!
    }

private var _ArrowsUpDown: ImageVector? = null

