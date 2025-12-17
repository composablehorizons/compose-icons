package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Phone: ImageVector
    get() {
        if (_Phone != null) return _Phone!!
        
        _Phone = ImageVector.Builder(
            name = "phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.877f, 0.519f)
                lineToRelative(0.051f, 0.11f)
                lineToRelative(2f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.313f, 1.16f)
                lineToRelative(-0.1f, 0.068f)
                lineToRelative(-1.674f, 1.004f)
                lineToRelative(0.063f, 0.103f)
                arcToRelative(10f, 10f, 0f, false, false, 3.132f, 3.132f)
                lineToRelative(0.102f, 0.062f)
                lineToRelative(1.005f, -1.672f)
                arcToRelative(1f, 1f, 0f, false, true, 1.113f, -0.453f)
                lineToRelative(0.115f, 0.039f)
                lineToRelative(5f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.622f, 0.807f)
                lineToRelative(0.007f, 0.121f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.657f, -1.343f, 3f, -3.06f, 2.998f)
                curveToRelative(-8.579f, -0.521f, -15.418f, -7.36f, -15.94f, -15.998f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Phone!!
    }

private var _Phone: ImageVector? = null

