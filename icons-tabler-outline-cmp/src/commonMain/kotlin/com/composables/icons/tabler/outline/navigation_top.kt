package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.NavigationTop: ImageVector
    get() {
        if (_NavigationTop != null) return _NavigationTop!!
        
        _NavigationTop = ImageVector.Builder(
            name = "navigation-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.54f, 19.977f)
                arcToRelative(0.34f, 0.34f, 0f, false, false, 0.357f, -0.07f)
                arcToRelative(0.33f, 0.33f, 0f, false, false, 0.084f, -0.35f)
                lineToRelative(-4.981f, -10.557f)
                lineToRelative(-4.982f, 10.557f)
                arcToRelative(0.33f, 0.33f, 0f, false, false, 0.084f, 0.35f)
                arcToRelative(0.34f, 0.34f, 0f, false, false, 0.357f, 0.07f)
                lineToRelative(4.541f, -1.477f)
                lineToRelative(4.54f, 1.477f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _NavigationTop!!
    }

private var _NavigationTop: ImageVector? = null

