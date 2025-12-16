package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Component: ImageVector
    get() {
        if (_Component != null) return _Component!!
        
        _Component = ImageVector.Builder(
            name = "component",
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
                moveTo(15.536f, 11.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.376f, 2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.297f, 11.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.377f, 2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineTo(6.088f, 8.916f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.916f, 17.912f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.415f)
                lineToRelative(2.377f, 2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.415f)
                lineToRelative(-2.377f, -2.376f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.916f, 4.674f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.377f, 2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
        }.build()
        
        return _Component!!
    }

private var _Component: ImageVector? = null

