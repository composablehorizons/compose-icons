package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cottage: ImageVector
    get() {
        if (_Cottage != null) return _Cottage!!
        
        _Cottage = ImageVector.Builder(
            name = "cottage",
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
                moveTo(22.39f, 12.19f)
                curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f)
                lineToRelative(-9.6f, -7.33f)
                curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0f)
                lineTo(6f, 7.58f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(4f, 6.45f, 4f, 7f)
                verticalLineToRelative(2.11f)
                lineToRelative(-2.21f, 1.68f)
                curveToRelative(-0.44f, 0.33f, -0.52f, 0.96f, -0.19f, 1.4f)
                curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f)
                lineTo(4f, 11.62f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8.38f)
                lineToRelative(0.99f, 0.76f)
                curveTo(21.43f, 12.72f, 22.06f, 12.63f, 22.39f, 12.19f)
                close()
                moveTo(5.27f, 5f)
                curveToRelative(-0.74f, 0f, -1.26f, -0.8f, -0.9f, -1.45f)
                curveTo(4.89f, 2.62f, 5.87f, 2f, 7f, 2f)
                curveToRelative(0.38f, 0f, 0.72f, -0.22f, 0.89f, -0.53f)
                curveTo(8.04f, 1.16f, 8.39f, 1f, 8.73f, 1f)
                curveToRelative(0.74f, 0f, 1.26f, 0.8f, 0.9f, 1.45f)
                curveTo(9.11f, 3.38f, 8.13f, 4f, 7f, 4f)
                curveTo(6.62f, 4f, 6.28f, 4.22f, 6.11f, 4.53f)
                curveTo(5.96f, 4.84f, 5.61f, 5f, 5.27f, 5f)
                close()
            }
        }.build()
        
        return _Cottage!!
    }

private var _Cottage: ImageVector? = null

