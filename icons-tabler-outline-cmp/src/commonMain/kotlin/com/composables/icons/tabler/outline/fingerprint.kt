package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Fingerprint: ImageVector
    get() {
        if (_Fingerprint != null) return _Fingerprint!!
        
        _Fingerprint = ImageVector.Builder(
            name = "fingerprint",
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
                moveTo(18.9f, 7f)
                arcToRelative(8f, 8f, 0f, false, true, 1.1f, 5f)
                verticalLineToRelative(1f)
                arcToRelative(6f, 6f, 0f, false, false, 0.8f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(10f, 10f, 0f, false, false, 2f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                verticalLineToRelative(2f)
                arcToRelative(14f, 14f, 0f, false, false, 2.5f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                arcToRelative(18f, 18f, 0f, false, false, 1.8f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.9f, 19f)
                arcToRelative(22f, 22f, 0f, false, true, -0.9f, -7f)
                verticalLineToRelative(-1f)
                arcToRelative(8f, 8f, 0f, false, true, 12f, -6.95f)
            }
        }.build()
        
        return _Fingerprint!!
    }

private var _Fingerprint: ImageVector? = null

