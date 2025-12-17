package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Picture_as_pdf: ImageVector
    get() {
        if (_Picture_as_pdf != null) return _Picture_as_pdf!!
        
        _Picture_as_pdf = ImageVector.Builder(
            name = "picture_as_pdf",
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
                moveTo(22f, 2f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveToRelative(-10.5f, 9f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(7.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(5f, 0.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(4f, -3f)
                horizontalLineTo(19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(9f, 9.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                close()
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
                moveToRelative(10f, 5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Picture_as_pdf!!
    }

private var _Picture_as_pdf: ImageVector? = null

