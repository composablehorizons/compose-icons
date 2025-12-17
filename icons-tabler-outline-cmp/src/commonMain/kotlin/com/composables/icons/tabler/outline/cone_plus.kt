package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ConePlus: ImageVector
    get() {
        if (_ConePlus != null) return _ConePlus!!
        
        _ConePlus = ImageVector.Builder(
            name = "cone-plus",
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
                moveTo(18.03f, 12.022f)
                lineToRelative(-5.16f, -9.515f)
                arcToRelative(1f, 1f, 0f, false, false, -1.74f, 0f)
                lineToRelative(-8.13f, 14.99f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.66f, 4.03f, 3.003f, 9f, 3.003f)
                curveToRelative(0.17f, 0f, 0.34f, -0.002f, 0.508f, -0.005f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _ConePlus!!
    }

private var _ConePlus: ImageVector? = null

