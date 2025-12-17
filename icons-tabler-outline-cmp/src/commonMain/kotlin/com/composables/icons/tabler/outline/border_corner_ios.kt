package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BorderCornerIos: ImageVector
    get() {
        if (_BorderCornerIos != null) return _BorderCornerIos!!
        
        _BorderCornerIos = ImageVector.Builder(
            name = "border-corner-ios",
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
                moveTo(4f, 20f)
                curveToRelative(0f, -6.559f, 0f, -9.838f, 1.628f, -12.162f)
                arcToRelative(9f, 9f, 0f, false, true, 2.21f, -2.21f)
                curveToRelative(2.324f, -1.628f, 5.602f, -1.628f, 12.162f, -1.628f)
            }
        }.build()
        
        return _BorderCornerIos!!
    }

private var _BorderCornerIos: ImageVector? = null

