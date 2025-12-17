package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Crutch: ImageVector
    get() {
        if (_Crutch != null) return _Crutch!!
        
        _Crutch = ImageVector.Builder(
            name = "crutch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(507.31f, 185.71f)
                lineToRelative(-181f, -181f)
                arcToRelative(16f, 16f, 0f, false, false, -22.62f, 0f)
                lineTo(281f, 27.31f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, 22.63f)
                lineToRelative(181f, 181f)
                arcToRelative(16f, 16f, 0f, false, false, 22.63f, 0f)
                lineToRelative(22.62f, -22.63f)
                arcToRelative(16f, 16f, 0f, false, false, 0.06f, -22.6f)
                close()
                moveToRelative(-179.54f, 66.41f)
                lineToRelative(-67.89f, -67.89f)
                lineToRelative(55.1f, -55.1f)
                lineToRelative(-45.25f, -45.25f)
                lineToRelative(-109.67f, 109.67f)
                arcToRelative(96.08f, 96.08f, 0f, false, false, -25.67f, 46.29f)
                lineTo(106.65f, 360.1f)
                lineToRelative(-102f, 102f)
                arcToRelative(16f, 16f, 0f, false, false, 0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                arcToRelative(16f, 16f, 0f, false, false, 22.63f, 0f)
                lineToRelative(102f, -102f)
                lineToRelative(120.25f, -27.75f)
                arcToRelative(95.88f, 95.88f, 0f, false, false, 46.29f, -25.65f)
                lineToRelative(109.68f, -109.68f)
                lineTo(382.87f, 197f)
                close()
                moveToRelative(-54.57f, 54.57f)
                arcToRelative(32f, 32f, 0f, false, true, -15.45f, 8.54f)
                lineToRelative(-79.3f, 18.32f)
                lineToRelative(18.3f, -79.3f)
                arcToRelative(32.22f, 32.22f, 0f, false, true, 8.56f, -15.45f)
                lineToRelative(9.31f, -9.31f)
                lineToRelative(67.89f, 67.89f)
                close()
            }
        }.build()
        
        return _Crutch!!
    }

private var _Crutch: ImageVector? = null

