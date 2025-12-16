package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronsRightLeft: ImageVector
    get() {
        if (_ChevronsRightLeft != null) return _ChevronsRightLeft!!
        
        _ChevronsRightLeft = ImageVector.Builder(
            name = "chevrons-right-left",
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
                moveTo(20f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 17f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
        }.build()
        
        return _ChevronsRightLeft!!
    }

private var _ChevronsRightLeft: ImageVector? = null

