package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HeartCrack: ImageVector
    get() {
        if (_HeartCrack != null) return _HeartCrack!!
        
        _HeartCrack = ImageVector.Builder(
            name = "heart-crack",
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
                moveTo(12.409f, 5.824f)
                curveToRelative(-0.702f, 0.792f, -1.15f, 1.496f, -1.415f, 2.166f)
                lineToRelative(2.153f, 2.156f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
                lineTo(12f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.508f, 20.313f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, 0.019f)
                lineTo(5f, 15f)
                curveToRelative(-1.5f, -1.5f, -3f, -3.2f, -3f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 9.591f, -3.677f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0f, false, true, 22f, 9.5f)
                curveToRelative(0f, 2.29f, -1.5f, 4f, -3f, 5.5f)
                close()
            }
        }.build()
        
        return _HeartCrack!!
    }

private var _HeartCrack: ImageVector? = null

