package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Label: ImageVector
    get() {
        if (_Label != null) return _Label!!
        
        _Label = ImageVector.Builder(
            name = "label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.52f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 1.561f, 0.75f)
                lineToRelative(3.7f, 4.625f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.25f)
                lineToRelative(-3.7f, 4.624f)
                arcToRelative(2f, 2f, 0f, false, true, -1.561f, 0.751f)
                horizontalLineToRelative(-10.52f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
        }.build()
        
        return _Label!!
    }

private var _Label: ImageVector? = null

