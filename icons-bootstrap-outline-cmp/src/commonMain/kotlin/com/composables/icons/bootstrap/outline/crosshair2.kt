package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Crosshair2: ImageVector
    get() {
        if (_Crosshair2 != null) return _Crosshair2!!
        
        _Crosshair2 = ImageVector.Builder(
            name = "crosshair2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.518f)
                arcTo(7f, 7f, 0f, false, true, 14.982f, 7.5f)
                horizontalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-0.518f)
                arcTo(7f, 7f, 0f, false, true, 8.5f, 14.982f)
                verticalLineToRelative(0.518f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-0.518f)
                arcTo(7f, 7f, 0f, false, true, 1.018f, 8.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(0.518f)
                arcTo(7f, 7f, 0f, false, true, 7.5f, 1.018f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
                moveToRelative(-0.5f, 2.02f)
                arcTo(6f, 6f, 0f, false, false, 2.02f, 7.5f)
                horizontalLineToRelative(1.005f)
                arcTo(5f, 5f, 0f, false, true, 7.5f, 3.025f)
                close()
                moveToRelative(1f, 1.005f)
                arcTo(5f, 5f, 0f, false, true, 12.975f, 7.5f)
                horizontalLineToRelative(1.005f)
                arcTo(6f, 6f, 0f, false, false, 8.5f, 2.02f)
                close()
                moveTo(12.975f, 8.5f)
                arcTo(5f, 5f, 0f, false, true, 8.5f, 12.975f)
                verticalLineToRelative(1.005f)
                arcToRelative(6f, 6f, 0f, false, false, 5.48f, -5.48f)
                close()
                moveTo(7.5f, 12.975f)
                arcTo(5f, 5f, 0f, false, true, 3.025f, 8.5f)
                horizontalLineTo(2.02f)
                arcToRelative(6f, 6f, 0f, false, false, 5.48f, 5.48f)
                close()
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
            }
        }.build()
        
        return _Crosshair2!!
    }

private var _Crosshair2: ImageVector? = null

