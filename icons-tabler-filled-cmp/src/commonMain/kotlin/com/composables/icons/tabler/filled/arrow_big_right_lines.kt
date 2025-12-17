package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowBigRightLines: ImageVector
    get() {
        if (_ArrowBigRightLines != null) return _ArrowBigRightLines!!
        
        _ArrowBigRightLines = ImageVector.Builder(
            name = "arrow-big-right-lines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.089f, 3.634f)
                arcToRelative(2f, 2f, 0f, false, false, -1.089f, 1.78f)
                lineToRelative(-0.001f, 2.585f)
                lineToRelative(-1.999f, 0.001f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, 0.883f)
                lineToRelative(1.999f, -0.001f)
                lineToRelative(0.001f, 2.587f)
                arcToRelative(2f, 2f, 0f, false, false, 3.414f, 1.414f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -2.828f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, false, false, -2.18f, -0.434f)
                lineToRelative(-0.145f, 0.068f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _ArrowBigRightLines!!
    }

private var _ArrowBigRightLines: ImageVector? = null

