package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GuitarPick: ImageVector
    get() {
        if (_GuitarPick != null) return _GuitarPick!!
        
        _GuitarPick = ImageVector.Builder(
            name = "guitar-pick",
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
                moveTo(16f, 18.5f)
                curveToRelative(2f, -2.5f, 4f, -6.5f, 4f, -10.5f)
                curveToRelative(0f, -2.946f, -2.084f, -4.157f, -4.204f, -4.654f)
                curveToRelative(-0.864f, -0.23f, -2.13f, -0.346f, -3.796f, -0.346f)
                curveToRelative(-1.667f, 0f, -2.932f, 0.115f, -3.796f, 0.346f)
                curveToRelative(-2.12f, 0.497f, -4.204f, 1.708f, -4.204f, 4.654f)
                curveToRelative(0f, 3.312f, 2f, 8f, 4f, 10.5f)
                curveToRelative(0.297f, 0.37f, 0.618f, 0.731f, 0.963f, 1.081f)
                lineToRelative(0.354f, 0.347f)
                arcToRelative(3.9f, 3.9f, 0f, false, false, 5.364f, 0f)
                arcToRelative(14.05f, 14.05f, 0f, false, false, 1.319f, -1.428f)
                close()
            }
        }.build()
        
        return _GuitarPick!!
    }

private var _GuitarPick: ImageVector? = null

