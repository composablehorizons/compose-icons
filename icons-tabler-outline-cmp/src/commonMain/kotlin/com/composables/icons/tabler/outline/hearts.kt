package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Hearts: ImageVector
    get() {
        if (_Hearts != null) return _Hearts!!
        
        _Hearts = ImageVector.Builder(
            name = "hearts",
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
                moveTo(14.017f, 18f)
                lineToRelative(-2.017f, 2f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5f, 5f, 0f, true, true, 7.5f, -6.566f)
                arcToRelative(5f, 5f, 0f, false, true, 8.153f, 5.784f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.99f, 20f)
                lineToRelative(4.197f, -4.223f)
                arcToRelative(2.81f, 2.81f, 0f, false, false, 0f, -3.948f)
                arcToRelative(2.747f, 2.747f, 0f, false, false, -3.91f, -0.007f)
                lineToRelative(-0.28f, 0.282f)
                lineToRelative(-0.279f, -0.283f)
                arcToRelative(2.747f, 2.747f, 0f, false, false, -3.91f, -0.007f)
                arcToRelative(2.81f, 2.81f, 0f, false, false, -0.007f, 3.948f)
                lineToRelative(4.182f, 4.238f)
                close()
            }
        }.build()
        
        return _Hearts!!
    }

private var _Hearts: ImageVector? = null

