package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cocktail: ImageVector
    get() {
        if (_Cocktail != null) return _Cocktail!!
        
        _Cocktail = ImageVector.Builder(
            name = "cocktail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 464f)
                horizontalLineToRelative(-56f)
                verticalLineTo(338.78f)
                lineToRelative(168.74f, -168.73f)
                curveToRelative(15.52f, -15.52f, 4.53f, -42.05f, -17.42f, -42.05f)
                horizontalLineTo(24.68f)
                curveToRelative(-21.95f, 0f, -32.94f, 26.53f, -17.42f, 42.05f)
                lineTo(176f, 338.78f)
                verticalLineTo(464f)
                horizontalLineToRelative(-56f)
                curveToRelative(-22.09f, 0f, -40f, 17.91f, -40f, 40f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                curveToRelative(0f, -22.09f, -17.91f, -40f, -40f, -40f)
                close()
                moveTo(432f, 0f)
                curveToRelative(-62.61f, 0f, -115.35f, 40.2f, -135.18f, 96f)
                horizontalLineToRelative(52.54f)
                curveToRelative(16.65f, -28.55f, 47.27f, -48f, 82.64f, -48f)
                curveToRelative(52.93f, 0f, 96f, 43.06f, 96f, 96f)
                reflectiveCurveToRelative(-43.07f, 96f, -96f, 96f)
                curveToRelative(-14.04f, 0f, -27.29f, -3.2f, -39.32f, -8.64f)
                lineToRelative(-35.26f, 35.26f)
                curveTo(379.23f, 279.92f, 404.59f, 288f, 432f, 288f)
                curveToRelative(79.53f, 0f, 144f, -64.47f, 144f, -144f)
                reflectiveCurveTo(511.53f, 0f, 432f, 0f)
                close()
            }
        }.build()
        
        return _Cocktail!!
    }

private var _Cocktail: ImageVector? = null

