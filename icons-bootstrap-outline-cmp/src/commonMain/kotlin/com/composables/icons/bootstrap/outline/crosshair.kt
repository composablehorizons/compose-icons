package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Crosshair: ImageVector
    get() {
        if (_Crosshair != null) return _Crosshair!!
        
        _Crosshair = ImageVector.Builder(
            name = "crosshair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.518f)
                arcTo(7f, 7f, 0f, false, false, 1.018f, 7.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.518f)
                arcTo(7f, 7f, 0f, false, false, 7.5f, 14.982f)
                verticalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-0.518f)
                arcTo(7f, 7f, 0f, false, false, 14.982f, 8.5f)
                horizontalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-0.518f)
                arcTo(7f, 7f, 0f, false, false, 8.5f, 1.018f)
                close()
                moveToRelative(-6.48f, 7f)
                arcTo(6f, 6f, 0f, false, true, 7.5f, 2.02f)
                verticalLineToRelative(0.48f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-0.48f)
                arcToRelative(6f, 6f, 0f, false, true, 5.48f, 5.48f)
                horizontalLineToRelative(-0.48f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.48f)
                arcToRelative(6f, 6f, 0f, false, true, -5.48f, 5.48f)
                verticalLineToRelative(-0.48f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.48f)
                arcTo(6f, 6f, 0f, false, true, 2.02f, 8.5f)
                horizontalLineToRelative(0.48f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
        }.build()
        
        return _Crosshair!!
    }

private var _Crosshair: ImageVector? = null

