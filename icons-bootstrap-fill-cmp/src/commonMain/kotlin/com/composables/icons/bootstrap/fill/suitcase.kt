package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Suitcase: ImageVector
    get() {
        if (_Suitcase != null) return _Suitcase!!
        
        _Suitcase = ImageVector.Builder(
            name = "suitcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 4.5f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.004f, 1.416f)
                arcTo(1f, 1f, 0f, true, true, 10f, 15f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, true, true, -1.997f, -0.084f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 13.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 3f)
                horizontalLineTo(6f)
                close()
                moveTo(9f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _Suitcase!!
    }

private var _Suitcase: ImageVector? = null

