package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Badge: ImageVector
    get() {
        if (_Badge != null) return _Badge!!
        
        _Badge = ImageVector.Builder(
            name = "badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.486f, 3.143f)
                lineToRelative(-4.486f, 2.69f)
                lineToRelative(-4.486f, -2.69f)
                arcToRelative(1f, 1f, 0f, false, false, -1.514f, 0.857f)
                verticalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, false, 0.486f, 0.857f)
                lineToRelative(5f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.028f, 0f)
                lineToRelative(5f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.486f, -0.857f)
                verticalLineToRelative(-13f)
                arcToRelative(1f, 1f, 0f, false, false, -1.514f, -0.857f)
                close()
            }
        }.build()
        
        return _Badge!!
    }

private var _Badge: ImageVector? = null

