package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Snow2: ImageVector
    get() {
        if (_Snow2 != null) return _Snow2!!
        
        _Snow2 = ImageVector.Builder(
            name = "snow2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.293f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.708f)
                lineTo(7.5f, 12.793f)
                verticalLineToRelative(-1.086f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.708f)
                lineTo(7.5f, 10.293f)
                verticalLineTo(8.866f)
                lineToRelative(-1.236f, 0.713f)
                lineToRelative(-0.495f, 1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.966f, -0.26f)
                lineToRelative(0.237f, -0.882f)
                lineToRelative(-0.94f, 0.542f)
                lineToRelative(-0.496f, 1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.966f, -0.26f)
                lineToRelative(0.237f, -0.882f)
                lineToRelative(-1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.866f)
                lineToRelative(1.12f, -0.646f)
                lineToRelative(-0.884f, -0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.26f, -0.966f)
                lineToRelative(1.848f, 0.495f)
                lineToRelative(0.94f, -0.542f)
                lineToRelative(-0.882f, -0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.258f, -0.966f)
                lineToRelative(1.85f, 0.495f)
                lineTo(7f, 8f)
                lineToRelative(-1.236f, -0.713f)
                lineToRelative(-1.849f, 0.495f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.258f, -0.966f)
                lineToRelative(0.883f, -0.237f)
                lineToRelative(-0.94f, -0.542f)
                lineToRelative(-1.85f, 0.495f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.258f, -0.966f)
                lineToRelative(0.883f, -0.237f)
                lineToRelative(-1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.5f, -0.866f)
                lineToRelative(1.12f, 0.646f)
                lineToRelative(-0.237f, -0.883f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.966f, -0.258f)
                lineToRelative(0.495f, 1.849f)
                lineToRelative(0.94f, 0.542f)
                lineToRelative(-0.236f, -0.883f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.966f, -0.258f)
                lineToRelative(0.495f, 1.849f)
                lineToRelative(1.236f, 0.713f)
                verticalLineTo(5.707f)
                lineTo(6.147f, 4.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.708f)
                lineToRelative(0.646f, 0.647f)
                verticalLineTo(3.207f)
                lineTo(6.147f, 1.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.708f)
                lineToRelative(0.646f, 0.647f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1.293f)
                lineToRelative(0.647f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.708f)
                lineTo(8.5f, 3.207f)
                verticalLineToRelative(1.086f)
                lineToRelative(0.647f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.708f)
                lineTo(8.5f, 5.707f)
                verticalLineToRelative(1.427f)
                lineToRelative(1.236f, -0.713f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.236f, 0.882f)
                lineToRelative(0.94f, -0.542f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.236f, 0.882f)
                lineToRelative(1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.866f)
                lineToRelative(-1.12f, 0.646f)
                lineToRelative(0.883f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineToRelative(-0.94f, 0.542f)
                lineToRelative(0.883f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineTo(9f, 8f)
                lineToRelative(1.236f, 0.713f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.259f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(0.94f, 0.542f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.259f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.866f)
                lineToRelative(-1.12f, -0.646f)
                lineToRelative(0.236f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.966f, 0.258f)
                lineToRelative(-0.495f, -1.849f)
                lineToRelative(-0.94f, -0.542f)
                lineToRelative(0.236f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.966f, 0.258f)
                lineTo(9.736f, 9.58f)
                lineTo(8.5f, 8.866f)
                verticalLineToRelative(1.427f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.647f, -0.647f)
                verticalLineToRelative(1.086f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.647f, -0.647f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
            }
        }.build()
        
        return _Snow2!!
    }

private var _Snow2: ImageVector? = null

