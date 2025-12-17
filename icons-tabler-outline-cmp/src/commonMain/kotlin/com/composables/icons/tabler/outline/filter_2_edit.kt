package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter2Edit: ImageVector
    get() {
        if (_Filter2Edit != null) return _Filter2Edit!!
        
        _Filter2Edit = ImageVector.Builder(
            name = "filter-2-edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(11f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.42f, 15.61f)
                curveToRelative(0.195f, -0.195f, 0.426f, -0.35f, 0.681f, -0.455f)
                curveToRelative(0.255f, -0.106f, 0.528f, -0.16f, 0.804f, -0.16f)
                curveToRelative(0.276f, 0f, 0.549f, 0.054f, 0.804f, 0.16f)
                curveToRelative(0.255f, 0.106f, 0.486f, 0.26f, 0.681f, 0.455f)
                curveToRelative(0.195f, 0.195f, 0.35f, 0.427f, 0.455f, 0.681f)
                curveToRelative(0.106f, 0.255f, 0.16f, 0.528f, 0.16f, 0.804f)
                curveToRelative(0f, 0.276f, -0.054f, 0.549f, -0.16f, 0.804f)
                curveToRelative(-0.105f, 0.255f, -0.26f, 0.486f, -0.455f, 0.681f)
                lineToRelative(-3.39f, 3.42f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineToRelative(3.42f, -3.39f)
                close()
            }
        }.build()
        
        return _Filter2Edit!!
    }

private var _Filter2Edit: ImageVector? = null

