package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PhoneOutgoing: ImageVector
    get() {
        if (_PhoneOutgoing != null) return _PhoneOutgoing!!
        
        _PhoneOutgoing = ImageVector.Builder(
            name = "phone-outgoing",
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
                moveTo(5f, 4f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 5f)
                lineToRelative(-2.5f, 1.5f)
                arcToRelative(11f, 11f, 0f, false, false, 5f, 5f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(5f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                curveToRelative(-8.072f, -0.49f, -14.51f, -6.928f, -15f, -15f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 5f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 7.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-2.5f, -2.5f)
            }
        }.build()
        
        return _PhoneOutgoing!!
    }

private var _PhoneOutgoing: ImageVector? = null

