package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Stickies: ImageVector
    get() {
        if (_Stickies != null) return _Stickies!!
        
        _Stickies = ImageVector.Builder(
            name = "stickies",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 1.5f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineToRelative(11f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(6.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.06f, -0.44f)
                lineToRelative(4.915f, -4.914f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16f, 9.586f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 2f)
                close()
                moveTo(3f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9f, 10.5f)
                verticalLineTo(15f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveToRelative(7f, 11.293f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4.293f)
                close()
            }
        }.build()
        
        return _Stickies!!
    }

private var _Stickies: ImageVector? = null

