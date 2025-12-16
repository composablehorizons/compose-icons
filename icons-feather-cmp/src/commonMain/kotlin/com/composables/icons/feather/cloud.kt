package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
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
                moveTo(18f, 10f)
                horizontalLineToRelative(-1.26f)
                arcTo(8f, 8f, 0f, true, false, 9f, 20f)
                horizontalLineToRelative(9f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, -10f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

