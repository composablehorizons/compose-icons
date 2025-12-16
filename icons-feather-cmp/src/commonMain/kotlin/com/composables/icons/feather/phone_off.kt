package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.PhoneOff: ImageVector
    get() {
        if (_PhoneOff != null) return _PhoneOff!!
        
        _PhoneOff = ImageVector.Builder(
            name = "phone-off",
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
                moveTo(10.68f, 13.31f)
                arcToRelative(16f, 16f, 0f, false, false, 3.41f, 2.6f)
                lineToRelative(1.27f, -1.27f)
                arcToRelative(2f, 2f, 0f, false, true, 2.11f, -0.45f)
                arcToRelative(12.84f, 12.84f, 0f, false, false, 2.81f, 0.7f)
                arcToRelative(2f, 2f, 0f, false, true, 1.72f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2.18f, 2f)
                arcToRelative(19.79f, 19.79f, 0f, false, true, -8.63f, -3.07f)
                arcToRelative(19.42f, 19.42f, 0f, false, true, -3.33f, -2.67f)
                moveToRelative(-2.67f, -3.34f)
                arcToRelative(19.79f, 19.79f, 0f, false, true, -3.07f, -8.63f)
                arcTo(2f, 2f, 0f, false, true, 4.11f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 1.72f)
                arcToRelative(12.84f, 12.84f, 0f, false, false, 0.7f, 2.81f)
                arcToRelative(2f, 2f, 0f, false, true, -0.45f, 2.11f)
                lineTo(8.09f, 9.91f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 1f)
                lineTo(1f, 23f)
            }
        }.build()
        
        return _PhoneOff!!
    }

private var _PhoneOff: ImageVector? = null

