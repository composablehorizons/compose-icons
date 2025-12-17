package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CopyPlus: ImageVector
    get() {
        if (_CopyPlus != null) return _CopyPlus!!
        
        _CopyPlus = ImageVector.Builder(
            name = "copy-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.333f, 6f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, 3.667f, 3.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, -3.667f, 3.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, -3.667f, -3.667f)
                verticalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, 3.667f, -3.667f)
                close()
                moveToRelative(-4.333f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                close()
                moveToRelative(1f, -8f)
                curveToRelative(1.094f, 0f, 1.828f, 0.533f, 2.374f, 1.514f)
                arcToRelative(1f, 1f, 0f, true, true, -1.748f, 0.972f)
                curveToRelative(-0.221f, -0.398f, -0.342f, -0.486f, -0.626f, -0.486f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.548f, 0f, -1f, 0.452f, -1f, 1f)
                verticalLineToRelative(9.998f)
                curveToRelative(0f, 0.32f, 0.154f, 0.618f, 0.407f, 0.805f)
                lineToRelative(0.1f, 0.065f)
                arcToRelative(1f, 1f, 0f, true, true, -0.99f, 1.738f)
                arcToRelative(3f, 3f, 0f, false, true, -1.517f, -2.606f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.652f, 1.348f, -3f, 3f, -3f)
                close()
            }
        }.build()
        
        return _CopyPlus!!
    }

private var _CopyPlus: ImageVector? = null

