package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserAlt: ImageVector
    get() {
        if (_UserAlt != null) return _UserAlt!!
        
        _UserAlt = ImageVector.Builder(
            name = "user-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 288f)
                curveToRelative(79.5f, 0f, 144f, -64.5f, 144f, -144f)
                reflectiveCurveTo(335.5f, 0f, 256f, 0f)
                reflectiveCurveTo(112f, 64.5f, 112f, 144f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                close()
                moveToRelative(128f, 32f)
                horizontalLineToRelative(-55.1f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16f, -72.9f, 16f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16f)
                horizontalLineTo(128f)
                curveTo(57.3f, 320f, 0f, 377.3f, 0f, 448f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -70.7f, -57.3f, -128f, -128f, -128f)
                close()
            }
        }.build()
        
        return _UserAlt!!
    }

private var _UserAlt: ImageVector? = null

