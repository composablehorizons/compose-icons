package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Palette2: ImageVector
    get() {
        if (_Palette2 != null) return _Palette2!!
        
        _Palette2 = ImageVector.Builder(
            name = "palette2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.277f)
                lineToRelative(4.147f, -4.131f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                lineToRelative(3.535f, 3.536f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineTo(10.261f, 10f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, false, true, -2.121f, -0.879f)
                arcTo(3f, 3f, 0f, false, true, 0f, 13.044f)
                moveToRelative(6f, -0.21f)
                lineToRelative(7.328f, -7.3f)
                lineToRelative(-2.829f, -2.828f)
                lineTo(6f, 7.188f)
                close()
                moveTo(4.5f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                moveTo(15f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineTo(9.258f)
                lineToRelative(-4.015f, 4f)
                close()
                moveTo(0f, 0.5f)
                verticalLineToRelative(12.495f)
                close()
                moveToRelative(0f, 12.495f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Palette2!!
    }

private var _Palette2: ImageVector? = null

