package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PhoneSpark: ImageVector
    get() {
        if (_PhoneSpark != null) return _PhoneSpark!!
        
        _PhoneSpark = ImageVector.Builder(
            name = "phone-spark",
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
                moveTo(11.584f, 19.225f)
                arcToRelative(16f, 16f, 0f, false, true, -8.584f, -13.225f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 5f)
                lineToRelative(-2.5f, 1.5f)
                arcToRelative(11f, 11f, 0f, false, false, 5f, 5f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(0.65f, 0.26f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -3.5f, 3.5f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 3.5f, 3.5f)
            }
        }.build()
        
        return _PhoneSpark!!
    }

private var _PhoneSpark: ImageVector? = null

