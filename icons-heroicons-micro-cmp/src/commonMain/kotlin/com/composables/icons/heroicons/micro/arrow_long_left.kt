package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowLongLeft: ImageVector
    get() {
        if (_ArrowLongLeft != null) return _ArrowLongLeft!!
        
        _ArrowLongLeft = ImageVector.Builder(
            name = "arrow-long-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(4.56f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineTo(4.56f, 7.25f)
                horizontalLineToRelative(8.69f)
                arcTo(0.75f, 0.75f, 0f, false, true, 14f, 8f)
                close()
            }
        }.build()
        
        return _ArrowLongLeft!!
    }

private var _ArrowLongLeft: ImageVector? = null

