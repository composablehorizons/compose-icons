package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Easel3: ImageVector
    get() {
        if (_Easel3 != null) return _Easel3!!
        
        _Easel3 = ImageVector.Builder(
            name = "easel3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 13.134f)
                verticalLineTo(12f)
                horizontalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(8.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.134f)
                arcToRelative(1f, 1f, 0f, true, false, 1f, 0f)
                moveTo(2f, 2f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Easel3!!
    }

private var _Easel3: ImageVector? = null

