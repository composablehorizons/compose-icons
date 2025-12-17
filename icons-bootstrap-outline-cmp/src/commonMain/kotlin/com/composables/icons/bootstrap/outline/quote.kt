package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Quote: ImageVector
    get() {
        if (_Quote != null) return _Quote!!
        
        _Quote = ImageVector.Builder(
            name = "quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(8.558f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1.388f)
                quadToRelative(0f, -0.527f, 0.062f, -1.054f)
                quadToRelative(0.093f, -0.558f, 0.31f, -0.992f)
                reflectiveQuadToRelative(0.559f, -0.683f)
                quadToRelative(0.34f, -0.279f, 0.868f, -0.279f)
                verticalLineTo(3f)
                quadToRelative(-0.868f, 0f, -1.52f, 0.372f)
                arcToRelative(3.3f, 3.3f, 0f, false, false, -1.085f, 0.992f)
                arcToRelative(4.9f, 4.9f, 0f, false, false, -0.62f, 1.458f)
                arcTo(7.7f, 7.7f, 0f, false, false, 9f, 7.558f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
                moveToRelative(-6f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(8.558f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(4.612f)
                quadToRelative(0f, -0.527f, 0.062f, -1.054f)
                quadToRelative(0.094f, -0.558f, 0.31f, -0.992f)
                quadToRelative(0.217f, -0.434f, 0.559f, -0.683f)
                quadToRelative(0.34f, -0.279f, 0.868f, -0.279f)
                verticalLineTo(3f)
                quadToRelative(-0.868f, 0f, -1.52f, 0.372f)
                arcToRelative(3.3f, 3.3f, 0f, false, false, -1.085f, 0.992f)
                arcToRelative(4.9f, 4.9f, 0f, false, false, -0.62f, 1.458f)
                arcTo(7.7f, 7.7f, 0f, false, false, 3f, 7.558f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
        }.build()
        
        return _Quote!!
    }

private var _Quote: ImageVector? = null

