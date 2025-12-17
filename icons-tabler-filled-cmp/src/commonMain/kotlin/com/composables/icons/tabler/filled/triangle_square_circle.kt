package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TriangleSquareCircle: ImageVector
    get() {
        if (_TriangleSquareCircle != null) return _TriangleSquareCircle!!
        
        _TriangleSquareCircle = ImageVector.Builder(
            name = "triangle-square-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.132f, 2.504f)
                lineToRelative(-4f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0.868f, 1.496f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 0.868f, -1.496f)
                lineToRelative(-4f, -7f)
                arcToRelative(1f, 1f, 0f, false, false, -1.736f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 13f)
                arcToRelative(4f, 4f, 0f, true, true, -3.995f, 4.2f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 13f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _TriangleSquareCircle!!
    }

private var _TriangleSquareCircle: ImageVector? = null

