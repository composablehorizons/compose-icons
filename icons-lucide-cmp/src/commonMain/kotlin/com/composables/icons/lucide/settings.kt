package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Settings: ImageVector
    get() {
        if (_Settings != null) return _Settings!!
        
        _Settings = ImageVector.Builder(
            name = "settings",
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
                moveTo(9.671f, 4.136f)
                arcToRelative(2.34f, 2.34f, 0f, false, true, 4.659f, 0f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, 3.319f, 1.915f)
                arcToRelative(2.34f, 2.34f, 0f, false, true, 2.33f, 4.033f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, 0f, 3.831f)
                arcToRelative(2.34f, 2.34f, 0f, false, true, -2.33f, 4.033f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, -3.319f, 1.915f)
                arcToRelative(2.34f, 2.34f, 0f, false, true, -4.659f, 0f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, -3.32f, -1.915f)
                arcToRelative(2.34f, 2.34f, 0f, false, true, -2.33f, -4.033f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, 0f, -3.831f)
                arcTo(2.34f, 2.34f, 0f, false, true, 6.35f, 6.051f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, 3.319f, -1.915f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
        }.build()
        
        return _Settings!!
    }

private var _Settings: ImageVector? = null

