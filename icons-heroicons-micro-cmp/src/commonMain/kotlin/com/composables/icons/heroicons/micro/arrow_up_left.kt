package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUpLeft: ImageVector
    get() {
        if (_ArrowUpLeft != null) return _ArrowUpLeft!!
        
        _ArrowUpLeft = ImageVector.Builder(
            name = "arrow-up-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.78f, 11.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineTo(6.56f, 5.5f)
                horizontalLineToRelative(3.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(6.56f)
                lineToRelative(5.22f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _ArrowUpLeft!!
    }

private var _ArrowUpLeft: ImageVector? = null

