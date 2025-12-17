package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HangerOff: ImageVector
    get() {
        if (_HangerOff != null) return _HangerOff!!
        
        _HangerOff = ImageVector.Builder(
            name = "hanger-off",
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
                moveTo(14f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                moveToRelative(6.506f, 6.506f)
                lineToRelative(3.461f, 1.922f)
                arcToRelative(2f, 2f, 0f, false, true, 1.029f, 1.749f)
                verticalLineToRelative(0.823f)
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-0.823f)
                arcToRelative(2f, 2f, 0f, false, true, 1.029f, -1.749f)
                lineToRelative(6.673f, -3.707f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _HangerOff!!
    }

private var _HangerOff: ImageVector? = null

