package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hryvnia: ImageVector
    get() {
        if (_Hryvnia != null) return _Hryvnia!!
        
        _Hryvnia = ImageVector.Builder(
            name = "hryvnia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 240f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-41.86f)
                curveToRelative(13.41f, -28.63f, 13.74f, -63.33f, -4.13f, -94.05f)
                curveTo(303.34f, 49.84f, 267.1f, 32f, 229.96f, 32f)
                horizontalLineToRelative(-78.82f)
                curveToRelative(-24.32f, 0f, -47.86f, 8.53f, -66.54f, 24.09f)
                lineTo(72.83f, 65.9f)
                curveToRelative(-10.18f, 8.49f, -11.56f, 23.62f, -3.07f, 33.8f)
                lineToRelative(20.49f, 24.59f)
                curveToRelative(8.49f, 10.19f, 23.62f, 11.56f, 33.81f, 3.07f)
                lineToRelative(11.73f, -9.78f)
                curveToRelative(4.32f, -3.6f, 9.77f, -5.57f, 15.39f, -5.57f)
                horizontalLineToRelative(83.62f)
                curveToRelative(11.69f, 0f, 21.2f, 9.52f, 21.2f, 21.2f)
                curveToRelative(0f, 5.91f, -2.48f, 11.58f, -6.81f, 15.58f)
                lineTo(219.7f, 176f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(134.37f)
                lineToRelative(-34.67f, 32f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(41.86f)
                curveToRelative(-13.41f, 28.63f, -13.74f, 63.33f, 4.13f, 94.05f)
                curveTo(80.66f, 462.15f, 116.9f, 480f, 154.04f, 480f)
                horizontalLineToRelative(78.82f)
                curveToRelative(24.32f, 0f, 47.86f, -8.53f, 66.54f, -24.09f)
                lineToRelative(11.77f, -9.81f)
                curveToRelative(10.18f, -8.49f, 11.56f, -23.62f, 3.07f, -33.8f)
                lineToRelative(-20.49f, -24.59f)
                curveToRelative(-8.49f, -10.19f, -23.62f, -11.56f, -33.81f, -3.07f)
                lineToRelative(-11.75f, 9.8f)
                arcToRelative(23.992f, 23.992f, 0f, false, true, -15.36f, 5.56f)
                horizontalLineTo(149.2f)
                curveToRelative(-11.69f, 0f, -21.2f, -9.52f, -21.2f, -21.2f)
                curveToRelative(0f, -5.91f, 2.48f, -11.58f, 6.81f, -15.58f)
                lineTo(164.3f, 336f)
                horizontalLineTo(368f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(233.63f)
                lineToRelative(34.67f, -32f)
                horizontalLineTo(368f)
                close()
            }
        }.build()
        
        return _Hryvnia!!
    }

private var _Hryvnia: ImageVector? = null

