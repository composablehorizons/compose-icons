package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Handbag: ImageVector
    get() {
        if (_Handbag != null) return _Handbag!!
        
        _Handbag = ImageVector.Builder(
            name = "handbag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(3f, 4f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.36f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.483f, 1.277f)
                lineTo(0.85f, 13.13f)
                arcTo(2.5f, 2.5f, 0f, false, false, 3.322f, 16f)
                horizontalLineToRelative(9.355f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.473f, -2.87f)
                lineToRelative(-1.028f, -6.853f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.64f, 5f)
                close()
                moveToRelative(-1f, 1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(6f)
                horizontalLineToRelative(1.639f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.494f, 0.426f)
                lineToRelative(1.028f, 6.851f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.678f, 15f)
                horizontalLineTo(3.322f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.483f, -1.723f)
                lineToRelative(1.028f, -6.851f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.36f, 6f)
                horizontalLineTo(5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Handbag!!
    }

private var _Handbag: ImageVector? = null

