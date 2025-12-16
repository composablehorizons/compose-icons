package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.QuestionMark: ImageVector
    get() {
        if (_QuestionMark != null) return _QuestionMark!!
        
        _QuestionMark = ImageVector.Builder(
            name = "question-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50024f, 11.6071f)
                curveTo(7.98326f, 11.6072f, 8.37501f, 11.9991f, 8.37524f, 12.4821f)
                curveTo(8.37524f, 12.9653f, 7.9834f, 13.357f, 7.50024f, 13.3571f)
                curveTo(7.01699f, 13.3571f, 6.62524f, 12.9653f, 6.62524f, 12.4821f)
                curveTo(6.62547f, 11.999f, 7.01714f, 11.6071f, 7.50024f, 11.6071f)
                close()
                moveTo(7.50024f, 0.77504f)
                curveTo(9.21883f, 0.775142f, 11.0754f, 2.12786f, 11.0754f, 4.10023f)
                curveTo(11.0754f, 5.75307f, 10.1328f, 6.57417f, 9.38208f, 7.23988f)
                curveTo(8.62999f, 7.90686f, 8.07544f, 8.41581f, 8.07544f, 9.50063f)
                curveTo(8.07511f, 9.81785f, 7.81752f, 10.0747f, 7.50024f, 10.0748f)
                curveTo(7.18288f, 10.0748f, 6.92538f, 9.81791f, 6.92505f, 9.50063f)
                curveTo(6.92505f, 7.85828f, 7.87058f, 7.04271f, 8.61841f, 6.37953f)
                curveTo(9.36764f, 5.7151f, 9.92498f, 5.19868f, 9.92505f, 4.10023f)
                curveTo(9.92505f, 2.91132f, 8.74295f, 1.92553f, 7.50024f, 1.92543f)
                curveTo(6.25747f, 1.92543f, 5.07544f, 2.91126f, 5.07544f, 4.10023f)
                curveTo(5.07533f, 4.41764f, 4.81765f, 4.67532f, 4.50024f, 4.67543f)
                curveTo(4.18275f, 4.67543f, 3.92516f, 4.4177f, 3.92505f, 4.10023f)
                curveTo(3.92505f, 2.12779f, 5.7816f, 0.77504f, 7.50024f, 0.77504f)
                close()
            }
        }.build()
        
        return _QuestionMark!!
    }

private var _QuestionMark: ImageVector? = null

