package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                curveToRelative(4.29f, 0f, 7.863f, 2.429f, 10.665f, 7.154f)
                lineToRelative(0.22f, 0.379f)
                lineToRelative(0.045f, 0.1f)
                lineToRelative(0.03f, 0.083f)
                lineToRelative(0.014f, 0.055f)
                lineToRelative(0.014f, 0.082f)
                lineToRelative(0.011f, 0.1f)
                verticalLineToRelative(0.11f)
                lineToRelative(-0.014f, 0.111f)
                arcToRelative(0.992f, 0.992f, 0f, false, true, -0.026f, 0.11f)
                lineToRelative(-0.039f, 0.108f)
                lineToRelative(-0.036f, 0.075f)
                lineToRelative(-0.016f, 0.03f)
                curveToRelative(-2.764f, 4.836f, -6.3f, 7.38f, -10.555f, 7.499f)
                lineToRelative(-0.313f, 0.004f)
                curveToRelative(-4.396f, 0f, -8.037f, -2.549f, -10.868f, -7.504f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -0.992f)
                curveToRelative(2.831f, -4.955f, 6.472f, -7.504f, 10.868f, -7.504f)
                close()
                moveToRelative(0f, 5f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

