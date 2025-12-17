package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Snow3: ImageVector
    get() {
        if (_Snow3 != null) return _Snow3!!
        
        _Snow3 = ImageVector.Builder(
            name = "snow3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.293f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.708f)
                lineTo(7.5f, 12.793f)
                verticalLineToRelative(-1.51f)
                lineToRelative(-2.053f, -1.232f)
                lineToRelative(-1.348f, 0.778f)
                lineToRelative(-0.495f, 1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.966f, -0.26f)
                lineToRelative(0.237f, -0.882f)
                lineToRelative(-1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.866f)
                lineToRelative(1.12f, -0.646f)
                lineToRelative(-0.883f, -0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.258f, -0.966f)
                lineToRelative(1.85f, 0.495f)
                lineTo(5f, 9.155f)
                verticalLineToRelative(-2.31f)
                lineToRelative(-1.4f, -0.808f)
                lineToRelative(-1.85f, 0.495f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.259f, -0.966f)
                lineToRelative(0.884f, -0.237f)
                lineToRelative(-1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.866f)
                lineToRelative(1.12f, 0.646f)
                lineToRelative(-0.237f, -0.883f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.966f, -0.258f)
                lineToRelative(0.495f, 1.849f)
                lineToRelative(1.348f, 0.778f)
                lineTo(7.5f, 4.717f)
                verticalLineToRelative(-1.51f)
                lineTo(6.147f, 1.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.708f)
                lineToRelative(0.646f, 0.647f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1.293f)
                lineToRelative(0.647f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.708f)
                lineTo(8.5f, 3.207f)
                verticalLineToRelative(1.51f)
                lineToRelative(2.053f, 1.232f)
                lineToRelative(1.348f, -0.778f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.236f, 0.882f)
                lineToRelative(1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.866f)
                lineToRelative(-1.12f, 0.646f)
                lineToRelative(0.883f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineToRelative(-1.4f, 0.808f)
                verticalLineToRelative(2.31f)
                lineToRelative(1.4f, 0.808f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.259f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.866f)
                lineToRelative(-1.12f, -0.646f)
                lineToRelative(0.236f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.966f, 0.258f)
                lineToRelative(-0.495f, -1.849f)
                lineToRelative(-1.348f, -0.778f)
                lineTo(8.5f, 11.283f)
                verticalLineToRelative(1.51f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.647f, -0.647f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                moveToRelative(2f, -6.783f)
                verticalLineTo(6.783f)
                lineToRelative(-2f, -1.2f)
                lineToRelative(-2f, 1.2f)
                verticalLineToRelative(2.434f)
                lineToRelative(2f, 1.2f)
                close()
            }
        }.build()
        
        return _Snow3!!
    }

private var _Snow3: ImageVector? = null

