package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.At: ImageVector
    get() {
        if (_At != null) return _At!!
        
        _At = ImageVector.Builder(
            name = "at",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.106f, 7.222f)
                curveToRelative(0f, -2.967f, -2.249f, -5.032f, -5.482f, -5.032f)
                curveToRelative(-3.35f, 0f, -5.646f, 2.318f, -5.646f, 5.702f)
                curveToRelative(0f, 3.493f, 2.235f, 5.708f, 5.762f, 5.708f)
                curveToRelative(0.862f, 0f, 1.689f, -0.123f, 2.304f, -0.335f)
                verticalLineToRelative(-0.862f)
                curveToRelative(-0.43f, 0.199f, -1.354f, 0.328f, -2.29f, 0.328f)
                curveToRelative(-2.926f, 0f, -4.813f, -1.88f, -4.813f, -4.798f)
                curveToRelative(0f, -2.844f, 1.921f, -4.881f, 4.594f, -4.881f)
                curveToRelative(2.735f, 0f, 4.608f, 1.688f, 4.608f, 4.156f)
                curveToRelative(0f, 1.682f, -0.554f, 2.769f, -1.416f, 2.769f)
                curveToRelative(-0.492f, 0f, -0.772f, -0.28f, -0.772f, -0.76f)
                verticalLineTo(5.206f)
                horizontalLineTo(8.923f)
                verticalLineToRelative(0.834f)
                horizontalLineToRelative(-0.11f)
                curveToRelative(-0.266f, -0.595f, -0.881f, -0.964f, -1.6f, -0.964f)
                curveToRelative(-1.4f, 0f, -2.378f, 1.162f, -2.378f, 2.823f)
                curveToRelative(0f, 1.737f, 0.957f, 2.906f, 2.379f, 2.906f)
                curveToRelative(0.8f, 0f, 1.415f, -0.39f, 1.709f, -1.087f)
                horizontalLineToRelative(0.11f)
                curveToRelative(0.081f, 0.67f, 0.703f, 1.148f, 1.503f, 1.148f)
                curveToRelative(1.572f, 0f, 2.57f, -1.415f, 2.57f, -3.643f)
                close()
                moveToRelative(-7.177f, 0.704f)
                curveToRelative(0f, -1.197f, 0.54f, -1.907f, 1.456f, -1.907f)
                curveToRelative(0.93f, 0f, 1.524f, 0.738f, 1.524f, 1.907f)
                reflectiveCurveTo(8.308f, 9.84f, 7.371f, 9.84f)
                curveToRelative(-0.895f, 0f, -1.442f, -0.725f, -1.442f, -1.914f)
            }
        }.build()
        
        return _At!!
    }

private var _At: ImageVector? = null

