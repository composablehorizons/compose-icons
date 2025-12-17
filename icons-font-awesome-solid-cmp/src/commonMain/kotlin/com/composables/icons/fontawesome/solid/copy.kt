package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Copy: ImageVector
    get() {
        if (_Copy != null) return _Copy!!
        
        _Copy = ImageVector.Builder(
            name = "copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 448f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(296f)
                curveToRelative(0f, 30.879f, 25.121f, 56f, 56f, 56f)
                horizontalLineToRelative(168f)
                close()
                moveToRelative(0f, -344f)
                verticalLineTo(0f)
                horizontalLineTo(152f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(368f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(272f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(128f)
                horizontalLineTo(344f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(120.971f, -31.029f)
                lineTo(375.029f, 7.029f)
                arcTo(24f, 24f, 0f, false, false, 358.059f, 0f)
                horizontalLineTo(352f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-6.059f)
                arcToRelative(24f, 24f, 0f, false, false, -7.029f, -16.97f)
                close()
            }
        }.build()
        
        return _Copy!!
    }

private var _Copy: ImageVector? = null

