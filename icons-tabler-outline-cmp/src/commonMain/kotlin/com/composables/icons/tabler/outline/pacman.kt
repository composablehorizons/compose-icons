package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pacman: ImageVector
    get() {
        if (_Pacman != null) return _Pacman!!
        
        _Pacman = ImageVector.Builder(
            name = "pacman",
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
                moveTo(5.636f, 5.636f)
                arcToRelative(9f, 9f, 0f, false, true, 13.397f, 0.747f)
                lineToRelative(-5.619f, 5.617f)
                lineToRelative(5.619f, 5.617f)
                arcToRelative(9f, 9f, 0f, true, true, -13.397f, -11.981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 7.5f)
                arcTo(1f, 1f, 0f, false, true, 11.5f, 8.5f)
                arcTo(1f, 1f, 0f, false, true, 10.5f, 7.5f)
                arcTo(1f, 1f, 0f, false, true, 12.5f, 7.5f)
                close()
            }
        }.build()
        
        return _Pacman!!
    }

private var _Pacman: ImageVector? = null

