package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Paste: ImageVector
    get() {
        if (_Paste != null) return _Paste!!
        
        _Paste = ImageVector.Builder(
            name = "paste",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 184f)
                curveToRelative(0f, -30.879f, 25.122f, -56f, 56f, -56f)
                horizontalLineToRelative(136f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineToRelative(-80.61f)
                curveTo(204.306f, 12.89f, 183.637f, 0f, 160f, 0f)
                reflectiveCurveToRelative(-44.306f, 12.89f, -55.39f, 32f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                verticalLineToRelative(336f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineTo(184f)
                close()
                moveToRelative(32f, -144f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                close()
                moveToRelative(184f, 248f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(200f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(184f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(184f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.2f, 10.8f, 24f, 24f, 24f)
                close()
                moveToRelative(104f, -38.059f)
                verticalLineTo(256f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(6.059f)
                arcToRelative(24f, 24f, 0f, false, true, 16.97f, 7.029f)
                lineToRelative(65.941f, 65.941f)
                arcToRelative(24.002f, 24.002f, 0f, false, true, 7.03f, 16.971f)
                close()
            }
        }.build()
        
        return _Paste!!
    }

private var _Paste: ImageVector? = null

