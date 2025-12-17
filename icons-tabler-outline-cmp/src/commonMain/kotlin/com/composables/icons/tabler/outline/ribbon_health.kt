package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RibbonHealth: ImageVector
    get() {
        if (_RibbonHealth != null) return _RibbonHealth!!
        
        _RibbonHealth = ImageVector.Builder(
            name = "ribbon-health",
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
                moveTo(7f, 21f)
                reflectiveCurveToRelative(9.286f, -9.841f, 9.286f, -13.841f)
                arcToRelative(3.864f, 3.864f, 0f, false, false, -1.182f, -3.008f)
                arcToRelative(4.13f, 4.13f, 0f, false, false, -3.104f, -1.144f)
                arcToRelative(4.13f, 4.13f, 0f, false, false, -3.104f, 1.143f)
                arcToRelative(3.864f, 3.864f, 0f, false, false, -1.182f, 3.01f)
                curveToRelative(0f, 4f, 9.286f, 13.84f, 9.286f, 13.84f)
            }
        }.build()
        
        return _RibbonHealth!!
    }

private var _RibbonHealth: ImageVector? = null

