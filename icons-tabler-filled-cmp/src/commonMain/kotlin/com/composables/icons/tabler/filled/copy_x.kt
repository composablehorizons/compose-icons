package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CopyX: ImageVector
    get() {
        if (_CopyX != null) return _CopyX!!
        
        _CopyX = ImageVector.Builder(
            name = "copy-x",
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
                moveToRelative(-3.333f, -4f)
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
                moveToRelative(0.8f, 8.786f)
                lineToRelative(-1.837f, 1.799f)
                lineToRelative(-1.749f, -1.785f)
                arcToRelative(1f, 1f, 0f, false, false, -1.319f, -0.096f)
                lineToRelative(-0.095f, 0.082f)
                arcToRelative(1f, 1f, 0f, false, false, -0.014f, 1.414f)
                lineToRelative(1.749f, 1.785f)
                lineToRelative(-1.835f, 1.8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.096f, 1.32f)
                lineToRelative(0.082f, 0.095f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0.014f)
                lineToRelative(1.836f, -1.8f)
                lineToRelative(1.75f, 1.786f)
                arcToRelative(1f, 1f, 0f, false, false, 1.319f, 0.096f)
                lineToRelative(0.095f, -0.082f)
                arcToRelative(1f, 1f, 0f, false, false, 0.014f, -1.414f)
                lineToRelative(-1.75f, -1.786f)
                lineToRelative(1.836f, -1.8f)
                arcToRelative(1f, 1f, 0f, false, false, 0.096f, -1.319f)
                lineToRelative(-0.082f, -0.095f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, -0.014f)
            }
        }.build()
        
        return _CopyX!!
    }

private var _CopyX: ImageVector? = null

