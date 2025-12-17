package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 4.5f)
                verticalLineToRelative(8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 3f)
                horizontalLineTo(11f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(1.886f, 6.914f)
                lineTo(15f, 7.151f)
                verticalLineTo(12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(7.15f)
                lineToRelative(6.614f, 1.764f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.772f, 0f)
                moveTo(1.5f, 4f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.616f)
                lineTo(8.129f, 7.948f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.258f, 0f)
                lineTo(1f, 6.116f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

