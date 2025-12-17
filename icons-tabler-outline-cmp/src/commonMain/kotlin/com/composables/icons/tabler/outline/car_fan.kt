package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CarFan: ImageVector
    get() {
        if (_CarFan != null) return _CarFan!!
        
        _CarFan = ImageVector.Builder(
            name = "car-fan",
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
                moveTo(12f, 12f)
                verticalLineToRelative(-9f)
                lineToRelative(4.912f, 1.914f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, 0.428f, 2.925f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineToRelative(9f)
                lineToRelative(-1.914f, 4.912f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -2.925f, 0.428f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineToRelative(-9f)
                lineToRelative(1.914f, -4.912f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, 2.925f, -0.428f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(9f)
                lineToRelative(-4.912f, -1.914f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.428f, -2.925f)
                close()
            }
        }.build()
        
        return _CarFan!!
    }

private var _CarFan: ImageVector? = null

