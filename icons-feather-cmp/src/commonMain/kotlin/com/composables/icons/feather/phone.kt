package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Phone: ImageVector
    get() {
        if (_Phone != null) return _Phone!!
        
        _Phone = ImageVector.Builder(
            name = "phone",
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
                moveTo(22f, 16.92f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2.18f, 2f)
                arcToRelative(19.79f, 19.79f, 0f, false, true, -8.63f, -3.07f)
                arcToRelative(19.5f, 19.5f, 0f, false, true, -6f, -6f)
                arcToRelative(19.79f, 19.79f, 0f, false, true, -3.07f, -8.67f)
                arcTo(2f, 2f, 0f, false, true, 4.11f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 1.72f)
                arcToRelative(12.84f, 12.84f, 0f, false, false, 0.7f, 2.81f)
                arcToRelative(2f, 2f, 0f, false, true, -0.45f, 2.11f)
                lineTo(8.09f, 9.91f)
                arcToRelative(16f, 16f, 0f, false, false, 6f, 6f)
                lineToRelative(1.27f, -1.27f)
                arcToRelative(2f, 2f, 0f, false, true, 2.11f, -0.45f)
                arcToRelative(12.84f, 12.84f, 0f, false, false, 2.81f, 0.7f)
                arcTo(2f, 2f, 0f, false, true, 22f, 16.92f)
                close()
            }
        }.build()
        
        return _Phone!!
    }

private var _Phone: ImageVector? = null

