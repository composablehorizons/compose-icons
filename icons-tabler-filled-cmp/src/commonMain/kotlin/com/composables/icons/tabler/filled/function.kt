package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Function: ImageVector
    get() {
        if (_Function != null) return _Function!!
        
        _Function = ImageVector.Builder(
            name = "function",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.333f, 3f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, 3.667f, 3.667f)
                verticalLineToRelative(10.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, -3.667f, 3.667f)
                horizontalLineToRelative(-10.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, -3.667f, -3.667f)
                verticalLineToRelative(-10.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, 3.667f, -3.667f)
                close()
                moveToRelative(-3.583f, 3f)
                arcToRelative(2.38f, 2.38f, 0f, false, false, -2.37f, 2.145f)
                lineToRelative(-0.285f, 2.855f)
                horizontalLineToRelative(-2.095f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                horizontalLineToRelative(1.894f)
                lineToRelative(-0.265f, 2.656f)
                lineToRelative(-0.014f, 0.071f)
                arcToRelative(0.38f, 0.38f, 0f, false, true, -0.365f, 0.273f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-0.25f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1.993f, 0.117f)
                verticalLineToRelative(0.25f)
                lineToRelative(0.005f, 0.154f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.245f, 2.096f)
                arcToRelative(2.38f, 2.38f, 0f, false, false, 2.37f, -2.145f)
                lineToRelative(0.284f, -2.855f)
                horizontalLineToRelative(2.096f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-1.895f)
                lineToRelative(0.266f, -2.656f)
                lineToRelative(0.014f, -0.071f)
                arcToRelative(0.381f, 0.381f, 0f, false, true, 0.365f, -0.273f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.25f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-0.25f)
                lineToRelative(-0.005f, -0.154f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.245f, -2.096f)
                close()
            }
        }.build()
        
        return _Function!!
    }

private var _Function: ImageVector? = null

