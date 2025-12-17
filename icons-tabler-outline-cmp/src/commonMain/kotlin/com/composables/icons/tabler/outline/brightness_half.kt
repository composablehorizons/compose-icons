package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrightnessHalf: ImageVector
    get() {
        if (_BrightnessHalf != null) return _BrightnessHalf!!
        
        _BrightnessHalf = ImageVector.Builder(
            name = "brightness-half",
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
                moveTo(12f, 9f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                verticalLineToRelative(-6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6f)
                horizontalLineToRelative(3.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(2.5f, -2.5f)
                close()
            }
        }.build()
        
        return _BrightnessHalf!!
    }

private var _BrightnessHalf: ImageVector? = null

