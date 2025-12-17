package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CheckSquare: ImageVector
    get() {
        if (_CheckSquare != null) return _CheckSquare!!
        
        _CheckSquare = ImageVector.Builder(
            name = "check-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.97f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.071f, 1.05f)
                lineToRelative(-3.992f, 4.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.08f, 0.02f)
                lineTo(4.324f, 8.384f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.094f, 2.093f)
                lineToRelative(3.473f, -4.425f)
                close()
            }
        }.build()
        
        return _CheckSquare!!
    }

private var _CheckSquare: ImageVector? = null

