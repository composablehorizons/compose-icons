package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Ban: ImageVector
    get() {
        if (_Ban != null) return _Ban!!
        
        _Ban = ImageVector.Builder(
            name = "ban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcToRelative(6.97f, 6.97f, 0f, false, false, -1.71f, -4.584f)
                lineToRelative(-9.874f, 9.875f)
                arcTo(7f, 7f, 0f, false, false, 15f, 8f)
                moveTo(2.71f, 12.584f)
                lineToRelative(9.874f, -9.875f)
                arcToRelative(7f, 7f, 0f, false, false, -9.874f, 9.874f)
                close()
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
            }
        }.build()
        
        return _Ban!!
    }

private var _Ban: ImageVector? = null

