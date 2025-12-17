package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Calculator: ImageVector
    get() {
        if (_Calculator != null) return _Calculator!!
        
        _Calculator = ImageVector.Builder(
            name = "calculator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-10f, 15f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(-8f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(-1f, -7f)
                horizontalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _Calculator!!
    }

private var _Calculator: ImageVector? = null

