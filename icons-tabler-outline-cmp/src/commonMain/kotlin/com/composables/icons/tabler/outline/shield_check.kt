package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) return _ShieldCheck!!
        
        _ShieldCheck = ImageVector.Builder(
            name = "shield-check",
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
                moveTo(11.46f, 20.846f)
                arcToRelative(12f, 12f, 0f, false, true, -7.96f, -14.846f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, -3f)
                arcToRelative(12f, 12f, 0f, false, false, 8.5f, 3f)
                arcToRelative(12f, 12f, 0f, false, true, -0.09f, 7.06f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _ShieldCheck!!
    }

private var _ShieldCheck: ImageVector? = null

