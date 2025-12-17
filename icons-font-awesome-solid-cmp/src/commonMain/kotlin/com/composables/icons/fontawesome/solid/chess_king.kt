package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChessKing: ImageVector
    get() {
        if (_ChessKing != null) return _ChessKing!!
        
        _ChessKing = ImageVector.Builder(
            name = "chess-king",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 448f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(352f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(16f, -288f)
                horizontalLineTo(256f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                horizontalLineToRelative(-40f)
                verticalLineTo(8f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                horizontalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, 8f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, 8f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(48f)
                horizontalLineTo(32f)
                arcToRelative(32f, 32f, 0f, false, false, -30.52f, 41.54f)
                lineTo(74.56f, 416f)
                horizontalLineToRelative(298.88f)
                lineToRelative(73.08f, -214.46f)
                arcTo(32f, 32f, 0f, false, false, 416f, 160f)
                close()
            }
        }.build()
        
        return _ChessKing!!
    }

private var _ChessKing: ImageVector? = null

