package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Crop: ImageVector
    get() {
        if (_Crop != null) return _Crop!!
        
        _Crop = ImageVector.Builder(
            name = "crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(2.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _Crop!!
    }

private var _Crop: ImageVector? = null

