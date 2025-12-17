package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Scroll: ImageVector
    get() {
        if (_Scroll != null) return _Scroll!!
        
        _Scroll = ImageVector.Builder(
            name = "scroll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(48f, 0f)
                curveTo(21.53f, 0f, 0f, 21.53f, 0f, 48f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(80f)
                verticalLineTo(48f)
                curveTo(96f, 21.53f, 74.47f, 0f, 48f, 0f)
                close()
                moveToRelative(208f, 412.57f)
                verticalLineTo(352f)
                horizontalLineToRelative(288f)
                verticalLineTo(96f)
                curveToRelative(0f, -52.94f, -43.06f, -96f, -96f, -96f)
                horizontalLineTo(111.59f)
                curveTo(121.74f, 13.41f, 128f, 29.92f, 128f, 48f)
                verticalLineToRelative(368f)
                curveToRelative(0f, 38.87f, 34.65f, 69.65f, 74.75f, 63.12f)
                curveTo(234.22f, 474f, 256f, 444.46f, 256f, 412.57f)
                close()
                moveTo(288f, 384f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 52.93f, -43.06f, 96f, -96f, 96f)
                horizontalLineToRelative(336f)
                curveToRelative(61.86f, 0f, 112f, -50.14f, 112f, -112f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(288f)
                close()
            }
        }.build()
        
        return _Scroll!!
    }

private var _Scroll: ImageVector? = null

