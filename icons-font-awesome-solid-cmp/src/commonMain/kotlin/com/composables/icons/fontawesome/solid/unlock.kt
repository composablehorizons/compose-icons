package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Unlock: ImageVector
    get() {
        if (_Unlock != null) return _Unlock!!
        
        _Unlock = ImageVector.Builder(
            name = "unlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 256f)
                horizontalLineTo(152f)
                verticalLineTo(152.9f)
                curveToRelative(0f, -39.6f, 31.7f, -72.5f, 71.3f, -72.9f)
                curveToRelative(40f, -0.4f, 72.7f, 32.1f, 72.7f, 72f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(32f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-16f)
                curveTo(376f, 68f, 307.5f, -0.3f, 223.5f, 0f)
                curveTo(139.5f, 0.3f, 72f, 69.5f, 72f, 153.5f)
                verticalLineTo(256f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(304f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _Unlock!!
    }

private var _Unlock: ImageVector? = null

