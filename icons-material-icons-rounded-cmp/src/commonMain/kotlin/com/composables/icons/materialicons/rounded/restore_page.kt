package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Restore_page: ImageVector
    get() {
        if (_Restore_page != null) return _Restore_page!!
        
        _Restore_page = ImageVector.Builder(
            name = "restore_page",
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
                moveTo(19.41f, 7.41f)
                lineToRelative(-4.83f, -4.83f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(4f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8.83f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-1.65f, 0f, -3.19f, -0.81f, -4.12f, -2.17f)
                curveToRelative(-0.23f, -0.34f, -0.15f, -0.81f, 0.19f, -1.04f)
                curveToRelative(0.34f, -0.24f, 0.81f, -0.15f, 1.04f, 0.19f)
                curveToRelative(0.65f, 0.95f, 1.73f, 1.52f, 2.88f, 1.52f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(13.93f, 9.5f, 12f, 9.5f)
                curveToRelative(-1.33f, 0f, -2.52f, 0.74f, -3.11f, 1.89f)
                lineTo(10.5f, 13f)
                horizontalLineTo(7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(9f)
                lineToRelative(1.3f, 1.3f)
                curveTo(8.71f, 8.89f, 10.26f, 8f, 12f, 8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.build()
        
        return _Restore_page!!
    }

private var _Restore_page: ImageVector? = null

