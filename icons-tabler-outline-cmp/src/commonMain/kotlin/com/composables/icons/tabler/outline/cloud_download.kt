package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CloudDownload: ImageVector
    get() {
        if (_CloudDownload != null) return _CloudDownload!!
        
        _CloudDownload = ImageVector.Builder(
            name = "cloud-download",
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
                moveTo(19f, 18f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, -7f)
                horizontalLineToRelative(-1f)
                arcToRelative(5f, 4.5f, 0f, false, false, -11f, -2f)
                arcToRelative(4.6f, 4.4f, 0f, false, false, -2.1f, 8.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                lineToRelative(0f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 19f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
        }.build()
        
        return _CloudDownload!!
    }

private var _CloudDownload: ImageVector? = null

