package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FishBone: ImageVector
    get() {
        if (_FishBone != null) return _FishBone!!
        
        _FishBone = ImageVector.Builder(
            name = "fish-bone",
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
                moveTo(16.69f, 7.44f)
                arcToRelative(6.973f, 6.973f, 0f, false, false, -1.69f, 4.56f)
                arcToRelative(6.97f, 6.97f, 0f, false, false, 1.699f, 4.571f)
                curveToRelative(1.914f, -0.684f, 3.691f, -2.183f, 5.301f, -4.565f)
                curveToRelative(-1.613f, -2.384f, -3.394f, -3.883f, -5.312f, -4.565f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9.504f)
                arcToRelative(40.73f, 40.73f, 0f, false, false, 2.422f, 2.504f)
                arcToRelative(39.679f, 39.679f, 0f, false, false, -2.422f, 2.498f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.422f, 12f)
                horizontalLineToRelative(10.578f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 8f)
                verticalLineToRelative(8f)
            }
        }.build()
        
        return _FishBone!!
    }

private var _FishBone: ImageVector? = null

