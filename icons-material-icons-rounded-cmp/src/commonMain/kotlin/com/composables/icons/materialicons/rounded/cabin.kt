package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cabin: ImageVector
    get() {
        if (_Cabin != null) return _Cabin!!
        
        _Cabin = ImageVector.Builder(
            name = "cabin",
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
                moveTo(4.37f, 3.55f)
                curveTo(4.89f, 2.62f, 5.87f, 2f, 7f, 2f)
                curveToRelative(0.38f, 0f, 0.72f, -0.22f, 0.89f, -0.53f)
                curveTo(8.04f, 1.16f, 8.39f, 1f, 8.73f, 1f)
                curveToRelative(0.74f, 0f, 1.26f, 0.8f, 0.9f, 1.45f)
                curveTo(9.11f, 3.38f, 8.13f, 4f, 7f, 4f)
                curveTo(6.62f, 4f, 6.28f, 4.22f, 6.11f, 4.53f)
                curveTo(5.96f, 4.84f, 5.61f, 5f, 5.27f, 5f)
                curveTo(4.53f, 5f, 4.01f, 4.2f, 4.37f, 3.55f)
                close()
                moveTo(22.39f, 12.19f)
                curveToRelative(-0.34f, 0.44f, -0.96f, 0.52f, -1.4f, 0.19f)
                lineTo(20f, 11.62f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.38f)
                lineToRelative(-0.99f, 0.76f)
                curveToRelative(-0.44f, 0.34f, -1.07f, 0.25f, -1.4f, -0.19f)
                curveToRelative(-0.33f, -0.44f, -0.25f, -1.07f, 0.19f, -1.4f)
                lineTo(4f, 9.11f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0.58f)
                lineToRelative(5.39f, -4.12f)
                curveToRelative(0.36f, -0.27f, 0.86f, -0.27f, 1.21f, 0f)
                lineToRelative(9.6f, 7.33f)
                curveTo(22.64f, 11.13f, 22.73f, 11.76f, 22.39f, 12.19f)
                close()
                moveTo(10.06f, 7f)
                horizontalLineToRelative(3.89f)
                lineTo(12f, 5.52f)
                lineTo(10.06f, 7f)
                close()
                moveTo(6f, 10.1f)
                verticalLineTo(11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.9f)
                lineTo(16.56f, 9f)
                horizontalLineTo(7.44f)
                lineTo(6f, 10.1f)
                close()
                moveTo(6f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                close()
                moveTo(18f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(18f)
                close()
            }
        }.build()
        
        return _Cabin!!
    }

private var _Cabin: ImageVector? = null

