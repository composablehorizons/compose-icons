package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.EyeTable: ImageVector
    get() {
        if (_EyeTable != null) return _EyeTable!!
        
        _EyeTable = ImageVector.Builder(
            name = "eye-table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                close()
                moveToRelative(-12f, 15f)
                lineToRelative(-0.128f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.118f, 1.993f)
                lineToRelative(0.128f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.118f, -1.993f)
                moveToRelative(4f, 0f)
                lineToRelative(-0.128f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.118f, 1.993f)
                lineToRelative(0.128f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.118f, -1.993f)
                moveToRelative(4f, 0f)
                lineToRelative(-0.128f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.118f, 1.993f)
                lineToRelative(0.128f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.118f, -1.993f)
                moveToRelative(-6f, -3f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-1f, -8f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _EyeTable!!
    }

private var _EyeTable: ImageVector? = null

