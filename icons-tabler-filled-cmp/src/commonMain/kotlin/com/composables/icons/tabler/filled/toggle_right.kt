package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ToggleRight: ImageVector
    get() {
        if (_ToggleRight != null) return _ToggleRight!!
        
        _ToggleRight = ImageVector.Builder(
            name = "toggle-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 9f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 5f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                horizontalLineToRelative(-8f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, -14f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(-8f)
                arcToRelative(5f, 5f, 0f, true, false, 0f, 10f)
                horizontalLineToRelative(8f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, -10f)
            }
        }.build()
        
        return _ToggleRight!!
    }

private var _ToggleRight: ImageVector? = null

