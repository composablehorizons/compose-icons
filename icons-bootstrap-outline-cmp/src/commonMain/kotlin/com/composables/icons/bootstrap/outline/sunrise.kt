package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sunrise: ImageVector
    get() {
        if (_Sunrise != null) return _Sunrise!!
        
        _Sunrise = ImageVector.Builder(
            name = "sunrise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 2.707f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2.707f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
                moveTo(2.343f, 4.343f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
                lineTo(2.343f, 5.05f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                moveToRelative(11.314f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                moveTo(8f, 7f)
                arcToRelative(3f, 3f, 0f, false, true, 2.599f, 4.5f)
                horizontalLineTo(5.4f)
                arcTo(3f, 3f, 0f, false, true, 8f, 7f)
                moveToRelative(3.71f, 4.5f)
                arcToRelative(4f, 4f, 0f, true, false, -7.418f, 0f)
                horizontalLineTo(0.499f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-3.79f)
                close()
                moveTo(0f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 10f)
                moveToRelative(13f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _Sunrise!!
    }

private var _Sunrise: ImageVector? = null

