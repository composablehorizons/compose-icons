package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Nimblr: ImageVector
    get() {
        if (_Nimblr != null) return _Nimblr!!
        
        _Nimblr = ImageVector.Builder(
            name = "nimblr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(246.6f, 299.29f)
                curveToRelative(15.57f, 0f, 27.15f, 11.46f, 27.15f, 27f)
                reflectiveCurveToRelative(-11.62f, 27f, -27.15f, 27f)
                curveToRelative(-15.7f, 0f, -27.15f, -11.57f, -27.15f, -27f)
                reflectiveCurveToRelative(11.55f, -27f, 27.15f, -27f)
                close()
                moveTo(113f, 326.25f)
                curveToRelative(0f, -15.61f, 11.68f, -27f, 27.15f, -27f)
                reflectiveCurveToRelative(27.15f, 11.46f, 27.15f, 27f)
                reflectiveCurveToRelative(-11.47f, 27f, -27.15f, 27f)
                curveToRelative(-15.44f, 0f, -27.15f, -11.31f, -27.15f, -27f)
                moveTo(191.76f, 159f)
                curveTo(157f, 159f, 89.45f, 178.77f, 59.25f, 227f)
                lineTo(14f, 0f)
                verticalLineToRelative(335.48f)
                curveTo(14f, 433.13f, 93.61f, 512f, 191.76f, 512f)
                reflectiveCurveToRelative(177.76f, -78.95f, 177.76f, -176.52f)
                reflectiveCurveTo(290.13f, 159f, 191.76f, 159f)
                close()
                moveToRelative(0f, 308.12f)
                curveToRelative(-73.27f, 0f, -132.51f, -58.9f, -132.51f, -131.59f)
                reflectiveCurveToRelative(59.24f, -131.59f, 132.51f, -131.59f)
                reflectiveCurveToRelative(132.51f, 58.86f, 132.51f, 131.54f)
                reflectiveCurveTo(265f, 467.07f, 191.76f, 467.07f)
                close()
            }
        }.build()
        
        return _Nimblr!!
    }

private var _Nimblr: ImageVector? = null

