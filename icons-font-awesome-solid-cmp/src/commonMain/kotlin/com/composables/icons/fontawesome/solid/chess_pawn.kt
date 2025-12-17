package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChessPawn: ImageVector
    get() {
        if (_ChessPawn != null) return _ChessPawn!!
        
        _ChessPawn = ImageVector.Builder(
            name = "chess-pawn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(105.1f, 224f)
                horizontalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(5.49f)
                curveToRelative(0f, 44f, -4.14f, 86.6f, -24f, 122.51f)
                horizontalLineToRelative(176f)
                curveToRelative(-19.89f, -35.91f, -24f, -78.51f, -24f, -122.51f)
                verticalLineTo(288f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-25.1f)
                curveToRelative(29.39f, -18.38f, 49.1f, -50.78f, 49.1f, -88f)
                arcToRelative(104f, 104f, 0f, false, false, -208f, 0f)
                curveToRelative(0f, 37.22f, 19.71f, 69.62f, 49.1f, 88f)
                close()
                moveTo(304f, 448f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(288f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _ChessPawn!!
    }

private var _ChessPawn: ImageVector? = null

