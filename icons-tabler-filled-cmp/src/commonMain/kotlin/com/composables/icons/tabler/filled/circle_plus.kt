package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CirclePlus: ImageVector
    get() {
        if (_CirclePlus != null) return _CirclePlus!!
        
        _CirclePlus = ImageVector.Builder(
            name = "circle-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.929f, 4.929f)
                arcToRelative(10f, 10f, 0f, true, true, 14.141f, 14.141f)
                arcToRelative(10f, 10f, 0f, false, true, -14.14f, -14.14f)
                close()
                moveToRelative(8.071f, 4.071f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _CirclePlus!!
    }

private var _CirclePlus: ImageVector? = null

