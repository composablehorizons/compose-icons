package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PhoneOff: ImageVector
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
                moveTo(3f, 21f)
                lineToRelative(18f, -18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.831f, 14.161f)
                arcToRelative(15.946f, 15.946f, 0f, false, true, -2.831f, -8.161f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 5f)
                lineToRelative(-2.5f, 1.5f)
                curveToRelative(0.108f, 0.22f, 0.223f, 0.435f, 0.345f, 0.645f)
                moveToRelative(1.751f, 2.277f)
                curveToRelative(0.843f, 0.84f, 1.822f, 1.544f, 2.904f, 2.078f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(5f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcToRelative(15.963f, 15.963f, 0f, false, true, -10.344f, -4.657f)
            }
        }.build()
        
        return _PhoneOff!!
    }

private var _PhoneOff: ImageVector? = null

