package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Feather: ImageVector
    get() {
        if (_Feather != null) return _Feather!!
        
        _Feather = ImageVector.Builder(
            name = "feather",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(467.14f, 44.84f)
                curveToRelative(-62.55f, -62.48f, -161.67f, -64.78f, -252.28f, 25.73f)
                curveToRelative(-78.61f, 78.52f, -60.98f, 60.92f, -85.75f, 85.66f)
                curveToRelative(-60.46f, 60.39f, -70.39f, 150.83f, -63.64f, 211.17f)
                lineToRelative(178.44f, -178.25f)
                curveToRelative(6.26f, -6.25f, 16.4f, -6.25f, 22.65f, 0f)
                reflectiveCurveToRelative(6.25f, 16.38f, 0f, 22.63f)
                lineTo(7.04f, 471.03f)
                curveToRelative(-9.38f, 9.37f, -9.38f, 24.57f, 0f, 33.94f)
                curveToRelative(9.38f, 9.37f, 24.6f, 9.37f, 33.98f, 0f)
                lineToRelative(66.1f, -66.03f)
                curveTo(159.42f, 454.65f, 279f, 457.11f, 353.95f, 384f)
                horizontalLineToRelative(-98.19f)
                lineToRelative(147.57f, -49.14f)
                curveToRelative(49.99f, -49.93f, 36.38f, -36.18f, 46.31f, -46.86f)
                horizontalLineToRelative(-97.78f)
                lineToRelative(131.54f, -43.8f)
                curveToRelative(45.44f, -74.46f, 34.31f, -148.84f, -16.26f, -199.36f)
                close()
            }
        }.build()
        
        return _Feather!!
    }

private var _Feather: ImageVector? = null

