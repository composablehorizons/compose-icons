package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pageview: ImageVector
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
                moveTo(22f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveToRelative(-5.21f, 14.21f)
                lineToRelative(-2.91f, -2.91f)
                curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f)
                curveTo(9.01f, 16f, 7f, 13.99f, 7f, 11.5f)
                reflectiveCurveTo(9.01f, 7f, 11.5f, 7f)
                reflectiveCurveTo(16f, 9.01f, 16f, 11.5f)
                curveToRelative(0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f)
                lineToRelative(2.91f, 2.9f)
                lineToRelative(-1.42f, 1.42f)
                close()
            }
        }.build()
        
        return _Pageview!!
    }

private var _Pageview: ImageVector? = null

