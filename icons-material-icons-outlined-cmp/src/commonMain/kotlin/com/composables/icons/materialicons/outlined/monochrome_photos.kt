package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Monochrome_photos: ImageVector
    get() {
        if (_Monochrome_photos != null) return _Monochrome_photos!!
        
        _Monochrome_photos = ImageVector.Builder(
            name = "monochrome_photos",
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
                moveTo(20f, 5f)
                horizontalLineToRelative(-3.2f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(7.2f, 5f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                curveToRelative(-2.8f, 0f, -5f, -2.2f, -5f, -5f)
                reflectiveCurveToRelative(2.2f, -5f, 5f, -5f)
                verticalLineTo(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-3f, -6f)
                curveToRelative(0f, -2.8f, -2.2f, -5f, -5f, -5f)
                verticalLineToRelative(1.8f)
                curveToRelative(1.8f, 0f, 3.2f, 1.4f, 3.2f, 3.2f)
                reflectiveCurveToRelative(-1.4f, 3.2f, -3.2f, 3.2f)
                verticalLineTo(18f)
                curveToRelative(2.8f, 0f, 5f, -2.2f, 5f, -5f)
                close()
                moveToRelative(-8.2f, 0f)
                curveToRelative(0f, 1.8f, 1.4f, 3.2f, 3.2f, 3.2f)
                verticalLineTo(9.8f)
                curveToRelative(-1.8f, 0f, -3.2f, 1.4f, -3.2f, 3.2f)
                close()
            }
        }.build()
        
        return _Monochrome_photos!!
    }

private var _Monochrome_photos: ImageVector? = null

