package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChessRook: ImageVector
    get() {
        if (_ChessRook != null) return _ChessRook!!
        
        _ChessRook = ImageVector.Builder(
            name = "chess-rook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.652f)
                lineToRelative(0.362f, -2.164f)
                arcToRelative(1f, 1f, 0f, false, true, 1.034f, -0.836f)
                lineToRelative(0.116f, 0.013f)
                arcToRelative(1f, 1f, 0f, false, true, 0.836f, 1.035f)
                lineToRelative(-0.013f, 0.116f)
                lineToRelative(-0.5f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.865f, 0.829f)
                lineToRelative(-0.122f, 0.007f)
                horizontalLineToRelative(-1.383f)
                lineToRelative(0.877f, 7.89f)
                arcToRelative(1f, 1f, 0f, false, true, -0.877f, 1.103f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -0.993f)
                lineToRelative(0.006f, -0.117f)
                lineToRelative(0.877f, -7.89f)
                horizontalLineToRelative(-1.383f)
                arcToRelative(1f, 1f, 0f, false, true, -0.96f, -0.718f)
                lineToRelative(-0.026f, -0.118f)
                lineToRelative(-0.5f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.947f, -0.442f)
                lineToRelative(0.025f, 0.114f)
                lineToRelative(0.361f, 2.164f)
                horizontalLineToRelative(1.653f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
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
        
        return _ChessRook!!
    }

private var _ChessRook: ImageVector? = null

