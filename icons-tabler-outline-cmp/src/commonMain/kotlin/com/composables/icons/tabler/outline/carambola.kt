package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Carambola: ImageVector
    get() {
        if (_Carambola != null) return _Carambola!!
        
        _Carambola = ImageVector.Builder(
            name = "carambola",
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
                moveTo(17.286f, 21.09f)
                quadToRelative(-1.69f, 0.001f, -5.288f, -2.615f)
                quadToRelative(-3.596f, 2.617f, -5.288f, 2.616f)
                quadToRelative(-2.726f, 0f, -0.495f, -6.8f)
                quadToRelative(-9.389f, -6.775f, 2.135f, -6.775f)
                horizontalLineToRelative(0.076f)
                quadToRelative(1.785f, -5.516f, 3.574f, -5.516f)
                quadToRelative(1.785f, 0f, 3.574f, 5.516f)
                horizontalLineToRelative(0.076f)
                quadToRelative(11.525f, 0f, 2.133f, 6.774f)
                quadToRelative(2.23f, 6.802f, -0.497f, 6.8f)
            }
        }.build()
        
        return _Carambola!!
    }

private var _Carambola: ImageVector? = null

