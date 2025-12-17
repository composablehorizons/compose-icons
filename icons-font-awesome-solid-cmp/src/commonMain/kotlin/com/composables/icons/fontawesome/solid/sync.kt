package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Sync: ImageVector
    get() {
        if (_Sync != null) return _Sync!!
        
        _Sync = ImageVector.Builder(
            name = "sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440.65f, 12.57f)
                lineToRelative(4f, 82.77f)
                arcTo(247.16f, 247.16f, 0f, false, false, 255.83f, 8f)
                curveTo(134.73f, 8f, 33.91f, 94.92f, 12.29f, 209.82f)
                arcTo(12f, 12f, 0f, false, false, 24.09f, 224f)
                horizontalLineToRelative(49.05f)
                arcToRelative(12f, 12f, 0f, false, false, 11.67f, -9.26f)
                arcToRelative(175.91f, 175.91f, 0f, false, true, 317f, -56.94f)
                lineToRelative(-101.46f, -4.86f)
                arcToRelative(12f, 12f, 0f, false, false, -12.57f, 12f)
                verticalLineToRelative(47.41f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, 12f)
                horizontalLineTo(500f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, -12f)
                verticalLineTo(12f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                horizontalLineToRelative(-47.37f)
                arcToRelative(12f, 12f, 0f, false, false, -11.98f, 12.57f)
                close()
                moveTo(255.83f, 432f)
                arcToRelative(175.61f, 175.61f, 0f, false, true, -146f, -77.8f)
                lineToRelative(101.8f, 4.87f)
                arcToRelative(12f, 12f, 0f, false, false, 12.57f, -12f)
                verticalLineToRelative(-47.4f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                horizontalLineTo(12f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12f)
                verticalLineTo(500f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, 12f)
                horizontalLineToRelative(47.35f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, -12.6f)
                lineToRelative(-4.15f, -82.57f)
                arcTo(247.17f, 247.17f, 0f, false, false, 255.83f, 504f)
                curveToRelative(121.11f, 0f, 221.93f, -86.92f, 243.55f, -201.82f)
                arcToRelative(12f, 12f, 0f, false, false, -11.8f, -14.18f)
                horizontalLineToRelative(-49.05f)
                arcToRelative(12f, 12f, 0f, false, false, -11.67f, 9.26f)
                arcTo(175.86f, 175.86f, 0f, false, true, 255.83f, 432f)
                close()
            }
        }.build()
        
        return _Sync!!
    }

private var _Sync: ImageVector? = null

