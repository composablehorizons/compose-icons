package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.InfoCircle: ImageVector
    get() {
        if (_InfoCircle != null) return _InfoCircle!!
        
        _InfoCircle = ImageVector.Builder(
            name = "info-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.043f, 8f, 8f, 119.083f, 8f, 256f)
                curveToRelative(0f, 136.997f, 111.043f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.003f, 248f, -248f)
                curveTo(504f, 119.083f, 392.957f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 110f)
                curveToRelative(23.196f, 0f, 42f, 18.804f, 42f, 42f)
                reflectiveCurveToRelative(-18.804f, 42f, -42f, 42f)
                reflectiveCurveToRelative(-42f, -18.804f, -42f, -42f)
                reflectiveCurveToRelative(18.804f, -42f, 42f, -42f)
                close()
                moveToRelative(56f, 254f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-88f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-12f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(64f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(12f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(24f)
                close()
            }
        }.build()
        
        return _InfoCircle!!
    }

private var _InfoCircle: ImageVector? = null

