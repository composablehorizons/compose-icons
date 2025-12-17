package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Beer: ImageVector
    get() {
        if (_Beer != null) return _Beer!!
        
        _Beer = ImageVector.Builder(
            name = "beer",
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
                moveTo(9f, 21f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3.625f)
                curveToRelative(0f, -1.397f, 0.29f, -2.775f, 0.845f, -4.025f)
                lineToRelative(0.31f, -0.7f)
                curveToRelative(0.556f, -1.25f, 0.845f, -2.253f, 0.845f, -3.65f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-10f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.397f, 0.29f, 2.4f, 0.845f, 3.65f)
                lineToRelative(0.31f, 0.7f)
                arcToRelative(9.931f, 9.931f, 0f, false, true, 0.845f, 4.025f)
                verticalLineToRelative(3.625f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                horizontalLineToRelative(12f)
            }
        }.build()
        
        return _Beer!!
    }

private var _Beer: ImageVector? = null

