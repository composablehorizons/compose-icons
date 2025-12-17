package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.994f, 0.013f)
                lineToRelative(-0.595f, 0.79f)
                arcToRelative(0.747f, 0.747f, 0f, false, false, 0.101f, 1.01f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(8.5f)
                verticalLineTo(1.806f)
                arcTo(0.747f, 0.747f, 0f, false, false, 8.592f, 0.802f)
                close()
                moveTo(4f, 6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.414f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.646f, -0.268f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcTo(0.9f, 0.9f, 0f, false, true, 4f, 6.414f)
                close()
                moveToRelative(0f, 1.414f)
                curveToRelative(0.49f, 0f, 0.98f, -0.187f, 1.354f, -0.56f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.748f, 0.747f, 1.96f, 0.747f, 2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.374f, 0.373f, 0.864f, 0.56f, 1.354f, 0.56f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                close()
                moveTo(1f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.793f)
                lineToRelative(-0.354f, 0.354f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.293f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.707f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                lineTo(1f, 11.793f)
                close()
                moveToRelative(11.646f, 1.854f)
                arcToRelative(1.915f, 1.915f, 0f, false, false, 2.354f, 0.279f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineToRelative(-1.867f)
                curveToRelative(0.737f, 0.452f, 1.715f, 0.36f, 2.354f, -0.28f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.748f, 0.748f, 1.96f, 0.748f, 2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.748f, 0.748f, 1.96f, 0.748f, 2.707f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.293f, 0f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

