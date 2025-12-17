package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Sunset: ImageVector
    get() {
        if (_Sunset != null) return _Sunset!!
        
        _Sunset = ImageVector.Builder(
            name = "sunset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-0.646f, 0.647f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(1.793f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                close()
                moveToRelative(-5.303f, -0.51f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                lineToRelative(1.414f, 1.413f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
                lineTo(2.343f, 5.05f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                close()
                moveToRelative(11.314f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.706f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                close()
                moveTo(11.709f, 11.5f)
                arcToRelative(4f, 4f, 0f, true, false, -7.418f, 0f)
                horizontalLineTo(0.5f)
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
        
        return _Sunset!!
    }

private var _Sunset: ImageVector? = null

