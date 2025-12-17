package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) return _CaretUp!!
        
        _CaretUp = ImageVector.Builder(
            name = "caret-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.204f, 11f)
                horizontalLineToRelative(9.592f)
                lineTo(8f, 5.519f)
                close()
                moveToRelative(-0.753f, -0.659f)
                lineToRelative(4.796f, -5.48f)
                arcToRelative(1f, 1f, 0f, false, true, 1.506f, 0f)
                lineToRelative(4.796f, 5.48f)
                curveToRelative(0.566f, 0.647f, 0.106f, 1.659f, -0.753f, 1.659f)
                horizontalLineTo(3.204f)
                arcToRelative(1f, 1f, 0f, false, true, -0.753f, -1.659f)
            }
        }.build()
        
        return _CaretUp!!
    }

private var _CaretUp: ImageVector? = null

