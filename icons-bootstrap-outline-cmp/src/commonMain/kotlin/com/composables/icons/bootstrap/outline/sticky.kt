package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sticky: ImageVector
    get() {
        if (_Sticky != null) return _Sticky!!
        
        _Sticky = ImageVector.Builder(
            name = "sticky",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 2.5f)
                verticalLineToRelative(11f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 15f)
                horizontalLineToRelative(6.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.06f, -0.44f)
                lineToRelative(4.915f, -4.914f)
                arcTo(1.5f, 1.5f, 0f, false, false, 15f, 8.586f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 1f)
                close()
                moveTo(2f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(8f)
                horizontalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8f, 9.5f)
                verticalLineTo(14f)
                horizontalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveToRelative(7f, 11.293f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4.293f)
                close()
            }
        }.build()
        
        return _Sticky!!
    }

private var _Sticky: ImageVector? = null

