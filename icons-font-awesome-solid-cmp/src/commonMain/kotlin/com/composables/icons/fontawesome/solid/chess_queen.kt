package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChessQueen: ImageVector
    get() {
        if (_ChessQueen != null) return _ChessQueen!!
        
        _ChessQueen = ImageVector.Builder(
            name = "chess-queen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 112f)
                arcToRelative(56f, 56f, 0f, true, false, -56f, -56f)
                arcToRelative(56f, 56f, 0f, false, false, 56f, 56f)
                close()
                moveToRelative(176f, 336f)
                horizontalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(352f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(72.87f, -263.84f)
                lineToRelative(-28.51f, -15.92f)
                curveToRelative(-7.44f, -5f, -16.91f, -2.46f, -22.29f, 4.68f)
                arcToRelative(47.59f, 47.59f, 0f, false, true, -47.23f, 18.23f)
                curveTo(383.7f, 186.86f, 368f, 164.93f, 368f, 141.4f)
                arcToRelative(13.4f, 13.4f, 0f, false, false, -13.4f, -13.4f)
                horizontalLineToRelative(-38.77f)
                curveToRelative(-6f, 0f, -11.61f, 4f, -12.86f, 9.91f)
                arcToRelative(48f, 48f, 0f, false, true, -93.94f, 0f)
                curveToRelative(-1.25f, -5.92f, -6.82f, -9.91f, -12.86f, -9.91f)
                horizontalLineTo(157.4f)
                arcToRelative(13.4f, 13.4f, 0f, false, false, -13.4f, 13.4f)
                curveToRelative(0f, 25.69f, -19f, 48.75f, -44.67f, 50.49f)
                arcToRelative(47.5f, 47.5f, 0f, false, true, -41.54f, -19.15f)
                curveToRelative(-5.28f, -7.09f, -14.73f, -9.45f, -22.09f, -4.54f)
                lineToRelative(-28.57f, 16f)
                arcToRelative(16f, 16f, 0f, false, false, -5.44f, 20.47f)
                lineTo(104.24f, 416f)
                horizontalLineToRelative(303.52f)
                lineToRelative(102.55f, -211.37f)
                arcToRelative(16f, 16f, 0f, false, false, -5.44f, -20.47f)
                close()
            }
        }.build()
        
        return _ChessQueen!!
    }

private var _ChessQueen: ImageVector? = null

