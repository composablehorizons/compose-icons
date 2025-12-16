package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Gitlab: ImageVector
    get() {
        if (_Gitlab != null) return _Gitlab!!
        
        _Gitlab = ImageVector.Builder(
            name = "gitlab",
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
                moveTo(22.65f, 14.39f)
                lineTo(12f, 22.13f)
                lineTo(1.35f, 14.39f)
                arcToRelative(0.84f, 0.84f, 0f, false, true, -0.3f, -0.94f)
                lineToRelative(1.22f, -3.78f)
                lineToRelative(2.44f, -7.51f)
                arcTo(0.42f, 0.42f, 0f, false, true, 4.82f, 2f)
                arcToRelative(0.43f, 0.43f, 0f, false, true, 0.58f, 0f)
                arcToRelative(0.42f, 0.42f, 0f, false, true, 0.11f, 0.18f)
                lineToRelative(2.44f, 7.49f)
                horizontalLineToRelative(8.1f)
                lineToRelative(2.44f, -7.51f)
                arcTo(0.42f, 0.42f, 0f, false, true, 18.6f, 2f)
                arcToRelative(0.43f, 0.43f, 0f, false, true, 0.58f, 0f)
                arcToRelative(0.42f, 0.42f, 0f, false, true, 0.11f, 0.18f)
                lineToRelative(2.44f, 7.51f)
                lineTo(23f, 13.45f)
                arcToRelative(0.84f, 0.84f, 0f, false, true, -0.35f, 0.94f)
                close()
            }
        }.build()
        
        return _Gitlab!!
    }

private var _Gitlab: ImageVector? = null

