package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hdr_off: ImageVector
    get() {
        if (_Hdr_off != null) return _Hdr_off!!
        
        _Hdr_off = ImageVector.Builder(
            name = "hdr_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.5f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2f)
                horizontalLineTo(21f)
                lineToRelative(-0.9f, -2.1f)
                curveToRelative(0.5f, -0.2f, 0.9f, -0.8f, 0.9f, -1.4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(16f)
                verticalLineToRelative(4.9f)
                lineToRelative(1.1f, 1.1f)
                horizontalLineToRelative(0.4f)
                close()
                moveToRelative(0f, -4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-4.5f, 0f)
                verticalLineToRelative(0.4f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(0.4f)
                close()
                moveToRelative(-3.5f, -1f)
                lineToRelative(-7f, -7f)
                lineToRelative(-1.1f, 1f)
                lineTo(6.9f, 9f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineToRelative(-4.9f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(3.4f)
                lineToRelative(7.6f, 7.6f)
                lineToRelative(1.1f, -1.1f)
                lineToRelative(-12.1f, -12f)
                close()
            }
        }.build()
        
        return _Hdr_off!!
    }

private var _Hdr_off: ImageVector? = null

