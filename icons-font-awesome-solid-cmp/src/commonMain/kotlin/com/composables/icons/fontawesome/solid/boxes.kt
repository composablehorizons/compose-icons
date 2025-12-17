package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Boxes: ImageVector
    get() {
        if (_Boxes != null) return _Boxes!!
        
        _Boxes = ImageVector.Builder(
            name = "boxes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 288f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(96f)
                lineToRelative(-32f, -21.3f)
                lineToRelative(-32f, 21.3f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(304f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-384f, -64f)
                horizontalLineToRelative(224f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(96f)
                lineToRelative(-32f, -21.3f)
                lineTo(256f, 96f)
                verticalLineTo(0f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(64f, 64f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(96f)
                lineToRelative(-32f, -21.3f)
                lineTo(96f, 384f)
                verticalLineToRelative(-96f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(304f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Boxes!!
    }

private var _Boxes: ImageVector? = null

