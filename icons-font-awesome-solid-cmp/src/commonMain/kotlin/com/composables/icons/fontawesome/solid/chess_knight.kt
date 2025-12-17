package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChessKnight: ImageVector
    get() {
        if (_ChessKnight != null) return _ChessKnight!!
        
        _ChessKnight = ImageVector.Builder(
            name = "chess-knight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 272.47f)
                lineToRelative(40.63f, 18.06f)
                arcToRelative(32f, 32f, 0f, false, false, 24.88f, 0.47f)
                lineToRelative(12.78f, -5.12f)
                arcToRelative(32f, 32f, 0f, false, false, 18.76f, -20.5f)
                lineToRelative(9.22f, -30.65f)
                arcToRelative(24f, 24f, 0f, false, true, 12.55f, -15.65f)
                lineTo(159.94f, 208f)
                verticalLineToRelative(50.33f)
                arcToRelative(48f, 48f, 0f, false, true, -26.53f, 42.94f)
                lineToRelative(-57.22f, 28.65f)
                arcTo(80f, 80f, 0f, false, false, 32f, 401.48f)
                verticalLineTo(416f)
                horizontalLineToRelative(319.86f)
                verticalLineTo(224f)
                curveToRelative(0f, -106f, -85.92f, -192f, -191.92f, -192f)
                horizontalLineTo(12f)
                arcTo(12f, 12f, 0f, false, false, 0f, 44f)
                arcToRelative(16.9f, 16.9f, 0f, false, false, 1.79f, 7.58f)
                lineTo(16f, 80f)
                lineToRelative(-9f, 9f)
                arcToRelative(24f, 24f, 0f, false, false, -7f, 17f)
                verticalLineToRelative(137.21f)
                arcToRelative(32f, 32f, 0f, false, false, 19f, 29.26f)
                close()
                moveTo(52f, 128f)
                arcToRelative(20f, 20f, 0f, true, true, -20f, 20f)
                arcToRelative(20f, 20f, 0f, false, true, 20f, -20f)
                close()
                moveToRelative(316f, 320f)
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
        
        return _ChessKnight!!
    }

private var _ChessKnight: ImageVector? = null

