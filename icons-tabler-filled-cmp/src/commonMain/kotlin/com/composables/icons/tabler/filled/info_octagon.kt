package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.InfoOctagon: ImageVector
    get() {
        if (_InfoOctagon != null) return _InfoOctagon!!
        
        _InfoOctagon = ImageVector.Builder(
            name = "info-octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.897f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, 2.664f, 1.016f)
                lineToRelative(0.165f, 0.156f)
                lineToRelative(4.1f, 4.1f)
                arcToRelative(4f, 4f, 0f, false, true, 1.168f, 2.605f)
                lineToRelative(0.006f, 0.227f)
                verticalLineToRelative(5.794f)
                arcToRelative(4f, 4f, 0f, false, true, -1.016f, 2.664f)
                lineToRelative(-0.156f, 0.165f)
                lineToRelative(-4.1f, 4.1f)
                arcToRelative(4f, 4f, 0f, false, true, -2.603f, 1.168f)
                lineToRelative(-0.227f, 0.006f)
                horizontalLineToRelative(-5.795f)
                arcToRelative(3.999f, 3.999f, 0f, false, true, -2.664f, -1.017f)
                lineToRelative(-0.165f, -0.156f)
                lineToRelative(-4.1f, -4.1f)
                arcToRelative(4f, 4f, 0f, false, true, -1.168f, -2.604f)
                lineToRelative(-0.006f, -0.227f)
                verticalLineToRelative(-5.794f)
                arcToRelative(4f, 4f, 0f, false, true, 1.016f, -2.664f)
                lineToRelative(0.156f, -0.165f)
                lineToRelative(4.1f, -4.1f)
                arcToRelative(4f, 4f, 0f, false, true, 2.605f, -1.168f)
                lineToRelative(0.227f, -0.006f)
                horizontalLineToRelative(5.793f)
                close()
                moveToRelative(-2.897f, 10f)
                horizontalLineToRelative(-1f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                verticalLineToRelative(3f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.876f, -0.876f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.764f, -0.857f)
                lineToRelative(-0.112f, -0.02f)
                lineToRelative(-0.117f, -0.006f)
                verticalLineToRelative(-3f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.876f, -0.876f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveToRelative(0.01f, -3f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()
        
        return _InfoOctagon!!
    }

private var _InfoOctagon: ImageVector? = null

