package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 1f)
                horizontalLineToRelative(11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 2.5f)
                verticalLineToRelative(10.528f)
                curveToRelative(0f, 0.3f, -0.05f, 0.654f, -0.238f, 0.972f)
                horizontalLineToRelative(0.738f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(1.497f)
                arcTo(1.497f, 1.497f, 0f, false, true, 0f, 13.5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(0.37f, 0f, 0.654f, -0.211f, 0.853f, -0.441f)
                curveToRelative(0.092f, -0.106f, 0.147f, -0.279f, 0.147f, -0.531f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.278f, 0.223f, 0.5f, 0.497f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                close()
                moveToRelative(5f, -6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-3f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-3f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

