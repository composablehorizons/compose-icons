package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.53f, 3.956f)
                arcTo(1f, 1f, 0f, false, false, 1f, 4.804f)
                verticalLineToRelative(6.392f)
                arcToRelative(1f, 1f, 0f, false, false, 1.53f, 0.848f)
                lineToRelative(5.113f, -3.196f)
                curveToRelative(0.16f, -0.1f, 0.279f, -0.233f, 0.357f, -0.383f)
                verticalLineToRelative(2.73f)
                arcToRelative(1f, 1f, 0f, false, false, 1.53f, 0.849f)
                lineToRelative(5.113f, -3.196f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.696f)
                lineTo(9.53f, 3.956f)
                arcTo(1f, 1f, 0f, false, false, 8f, 4.804f)
                verticalLineToRelative(2.731f)
                arcToRelative(0.992f, 0.992f, 0f, false, false, -0.357f, -0.383f)
                lineTo(2.53f, 3.956f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

