package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MichelinStar: ImageVector
    get() {
        if (_MichelinStar != null) return _MichelinStar!!
        
        _MichelinStar = ImageVector.Builder(
            name = "michelin-star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.81f, 2f)
                curveToRelative(2.018f, 0f, 3.478f, 1.232f, 3.874f, 3.129f)
                lineToRelative(0.016f, 0.089f)
                lineToRelative(0.172f, -0.057f)
                curveToRelative(0.34f, -0.104f, 0.684f, -0.16f, 1.055f, -0.175f)
                lineToRelative(0.227f, -0.005f)
                curveToRelative(2.09f, 0f, 3.925f, 1.93f, 3.925f, 4.094f)
                curveToRelative(0f, 1.095f, -0.51f, 2.087f, -1.364f, 2.835f)
                lineToRelative(-0.118f, 0.098f)
                lineToRelative(0.06f, 0.048f)
                curveToRelative(0.88f, 0.737f, 1.36f, 1.605f, 1.416f, 2.656f)
                lineToRelative(0.006f, 0.213f)
                curveToRelative(0f, 2.24f, -1.739f, 4.094f, -3.925f, 4.094f)
                curveToRelative(-0.445f, 0f, -0.923f, -0.084f, -1.374f, -0.233f)
                lineToRelative(-0.043f, 0.193f)
                curveToRelative(-0.395f, 1.736f, -1.806f, 2.933f, -3.662f, 3.016f)
                lineToRelative(-0.208f, 0.005f)
                curveToRelative(-2.018f, 0f, -3.477f, -1.232f, -3.873f, -3.13f)
                lineToRelative(-0.03f, -0.161f)
                lineToRelative(-0.011f, 0.006f)
                arcToRelative(4.1f, 4.1f, 0f, false, true, -1.26f, 0.243f)
                lineToRelative(-0.226f, 0.005f)
                curveToRelative(-2.09f, 0f, -3.925f, -1.93f, -3.925f, -4.094f)
                curveToRelative(0f, -1.096f, 0.51f, -2.087f, 1.378f, -2.84f)
                lineToRelative(0.073f, -0.062f)
                lineToRelative(-0.03f, -0.023f)
                curveToRelative(-0.88f, -0.737f, -1.359f, -1.605f, -1.415f, -2.656f)
                lineToRelative(-0.006f, -0.213f)
                curveToRelative(0f, -2.239f, 1.74f, -4.094f, 3.925f, -4.094f)
                curveToRelative(0.44f, 0f, 0.92f, 0.098f, 1.391f, 0.27f)
                lineToRelative(0.036f, 0.013f)
                lineToRelative(0.008f, -0.048f)
                curveToRelative(0.331f, -1.84f, 1.776f, -3.125f, 3.7f, -3.211f)
                close()
            }
        }.build()
        
        return _MichelinStar!!
    }

private var _MichelinStar: ImageVector? = null

