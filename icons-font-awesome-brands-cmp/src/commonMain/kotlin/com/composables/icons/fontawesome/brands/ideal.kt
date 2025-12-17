package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Ideal: ImageVector
    get() {
        if (_Ideal != null) return _Ideal!!
        
        _Ideal = ImageVector.Builder(
            name = "ideal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(125.61f, 165.48f)
                arcToRelative(49.07f, 49.07f, 0f, true, false, 49.06f, 49.06f)
                arcTo(49.08f, 49.08f, 0f, false, false, 125.61f, 165.48f)
                close()
                moveTo(86.15f, 425.84f)
                horizontalLineToRelative(78.94f)
                verticalLineTo(285.32f)
                horizontalLineTo(86.15f)
                close()
                moveToRelative(151.46f, -211.6f)
                curveToRelative(0f, -20f, -10f, -22.53f, -18.74f, -22.53f)
                horizontalLineTo(204.82f)
                verticalLineTo(237.5f)
                horizontalLineToRelative(14.05f)
                curveTo(228.62f, 237.5f, 237.61f, 234.69f, 237.61f, 214.24f)
                close()
                moveToRelative(201.69f, 46f)
                verticalLineTo(168.93f)
                horizontalLineToRelative(22.75f)
                verticalLineTo(237.5f)
                horizontalLineToRelative(33.69f)
                curveTo(486.5f, 113.08f, 388.61f, 86.19f, 299.67f, 86.19f)
                horizontalLineTo(204.84f)
                verticalLineTo(169f)
                horizontalLineToRelative(14f)
                curveToRelative(25.6f, 0f, 41.5f, 17.35f, 41.5f, 45.26f)
                curveToRelative(0f, 28.81f, -15.52f, 46f, -41.5f, 46f)
                horizontalLineToRelative(-14f)
                verticalLineTo(425.88f)
                horizontalLineToRelative(94.83f)
                curveToRelative(144.61f, 0f, 194.94f, -67.16f, 196.72f, -165.64f)
                close()
                moveToRelative(-109.75f, 0f)
                horizontalLineTo(273.3f)
                verticalLineTo(169f)
                horizontalLineToRelative(54.43f)
                verticalLineToRelative(22.73f)
                horizontalLineTo(296f)
                verticalLineToRelative(10.58f)
                horizontalLineToRelative(30f)
                verticalLineTo(225f)
                horizontalLineTo(296f)
                verticalLineTo(237.5f)
                horizontalLineToRelative(33.51f)
                close()
                moveToRelative(74.66f, 0f)
                lineToRelative(-5.16f, -17.67f)
                horizontalLineTo(369.31f)
                lineToRelative(-5.18f, 17.67f)
                horizontalLineTo(340.47f)
                lineTo(368f, 168.92f)
                horizontalLineToRelative(32.35f)
                lineToRelative(27.53f, 91.34f)
                close()
                moveTo(299.65f, 32f)
                horizontalLineTo(32f)
                verticalLineTo(480f)
                horizontalLineTo(299.65f)
                curveToRelative(161.85f, 0f, 251f, -79.73f, 251f, -224.52f)
                curveTo(550.62f, 172f, 518f, 32f, 299.65f, 32f)
                close()
                moveToRelative(0f, 426.92f)
                horizontalLineTo(53.07f)
                verticalLineTo(53.07f)
                horizontalLineTo(299.65f)
                curveToRelative(142.1f, 0f, 229.9f, 64.61f, 229.9f, 202.41f)
                curveTo(529.55f, 389.57f, 448.55f, 458.92f, 299.65f, 458.92f)
                close()
                moveToRelative(83.86f, -264.85f)
                lineTo(376f, 219.88f)
                horizontalLineTo(392.4f)
                lineToRelative(-7.52f, -25.81f)
                close()
            }
        }.build()
        
        return _Ideal!!
    }

private var _Ideal: ImageVector? = null

