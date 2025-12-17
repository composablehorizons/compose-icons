package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sanitizer: ImageVector
    get() {
        if (_Sanitizer != null) return _Sanitizer!!
        
        _Sanitizer = ImageVector.Builder(
            name = "sanitizer",
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
                moveTo(15.5f, 6.5f)
                curveTo(15.5f, 5.66f, 17f, 4f, 17f, 4f)
                reflectiveCurveToRelative(1.5f, 1.66f, 1.5f, 2.5f)
                curveTo(18.5f, 7.33f, 17.83f, 8f, 17f, 8f)
                reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f)
                close()
                moveTo(19.5f, 15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.67f, -2.5f, -4.5f, -2.5f, -4.5f)
                reflectiveCurveTo(17f, 10.83f, 17f, 12.5f)
                curveTo(17f, 13.88f, 18.12f, 15f, 19.5f, 15f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                close()
                moveTo(16f, 12f)
                verticalLineToRelative(10f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveToRelative(0f, -2.97f, 2.16f, -5.43f, 5f, -5.91f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.13f, 0f, 2.15f, 0.39f, 2.99f, 1.01f)
                lineToRelative(-1.43f, 1.43f)
                curveTo(14.1f, 4.17f, 13.57f, 4f, 13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.09f)
                curveTo(13.84f, 6.57f, 16f, 9.03f, 16f, 12f)
                close()
            }
        }.build()
        
        return _Sanitizer!!
    }

private var _Sanitizer: ImageVector? = null

