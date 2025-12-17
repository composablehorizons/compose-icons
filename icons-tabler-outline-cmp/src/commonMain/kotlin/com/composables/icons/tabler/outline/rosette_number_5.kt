package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RosetteNumber5: ImageVector
    get() {
        if (_RosetteNumber5 != null) return _RosetteNumber5!!
        
        _RosetteNumber5 = ImageVector.Builder(
            name = "rosette-number-5",
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
                moveTo(10f, 15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 7.2f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 2.2f, -2.2f)
                horizontalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, 1.55f, -0.64f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 3.12f, 0f)
                lineToRelative(0.7f, 0.7f)
                curveToRelative(0.412f, 0.41f, 0.97f, 0.64f, 1.55f, 0.64f)
                horizontalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 2.2f, 2.2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.58f, 0.23f, 1.138f, 0.64f, 1.55f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 0f, 3.12f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -0.64f, 1.55f)
                verticalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, -2.2f, 2.2f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -1.55f, 0.64f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, -3.12f, 0f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -1.55f, -0.64f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, -2.2f, -2.2f)
                verticalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -0.64f, -1.55f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 0f, -3.12f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, 0.64f, -1.55f)
                verticalLineToRelative(-1f)
            }
        }.build()
        
        return _RosetteNumber5!!
    }

private var _RosetteNumber5: ImageVector? = null

