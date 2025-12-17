package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CaretLeft: ImageVector
    get() {
        if (_CaretLeft != null) return _CaretLeft!!
        
        _CaretLeft = ImageVector.Builder(
            name = "caret-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 12.796f)
                verticalLineTo(3.204f)
                lineTo(4.519f, 8f)
                close()
                moveToRelative(-0.659f, 0.753f)
                lineToRelative(-5.48f, -4.796f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.506f)
                lineToRelative(5.48f, -4.796f)
                arcTo(1f, 1f, 0f, false, true, 11f, 3.204f)
                verticalLineToRelative(9.592f)
                arcToRelative(1f, 1f, 0f, false, true, -1.659f, 0.753f)
            }
        }.build()
        
        return _CaretLeft!!
    }

private var _CaretLeft: ImageVector? = null

