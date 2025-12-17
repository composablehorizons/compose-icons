package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChessBishop: ImageVector
    get() {
        if (_ChessBishop != null) return _ChessBishop!!
        
        _ChessBishop = ImageVector.Builder(
            name = "chess-bishop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.386f, 3.442f)
                curveToRelative(0.646f, 0.28f, 1.226f, 0.62f, 1.74f, 1.017f)
                lineToRelative(-3.833f, 3.834f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.403f, 1.403f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(3.814f, -3.813f)
                curveToRelative(0.977f, 1.35f, 1.479f, 3.07f, 1.479f, 5.106f)
                curveToRelative(0f, 1.913f, -1.178f, 3.722f, -3.089f, 3.973f)
                lineToRelative(-0.2f, 0.02f)
                lineToRelative(-0.211f, 0.007f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.126f, 0f, -3.5f, -1.924f, -3.5f, -4f)
                curveToRelative(0f, -3.68f, 1.57f, -6.255f, 4.613f, -7.56f)
                arcToRelative(2f, 2f, 0f, false, true, 1.387f, -3.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5f)
                verticalLineToRelative(1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 18f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 1.987f, -1.768f)
                lineToRelative(0.011f, -0.174f)
                arcToRelative(1f, 1f, 0f, false, false, -0.998f, -1.058f)
                close()
            }
        }.build()
        
        return _ChessBishop!!
    }

private var _ChessBishop: ImageVector? = null

