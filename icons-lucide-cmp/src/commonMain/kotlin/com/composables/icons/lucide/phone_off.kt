package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PhoneOff: ImageVector
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
                moveTo(10.1f, 13.9f)
                arcToRelative(14f, 14f, 0f, false, false, 3.732f, 2.668f)
                arcToRelative(1f, 1f, 0f, false, false, 1.213f, -0.303f)
                lineToRelative(0.355f, -0.465f)
                arcTo(2f, 2f, 0f, false, true, 17f, 15f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcToRelative(18f, 18f, 0f, false, true, -12.728f, -5.272f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.76f, 13.582f)
                arcTo(18f, 18f, 0f, false, true, 2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -0.8f, 1.6f)
                lineToRelative(-0.468f, 0.351f)
                arcToRelative(1f, 1f, 0f, false, false, -0.292f, 1.233f)
                arcToRelative(14f, 14f, 0f, false, false, 0.244f, 0.473f)
            }
        }.build()
        
        return _PhoneOff!!
    }

private var _PhoneOff: ImageVector? = null

