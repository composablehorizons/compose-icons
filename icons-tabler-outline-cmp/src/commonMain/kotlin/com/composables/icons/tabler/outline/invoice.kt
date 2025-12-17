package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Invoice: ImageVector
    get() {
        if (_Invoice != null) return _Invoice!!
        
        _Invoice = ImageVector.Builder(
            name = "invoice",
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
                moveTo(14f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                verticalLineToRelative(7f)
                arcToRelative(1.78f, 1.78f, 0f, false, true, -3.1f, 1.4f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, false, true, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -2.6f, 0f)
                arcToRelative(1.78f, 1.78f, 0f, false, true, -3.1f, -1.4f)
                verticalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(4.25f)
            }
        }.build()
        
        return _Invoice!!
    }

private var _Invoice: ImageVector? = null

