package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareDot: ImageVector
    get() {
        if (_SquareDot != null) return _SquareDot!!
        
        _SquareDot = ImageVector.Builder(
            name = "square-dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-7f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 1.995f, -2.15f)
                close()
            }
        }.build()
        
        return _SquareDot!!
    }

private var _SquareDot: ImageVector? = null

