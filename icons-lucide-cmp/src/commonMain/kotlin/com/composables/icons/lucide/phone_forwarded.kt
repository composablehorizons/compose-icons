package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PhoneForwarded: ImageVector
    get() {
        if (_PhoneForwarded != null) return _PhoneForwarded!!
        
        _PhoneForwarded = ImageVector.Builder(
            name = "phone-forwarded",
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
                moveTo(14f, 6f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.832f, 16.568f)
                arcToRelative(1f, 1f, 0f, false, false, 1.213f, -0.303f)
                lineToRelative(0.355f, -0.465f)
                arcTo(2f, 2f, 0f, false, true, 17f, 15f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcTo(18f, 18f, 0f, false, true, 2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -0.8f, 1.6f)
                lineToRelative(-0.468f, 0.351f)
                arcToRelative(1f, 1f, 0f, false, false, -0.292f, 1.233f)
                arcToRelative(14f, 14f, 0f, false, false, 6.392f, 6.384f)
            }
        }.build()
        
        return _PhoneForwarded!!
    }

private var _PhoneForwarded: ImageVector? = null

