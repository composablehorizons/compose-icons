package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowBigDownLine: ImageVector
    get() {
        if (_ArrowBigDownLine != null) return _ArrowBigDownLine!!
        
        _ArrowBigDownLine = ImageVector.Builder(
            name = "arrow-big-down-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(4.999f)
                lineToRelative(-2.586f, 0.001f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 3.414f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, false, false, 2.828f, 0f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, false, false, 0.434f, -2.18f)
                lineToRelative(-0.068f, -0.145f)
                arcToRelative(2f, 2f, 0f, false, false, -1.78f, -1.089f)
                lineToRelative(-2.586f, -0.001f)
                verticalLineToRelative(-4.999f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _ArrowBigDownLine!!
    }

private var _ArrowBigDownLine: ImageVector? = null

