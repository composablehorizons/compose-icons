package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandMonday: ImageVector
    get() {
        if (_BrandMonday != null) return _BrandMonday!!
        
        _BrandMonday = ImageVector.Builder(
            name = "brand-monday",
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
                moveTo(19.5f, 15.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.339f, 2.177f)
                lineToRelative(-4.034f, 7.074f)
                curveToRelative(-0.264f, 0.447f, -0.75f, 0.749f, -1.305f, 0.749f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.271f, -2.297f)
                lineToRelative(3.906f, -6.827f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.365f, -0.876f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.339f, 2.177f)
                lineToRelative(-4.034f, 7.074f)
                curveToRelative(-0.264f, 0.447f, -0.75f, 0.749f, -1.305f, 0.749f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.271f, -2.297f)
                lineToRelative(3.906f, -6.827f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.365f, -0.876f)
                close()
            }
        }.build()
        
        return _BrandMonday!!
    }

private var _BrandMonday: ImageVector? = null

