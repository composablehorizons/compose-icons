package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Hanger: ImageVector
    get() {
        if (_Hanger != null) return _Hanger!!
        
        _Hanger = ImageVector.Builder(
            name = "hanger",
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
                moveTo(14f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                curveToRelative(0f, 1.667f, 0.67f, 3f, 2f, 4f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(7.971f, 4.428f)
                arcToRelative(2f, 2f, 0f, false, true, 1.029f, 1.749f)
                verticalLineToRelative(0.823f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-0.823f)
                arcToRelative(2f, 2f, 0f, false, true, 1.029f, -1.749f)
                lineToRelative(7.971f, -4.428f)
            }
        }.build()
        
        return _Hanger!!
    }

private var _Hanger: ImageVector? = null

