package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Guitar: ImageVector
    get() {
        if (_Guitar != null) return _Guitar!!
        
        _Guitar = ImageVector.Builder(
            name = "guitar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.63f, 39f)
                lineTo(473f, 9.37f)
                arcToRelative(32f, 32f, 0f, false, false, -45.26f, 0f)
                lineTo(381.46f, 55.7f)
                arcToRelative(35.14f, 35.14f, 0f, false, false, -8.53f, 13.79f)
                lineTo(360.77f, 106f)
                lineToRelative(-76.26f, 76.26f)
                curveToRelative(-12.16f, -8.76f, -25.5f, -15.74f, -40.1f, -19.14f)
                curveToRelative(-33.45f, -7.78f, -67f, -0.88f, -89.88f, 22f)
                arcToRelative(82.45f, 82.45f, 0f, false, false, -20.24f, 33.47f)
                curveToRelative(-6f, 18.56f, -23.21f, 32.69f, -42.15f, 34.46f)
                curveToRelative(-23.7f, 2.27f, -45.73f, 11.45f, -62.61f, 28.44f)
                curveTo(-16.11f, 327f, -7.9f, 409f, 47.58f, 464.45f)
                reflectiveCurveTo(185f, 528f, 230.56f, 482.52f)
                curveToRelative(17f, -16.88f, 26.16f, -38.9f, 28.45f, -62.71f)
                curveToRelative(1.76f, -18.85f, 15.89f, -36.13f, 34.43f, -42.14f)
                arcToRelative(82.6f, 82.6f, 0f, false, false, 33.48f, -20.25f)
                curveToRelative(22.87f, -22.88f, 29.74f, -56.36f, 22f, -89.75f)
                curveToRelative(-3.39f, -14.64f, -10.37f, -28f, -19.16f, -40.2f)
                lineTo(406f, 151.23f)
                lineToRelative(36.48f, -12.16f)
                arcToRelative(35.14f, 35.14f, 0f, false, false, 13.79f, -8.53f)
                lineToRelative(46.33f, -46.32f)
                arcToRelative(32f, 32f, 0f, false, false, 0.03f, -45.22f)
                close()
                moveTo(208f, 352f)
                arcToRelative(48f, 48f, 0f, true, true, 48f, -48f)
                arcToRelative(48f, 48f, 0f, false, true, -48f, 48f)
                close()
            }
        }.build()
        
        return _Guitar!!
    }

private var _Guitar: ImageVector? = null

