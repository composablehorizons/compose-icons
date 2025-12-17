package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Switch3: ImageVector
    get() {
        if (_Switch3 != null) return _Switch3!!
        
        _Switch3 = ImageVector.Builder(
            name = "switch-3",
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
                moveTo(3f, 17f)
                horizontalLineToRelative(2.397f)
                arcToRelative(5f, 5f, 0f, false, false, 4.096f, -2.133f)
                lineToRelative(0.177f, -0.253f)
                moveToRelative(3.66f, -5.227f)
                lineToRelative(0.177f, -0.254f)
                arcToRelative(5f, 5f, 0f, false, true, 4.096f, -2.133f)
                horizontalLineToRelative(3.397f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 4f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 7f)
                horizontalLineToRelative(2.397f)
                arcToRelative(5f, 5f, 0f, false, true, 4.096f, 2.133f)
                lineToRelative(4.014f, 5.734f)
                arcToRelative(5f, 5f, 0f, false, false, 4.096f, 2.133f)
                horizontalLineToRelative(3.397f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 20f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
        }.build()
        
        return _Switch3!!
    }

private var _Switch3: ImageVector? = null

