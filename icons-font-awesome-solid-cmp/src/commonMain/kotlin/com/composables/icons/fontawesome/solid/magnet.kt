package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Magnet: ImageVector
    get() {
        if (_Magnet != null) return _Magnet!!
        
        _Magnet = ImageVector.Builder(
            name = "magnet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(164.07f, 148.1f)
                horizontalLineTo(12f)
                arcToRelative(12f, 12f, 0f, false, true, -12f, -12f)
                verticalLineToRelative(-80f)
                arcToRelative(36f, 36f, 0f, false, true, 36f, -36f)
                horizontalLineToRelative(104f)
                arcToRelative(36f, 36f, 0f, false, true, 36f, 36f)
                verticalLineToRelative(80f)
                arcToRelative(11.89f, 11.89f, 0f, false, true, -11.93f, 12f)
                close()
                moveToRelative(347.93f, -12f)
                verticalLineTo(56f)
                arcToRelative(36f, 36f, 0f, false, false, -36f, -36f)
                horizontalLineTo(372f)
                arcToRelative(36f, 36f, 0f, false, false, -36f, 36f)
                verticalLineToRelative(80f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, 12f)
                horizontalLineToRelative(152f)
                arcToRelative(11.89f, 11.89f, 0f, false, false, 12f, -11.9f)
                close()
                moveToRelative(-164f, 44f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12f)
                verticalLineToRelative(52f)
                curveToRelative(0f, 128.1f, -160f, 127.9f, -160f, 0f)
                verticalLineToRelative(-52f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                horizontalLineTo(12.1f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12.1f)
                curveToRelative(0.1f, 21.4f, 0.6f, 40.3f, 0f, 53.3f)
                curveToRelative(0f, 150.6f, 136.17f, 246.6f, 256.75f, 246.6f)
                reflectiveCurveToRelative(255f, -96f, 255f, -246.7f)
                curveToRelative(-0.6f, -12.8f, -0.2f, -33f, 0f, -53.2f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12.1f)
                close()
            }
        }.build()
        
        return _Magnet!!
    }

private var _Magnet: ImageVector? = null

