package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ads_click: ImageVector
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
                lineTo(22f, 15f)
                lineToRelative(-10f, -3f)
                lineToRelative(3f, 10f)
                lineToRelative(1.26f, -3.77f)
                lineToRelative(4.27f, 4.27f)
                lineToRelative(1.98f, -1.98f)
                lineTo(18.23f, 16.26f)
                close()
            }
        }.build()
        
        return _Ads_click!!
    }

private var _Ads_click: ImageVector? = null

