package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.OilCan: ImageVector
    get() {
        if (_OilCan != null) return _OilCan!!
        
        _OilCan = ImageVector.Builder(
            name = "oil-can",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(629.8f, 160.31f)
                lineTo(416f, 224f)
                lineToRelative(-50.49f, -25.24f)
                arcToRelative(64.07f, 64.07f, 0f, false, false, -28.62f, -6.76f)
                horizontalLineTo(280f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(56f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(176f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-56f)
                lineTo(37.72f, 166.86f)
                arcToRelative(31.9f, 31.9f, 0f, false, false, -5.79f, -0.53f)
                curveTo(14.67f, 166.33f, 0f, 180.36f, 0f, 198.34f)
                verticalLineToRelative(94.95f)
                curveToRelative(0f, 15.46f, 11.06f, 28.72f, 26.28f, 31.48f)
                lineTo(96f, 337.46f)
                verticalLineTo(384f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(274.63f)
                curveToRelative(8.55f, 0f, 16.75f, -3.42f, 22.76f, -9.51f)
                lineToRelative(212.26f, -214.75f)
                curveToRelative(1.5f, -1.5f, 2.34f, -3.54f, 2.34f, -5.66f)
                verticalLineTo(168f)
                curveToRelative(0.01f, -5.31f, -5.08f, -9.15f, -10.19f, -7.69f)
                close()
                moveTo(96f, 288.67f)
                lineToRelative(-48f, -8.73f)
                verticalLineToRelative(-62.43f)
                lineToRelative(48f, 8.73f)
                verticalLineToRelative(62.43f)
                close()
                moveToRelative(453.33f, 84.66f)
                curveToRelative(0f, 23.56f, 19.1f, 42.67f, 42.67f, 42.67f)
                reflectiveCurveToRelative(42.67f, -19.1f, 42.67f, -42.67f)
                reflectiveCurveTo(592f, 288f, 592f, 288f)
                reflectiveCurveToRelative(-42.67f, 61.77f, -42.67f, 85.33f)
                close()
            }
        }.build()
        
        return _OilCan!!
    }

private var _OilCan: ImageVector? = null

