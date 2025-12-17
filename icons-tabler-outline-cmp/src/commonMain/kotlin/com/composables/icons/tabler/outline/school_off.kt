package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SchoolOff: ImageVector
    get() {
        if (_SchoolOff != null) return _SchoolOff!!
        
        _SchoolOff = ImageVector.Builder(
            name = "school-off",
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
                moveTo(22f, 9f)
                lineToRelative(-10f, -4f)
                lineToRelative(-2.136f, 0.854f)
                moveToRelative(-2.864f, 1.146f)
                lineToRelative(-5f, 2f)
                lineToRelative(10f, 4f)
                lineToRelative(0.697f, -0.279f)
                moveToRelative(2.878f, -1.151f)
                lineToRelative(6.425f, -2.57f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10.6f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 1.657f, 2.686f, 3f, 6f, 3f)
                curveToRelative(2.334f, 0f, 4.357f, -0.666f, 5.35f, -1.64f)
                moveToRelative(0.65f, -3.36f)
                verticalLineToRelative(-3.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _SchoolOff!!
    }

private var _SchoolOff: ImageVector? = null

