package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowLongUp: ImageVector
    get() {
        if (_ArrowLongUp != null) return _ArrowLongUp!!
        
        _ArrowLongUp = ImageVector.Builder(
            name = "arrow-long-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(4.56f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.22f, -1.22f)
                verticalLineToRelative(8.69f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowLongUp!!
    }

private var _ArrowLongUp: ImageVector? = null

