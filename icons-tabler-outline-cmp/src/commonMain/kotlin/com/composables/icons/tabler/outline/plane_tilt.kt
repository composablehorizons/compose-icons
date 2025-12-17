package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PlaneTilt: ImageVector
    get() {
        if (_PlaneTilt != null) return _PlaneTilt!!
        
        _PlaneTilt = ImageVector.Builder(
            name = "plane-tilt",
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
                moveTo(14.5f, 6.5f)
                lineToRelative(3f, -2.9f)
                arcToRelative(2.05f, 2.05f, 0f, false, true, 2.9f, 2.9f)
                lineToRelative(-2.9f, 3f)
                lineToRelative(2.5f, 7.5f)
                lineToRelative(-2.5f, 2.55f)
                lineToRelative(-3.5f, -6.55f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(3f)
                lineToRelative(-2f, 2f)
                lineToRelative(-1.5f, -4.5f)
                lineToRelative(-4.5f, -1.5f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(3f)
                lineToRelative(3f, -3f)
                lineToRelative(-6.5f, -3.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(7.5f, 2.5f)
                close()
            }
        }.build()
        
        return _PlaneTilt!!
    }

private var _PlaneTilt: ImageVector? = null

