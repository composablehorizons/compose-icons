package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ampersand: ImageVector
    get() {
        if (_Ampersand != null) return _Ampersand!!
        
        _Ampersand = ImageVector.Builder(
            name = "ampersand",
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
                moveTo(19f, 20f)
                lineToRelative(-10.403f, -10.972f)
                arcToRelative(2.948f, 2.948f, 0f, false, true, 0f, -4.165f)
                arcToRelative(2.94f, 2.94f, 0f, false, true, 4.161f, 0f)
                arcToRelative(2.948f, 2.948f, 0f, false, true, 0f, 4.165f)
                lineToRelative(-4.68f, 4.687f)
                arcToRelative(3.685f, 3.685f, 0f, false, false, 0f, 5.207f)
                arcToRelative(3.675f, 3.675f, 0f, false, false, 5.2f, 0f)
                lineToRelative(5.722f, -5.922f)
            }
        }.build()
        
        return _Ampersand!!
    }

private var _Ampersand: ImageVector? = null

