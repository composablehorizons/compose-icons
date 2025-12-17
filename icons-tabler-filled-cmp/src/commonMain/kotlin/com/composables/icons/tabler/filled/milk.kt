package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Milk: ImageVector
    get() {
        if (_Milk != null) return _Milk!!
        
        _Milk = ImageVector.Builder(
            name = "milk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.799f, 7f)
                lineToRelative(0.144f, 0.23f)
                arcToRelative(7f, 7f, 0f, false, true, 1.057f, 3.7f)
                verticalLineToRelative(8.07f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-8.071f)
                arcToRelative(7f, 7f, 0f, false, true, 1.057f, -3.698f)
                lineToRelative(0.142f, -0.231f)
                close()
                moveToRelative(-5.799f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, -3f)
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                moveToRelative(2f, -6f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(1f, -7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
        }.build()
        
        return _Milk!!
    }

private var _Milk: ImageVector? = null

