package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ZoomMoney: ImageVector
    get() {
        if (_ZoomMoney != null) return _ZoomMoney!!
        
        _ZoomMoney = ImageVector.Builder(
            name = "zoom-money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.072f)
                arcToRelative(8f, 8f, 0f, false, true, 2.32f, 11.834f)
                lineToRelative(5.387f, 5.387f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.414f)
                lineToRelative(-5.388f, -5.387f)
                arcToRelative(8f, 8f, 0f, false, true, -12.905f, -6.32f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, false, true, 11.995f, -6.643f)
                moveToRelative(-2f, 2.928f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(2.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _ZoomMoney!!
    }

private var _ZoomMoney: ImageVector? = null

