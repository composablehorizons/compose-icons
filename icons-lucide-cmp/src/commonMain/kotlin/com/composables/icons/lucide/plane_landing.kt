package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlaneLanding: ImageVector
    get() {
        if (_PlaneLanding != null) return _PlaneLanding!!
        
        _PlaneLanding = ImageVector.Builder(
            name = "plane-landing",
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
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.77f, 10.77f)
                lineTo(2f, 9f)
                lineToRelative(2f, -4.5f)
                lineToRelative(1.1f, 0.55f)
                curveToRelative(0.55f, 0.28f, 0.9f, 0.84f, 0.9f, 1.45f)
                reflectiveCurveToRelative(0.35f, 1.17f, 0.9f, 1.45f)
                lineTo(8f, 8.5f)
                lineToRelative(3f, -6f)
                lineToRelative(1.05f, 0.53f)
                arcToRelative(2f, 2f, 0f, false, true, 1.09f, 1.52f)
                lineToRelative(0.72f, 5.4f)
                arcToRelative(2f, 2f, 0f, false, false, 1.09f, 1.52f)
                lineToRelative(4.4f, 2.2f)
                curveToRelative(0.42f, 0.22f, 0.78f, 0.55f, 1.01f, 0.96f)
                lineToRelative(0.6f, 1.03f)
                curveToRelative(0.49f, 0.88f, -0.06f, 1.98f, -1.06f, 2.1f)
                lineToRelative(-1.18f, 0.15f)
                curveToRelative(-0.47f, 0.06f, -0.95f, -0.02f, -1.37f, -0.24f)
                lineTo(4.29f, 11.15f)
                arcToRelative(2f, 2f, 0f, false, true, -0.52f, -0.38f)
                close()
            }
        }.build()
        
        return _PlaneLanding!!
    }

private var _PlaneLanding: ImageVector? = null

