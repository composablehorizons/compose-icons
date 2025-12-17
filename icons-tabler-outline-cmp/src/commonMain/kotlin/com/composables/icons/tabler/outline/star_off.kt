package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.StarOff: ImageVector
    get() {
        if (_StarOff != null) return _StarOff!!
        
        _StarOff = ImageVector.Builder(
            name = "star-off",
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
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.012f, 6.016f)
                lineToRelative(1.981f, -4.014f)
                lineToRelative(3.086f, 6.253f)
                lineToRelative(6.9f, 1f)
                lineToRelative(-4.421f, 4.304f)
                moveToRelative(0.012f, 4.01f)
                lineToRelative(0.588f, 3.426f)
                lineToRelative(-6.158f, -3.245f)
                lineToRelative(-6.172f, 3.245f)
                lineToRelative(1.179f, -6.873f)
                lineToRelative(-5f, -4.867f)
                lineToRelative(6.327f, -0.917f)
            }
        }.build()
        
        return _StarOff!!
    }

private var _StarOff: ImageVector? = null

