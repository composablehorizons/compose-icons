package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pageview: ImageVector
    get() {
        if (_Pageview != null) return _Pageview!!
        
        _Pageview = ImageVector.Builder(
            name = "pageview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 9f)
                curveTo(10.12f, 9f, 9f, 10.12f, 9f, 11.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(12.88f, 9f, 11.5f, 9f)
                close()
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-3.92f, 13.5f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.9f, 0.58f, -2.03f, 0.84f, -3.22f, 0.62f)
                curveToRelative(-1.88f, -0.35f, -3.38f, -1.93f, -3.62f, -3.83f)
                curveToRelative(-0.38f, -3.01f, 2.18f, -5.52f, 5.21f, -5.04f)
                curveToRelative(1.88f, 0.3f, 3.39f, 1.84f, 3.7f, 3.71f)
                curveToRelative(0.19f, 1.16f, -0.08f, 2.23f, -0.64f, 3.12f)
                lineToRelative(2.2f, 2.19f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0f, 1.42f)
                curveToRelative(-0.4f, 0.4f, -1.04f, 0.4f, -1.43f, 0.01f)
                close()
            }
        }.build()
        
        return _Pageview!!
    }

private var _Pageview: ImageVector? = null

