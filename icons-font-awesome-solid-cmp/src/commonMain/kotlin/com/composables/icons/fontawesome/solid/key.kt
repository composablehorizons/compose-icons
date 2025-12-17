package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 176.001f)
                curveTo(512f, 273.203f, 433.202f, 352f, 336f, 352f)
                curveToRelative(-11.22f, 0f, -22.19f, -1.062f, -32.827f, -3.069f)
                lineToRelative(-24.012f, 27.014f)
                arcTo(23.999f, 23.999f, 0f, false, true, 261.223f, 384f)
                horizontalLineTo(224f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineToRelative(-78.059f)
                curveToRelative(0f, -6.365f, 2.529f, -12.47f, 7.029f, -16.971f)
                lineToRelative(161.802f, -161.802f)
                curveTo(163.108f, 213.814f, 160f, 195.271f, 160f, 176f)
                curveTo(160f, 78.798f, 238.797f, 0.001f, 335.999f, 0f)
                curveTo(433.488f, -0.001f, 512f, 78.511f, 512f, 176.001f)
                close()
                moveTo(336f, 128f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                reflectiveCurveToRelative(-21.49f, -48f, -48f, -48f)
                reflectiveCurveToRelative(-48f, 21.49f, -48f, 48f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

