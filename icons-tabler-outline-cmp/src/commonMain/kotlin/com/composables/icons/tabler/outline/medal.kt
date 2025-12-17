package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Medal: ImageVector
    get() {
        if (_Medal != null) return _Medal!!
        
        _Medal = ImageVector.Builder(
            name = "medal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineToRelative(3f)
                moveToRelative(-4f, -3f)
                verticalLineToRelative(6f)
                moveToRelative(8f, -6f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18.5f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(0.5f, -3.5f)
                lineToRelative(-2f, -2f)
                lineToRelative(3f, -0.5f)
                lineToRelative(1.5f, -3f)
                lineToRelative(1.5f, 3f)
                lineToRelative(3f, 0.5f)
                lineToRelative(-2f, 2f)
                lineToRelative(0.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Medal!!
    }

private var _Medal: ImageVector? = null

