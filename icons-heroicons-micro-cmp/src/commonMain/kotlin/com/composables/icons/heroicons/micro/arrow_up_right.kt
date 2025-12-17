package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) return _ArrowUpRight!!
        
        _ArrowUpRight = ImageVector.Builder(
            name = "arrow-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.22f, 11.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineTo(9.44f, 5.5f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(6.56f)
                lineToRelative(-5.22f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                close()
            }
        }.build()
        
        return _ArrowUpRight!!
    }

private var _ArrowUpRight: ImageVector? = null

