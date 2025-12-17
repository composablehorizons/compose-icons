package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BadgeTm: ImageVector
    get() {
        if (_BadgeTm != null) return _BadgeTm!!
        
        _BadgeTm = ImageVector.Builder(
            name = "badge-tm",
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
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(8f, 1f)
                curveToRelative(0f, -0.99f, -1.283f, -1.378f, -1.832f, -0.555f)
                lineToRelative(-1.168f, 1.752f)
                lineToRelative(-1.168f, -1.752f)
                curveToRelative(-0.549f, -0.823f, -1.832f, -0.434f, -1.832f, 0.555f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-2.697f)
                lineToRelative(0.168f, 0.252f)
                lineToRelative(0.08f, 0.104f)
                arcToRelative(1f, 1f, 0f, false, false, 1.584f, -0.104f)
                lineToRelative(0.168f, -0.253f)
                verticalLineToRelative(2.698f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                close()
            }
        }.build()
        
        return _BadgeTm!!
    }

private var _BadgeTm: ImageVector? = null

