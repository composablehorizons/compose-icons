package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FlaskFlorence: ImageVector
    get() {
        if (_FlaskFlorence != null) return _FlaskFlorence!!
        
        _FlaskFlorence = ImageVector.Builder(
            name = "flask-florence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(6f)
                verticalLineToRelative(5.416f)
                arcToRelative(5f, 5f, 0f, true, false, 4f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.564f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.27f, 0.227f)
                arcTo(4.002f, 4.002f, 0f, false, true, 8f, 15f)
                arcToRelative(4f, 4f, 0f, false, true, -1.333f, -7.773f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.333f, -0.47f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _FlaskFlorence!!
    }

private var _FlaskFlorence: ImageVector? = null

