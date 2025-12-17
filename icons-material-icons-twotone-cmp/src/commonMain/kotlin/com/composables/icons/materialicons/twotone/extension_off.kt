package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Extension_off: ImageVector
    get() {
        if (_Extension_off != null) return _Extension_off!!
        
        _Extension_off = ImageVector.Builder(
            name = "extension_off",
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
                moveTo(18f, 13f)
                verticalLineToRelative(2.17f)
                lineTo(8.83f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(12f, 3.72f, 12f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveTo(20.28f, 13f, 20f, 13f)
                horizontalLineTo(18f)
                close()
                moveTo(8f, 12.5f)
                curveToRelative(0f, 1.5f, -0.83f, 3.57f, -3f, 4.37f)
                verticalLineTo(19f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.8f, -2.17f, 2.87f, -3f, 4.37f, -3f)
                curveToRelative(0.69f, 0f, 1.5f, 0.18f, 2.25f, 0.58f)
                lineToRelative(-6.33f, -6.33f)
                curveTo(7.82f, 11f, 8f, 11.81f, 8f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.39f, 4.22f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0f, 0.05f, -0.01f, 0.1f, -0.01f, 0.16f)
                verticalLineToRelative(3.8f)
                curveTo(5.7f, 9.8f, 6f, 11.96f, 6f, 12.5f)
                curveToRelative(0f, 0.54f, -0.29f, 2.7f, -3f, 2.7f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0f, -2.71f, 2.16f, -3f, 2.7f, -3f)
                curveToRelative(0.54f, 0f, 2.7f, 0.29f, 2.7f, 3f)
                horizontalLineTo(18f)
                curveToRelative(0.06f, 0f, 0.11f, 0f, 0.16f, -0.01f)
                lineToRelative(1.61f, 1.61f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(11.5f, 16f)
                curveToRelative(-1.5f, 0f, -3.57f, 0.83f, -4.37f, 3f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2.13f)
                curveToRelative(2.17f, -0.8f, 3f, -2.87f, 3f, -4.37f)
                curveToRelative(0f, -0.69f, -0.18f, -1.5f, -0.58f, -2.25f)
                lineToRelative(6.33f, 6.33f)
                curveTo(13f, 16.18f, 12.19f, 16f, 11.5f, 16f)
                close()
                moveTo(8.83f, 6f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(9f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveTo(14f, 2.62f, 14f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(21.38f, 15f, 20f, 15f)
                verticalLineToRelative(2.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveTo(20.28f, 12f, 20f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(11f, 3.72f, 11f, 4f)
                verticalLineToRelative(2f)
                horizontalLineTo(8.83f)
                close()
            }
        }.build()
        
        return _Extension_off!!
    }

private var _Extension_off: ImageVector? = null

