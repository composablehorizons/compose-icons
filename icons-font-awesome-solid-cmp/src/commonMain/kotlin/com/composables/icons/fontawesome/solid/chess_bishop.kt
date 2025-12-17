package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChessBishop: ImageVector
    get() {
        if (_ChessBishop != null) return _ChessBishop!!
        
        _ChessBishop = ImageVector.Builder(
            name = "chess-bishop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 287.88f)
                curveToRelative(0f, 51.64f, 22.14f, 73.83f, 56f, 84.6f)
                verticalLineTo(416f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(-43.52f)
                curveToRelative(33.86f, -10.77f, 56f, -33f, 56f, -84.6f)
                curveToRelative(0f, -30.61f, -10.73f, -67.1f, -26.69f, -102.56f)
                lineTo(185f, 285.65f)
                arcToRelative(8f, 8f, 0f, false, true, -11.31f, 0f)
                lineToRelative(-11.31f, -11.31f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, -11.31f)
                lineTo(270.27f, 155.1f)
                curveToRelative(-20.8f, -37.91f, -46.47f, -72.1f, -70.87f, -92.59f)
                curveTo(213.4f, 59.09f, 224f, 47.05f, 224f, 32f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                horizontalLineToRelative(-64f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                curveToRelative(0f, 15f, 10.6f, 27.09f, 24.6f, 30.51f)
                curveTo(67.81f, 106.8f, 8f, 214.5f, 8f, 287.88f)
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
        
        return _ChessBishop!!
    }

private var _ChessBishop: ImageVector? = null

