package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Cake: ImageVector
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
                moveTo(7.399f, 0.804f)
                lineToRelative(0.595f, -0.792f)
                lineToRelative(0.598f, 0.79f)
                arcTo(0.747f, 0.747f, 0f, false, true, 8.5f, 1.806f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(1.813f)
                arcToRelative(0.747f, 0.747f, 0f, false, true, -0.101f, -1.01f)
                close()
                moveTo(12f, 6.414f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.646f, -0.268f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcTo(0.9f, 0.9f, 0f, false, true, 4f, 6.414f)
                verticalLineToRelative(1f)
                curveToRelative(0.49f, 0f, 0.98f, -0.187f, 1.354f, -0.56f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.748f, 0.747f, 1.96f, 0.747f, 2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.374f, 0.373f, 0.864f, 0.56f, 1.354f, 0.56f)
                close()
                moveToRelative(2.646f, 5.732f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.293f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.707f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, -1.292f, 0f)
                lineTo(1f, 11.793f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.737f, 0.452f, 1.715f, 0.36f, 2.354f, -0.28f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.748f, 0.748f, 1.96f, 0.748f, 2.708f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.292f, 0f)
                curveToRelative(0.748f, 0.748f, 1.96f, 0.748f, 2.707f, 0f)
                arcToRelative(0.914f, 0.914f, 0f, false, true, 1.293f, 0f)
                arcToRelative(1.915f, 1.915f, 0f, false, false, 2.354f, 0.28f)
                verticalLineToRelative(-1.34f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

