package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CloudStorm: ImageVector
    get() {
        if (_CloudStorm != null) return _CloudStorm!!
        
        _CloudStorm = ImageVector.Builder(
            name = "cloud-storm",
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
                moveTo(7f, 18f)
                arcToRelative(4.6f, 4.4f, 0f, false, true, 0f, -9f)
                arcToRelative(5f, 4.5f, 0f, false, true, 11f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 14f)
                lineToRelative(-2f, 4f)
                lineToRelative(3f, 0f)
                lineToRelative(-2f, 4f)
            }
        }.build()
        
        return _CloudStorm!!
    }

private var _CloudStorm: ImageVector? = null

