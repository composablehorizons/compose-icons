package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowBigLeft: ImageVector
    get() {
        if (_ArrowBigLeft != null) return _ArrowBigLeft!!
        
        _ArrowBigLeft = ImageVector.Builder(
            name = "arrow-big-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.586f, 4f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, false, false, 2.18f, 0.434f)
                lineToRelative(0.145f, -0.068f)
                arcToRelative(2f, 2f, 0f, false, false, 1.089f, -1.78f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, -1.85f)
                lineToRelative(-7f, -0.001f)
                verticalLineToRelative(-2.585f)
                arcToRelative(2f, 2f, 0f, false, false, -3.414f, -1.414f)
                close()
            }
        }.build()
        
        return _ArrowBigLeft!!
    }

private var _ArrowBigLeft: ImageVector? = null

