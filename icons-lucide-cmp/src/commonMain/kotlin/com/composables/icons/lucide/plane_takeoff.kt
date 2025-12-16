package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlaneTakeoff: ImageVector
    get() {
        if (_PlaneTakeoff != null) return _PlaneTakeoff!!
        
        _PlaneTakeoff = ImageVector.Builder(
            name = "plane-takeoff",
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
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.36f, 17.4f)
                lineTo(4f, 17f)
                lineToRelative(-2f, -4f)
                lineToRelative(1.1f, -0.55f)
                arcToRelative(2f, 2f, 0f, false, true, 1.8f, 0f)
                lineToRelative(0.17f, 0.1f)
                arcToRelative(2f, 2f, 0f, false, false, 1.8f, 0f)
                lineTo(8f, 12f)
                lineTo(5f, 6f)
                lineToRelative(0.9f, -0.45f)
                arcToRelative(2f, 2f, 0f, false, true, 2.09f, 0.2f)
                lineToRelative(4.02f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, 2.1f, 0.2f)
                lineToRelative(4.19f, -2.06f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 1.73f, -0.17f)
                lineTo(21f, 7f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, 0.87f, 1.99f)
                lineToRelative(-0.38f, 0.76f)
                curveToRelative(-0.23f, 0.46f, -0.6f, 0.84f, -1.07f, 1.08f)
                lineTo(7.58f, 17.2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.22f, 0.18f)
                close()
            }
        }.build()
        
        return _PlaneTakeoff!!
    }

private var _PlaneTakeoff: ImageVector? = null

