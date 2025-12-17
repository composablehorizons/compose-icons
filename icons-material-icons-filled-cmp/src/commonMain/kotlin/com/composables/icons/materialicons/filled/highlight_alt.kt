package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Highlight_alt: ImageVector
    get() {
        if (_Highlight_alt != null) return _Highlight_alt!!
        
        _Highlight_alt = ImageVector.Builder(
            name = "highlight_alt",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.59f)
                lineTo(19.59f, 21f)
                lineTo(21f, 19.59f)
                lineTo(18.41f, 17f)
                horizontalLineTo(21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(4f, -12f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-8f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2f, 4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(19f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-8f, 2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-4f, -8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Highlight_alt!!
    }

private var _Highlight_alt: ImageVector? = null

