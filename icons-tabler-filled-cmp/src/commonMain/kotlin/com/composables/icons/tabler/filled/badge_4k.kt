package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Badge4k: ImageVector
    get() {
        if (_Badge4k != null) return _Badge4k!!
        
        _Badge4k = ImageVector.Builder(
            name = "badge-4k",
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
                moveToRelative(-9f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(7.555f, 0.168f)
                arcToRelative(1f, 1f, 0f, false, false, -1.387f, 0.277f)
                lineToRelative(-1.168f, 1.751f)
                verticalLineToRelative(-1.196f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-1.196f)
                lineToRelative(1.168f, 1.75f)
                arcToRelative(1f, 1f, 0f, false, false, 1.286f, 0.337f)
                lineToRelative(0.1f, -0.059f)
                lineToRelative(0.094f, -0.07f)
                arcToRelative(1f, 1f, 0f, false, false, 0.184f, -1.317f)
                lineToRelative(-1.63f, -2.445f)
                lineToRelative(1.63f, -2.445f)
                arcToRelative(1f, 1f, 0f, false, false, -0.277f, -1.387f)
            }
        }.build()
        
        return _Badge4k!!
    }

private var _Badge4k: ImageVector? = null

