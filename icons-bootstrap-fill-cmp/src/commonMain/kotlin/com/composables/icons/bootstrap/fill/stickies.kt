package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Stickies: ImageVector
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
                moveTo(0f, 1.5f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 1.5f)
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
                moveToRelative(6f, 8.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4.396f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.177f, 0.427f)
                lineToRelative(-5.146f, 5.146f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.427f, -0.177f)
                close()
            }
        }.build()
        
        return _Stickies!!
    }

private var _Stickies: ImageVector? = null

