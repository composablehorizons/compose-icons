package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) return _ArrowRight!!
        
        _ArrowRight = ImageVector.Builder(
            name = "arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(8.69f)
                lineTo(8.22f, 4.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.22f, -3.22f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 8f)
                close()
            }
        }.build()
        
        return _ArrowRight!!
    }

private var _ArrowRight: ImageVector? = null

