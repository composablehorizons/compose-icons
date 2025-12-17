package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Alien: ImageVector
    get() {
        if (_Alien != null) return _Alien!!
        
        _Alien = ImageVector.Builder(
            name = "alien",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.004f, 2f)
                curveToRelative(4.942f, 0f, 8.288f, 2.503f, 8.85f, 6.444f)
                arcToRelative(12.884f, 12.884f, 0f, false, true, -2.163f, 9.308f)
                arcToRelative(11.794f, 11.794f, 0f, false, true, -3.51f, 3.356f)
                curveToRelative(-1.982f, 1.19f, -4.376f, 1.19f, -6.373f, -0.008f)
                arcToRelative(11.763f, 11.763f, 0f, false, true, -3.489f, -3.34f)
                arcToRelative(12.808f, 12.808f, 0f, false, true, -2.171f, -9.306f)
                curveToRelative(0.564f, -3.95f, 3.91f, -6.454f, 8.856f, -6.454f)
                close()
                moveToRelative(1.913f, 14.6f)
                arcToRelative(1f, 1f, 0f, false, false, -1.317f, -0.517f)
                lineToRelative(-0.146f, 0.055f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.054f, -0.055f)
                lineToRelative(-0.11f, -0.04f)
                arcToRelative(1f, 1f, 0f, false, false, -0.69f, 1.874f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 2.8f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 0.517f, -1.317f)
                close()
                moveToRelative(-5.304f, -6.39f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 1.497f)
                lineToRelative(2f, 2f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -1.497f)
                lineToRelative(-2f, -2f)
                close()
                moveToRelative(8.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-2f, 2f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.497f, 1.32f)
                lineToRelative(2f, -2f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _Alien!!
    }

private var _Alien: ImageVector? = null

