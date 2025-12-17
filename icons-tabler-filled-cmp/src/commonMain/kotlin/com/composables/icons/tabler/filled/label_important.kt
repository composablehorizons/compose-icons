package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.LabelImportant: ImageVector
    get() {
        if (_LabelImportant != null) return _LabelImportant!!
        
        _LabelImportant = ImageVector.Builder(
            name = "label-important",
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
                horizontalLineToRelative(-12.52f)
                arcToRelative(1f, 1f, 0f, false, true, -0.78f, -1.625f)
                lineToRelative(3.5f, -4.375f)
                lineToRelative(-3.5f, -4.375f)
                arcToRelative(1f, 1f, 0f, false, true, 0.668f, -1.62f)
                lineToRelative(0.112f, -0.005f)
                close()
            }
        }.build()
        
        return _LabelImportant!!
    }

private var _LabelImportant: ImageVector? = null

