package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CommandLine: ImageVector
    get() {
        if (_CommandLine != null) return _CommandLine!!
        
        _CommandLine = ImageVector.Builder(
            name = "command-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6.75f, 7.5f)
                lineToRelative(3f, 2.25f)
                lineToRelative(-3f, 2.25f)
                moveToRelative(4.5f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(-9f, 8.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 18f)
                verticalLineTo(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                close()
            }
        }.build()
        
        return _CommandLine!!
    }

private var _CommandLine: ImageVector? = null

