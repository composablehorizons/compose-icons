package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShareSquare: ImageVector
    get() {
        if (_ShareSquare != null) return _ShareSquare!!
        
        _ShareSquare = ImageVector.Builder(
            name = "share-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(568.482f, 177.448f)
                lineTo(424.479f, 313.433f)
                curveTo(409.3f, 327.768f, 384f, 317.14f, 384f, 295.985f)
                verticalLineToRelative(-71.963f)
                curveToRelative(-144.575f, 0.97f, -205.566f, 35.113f, -164.775f, 171.353f)
                curveToRelative(4.483f, 14.973f, -12.846f, 26.567f, -25.006f, 17.33f)
                curveTo(155.252f, 383.105f, 120f, 326.488f, 120f, 269.339f)
                curveToRelative(0f, -143.937f, 117.599f, -172.5f, 264f, -173.312f)
                verticalLineTo(24.012f)
                curveToRelative(0f, -21.174f, 25.317f, -31.768f, 40.479f, -17.448f)
                lineToRelative(144.003f, 135.988f)
                curveToRelative(10.02f, 9.463f, 10.028f, 25.425f, 0f, 34.896f)
                close()
                moveTo(384f, 379.128f)
                verticalLineTo(448f)
                horizontalLineTo(64f)
                verticalLineTo(128f)
                horizontalLineToRelative(50.916f)
                arcToRelative(11.99f, 11.99f, 0f, false, false, 8.648f, -3.693f)
                curveToRelative(14.953f, -15.568f, 32.237f, -27.89f, 51.014f, -37.676f)
                curveTo(185.708f, 80.83f, 181.584f, 64f, 169.033f, 64f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineToRelative(-88.806f)
                curveToRelative(0f, -8.288f, -8.197f, -14.066f, -16.011f, -11.302f)
                arcToRelative(71.83f, 71.83f, 0f, false, true, -34.189f, 3.377f)
                curveToRelative(-7.27f, -1.046f, -13.8f, 4.514f, -13.8f, 11.859f)
                close()
            }
        }.build()
        
        return _ShareSquare!!
    }

private var _ShareSquare: ImageVector? = null

