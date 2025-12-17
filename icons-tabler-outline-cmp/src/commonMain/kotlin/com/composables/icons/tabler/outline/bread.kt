package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bread: ImageVector
    get() {
        if (_Bread != null) return _Bread!!
        
        _Bread = ImageVector.Builder(
            name = "bread",
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
                moveTo(18f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 2f, 5.235f)
                verticalLineToRelative(8.765f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8.764f)
                arcToRelative(3f, 3f, 0f, false, true, 1.824f, -5.231f)
                horizontalLineToRelative(12.176f)
                verticalLineToRelative(-0.005f)
                close()
            }
        }.build()
        
        return _Bread!!
    }

private var _Bread: ImageVector? = null

