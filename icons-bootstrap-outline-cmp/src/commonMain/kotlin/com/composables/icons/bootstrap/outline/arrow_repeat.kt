package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowRepeat: ImageVector
    get() {
        if (_ArrowRepeat != null) return _ArrowRepeat!!
        
        _ArrowRepeat = ImageVector.Builder(
            name = "arrow-repeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.534f, 7f)
                horizontalLineToRelative(3.932f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.192f, 0.41f)
                lineToRelative(-1.966f, 2.36f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.384f, 0f)
                lineToRelative(-1.966f, -2.36f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.192f, -0.41f)
                moveToRelative(-11f, 2f)
                horizontalLineToRelative(3.932f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.192f, -0.41f)
                lineTo(2.692f, 6.23f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.384f, 0f)
                lineTo(0.342f, 8.59f)
                arcTo(0.25f, 0.25f, 0f, false, false, 0.534f, 9f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                curveToRelative(-1.552f, 0f, -2.94f, 0.707f, -3.857f, 1.818f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.771f, -0.636f)
                arcTo(6.002f, 6.002f, 0f, false, true, 13.917f, 7f)
                horizontalLineTo(12.9f)
                arcTo(5f, 5f, 0f, false, false, 8f, 3f)
                moveTo(3.1f, 9f)
                arcToRelative(5.002f, 5.002f, 0f, false, false, 8.757f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.771f, 0.636f)
                arcTo(6.002f, 6.002f, 0f, false, true, 2.083f, 9f)
                close()
            }
        }.build()
        
        return _ArrowRepeat!!
    }

private var _ArrowRepeat: ImageVector? = null

