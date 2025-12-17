package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Skull: ImageVector
    get() {
        if (_Skull != null) return _Skull!!
        
        _Skull = ImageVector.Builder(
            name = "skull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 0f)
                curveTo(114.6f, 0f, 0f, 100.3f, 0f, 224f)
                curveToRelative(0f, 70.1f, 36.9f, 132.6f, 94.5f, 173.7f)
                curveToRelative(9.6f, 6.9f, 15.2f, 18.1f, 13.5f, 29.9f)
                lineToRelative(-9.4f, 66.2f)
                curveToRelative(-1.4f, 9.6f, 6f, 18.2f, 15.7f, 18.2f)
                horizontalLineTo(192f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(77.7f)
                curveToRelative(9.7f, 0f, 17.1f, -8.6f, 15.7f, -18.2f)
                lineToRelative(-9.4f, -66.2f)
                curveToRelative(-1.7f, -11.7f, 3.8f, -23f, 13.5f, -29.9f)
                curveTo(475.1f, 356.6f, 512f, 294.1f, 512f, 224f)
                curveTo(512f, 100.3f, 397.4f, 0f, 256f, 0f)
                close()
                moveToRelative(-96f, 320f)
                curveToRelative(-35.3f, 0f, -64f, -28.7f, -64f, -64f)
                reflectiveCurveToRelative(28.7f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                close()
                moveToRelative(192f, 0f)
                curveToRelative(-35.3f, 0f, -64f, -28.7f, -64f, -64f)
                reflectiveCurveToRelative(28.7f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                close()
            }
        }.build()
        
        return _Skull!!
    }

private var _Skull: ImageVector? = null

