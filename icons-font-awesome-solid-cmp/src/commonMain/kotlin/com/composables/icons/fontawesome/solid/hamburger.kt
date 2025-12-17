package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hamburger: ImageVector
    get() {
        if (_Hamburger != null) return _Hamburger!!
        
        _Hamburger = ImageVector.Builder(
            name = "hamburger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 256f)
                horizontalLineTo(48f)
                arcToRelative(48f, 48f, 0f, false, false, 0f, 96f)
                horizontalLineToRelative(416f)
                arcToRelative(48f, 48f, 0f, false, false, 0f, -96f)
                close()
                moveToRelative(16f, 128f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(16f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, 64f)
                horizontalLineToRelative(352f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, -64f)
                verticalLineToRelative(-16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveTo(58.64f, 224f)
                horizontalLineToRelative(394.72f)
                curveToRelative(34.57f, 0f, 54.62f, -43.9f, 34.82f, -75.88f)
                curveTo(448f, 83.2f, 359.55f, 32.1f, 256f, 32f)
                curveToRelative(-103.54f, 0.1f, -192f, 51.2f, -232.18f, 116.11f)
                curveTo(4f, 180.09f, 24.07f, 224f, 58.64f, 224f)
                close()
                moveTo(384f, 112f)
                arcToRelative(16f, 16f, 0f, true, true, -16f, 16f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                close()
                moveTo(256f, 80f)
                arcToRelative(16f, 16f, 0f, true, true, -16f, 16f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                close()
                moveToRelative(-128f, 32f)
                arcToRelative(16f, 16f, 0f, true, true, -16f, 16f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                close()
            }
        }.build()
        
        return _Hamburger!!
    }

private var _Hamburger: ImageVector? = null

