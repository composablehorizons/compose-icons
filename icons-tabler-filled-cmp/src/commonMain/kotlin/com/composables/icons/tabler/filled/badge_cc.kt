package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BadgeCc: ImageVector
    get() {
        if (_BadgeCc != null) return _BadgeCc!!
        
        _BadgeCc = ImageVector.Builder(
            name = "badge-cc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-10.5f, 4f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
                moveToRelative(7f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
            }
        }.build()
        
        return _BadgeCc!!
    }

private var _BadgeCc: ImageVector? = null

