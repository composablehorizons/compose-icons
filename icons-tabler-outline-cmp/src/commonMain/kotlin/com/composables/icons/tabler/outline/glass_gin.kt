package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GlassGin: ImageVector
    get() {
        if (_GlassGin != null) return _GlassGin!!
        
        _GlassGin = ImageVector.Builder(
            name = "glass-gin",
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
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                moveToRelative(-6.5f, 0f)
                arcToRelative(6.5f, 2f, 0f, true, false, 13f, 0f)
                arcToRelative(6.5f, 2f, 0f, true, false, -13f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.75f, 4.5f)
                curveToRelative(-0.612f, 0.75f, -0.75f, 2f, -0.75f, 3.5f)
                arcToRelative(7f, 7f, 0f, false, false, 14f, 0f)
                curveToRelative(0f, -1.5f, -0.094f, -2.75f, -0.75f, -3.5f)
            }
        }.build()
        
        return _GlassGin!!
    }

private var _GlassGin: ImageVector? = null

