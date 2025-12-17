package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ferry: ImageVector
    get() {
        if (_Ferry != null) return _Ferry!!
        
        _Ferry = ImageVector.Builder(
            name = "ferry",
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
                moveTo(2f, 18f)
                horizontalLineToRelative(15.293f)
                curveToRelative(1.02f, 0f, 1.972f, -0.503f, 2.536f, -1.34f)
                lineToRelative(2.171f, -3.66f)
                horizontalLineToRelative(-18.479f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                lineToRelative(-1f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.107f, 12.675f)
                lineToRelative(1.384f, -4.675f)
                horizontalLineToRelative(8f)
                lineToRelative(2.675f, 4.598f)
            }
        }.build()
        
        return _Ferry!!
    }

private var _Ferry: ImageVector? = null

