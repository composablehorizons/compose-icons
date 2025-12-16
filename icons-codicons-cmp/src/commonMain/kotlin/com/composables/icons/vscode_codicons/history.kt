package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.History: ImageVector
    get() {
        if (_History != null) return _History!!
        
        _History = ImageVector.Builder(
            name = "history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.99909f, 3f)
                curveTo(10.7605f, 3f, 12.9991f, 5.23858f, 12.9991f, 8f)
                curveTo(12.9991f, 10.7614f, 10.7605f, 13f, 7.99909f, 13f)
                curveTo(5.39117f, 13f, 3.2491f, 11.003f, 3.0195f, 8.45512f)
                curveTo(2.99471f, 8.1801f, 2.75167f, 7.97723f, 2.47664f, 8.00202f)
                curveTo(2.20161f, 8.0268f, 1.99875f, 8.26985f, 2.02353f, 8.54488f)
                curveTo(2.29916f, 11.6035f, 4.86898f, 14f, 7.99909f, 14f)
                curveTo(11.3128f, 14f, 13.9991f, 11.3137f, 13.9991f, 8f)
                curveTo(13.9991f, 4.68629f, 11.3128f, 2f, 7.99909f, 2f)
                curveTo(6.20656f, 2f, 4.59815f, 2.78613f, 3.49909f, 4.03138f)
                verticalLineTo(2.5f)
                curveTo(3.49909f, 2.22386f, 3.27524f, 2f, 2.99909f, 2f)
                curveTo(2.72295f, 2f, 2.49909f, 2.22386f, 2.49909f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(2.49909f, 5.77614f, 2.72295f, 6f, 2.99909f, 6f)
                horizontalLineTo(3.08812f)
                curveTo(3.09498f, 6.00014f, 3.10184f, 6.00014f, 3.10868f, 6f)
                horizontalLineTo(5.99909f)
                curveTo(6.27524f, 6f, 6.49909f, 5.77614f, 6.49909f, 5.5f)
                curveTo(6.49909f, 5.22386f, 6.27524f, 5f, 5.99909f, 5f)
                horizontalLineTo(3.99863f)
                curveTo(4.91128f, 3.78495f, 6.36382f, 3f, 7.99909f, 3f)
                close()
                moveTo(7.99909f, 5.5f)
                curveTo(7.99909f, 5.22386f, 7.77524f, 5f, 7.49909f, 5f)
                curveTo(7.22295f, 5f, 6.99909f, 5.22386f, 6.99909f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(6.99909f, 8.77614f, 7.22295f, 9f, 7.49909f, 9f)
                horizontalLineTo(9.49909f)
                curveTo(9.77524f, 9f, 9.99909f, 8.77614f, 9.99909f, 8.5f)
                curveTo(9.99909f, 8.22386f, 9.77524f, 8f, 9.49909f, 8f)
                horizontalLineTo(7.99909f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _History!!
    }

private var _History: ImageVector? = null

