package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ads_click: ImageVector
    get() {
        if (_Ads_click != null) return _Ads_click!!
        
        _Ads_click = ImageVector.Builder(
            name = "ads_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.71f, 17.99f)
                curveTo(8.53f, 17.84f, 6f, 15.22f, 6f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(3.22f, 0f, 5.84f, 2.53f, 5.99f, 5.71f)
                lineToRelative(-2.1f, -0.63f)
                curveTo(15.48f, 9.31f, 13.89f, 8f, 12f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.89f, 1.31f, 3.48f, 3.08f, 3.89f)
                lineTo(11.71f, 17.99f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 0.3f, -0.01f, 0.6f, -0.04f, 0.9f)
                lineToRelative(-1.97f, -0.59f)
                curveTo(20f, 12.21f, 20f, 12.1f, 20f, 12f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                curveToRelative(0.1f, 0f, 0.21f, 0f, 0.31f, -0.01f)
                lineToRelative(0.59f, 1.97f)
                curveTo(12.6f, 21.99f, 12.3f, 22f, 12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.48f, 22f, 12f)
                close()
                moveTo(18.23f, 16.26f)
                lineToRelative(2.27f, -0.76f)
                curveToRelative(0.46f, -0.15f, 0.45f, -0.81f, -0.01f, -0.95f)
                lineToRelative(-7.6f, -2.28f)
                curveToRelative(-0.38f, -0.11f, -0.74f, 0.24f, -0.62f, 0.62f)
                lineToRelative(2.28f, 7.6f)
                curveToRelative(0.14f, 0.47f, 0.8f, 0.48f, 0.95f, 0.01f)
                lineToRelative(0.76f, -2.27f)
                lineToRelative(3.91f, 3.91f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(1.27f, -1.27f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineTo(18.23f, 16.26f)
                close()
            }
        }.build()
        
        return _Ads_click!!
    }

private var _Ads_click: ImageVector? = null

