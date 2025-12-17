package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowPath: ImageVector
    get() {
        if (_ArrowPath != null) return _ArrowPath!!
        
        _ArrowPath = ImageVector.Builder(
            name = "arrow-path",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.755f, 10.059f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 12.548f, -3.364f)
                lineToRelative(1.903f, 1.903f)
                horizontalLineToRelative(-3.183f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                horizontalLineToRelative(4.992f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(4.356f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3.18f)
                lineToRelative(-1.9f, -1.9f)
                arcTo(9f, 9f, 0f, false, false, 3.306f, 9.67f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.45f, 0.388f)
                close()
                moveToRelative(15.408f, 3.352f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.919f, 0.53f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, -12.548f, 3.364f)
                lineToRelative(-1.902f, -1.903f)
                horizontalLineToRelative(3.183f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(2.984f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.992f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-3.18f)
                lineToRelative(1.9f, 1.9f)
                arcToRelative(9f, 9f, 0f, false, false, 15.059f, -4.035f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.53f, -0.918f)
                close()
            }
        }.build()
        
        return _ArrowPath!!
    }

private var _ArrowPath: ImageVector? = null

