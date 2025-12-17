package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChessRook: ImageVector
    get() {
        if (_ChessRook != null) return _ChessRook!!
        
        _ChessRook = ImageVector.Builder(
            name = "chess-rook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 32f)
                horizontalLineToRelative(-56f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-48f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(88.1f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 48f)
                verticalLineToRelative(176f)
                lineToRelative(64f, 32f)
                curveToRelative(0f, 48.33f, -1.54f, 95f, -13.21f, 160f)
                horizontalLineToRelative(282.42f)
                curveTo(321.54f, 351f, 320f, 303.72f, 320f, 256f)
                lineToRelative(64f, -32f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveTo(224f, 320f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                arcToRelative(32f, 32f, 0f, false, true, 64f, 0f)
                close()
                moveToRelative(144f, 128f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(352f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _ChessRook!!
    }

private var _ChessRook: ImageVector? = null

