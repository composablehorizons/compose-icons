package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChristmasTree: ImageVector
    get() {
        if (_ChristmasTree != null) return _ChristmasTree!!
        
        _ChristmasTree = ImageVector.Builder(
            name = "christmas-tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 19f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-10f, -1f)
                curveToRelative(-0.89f, 0f, -1.337f, -1.077f, -0.707f, -1.707f)
                lineToRelative(2.855f, -2.857f)
                lineToRelative(-1.464f, -0.487f)
                arcToRelative(1f, 1f, 0f, false, true, -0.472f, -1.565f)
                lineToRelative(0.08f, -0.091f)
                lineToRelative(3.019f, -3.02f)
                lineToRelative(-0.758f, -0.379f)
                arcToRelative(1f, 1f, 0f, false, true, -0.343f, -1.507f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.26f, 1.601f)
                lineToRelative(-0.759f, 0.379f)
                lineToRelative(3.02f, 3.02f)
                arcToRelative(1f, 1f, 0f, false, true, -0.279f, 1.61f)
                lineToRelative(-0.113f, 0.046f)
                lineToRelative(-1.465f, 0.487f)
                lineToRelative(2.856f, 2.857f)
                curveToRelative(0.603f, 0.602f, 0.22f, 1.614f, -0.593f, 1.701f)
                lineToRelative(-0.114f, 0.006f)
                close()
            }
        }.build()
        
        return _ChristmasTree!!
    }

private var _ChristmasTree: ImageVector? = null

