package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Smartwatch: ImageVector
    get() {
        if (_Smartwatch != null) return _Smartwatch!!
        
        _Smartwatch = ImageVector.Builder(
            name = "smartwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1.667f)
                verticalLineToRelative(0.383f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2f, 4.5f)
                verticalLineToRelative(7f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2f, 2.45f)
                verticalLineToRelative(0.383f)
                curveTo(4f, 15.253f, 4.746f, 16f, 5.667f, 16f)
                horizontalLineToRelative(4.666f)
                curveToRelative(0.92f, 0f, 1.667f, -0.746f, 1.667f, -1.667f)
                verticalLineToRelative(-0.383f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2f, -2.45f)
                verticalLineTo(8f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2f, -2.45f)
                verticalLineToRelative(-0.383f)
                curveTo(12f, 0.747f, 11.254f, 0f, 10.333f, 0f)
                horizontalLineTo(5.667f)
                curveTo(4.747f, 0f, 4f, 0.746f, 4f, 1.667f)
                moveTo(4.5f, 3f)
                horizontalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 4.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 11.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 3f)
            }
        }.build()
        
        return _Smartwatch!!
    }

private var _Smartwatch: ImageVector? = null

