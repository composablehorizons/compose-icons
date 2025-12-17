package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Car4wd: ImageVector
    get() {
        if (_Car4wd != null) return _Car4wd!!
        
        _Car4wd = ImageVector.Builder(
            name = "car-4wd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                horizontalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
            }
        }.build()
        
        return _Car4wd!!
    }

private var _Car4wd: ImageVector? = null

