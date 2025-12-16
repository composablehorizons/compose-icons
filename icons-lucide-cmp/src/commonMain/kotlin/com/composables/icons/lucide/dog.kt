package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dog: ImageVector
    get() {
        if (_Dog != null) return _Dog!!
        
        _Dog = ImageVector.Builder(
            name = "dog",
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
                moveTo(11.25f, 16.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                verticalLineToRelative(0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.42f, 11.247f)
                arcTo(13.152f, 13.152f, 0f, false, false, 4f, 14.556f)
                curveTo(4f, 18.728f, 7.582f, 21f, 12f, 21f)
                reflectiveCurveToRelative(8f, -2.272f, 8f, -6.444f)
                arcToRelative(11.702f, 11.702f, 0f, false, false, -0.493f, -3.309f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                verticalLineToRelative(0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 8.5f)
                curveToRelative(-0.384f, 1.05f, -1.083f, 2.028f, -2.344f, 2.5f)
                curveToRelative(-1.931f, 0.722f, -3.576f, -0.297f, -3.656f, -1f)
                curveToRelative(-0.113f, -0.994f, 1.177f, -6.53f, 4f, -7f)
                curveToRelative(1.923f, -0.321f, 3.651f, 0.845f, 3.651f, 2.235f)
                arcTo(7.497f, 7.497f, 0f, false, true, 14f, 5.277f)
                curveToRelative(0f, -1.39f, 1.844f, -2.598f, 3.767f, -2.277f)
                curveToRelative(2.823f, 0.47f, 4.113f, 6.006f, 4f, 7f)
                curveToRelative(-0.08f, 0.703f, -1.725f, 1.722f, -3.656f, 1f)
                curveToRelative(-1.261f, -0.472f, -1.855f, -1.45f, -2.239f, -2.5f)
            }
        }.build()
        
        return _Dog!!
    }

private var _Dog: ImageVector? = null

